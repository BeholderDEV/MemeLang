/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.model.visitor;

import br.beholder.memelang.model.language.MemelangParser;
import br.beholder.memelang.model.analisador.Identificador.Tipo;
import br.beholder.memelang.model.analisador.Escopo;
import br.beholder.memelang.model.analisador.Identificador;
import br.beholder.memelang.model.language.MemelangParser.ExpressaoContext;
import br.beholder.memelang.model.language.MemelangParser.TipoContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.TerminalNode;



/**
 *
 * @author Alisson
 */
public class SemanticVisitor extends MemeVisitor{
    
    List<ParseCancellationException> semanticErrors = new ArrayList<ParseCancellationException>();
    List<String> semanticWarnings = new ArrayList<String>();
    Stack<Identificador.Tipo> pilhaTipoExpressao = new Stack<>();
    Stack<Operation> pilhaOperacao = new Stack<>();
    boolean temRetorno = false;
    Tipo tipoFuncao = null;
    int contEscopo = 1;
    
    public SemanticVisitor(List<Identificador> tabelaSimbolos) {
        super(tabelaSimbolos);
    }

    public List<Identificador> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
    
    @Override
    public Object visitTipoComVoid(MemelangParser.TipoComVoidContext ctx) {
        if (ctx.VOID() != null) {
            tipoAtual = Tipo.VOID;
        } else {
            visitTipo(ctx.tipo());
        }
        return null;
    }

