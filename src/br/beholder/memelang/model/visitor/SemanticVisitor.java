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
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.TerminalNode;



/**
 *
 * @author Alisson
 */
public class SemanticVisitor extends MemeVisitor{
    
    List<ParseCancellationException> semanticErrors = new ArrayList<ParseCancellationException>();
    
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

    @Override
    public Object visitExpressao(MemelangParser.ExpressaoContext ctx) {
        if (ctx == null) {
            return null;
        }
        for (int i = 0; i < ctx.val_final().size(); i++) {
            if (ctx.val_final(i).ID() != null) {
                TerminalNode tn = ctx.val_final(i).ID();
                Identificador id = Identificador.getId(tn.getSymbol().getText(), tabelaSimbolos, escopoAtual);
                if (ctx.val_final(i).multidimensional() != null) {
                    visitMultidimensional(ctx.val_final(i).multidimensional());
                } else {
                    multidimensional = 0;
                }
                if (id == null) {
                    this.semanticErrors.add(new ParseCancellationException("Váriavel " + ctx.val_final(i).ID() + " não existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
                } else if (!id.isInicializada()) {
                    this.semanticErrors.add(new ParseCancellationException("Váriavel " + ctx.val_final(i).ID() + " não inicializada Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
                } else if (id.getDimensoes() != multidimensional) {
                    this.semanticErrors.add(new ParseCancellationException("Dimensões incorreta do vetor " + ctx.val_final(i).ID() + " . Ele possui " + id.getDimensoes() + " dimensões e foi usada " + multidimensional + " Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
                } else {
                    System.out.println("Expressão em " + id.getNome() + " Escopo atual " + escopoAtual + " Escopo dele " + id.getEscopo() );
                    id.setUsada(true);
                }
                return null;
            }
        }

        return super.visitExpressao(ctx); //To change body of generated methods, choose Tools | Templates.
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
        return super.visitRetorno(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitParametrosChamada(MemelangParser.ParametrosChamadaContext ctx) {
        return super.visitParametrosChamada(ctx); //To change body of generated methods, choose Tools | Templates.
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
            tipoAtual = Tipo.TEXTO;
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
            System.out.println("Parametro: "+ idName +" do tipo" + tipoAtual + "  no escopo "+escopoAtual.getNome()+" qtdMultidimensional: " + qtdMultidimensional + " Mult " + multidimensional);
            visitTipo(ctx.parametro(i).tipo());
            Identificador id = new Identificador(
                    idName,
                    tipoAtual,
                    true,
                    false,
                    escopoAtual,
                    true,
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
        escopoAtual = Escopo.criaEVaiEscopoNovo("else", escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitIfdes(MemelangParser.IfdesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("if", escopoAtual);
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
        System.out.println("Atribuindo "+ id.getNome() +" a variavel " + id.getNome());
        if (id == null) {
            this.semanticErrors.add(new ParseCancellationException("Váriavel " + ctx.ID() + " não existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
        }
        if (ctx.atribuicoesIncEDec() != null && !id.isInicializada()) {
            this.semanticErrors.add(new ParseCancellationException("Váriavel " + ctx.ID() + " não inicializada Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
        }

        boolean usada = id.isUsada();
        visitExpressao(ctx.expressao());
        id.setUsada(usada);

        id.setInicializada(true);

        return super.visitAtribuicoes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitComandos(MemelangParser.ComandosContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitFordes(MemelangParser.FordesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("for", escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitWhiledes(MemelangParser.WhiledesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("while", escopoAtual);
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
            }else{
                System.out.println("vou salvar a variável: "+id.getSymbol().getStartIndex()+" do tipo" + tipoAtual + "  no escopo "+escopoAtual.getNome()+" inicializada: "+inicializada);
            }
            Identificador ident = new Identificador(
                    id.getSymbol().getText(),
                    tipoAtual,
                    inicializada,
                    false,
                    escopoAtual,
                    false,
                    0,
                    multidimensional,
                    qtdMultidimensional,
                    false);
            tabelaSimbolos.add(ident);
            visitChildren(ctx);
        }
        
        return null;
    }

    @Override
    public Object visitDodes(MemelangParser.DodesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("while", escopoAtual);
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
    public Object visitFuncoes(MemelangParser.FuncoesContext ctx) {
        if (ctx.ID() == null) {
            return null;
        }

        //criaEVaiEscopoNovo(ctx.ID().getText());
        escopoAtual = getEscopoDaFuncao(ctx.ID().getText());
        //visitParametros(ctx.parametros());
        visitBloco(ctx.bloco());
        retornaEscopoPai();
        visitFuncoes(ctx.funcoes());

        return null; //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Adiciona todas as funções na tabela de simbolos. Assim se uma função
     * chamar outra função ela vai ver que ela existe.
     *
     * @param ctxProg
     */
    private void markAllFunctions(MemelangParser.ProgContext ctxProg) {
        MemelangParser.FuncoesContext ctx = ctxProg.funcaoInicio().funcoes();
        while (ctx.ID() != null) {
            visitTipoComVoid(ctx.tipoComVoid());
            if (Escopo.verificaSeExisteNoEscopo(ctx.ID().getSymbol().getText(), tabelaSimbolos, escopoAtual)) {
                this.semanticErrors.add(new ParseCancellationException("Declaração de Váriavel " + ctx.ID().getSymbol().getText() + " já existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));
            }
            Identificador id = new Identificador(
                    ctx.ID().getSymbol().getText(),
                    tipoAtual,
                    true,
                    false,
                    escopoAtual,
                    false,
                    0,
                    0,
                    true);
            tabelaSimbolos.add(id);

            escopoAtual = Escopo.criaEVaiEscopoNovo(ctx.ID().getText(), escopoAtual);
            visitParametros(ctx.parametros());
            retornaEscopoPai();
            ctx = ctx.funcoes();
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
        //Captura os parametros da função e numeros
        Escopo escopoFuncao = getEscopoDaFuncao(id.getNome());
        int qtdParametrosNaFuncao;
        if (escopoFuncao != null) {
            List<Identificador> idListParametros = Identificador.getParametrosFuncao(escopoFuncao, tabelaSimbolos);
            qtdParametrosNaFuncao = idListParametros.size();
        }else{
            qtdParametrosNaFuncao = 0;
        }
        int qtdParametrosChamada = ctx.parametrosChamada().expressao().size();

        //Valida se os numeros de parametros bate
        if (qtdParametrosChamada != qtdParametrosNaFuncao) {
            this.semanticErrors.add(new ParseCancellationException("Chamada de função na linha " + ctx.start.getLine() + " coluna " + ctx.start.getCharPositionInLine() + " com numero incorreto de parametros. Esperado: " + qtdParametrosNaFuncao + " Encontrado: " + qtdParametrosChamada));
        }
        visitChildren(ctx);
        return null;

        //Valida se os parametros que estão sendo passados existem se forem IDs
    }

    @Override
    public Object visitIfdeselseif(MemelangParser.IfdeselseifContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("else if", escopoAtual);
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

    public List<ParseCancellationException> getSemanticErrors() {
        return semanticErrors;
    }
    
}