    public Tipo visitExpressaoLoop(MemelangParser.ExpressaoContext ctx){
        if (ctx == null) {
            return null;
        }
        Stack<Identificador.Tipo> pilhaTipoExpressaoLoop = new Stack<>();
        Stack<Operation> pilhaOperacaoLoop = new Stack<>();
        
        
        for (MemelangParser.OperationsContext opCont : ctx.operations()) {
            pilhaOperacaoLoop.push(verificarTipoOperacao(opCont));
        }
        for (int i = 0; i < ctx.val_final().size(); i++) {
            String valFinal = ctx.val_final(i).getText();            
            Tipo tipoExpParenteses = null;
            if(ctx.val_final(i).multidimensional() != null){
                valFinal =  ctx.val_final(i).ID().getText();
            }
            if(ctx.val_final(i).chamadaFuncao() != null){
                valFinal = ctx.val_final(i).chamadaFuncao().ID().getText();
            }
            if(ctx.val_final(i).PARENTESEABRE() != null){
                pilhaTipoExpressaoLoop.push(visitExpressaoLoop(ctx.val_final(i).expressao()));
                
                continue;
            }
            if (Identificador.getId(valFinal, tabelaSimbolos, escopoAtual) != null) {
                Identificador id = Identificador.getId(valFinal, tabelaSimbolos, escopoAtual);
                if (ctx.val_final(i).multidimensional() != null) {
                    Tipo posicaoVetor = visitExpressaoLoop(ctx.val_final(i).multidimensional().expressao(0));
                    if(posicaoVetor != Tipo.INTEIRO){
                        this.semanticErrors.add(new ParseCancellationException("Tentando acessar posição de vetor com tipo não inteiro na Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
                    }
                    visitMultidimensional(ctx.val_final(i).multidimensional(), posicaoVetor);
                } else {
                    multidimensional = 0;
                }
                if (!id.isInicializada()) {
                    this.semanticErrors.add(new ParseCancellationException("Váriavel " + id.getNome() + " não inicializada Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
                }
                if (id.getDimensoes() != multidimensional) {
                    this.semanticErrors.add(new ParseCancellationException("Dimensões incorreta do vetor " + id.getNome() + " . Ele possui " + id.getDimensoes() + " dimensões e foi usada " + multidimensional + " Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
                }
                id.setUsada(true);
                
                pilhaTipoExpressaoLoop.push(id.getTipo());
                
            }else if(verificarTipoConstante(ctx.val_final(i)) == null && tipoExpParenteses == null){
                this.semanticErrors.add(new ParseCancellationException("Váriavel " + valFinal + " não existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
            }else{
                if(tipoExpParenteses != null){
                    pilhaTipoExpressaoLoop.push(tipoExpParenteses);
                }
                pilhaTipoExpressaoLoop.push(verificarTipoConstante(ctx.val_final(i)));
            }
        }
        verificarCompatibilidadeOperacao(ctx, pilhaTipoExpressaoLoop, pilhaOperacaoLoop);
        if(pilhaTipoExpressaoLoop.empty())
        {
            return null;
        }
        return pilhaTipoExpressaoLoop.peek();
    }
    
    @Override
    public Object visitExpressao(MemelangParser.ExpressaoContext ctx) {
        if (ctx == null) {
            return null;
        }
        this.pilhaOperacao.clear();
        this.pilhaTipoExpressao.clear();
        for (MemelangParser.OperationsContext opCont : ctx.operations()) {
            this.pilhaOperacao.push(verificarTipoOperacao(opCont));
        }
        for (int i = 0; i < ctx.val_final().size(); i++) {
            String valFinal = ctx.val_final(i).getText();            
            if(ctx.val_final(i).multidimensional() != null){
                valFinal =  ctx.val_final(i).ID().getText();
            }
            if(ctx.val_final(i).chamadaFuncao()!= null){
                visitChamadaFuncao(ctx.val_final(i).chamadaFuncao());
                valFinal = ctx.val_final(i).chamadaFuncao().ID().getText();
            }
            if(ctx.val_final(i).PARENTESEABRE() != null){
                this.pilhaTipoExpressao.push(visitExpressaoLoop(ctx.val_final(i).expressao()));
                continue;
            }
            if (Identificador.getId(valFinal, tabelaSimbolos, escopoAtual) != null) {
                Identificador id = Identificador.getId(valFinal, tabelaSimbolos, escopoAtual);
                if (ctx.val_final(i).multidimensional() != null) {
                    Tipo posicaoVetor = visitExpressaoLoop(ctx.val_final(i).multidimensional().expressao(0));
                    if(posicaoVetor != Tipo.INTEIRO){
                        this.semanticErrors.add(new ParseCancellationException("Tentando acessar posição de vetor com tipo não inteiro na Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
                    }
                    visitMultidimensional(ctx.val_final(i).multidimensional(), posicaoVetor);
                } else {
                    multidimensional = 0;
                }
                if (!id.isInicializada()) {
                    this.semanticErrors.add(new ParseCancellationException("Váriavel " + id.getNome() + " não inicializada Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
                }
                if (id.getDimensoes() != multidimensional) {
                    this.semanticErrors.add(new ParseCancellationException("Dimensões incorreta do vetor " + id.getNome() + " . Ele possui " + id.getDimensoes() + " dimensões e foi usada " + multidimensional + " Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
                }
                id.setUsada(true);
                
                this.pilhaTipoExpressao.push(id.getTipo());
                
            }else if(verificarTipoConstante(ctx.val_final(i)) == null){
                this.semanticErrors.add(new ParseCancellationException("Váriavel " + valFinal + " não existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
            }else{
                this.pilhaTipoExpressao.push(verificarTipoConstante(ctx.val_final(i)));
            }
        }
        verificarCompatibilidadeOperacao(ctx, this.pilhaTipoExpressao, this.pilhaOperacao);
        return null;
//        return super.visitExpressao(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    public void verificarCompatibilidadeOperacao(MemelangParser.ExpressaoContext ctx, Stack<Tipo> pilhaTipoExpressao, Stack<Operation> pilhaOperacao){
        if(pilhaOperacao.empty() || pilhaTipoExpressao.size() != pilhaOperacao.size() + 1){
            
            return;
        }
        int resultExp;
        Tipo tipo1, tipo2;
        Operation op;
        while(!pilhaOperacao.empty()) {
            tipo1 = pilhaTipoExpressao.pop();
            tipo2 = pilhaTipoExpressao.pop();
            
            op = pilhaOperacao.pop();
            int resulExp = SemanticTable.resultType(tipo1, tipo2, op);
            if(resulExp == SemanticTable.ERR){
                this.semanticErrors.add(new ParseCancellationException("Tentando realizar uma " + op.name() + " entre " + tipo1.name() + " e " + tipo2.name() + " na linha " + ctx.start.getLine()));
                return;
            }
            pilhaTipoExpressao.push(SemanticTable.getCodeType(resulExp));
        }
    }
    
    public void verificarCompatibilidadeAtribuicao(Tipo tipoVariavelFinal, ParserRuleContext ctx){
        if(this.pilhaTipoExpressao.isEmpty()){
            return;
        }
        Tipo tipoAtribuição = this.pilhaTipoExpressao.pop();
        int resultAtr = SemanticTable.atribType(tipoVariavelFinal, tipoAtribuição);
        if(resultAtr == SemanticTable.ERR){
            this.semanticErrors.add(new ParseCancellationException("Tentando atribuir um " + tipoAtribuição.name() + " a um " + tipoVariavelFinal.name() + " na linha " + ctx.start.getLine()));
            return;
        }
        if(resultAtr == SemanticTable.WAR){
            this.semanticWarnings.add("Atribuindo um " + tipoAtribuição.name() + " a um " + tipoVariavelFinal.name() + " na linha " + ctx.start.getLine());
        }
    }
    
    public Operation verificarTipoOperacao(MemelangParser.OperationsContext opContext){
        if(opContext.op_arit_baixa() != null){
            if(opContext.op_arit_baixa().DIVIDE() != null){
                return Operation.DIVISAO;
            }
            if(opContext.op_arit_baixa().MAIS() != null){
                return Operation.SOMA;
            }
            if(opContext.op_arit_baixa().MULTIPLICA() != null){
                return Operation.MULTIPLICACAO;
            }
            if(opContext.op_arit_baixa().MOD() != null){
                return Operation.MOD;
            }
        }
        if(opContext.op_bitwise() != null){
            if(opContext.op_bitwise().BITSHIFTLEFT() != null){
                return Operation.BITSHIFTLEFT;
            }
            if(opContext.op_bitwise().BITSHIFTRIGHT() != null){
                return Operation.BITSHIFTRIGHT;
            }
        }
        if(opContext.op_logica() != null){
            if(opContext.op_logica().AND() != null){
                return Operation.AND;
            }
            if(opContext.op_logica().NOT() != null){
                return Operation.NOT;
            }
            if(opContext.op_logica().OR() != null){
                return Operation.OR;
            }
        }
        if(opContext.op_neg() != null){
            if(opContext.op_neg().BITNOT() != null){
                return Operation.BITNOT;
            }
            if(opContext.op_neg().MENOS() != null){
                return Operation.SUBTRACAO;
            }
            if(opContext.op_neg().NOT() != null){
                return Operation.NOT;
            }
        }
        if(opContext.op_rel() != null){
            if(opContext.op_rel().DIFERENTE() != null){
                return Operation.DIFERENTE;
            }
            if(opContext.op_rel().IDENTICO() != null){
                return Operation.IDENTICO;
            }
            if(opContext.op_rel().MAIOROUIGUAL() != null){
                return Operation.MAIOROUIGUAL;
            }
            if(opContext.op_rel().MAIORQUE() != null){
                return Operation.MAIORQUE;
            }
            if(opContext.op_rel().MENOROUIGUAL() != null){
                return Operation.MENOROUIGUAL;
            }
            if(opContext.op_rel().MENORQUE() != null){
                return Operation.MENORQUE;
            }
        }
        return null;
    }
    
    public Tipo verificarTipoConstante(MemelangParser.Val_finalContext val){
        if (val.CONSTBINARIO() != null) {
            return Tipo.BINARIO;
        } else if (val.CONSTLOGICO() != null) {
            return Tipo.LOGICO;
        } else if (val.CONSTREAL() != null) {
            return Tipo.REAL;
        } else if (val.CONSTHEXA() != null) {
            return Tipo.HEXADECIMAL;
        } else if (val.CONSTINTEIRO() != null) {
            return Tipo.INTEIRO;
        } else if (val.CONSTSTRING() != null) {
            return Tipo.STRING;
        }else if(val.CONSTCHAR() != null){
            return Tipo.CHAR;
        }
        return null;
    }
    public Tipo verificarTipo(MemelangParser.TipoContext tipo){
        if (tipo.BIN() != null) {
            return Tipo.BINARIO;
        } else if (tipo.BOOL() != null) {
            return Tipo.LOGICO;
        } else if (tipo.DOUBLE() != null) {
            return Tipo.REAL;
        } else if (tipo.HEXA() != null) {
            return Tipo.HEXADECIMAL;
        } else if (tipo.INT() != null) {
            return Tipo.INTEIRO;
        } else if (tipo.STRING() != null) {
            return Tipo.STRING;
        }else if(tipo.CHAR() != null){
            return Tipo.CHAR;
        }
        return null;
    }
    
    @Override
    public Object visitVal_final(MemelangParser.Val_finalContext ctx) {
        return super.visitVal_final(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_logica(MemelangParser.Op_logicaContext ctx) {
        return super.visitOp_logica(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOperations(MemelangParser.OperationsContext ctx) {
        return super.visitOperations(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitRetorno(MemelangParser.RetornoContext ctx) {
        Tipo tipoExpressao = visitExpressaoLoop(ctx.expressao());
        if(tipoExpressao == tipoFuncao){
            temRetorno = true;
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitParametrosChamada(MemelangParser.ParametrosChamadaContext ctx) {
//        for (ExpressaoContext expressao : ctx.expressao()) {
//            Tipo tipoParametro = visitExpressaoLoop(expressao);
//        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTipo(MemelangParser.TipoContext ctx) {
        if (ctx.BIN() != null) {
            tipoAtual = Tipo.BINARIO;
        } else if (ctx.BOOL() != null) {
            tipoAtual = Tipo.LOGICO;
        } else if (ctx.DOUBLE() != null) {
            tipoAtual = Tipo.REAL;
        } else if (ctx.HEXA() != null) {
            tipoAtual = Tipo.HEXADECIMAL;
        } else if (ctx.INT() != null) {
            tipoAtual = Tipo.INTEIRO;
        } else if (ctx.STRING() != null) {
            tipoAtual = Tipo.STRING;
        }else if(ctx.CHAR() != null){
            tipoAtual = Tipo.CHAR;
        }
        return null;
    }

    @Override
    public Object visitSwitchCase(MemelangParser.SwitchCaseContext ctx) {
        return super.visitSwitchCase(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_arit_baixa(MemelangParser.Op_arit_baixaContext ctx) {
        return super.visitOp_arit_baixa(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitParametros(MemelangParser.ParametrosContext ctx) {
        for (int i = 0; i < ctx.parametro().size(); i++) {
            String idName = ctx.parametro(i).ID().getSymbol().getText();
            if (Escopo.verificaSeExisteNoEscopo(idName, tabelaSimbolos, escopoAtual)) {
                this.semanticErrors.add(new ParseCancellationException("Declaração de Váriavel " + idName + " já existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
            }
            multidimensional = 0;
            qtdMultidimensional = 1;
            if (ctx.parametro(i).multidimensional() != null) {
                visitMultidimensional(ctx.parametro(i).multidimensional());
            }
            
            visitTipo(ctx.parametro(i).tipo());
            Identificador id = new Identificador(
                    idName,
                    tipoAtual,
                    true,
                    false,
                    escopoAtual,
                    true,
                    ctx.parametro(i).REFERENCIA() != null,
                    i + 1,
                    multidimensional, // Só aceita unidimensional como parametro... 
                    false);
            tabelaSimbolos.add(id);

        }
        return null;
    }

    @Override
    public Object visitSwitchdes(MemelangParser.SwitchdesContext ctx) {
        return super.visitSwitchdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Passe a ele o idNome da função que ele te retornara o escopo que a função
     * criou.
     *
     * @param idName
     * @return
     */
    private Escopo getEscopoDaFuncao(String idName) {
        Escopo escopo = null;
        for (Identificador identificador : tabelaSimbolos) {
            if (identificador.getNome().equals(idName)) {
                escopo = identificador.getEscopo();
                break;
            }
        }
        if (escopo == null) {
            this.semanticErrors.add(new ParseCancellationException("Escopo não encontrado"));
        }

        for (Escopo subEscopo : escopo.getSubEscopos()) {
            if (subEscopo.getNome().equals(idName)) {
                return subEscopo;
            }
        }
        return null;
    }

    @Override
    public Object visitIfdeselse(MemelangParser.IfdeselseContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("else_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitIfdes(MemelangParser.IfdesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("if_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitCondicionais(MemelangParser.CondicionaisContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitMultidimensional(MemelangParser.MultidimensionalContext ctx) {
        multidimensional = ctx.COLCHETESABRE().size();
        qtdMultidimensional = 1;
        for (int i = 0; i < multidimensional; i++) {
            String item = ctx.expressao(i).getText();
            qtdMultidimensional *= Integer.parseInt(item);
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
    public Object visitMultidimensional(MemelangParser.MultidimensionalContext ctx, Tipo tipo) {
        multidimensional = ctx.COLCHETESABRE().size();
        qtdMultidimensional = 1;
        for (int i = 0; i < multidimensional; i++) {
            String item = ctx.expressao(i).getText();
//            qtdMultidimensional *= Integer.parseInt(item);
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclaracoesArray(MemelangParser.DeclaracoesArrayContext ctx) {
        return super.visitDeclaracoesArray(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSubArrayDeclaracoes(MemelangParser.SubArrayDeclaracoesContext ctx) {
        return super.visitSubArrayDeclaracoes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAtribuicoes(MemelangParser.AtribuicoesContext ctx) {
        
        Identificador id = Identificador.getId(ctx.ID().getSymbol().getText(), tabelaSimbolos, escopoAtual);
        if (id == null) {
            this.semanticErrors.add(new ParseCancellationException("Váriavel " + ctx.ID() + " não existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
            return null;
        }
        if (ctx.atribuicoesIncEDec() != null && !id.isInicializada()) {
            this.semanticErrors.add(new ParseCancellationException("Váriavel " + ctx.ID() + " não inicializada Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
        }
        if(id.getDimensoes() > 0 && ctx.multidimensional() == null){
            this.semanticErrors.add(new ParseCancellationException("Tentando atribuir ao vetor " + id.getNome() +" sem dizer a posiçao na linha " + ctx.start.getLine()));
        }
        
        if(ctx.atribuicoesIncEDec() != null){
            
            Operation incDec;
            if(ctx.atribuicoesIncEDec().MAIS().size() == 2){
                incDec = Operation.SOMA;
            }else if(ctx.atribuicoesIncEDec().MENOS().size() == 2){
                incDec = Operation.SUBTRACAO;
            }
        }else{
            visitExpressao(ctx.expressao());
            verificarCompatibilidadeAtribuicao(id.getTipo(), ctx);
        }

        id.setUsada(true);

        id.setInicializada(true);

        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitComandos(MemelangParser.ComandosContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitFordes(MemelangParser.FordesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("for_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitWhiledes(MemelangParser.WhiledesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("while_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitDeclaracoes(MemelangParser.DeclaracoesContext ctx) {
        visitTipo(ctx.tipo());
        for (MemelangParser.DeclaracaoContext declaracaoContext : ctx.declaracao()) {            
            multidimensional = 0;
            qtdMultidimensional = 1;
            TerminalNode id = declaracaoContext.ID();
            if (declaracaoContext.multidimensional() != null) {
                visitMultidimensional(declaracaoContext.multidimensional());
            }
            boolean inicializada;            
            if (declaracaoContext.IGUAL() != null) {
                inicializada = true;
            } else {
                inicializada = false;
            }
            if (Escopo.verificaSeExisteNoEscopo(id.getSymbol().getText(), tabelaSimbolos, escopoAtual)) {
               this.semanticErrors.add(new ParseCancellationException("Declaração de Váriavel " + declaracaoContext.ID() + " já existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
            }
            Identificador ident = new Identificador(
                    id.getSymbol().getText(),
                    tipoAtual,
                    inicializada,
                    false,
                    escopoAtual,
                    false,
                    false,
                    0,
                    multidimensional,
                    qtdMultidimensional,
                    false);
            tabelaSimbolos.add(ident);
            visitChildren(ctx);
            verificarCompatibilidadeAtribuicao(ident.getTipo(), ctx);
        }
        
        return null;
    }

    @Override
    public Object visitDodes(MemelangParser.DodesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("doWhile_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitOp_rel(MemelangParser.Op_relContext ctx) {
        return super.visitOp_rel(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBloco(MemelangParser.BlocoContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitAtribuicoesIncEDec(MemelangParser.AtribuicoesIncEDecContext ctx) {
        return super.visitAtribuicoesIncEDec(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitProg(MemelangParser.ProgContext ctx) {
        escopoAtual = new Escopo("programa");
        markAllFunctions(ctx);
        visitChildren(ctx);
        return tabelaSimbolos; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFuncao(MemelangParser.FuncaoContext ctx) {
        if (ctx.ID() == null) {
            return null;
        }
        
       //criaEVaiEscopoNovo(ctx.ID().getText());
        escopoAtual = getEscopoDaFuncao(ctx.ID().getText());
        if(ctx.tipoComVoid().tipo()!=null)
        {
            tipoFuncao = verificarTipo(ctx.tipoComVoid().tipo());
        }
        //visitParametros(ctx.parametros());
        visitBloco(ctx.bloco());        
        if(ctx.tipoComVoid().tipo() != null && !temRetorno && !ctx.ID().getText().equals("divideByZero")){
            this.semanticErrors.add(new ParseCancellationException("Funcao "+ctx.ID().getText()+" não tem retorno necessário"));
            
        }
        temRetorno = false;
        retornaEscopoPai();
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Adiciona todas as funções na tabela de simbolos. Assim se uma função
     * chamar outra função ela vai ver que ela existe.
     *
     * @param ctxProg
     */
    private void markAllFunctions(MemelangParser.ProgContext ctxProg) {
        List<MemelangParser.FuncaoContext> fctx = ctxProg.funcaoInicio().funcao();
        for (MemelangParser.FuncaoContext ctx : fctx) {
            visitTipoComVoid(ctx.tipoComVoid());
            if (Escopo.verificaSeExisteNoEscopo(ctx.ID().getSymbol().getText(), tabelaSimbolos, escopoAtual)) {
                this.semanticErrors.add(new ParseCancellationException("Declaração da Função " + ctx.ID().getSymbol().getText() + " já existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
            }
            boolean usada = false;
            if(ctx.ID().getSymbol().getText().equals("divideByZero")){
                usada = true;
            }
            Identificador id = new Identificador(
                    ctx.ID().getSymbol().getText(),
                    tipoAtual,
                    true,
                    usada,
                    escopoAtual,
                    false,
                    false,
                    0,
                    0,
                    true);
            tabelaSimbolos.add(id);

            escopoAtual = Escopo.criaEVaiEscopoNovo(ctx.ID().getText(), escopoAtual);
            visitParametros(ctx.parametros());
            retornaEscopoPai();
            //visitFuncao(ctx);
        }
    }

    @Override
    public Object visitOp_bitwise(MemelangParser.Op_bitwiseContext ctx) {
        return super.visitOp_bitwise(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitChamadaFuncao(MemelangParser.ChamadaFuncaoContext ctx) {
        Identificador id = Identificador.getUNSAFEId(ctx.ID().getText(), tabelaSimbolos);

        
        //Vê se a função existe
        if (id == null) {
            this.semanticErrors.add(new ParseCancellationException("Chamada de função inexistente na " + ctx.start.getLine() + " coluna " + ctx.start.getCharPositionInLine() + "."));
            return null;
        }        
        id.setUsada(true);
        
        //Captura os parametros da função e numeros
        Escopo escopoFuncao = getEscopoDaFuncao(id.getNome());
        int qtdParametrosNaFuncao;
        List<Identificador> idListParametros = null;        
        if (escopoFuncao != null) {
            idListParametros = Identificador.getParametrosFuncao(escopoFuncao, tabelaSimbolos);
            qtdParametrosNaFuncao = idListParametros.size();
        }else{
            qtdParametrosNaFuncao = 0;
        }
        
        List<Tipo> tiposParam = new ArrayList<>();    
        for (ExpressaoContext expressaoContext : ctx.parametrosChamada().expressao()) {
            tiposParam.add(visitExpressaoLoop(expressaoContext));
        }
        int qtdParametrosChamada = ctx.parametrosChamada().expressao().size();
        
        //Valida se os numeros de parametros bate
        if (qtdParametrosChamada != qtdParametrosNaFuncao) {
            this.semanticErrors.add(new ParseCancellationException("Chamada de função na linha " + ctx.start.getLine() + " coluna " + ctx.start.getCharPositionInLine() + " com numero incorreto de parametros. Esperado: " + qtdParametrosNaFuncao + " Encontrado: " + qtdParametrosChamada));
        }
        //verifica os tipos dos parametros das funcoes
        if(idListParametros!=null && !tiposParam.isEmpty())
        {
            Iterator<Tipo> expIte = tiposParam.iterator();
            Iterator<Identificador> paramIte = idListParametros.iterator();
            while(expIte.hasNext() && paramIte.hasNext())
            {
                Identificador parametroFuncao = paramIte.next();
                Tipo tipoParametroChamada = expIte.next();
                if(parametroFuncao.getTipo() != tipoParametroChamada)
                {
                    this.semanticErrors.add(new ParseCancellationException("Chamada de função na linha " + ctx.start.getLine() + " coluna " + ctx.start.getCharPositionInLine() + " está com parametros com tipos incorretos Esperado: "+parametroFuncao.getTipo().name()+" Recebido: "+tipoParametroChamada.name()));
                }
            }
        }
        visitChildren(ctx);
        return null;

        //Valida se os parametros que estão sendo passados existem se forem IDs
    }

    @Override
    public Object visitIfdeselseif(MemelangParser.IfdeselseifContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("else_if_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitDefaultdes(MemelangParser.DefaultdesContext ctx) {
        return super.visitDefaultdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_neg(MemelangParser.Op_negContext ctx) {
        return super.visitOp_neg(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEntradaesaida(MemelangParser.EntradaesaidaContext ctx) {
        for (MemelangParser.ExpressaoContext exp : ctx.parametrosChamada().expressao()) {
            visitExpressao(exp);
            if(ctx.DEFREAD() != null && exp.val_final(0).ID() == null){
                this.semanticErrors.add(new ParseCancellationException("Tentando ler uma entrada em uma constante na Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
            }
        }
        return null;
    }

    public List<ParseCancellationException> getSemanticErrors() {
        return semanticErrors;
    }

    public List<String> getSemanticWarnings() {
        return semanticWarnings;
    }
    
}
