/*
 * To change this license this.header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.model.visitor;

import br.beholder.memelang.model.analisador.AssemblyName;
import br.beholder.memelang.model.analisador.Escopo;
import br.beholder.memelang.model.analisador.Identificador;
import br.beholder.memelang.model.language.MemelangParser;
import br.beholder.memelang.model.language.MemelangParser.ExpressaoContext;
import br.beholder.memelang.model.language.MemelangParser.Op_bitwiseContext;
import br.beholder.memelang.model.language.MemelangParser.ParametroContext;
import br.beholder.memelang.model.language.MemelangParser.Val_finalContext;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 *
 * @author 5663296
 */
public class BipGeneratorVisitor extends MemeVisitor{
    
    private final StringBuilder header = new StringBuilder();
    private final StringBuilder codigo = new StringBuilder();
    private final List<AssemblyName> anlist;
    private int maiorNumTemporariosNecessarios = 0;
    private int numTemporariosNecessarios = 0;
    private int numRotuloAtual = 0;
    private int contEscopo = 1;

    public BipGeneratorVisitor(List<Identificador> tabelaSimbolos) {
        super(tabelaSimbolos);
        this.anlist = AssemblyName.getMatrix(tabelaSimbolos);
        this.codigo.append(".text\n");
        this.geradorData();
        
    }
    
    public String getCodigo() {
        String lines[] = this.codigo.toString().split("\n");
        int lastReturn = -2;
        StringBuilder finalCode = new StringBuilder();
        finalCode.append(this.header);
        for (int i = 1; i <= this.maiorNumTemporariosNecessarios; i++) {
            finalCode.append("\t");
            finalCode.append("temp");
            finalCode.append(i);
            finalCode.append(" : 0\n");
        }
        for (int i = 0; i < lines.length; i++) {
            if(i - 1 == lastReturn && lines[i].contains("RETURN")){
                lines[i] = "";
            }
            if(lines[i].contains("RETURN")){
                lastReturn = i;
            }
            finalCode.append(lines[i]+"\n");
        }
//        finalCode.append(this.codigo);
        return finalCode.toString();
    }

    private int getOneTemp() {
        this.numTemporariosNecessarios++;
        if (this.maiorNumTemporariosNecessarios < this.numTemporariosNecessarios) {
            this.maiorNumTemporariosNecessarios = this.numTemporariosNecessarios;
        }
        return this.numTemporariosNecessarios;
    }

    private int releaseTheTemp() {
        this.numTemporariosNecessarios--;
        return this.numTemporariosNecessarios;
    }

    private String getOneRot() {
        this.numRotuloAtual++;
        String rot = "rot" + this.numRotuloAtual;
        return rot;
    }

    private void geradorData() {
        this.header.append(".data\n");
        for (Identificador identificador : tabelaSimbolos) {
            if (!identificador.isFuncao()) {
                if (identificador.getTipo() != Identificador.Tipo.INTEIRO) {
                    throw new ParseCancellationException(identificador.getTipo() + " NOT SUPPORTED BY BIPIDE");
                }
                this.header.append("\t");
                this.header.append(AssemblyName.findAN(this.anlist, identificador));
                this.header.append(" : ");
                for (int i = 0; i < identificador.getQtdArmazenada(); i++) {
                    if (i == identificador.getQtdArmazenada() - 1) {
                        this.header.append("0\n");
                    } else {
                        this.header.append("0 , ");
                    }
                }
            }
        }
    }

    @Override
    public Object visitTipoComVoid(MemelangParser.TipoComVoidContext ctx) {
        return super.visitTipoComVoid(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExpressao(MemelangParser.ExpressaoContext ctx) {
        //Primeira operação
//        System.out.println("Expr: " + ctx.getText());
        this.primeiraOperacao(ctx);
        //Demais Operações
        int tempNum;
        MemelangParser.Op_relContext rel = null;
        for (int i = 1; i < ctx.val_final().size(); i++) {
            if (ctx.operations(i - 1).op_rel() != null) {
                tempNum = this.getOneTemp();
                this.comando("STO", "temp" + tempNum);
                rel = ctx.operations(i - 1).op_rel();
                this.comando("LDI", ctx.val_final(i).getText());
            }
            resolveValFinalEOperando(ctx.operations(i - 1), ctx.val_final(i));
        }
        if (rel != null) {
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            comando("SUB", "temp" + tempNum);
            releaseTheTemp();
            releaseTheTemp();

        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    private void resolveSalto(MemelangParser.Op_relContext rel, boolean anti_form, String rot) {
        if (rel.DIFERENTE() != null) {
            if (anti_form) {
                comando("BEQ", rot);
            } else {
                comando("BNE", rot);
            }
        }
        if (rel.IDENTICO() != null) {
            if (anti_form) {
                comando("BNE", rot);
            } else {
                comando("BEQ", rot);
            }
        }
        if (rel.MAIOROUIGUAL() != null) {
            if (anti_form) {
                comando("BLT", rot);
            } else {
                comando("BGE", rot);
            }
        }
        if (rel.MAIORQUE() != null) {
            if (anti_form) {
                comando("BLE", rot);
            } else {
                comando("BGT", rot);
            }
        }
        if (rel.MENOROUIGUAL() != null) {
            if (anti_form) {
                comando("BGT", rot);
            } else {
                comando("BLE", rot);
            }
        }
        if (rel.MENORQUE() != null) {
            if (anti_form) {
                comando("BGE", rot);
            } else {
                comando("BLT", rot);
            }
        }
    }

    private void primeiraOperacao(MemelangParser.ExpressaoContext ctx) {
//        System.out.println("FirstOp: " + ctx.getText());
        MemelangParser.Val_finalContext valctx = ctx.val_final(0);
        //Carregar valor inteiro imediato
        if (valctx.CONSTINTEIRO() != null) {
            comando("LDI", valctx.CONSTINTEIRO().getSymbol().getText());
        }
        //Carrega valor de um ID
        if (valctx.ID() != null) {
            if (valctx.multidimensional() != null) {
                //Carregar valor de vetor
                
                for(ExpressaoContext exp : valctx.multidimensional().expressao()){
                    visitExpressao(exp);
                }
                comando("STO", "$indr");
                comando("LDV", findAN(valctx.ID().getSymbol().getText()).toString());
            } else {
                //Carregar valor de variavel
                String varName = findAN(valctx.ID().getText()).toString();
                comando("LD", varName);
            }
        }
       
        //Chama função
        if (valctx.chamadaFuncao() != null) {
            visitChamadaFuncao(valctx.chamadaFuncao());
        }

        //Resolve outra expressão
        if (valctx.expressao() != null) {
//            System.out.println("exp");
            visitExpressao(valctx.expressao());
        }

        if (ctx.op_neg() != null) {
            if(ctx.op_neg().BITNOT() != null){
                comando("NOT", "0");
            } else if (ctx.op_neg().MENOS() != null) {
                reverteSinalAcc();
            }
        }
//        System.out.println("Caiu fora");
    }

    private void resolveValFinalEOperando(MemelangParser.OperationsContext opctx, MemelangParser.Val_finalContext valctx) {
//        System.out.println("Entrou resolve");
        if (opctx.op_arit_baixa() != null) {
            if (opctx.op_arit_baixa().MAIS() != null) {
                resolveOpAritmeticaMaisOuNegacaoMenos(valctx, true);
            }
        }
        if (opctx.op_bitwise() != null){
            resolveOpBitwise(opctx.op_bitwise(), valctx);
        }
        if (opctx.op_neg() != null) {
            if (opctx.op_neg().MENOS() != null) {
                resolveOpAritmeticaMaisOuNegacaoMenos(valctx, false);
            }
        }
    }
    
    private void resolveOpBitwise(Op_bitwiseContext opBit, Val_finalContext valctx){
//        System.out.println("Entrou " + valctx.getText());
        if (valctx.CONSTINTEIRO() != null) {
            if (opBit.BITAND() != null) {
                comando("ANDI", valctx.CONSTINTEIRO().getSymbol().getText());
            } else if (opBit.BITOR() != null) {
                comando("ORI", valctx.CONSTINTEIRO().getSymbol().getText());
            } else if (opBit.BITXOR() != null){
                comando("XORI", valctx.CONSTINTEIRO().getSymbol().getText());
            } else if (opBit.BITSHIFTLEFT() != null){
                comando("SLL", valctx.CONSTINTEIRO().getSymbol().getText());
            } else if (opBit.BITSHIFTRIGHT() != null){
                comando("SRL", valctx.CONSTINTEIRO().getSymbol().getText());
            } else if (opBit.BITNOT() != null){
                comando("NOT", "0");
            }
            return;
        }
        //Carrega valor de um ID
        if (valctx.ID() != null) {
            if (valctx.multidimensional() != null) {
                //Carregar valor de vetor
                int tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                for(ExpressaoContext exp : valctx.multidimensional().expressao()){
                    visitExpressao(exp);
                }
                comando("STO", "$indr");
                comando("LDV", findAN(valctx.ID().getSymbol().getText()).toString());
                tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                comando("LD", "temp" + (tempNum - 1));
                if(opBit.BITAND() != null){
                    comando("AND", "temp" + tempNum);
                }else if (opBit.BITNOT() != null){
                    comando("NOT", "0");
                }else if (opBit.BITOR() != null ){
                    comando("OR", "temp" + tempNum);
                }else if (opBit.BITSHIFTLEFT() != null){
                    comando("SLL", "temp" + tempNum);
                }else if (opBit.BITSHIFTRIGHT() != null){
                    comando("SRL", "temp" + tempNum);
                }else if(opBit.BITXOR() != null){
                    comando("XOR", "temp" + tempNum);
                }
                releaseTheTemp();
                releaseTheTemp();
                return;

            } else {
                //Carregar valor de variavel
                String varName = findAN(valctx.ID().getText()).toString();
                 if(opBit.BITAND() != null){
                    comando("AND", varName);
                }else if (opBit.BITNOT() != null){
                    comando("NOT", "0");
                }else if (opBit.BITOR() != null ){
                    comando("OR", varName);
                }else if (opBit.BITSHIFTLEFT() != null){
                    comando("SLL", varName);
                }else if (opBit.BITSHIFTRIGHT() != null){
                    comando("SRL", varName);
                }else if(opBit.BITXOR() != null){
                    comando("XOR", varName);
                }
                return;
            }
        }

        //Chama função
        if (valctx.chamadaFuncao() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitChamadaFuncao(valctx.chamadaFuncao());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if(opBit.BITAND() != null){
                comando("AND", "temp" + tempNum);
            }else if (opBit.BITNOT() != null){
                comando("NOT", "0");
            }else if (opBit.BITOR() != null ){
                comando("OR", "temp" + tempNum);
            }else if (opBit.BITSHIFTLEFT() != null){
                comando("SLL", "temp" + tempNum);
            }else if (opBit.BITSHIFTRIGHT() != null){
                comando("SRL", "temp" + tempNum);
            }else if(opBit.BITXOR() != null){
                comando("XOR", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }

        //Resolve outra expressão
        if (valctx.expressao() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitExpressao(valctx.expressao());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if(opBit.BITAND() != null){
                comando("AND", "temp" + tempNum);
            }else if (opBit.BITNOT() != null){
                comando("NOT", "0");
            }else if (opBit.BITOR() != null ){
                comando("OR", "temp" + tempNum);
            }else if (opBit.BITSHIFTLEFT() != null){
                comando("SLL", "temp" + tempNum);
            }else if (opBit.BITSHIFTRIGHT() != null){
                comando("SRL", "temp" + tempNum);
            }else if(opBit.BITXOR() != null){
                comando("XOR", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }
        throw new ParseCancellationException("Outras operações não identificadas" + valctx.getText());
        
    }

    private void resolveOpAritmeticaMaisOuNegacaoMenos(MemelangParser.Val_finalContext valctx, boolean operacaoMais) {
        //ADD ou SUB valor inteiro imediato
        
//        System.out.println("Exp " + valctx.getText());
        
        if (valctx.CONSTINTEIRO() != null) {
            if (operacaoMais) {
                comando("ADDI", valctx.CONSTINTEIRO().getSymbol().getText());
            } else {
                comando("SUBI", valctx.CONSTINTEIRO().getSymbol().getText());
            }
            return;
        }

        //Carrega valor de um ID
        if (valctx.ID() != null) {
            if (valctx.multidimensional() != null) {
                //Carregar valor de vetor
                int tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                for(ExpressaoContext exp : valctx.multidimensional().expressao()){
                    visitExpressao(exp);
                }
                comando("STO", "$indr");
                comando("LDV", findAN(valctx.ID().getSymbol().getText()).toString());
                tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                comando("LD", "temp" + (tempNum - 1));
                if (operacaoMais) {
                    comando("ADD", "temp" + tempNum);
                } else {
                    comando("SUB", "temp" + tempNum);
                }
                releaseTheTemp();
                releaseTheTemp();
                return;

            } else {
                //Carregar valor de variavel
                String varName = findAN(valctx.ID().getText()).toString();
                if (operacaoMais) {
                    comando("ADD", varName);
                } else {
                    comando("SUB", varName);
                }
                return;
            }
        }

        //Chama função
        if (valctx.chamadaFuncao() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitChamadaFuncao(valctx.chamadaFuncao());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if (operacaoMais) {
                comando("ADD", "temp" + tempNum);
            } else {
                comando("SUB", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }

        //Resolve outra expressão
        if (valctx.expressao() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitExpressao(valctx.expressao());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if (operacaoMais) {
                comando("ADD", "temp" + tempNum);
            } else {
                comando("SUB", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }
        throw new ParseCancellationException("Outras operações não identificadas" + valctx.getText());

    }

    private void comando(String comando, String operador) {
        if(!comando.contains(":")){
            this.codigo.append("\t");
        }
        this.codigo.append(comando);
        this.codigo.append(" ");
        this.codigo.append(operador);
        this.codigo.append("\n");
    }

    @Override
    public Object visitVal_final(MemelangParser.Val_finalContext ctx) {
        if (ctx.CONSTINTEIRO() != null) {

        }
        return super.visitVal_final(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_logica(MemelangParser.Op_logicaContext ctx) {
        return super.visitOp_logica(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_bitwise(MemelangParser.Op_bitwiseContext ctx) {
        return super.visitOp_bitwise(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOperations(MemelangParser.OperationsContext ctx) {
        return super.visitOperations(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    private void reverteSinalAcc() {
        int tempNum = getOneTemp();
        comando("STO", "temp" + tempNum);
        comando("LDI", "0");
        comando("SUB", "temp" + tempNum);
        releaseTheTemp();
    }

    @Override
    public Object visitParametrosChamada(MemelangParser.ParametrosChamadaContext ctx) {
        for (ExpressaoContext expressao : ctx.expressao()) {
            visitExpressao(expressao);
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
        }
        for (ExpressaoContext expressao : ctx.expressao()) {
            releaseTheTemp();
        }
        return null;
//        return super.visitParametrosChamada(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTipo(MemelangParser.TipoContext ctx) {
        return super.visitTipo(ctx); //To change body of generated methods, choose Tools | Templates.
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
        return super.visitParametros(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSwitchdes(MemelangParser.SwitchdesContext ctx) {
        return super.visitSwitchdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFuncao(MemelangParser.FuncaoContext ctx) {
        if (ctx.ID() == null) {
            return null;
        }
        AssemblyName an = findAN(ctx.ID().getText());
        escopoAtual = vaiEscopoFilho(an.getId().getNome());
        this.codigo.append(an.toString());
        this.codigo.append(" : \n");
        for (ParametroContext par : ctx.parametros().parametro()) {
            AssemblyName variavel = findAN(par.ID().getText());
            int tempNum = getOneTemp();
            comando("LD", "temp" + tempNum);
            comando("STO", variavel.toString());            
        }
        for (ParametroContext par : ctx.parametros().parametro()) {
            releaseTheTemp();
        }
        
        visitBloco(ctx.bloco()); //To change body of generated methods, choose Tools | Templates.
        if (an.toString().equals("divideByZero")) {
            this.codigo.append("\tHLT\n");
        } else {
            this.codigo.append("\tRETURN\n");
        }
        retornaEscopoPai();
//        visitFuncoes(ctx.funcoes());
        return null;
    }

    @Override
    public Object visitIfdeselse(MemelangParser.IfdeselseContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("else_" + contEscopo++, escopoAtual);
        return super.visitIfdeselse(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIfdes(MemelangParser.IfdesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("if_" + contEscopo++, escopoAtual);
        String rot = getOneRot();
        String rot2 = null;
        visitExpressao(ctx.expressao());
        List<MemelangParser.OperationsContext> operacoes = ctx.expressao().operations();
        for (MemelangParser.OperationsContext operacao : operacoes) {
            if (operacao.op_rel() != null) {
                resolveSalto(operacao.op_rel(), true, rot);
            }
        }
        visitBloco(ctx.bloco());
        if (ctx.ifdeselse() != null || ctx.ifdeselseif() != null) {
            rot2 = getOneRot();
            comando("JMP", rot2);
        }
        comando(rot + " : ", "");

        if (ctx.ifdeselse() != null) {
            visitIfdeselse(ctx.ifdeselse());
            comando(rot2 + " : ", "");
        }
        if (ctx.ifdeselseif() != null) {
            visitIfdeselseif(ctx.ifdeselseif());
            comando(rot2 + " : ", "");
        }
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitCondicionais(MemelangParser.CondicionaisContext ctx) {
        return super.visitCondicionais(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMultidimensional(MemelangParser.MultidimensionalContext ctx) {
        return super.visitMultidimensional(ctx); //To change body of generated methods, choose Tools | Templates.
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
        AssemblyName variavel = findAN(ctx.ID().getText());
        if(variavel == null){
            System.out.println("Null aqui " + ctx.ID().getText());
        }
        if(ctx.atribuicoesIncEDec()!= null){
            if(ctx.atribuicoesIncEDec().MAIS().size()>0)
            {
                comando("LD", variavel.toString());
                comando("ADDI", ""+1);
                comando("STO", variavel.toString());
            }
            else if(ctx.atribuicoesIncEDec().MENOS().size()>0)
            {
                comando("LD", variavel.toString());
                comando("SUBI", ""+1);
                comando("STO", variavel.toString());
            }            
        }
        else if (variavel.getId().getDimensoes() == 0) {
            visitExpressao(ctx.expressao());
            comando("STO", variavel.toString());
        } else {
            visitExpressao(ctx.expressao());
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            for(ExpressaoContext exp : ctx.multidimensional().expressao()){
                visitExpressao(exp);
            }
            //tempNum = getOneTemp();
            //comando("LDI", "temp"+tempNum);
            comando("STO", "$indr");
            comando("LD", "temp" + tempNum);
            releaseTheTemp();
            comando("STOV", variavel.toString());
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitComandos(MemelangParser.ComandosContext ctx) {
        return super.visitComandos(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFordes(MemelangParser.FordesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("for_" + contEscopo++, escopoAtual);
        if(ctx.declaracoes() != null){
            visitDeclaracoes(ctx.declaracoes());
        }else{
            visitAtribuicoes(ctx.atribuicoes(0));
        }
        String rotRest = getOneRot();
        String rotQuit = getOneRot();
        comando(rotRest+" : ", "");
        
        visitExpressao(ctx.expressao());
        
        List<MemelangParser.OperationsContext> operacoes = ctx.expressao().operations();
        for (MemelangParser.OperationsContext operacao : operacoes) {
            if (operacao.op_rel() != null) {
                resolveSalto(operacao.op_rel(), true, rotQuit);
            }
        }
        
        visitBloco(ctx.bloco());
        visitAtribuicoes(ctx.atribuicoes(ctx.atribuicoes().size() - 1));
//        List<MemelangParser.AtribuicoesContext> atris = ctx.atribuicoes();
//        for (MemelangParser.AtribuicoesContext atri : atris) {
//            visitAtribuicoes(atri);
//        }
        
        comando("JMP", rotRest);
        comando(rotQuit+" : ", "");
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitWhiledes(MemelangParser.WhiledesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("while_" + contEscopo++, escopoAtual);
        String rotRest = getOneRot();
        String rotQuit = getOneRot();
        comando(rotRest+" : ", "");
        
        visitExpressao(ctx.expressao());
        
        List<MemelangParser.OperationsContext> operacoes = ctx.expressao().operations();
        for (MemelangParser.OperationsContext operacao : operacoes) {
            if (operacao.op_rel() != null) {
                resolveSalto(operacao.op_rel(), true, rotQuit);
            }
        }
        
        visitBloco(ctx.bloco());
        
        comando("JMP", rotRest);
        comando(rotQuit+" : ", "");
        retornaEscopoPai();
        return null;
    }

    private AssemblyName findAN(String name) {
        System.out.println(escopoAtual);
        return AssemblyName.findAN(this.anlist, Identificador.getId(name, tabelaSimbolos, escopoAtual));
    }

    @Override
    public Object visitDeclaracoes(MemelangParser.DeclaracoesContext ctx) {
        
        visitTipo(ctx.tipo());
        for (MemelangParser.DeclaracaoContext declaracaoContext : ctx.declaracao()) {  
            if(declaracaoContext.IGUAL() != null){
                AssemblyName variavel = findAN(declaracaoContext.ID().getText());
                if (declaracaoContext.multidimensional() == null) {
                    visitExpressao(declaracaoContext.expressao());
                    comando("STO", variavel.toString());
                } else {
                    int iMax = Integer.parseInt(declaracaoContext.multidimensional().expressao(0).getText());
                    for (int i = 0; i < iMax; i++) {
                        visitExpressao(declaracaoContext.declaracoesArray().subArrayDeclaracoes(0).expressao(i));
                        int tempNum = getOneTemp();
                        comando("STO", "temp" + tempNum);
                        comando("LDI", String.valueOf(i));
                        comando("STO", "$indr");
                        comando("LD", "temp" + tempNum);
                        comando("STOV", variavel.toString());
                        releaseTheTemp();
                    }
                }
            }
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitDodes(MemelangParser.DodesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("doWhile_" + contEscopo++, escopoAtual);
        String rotRest = getOneRot();
        String rotQuit = getOneRot();
        comando(rotRest+" : ", "");
        
        visitBloco(ctx.bloco());
        
        visitExpressao(ctx.expressao());
        
        List<MemelangParser.OperationsContext> operacoes = ctx.expressao().operations();
        for (MemelangParser.OperationsContext operacao : operacoes) {
            if (operacao.op_rel() != null) {
                resolveSalto(operacao.op_rel(), true, rotQuit);
            }
        }     
        comando("JMP", rotRest);
        comando(rotQuit+" : ", "");
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitOp_rel(MemelangParser.Op_relContext ctx) {
        return super.visitOp_rel(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBloco(MemelangParser.BlocoContext ctx) {
        visitComandos(ctx.comandos());
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAtribuicoesIncEDec(MemelangParser.AtribuicoesIncEDecContext ctx) {
        return super.visitAtribuicoesIncEDec(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitProg(MemelangParser.ProgContext ctx) {
        escopoAtual = Identificador.getUNSAFEId("divideByZero", tabelaSimbolos).getEscopo();
        this.codigo.append("\tCALL divideByZero\n");
        //JUMP TO MAIN
        return super.visitProg(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEntradaesaida(MemelangParser.EntradaesaidaContext ctx) {
        ExpressaoContext expGeralAtual;
        for (int i = 0; i < ctx.parametrosChamada().expressao().size(); i++) {
            expGeralAtual = ctx.parametrosChamada().expressao().get(i);
//            System.out.println("TEST " + expGeralAtual.val_final(0).getText());
            if (ctx.DEFREAD() != null) {       
                if(expGeralAtual.val_final(0).multidimensional() != null){
                    for(ExpressaoContext exp : expGeralAtual.val_final(0).multidimensional().expressao() ){
                        visitExpressao(exp);
                    }
                    comando("STO", "$indr");
                    comando("LD", "$in_port");
                    comando("STOV", findAN(expGeralAtual.val_final(0).ID().getText()).toString());
                }else{
                    comando("LD", "$in_port");
                    comando("STO", findAN(expGeralAtual.getText()).toString());
                }


            } else if (ctx.DEFWRITE() != null) {
                int tempNum = getOneTemp();
                if(expGeralAtual.val_final(0).multidimensional() != null){
                    for(ExpressaoContext exp : expGeralAtual.val_final(0).multidimensional().expressao() ){
                        visitExpressao(exp);
                    }
                    comando("STO", "$indr");
                    comando("LDV", findAN(expGeralAtual.val_final(0).ID().getText()).toString());
                }else{
                    visitExpressao(expGeralAtual);
                }
                comando("STO", "$out_port");
                releaseTheTemp();
            }
        }

        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public Object visitChamadaFuncao(MemelangParser.ChamadaFuncaoContext ctx) {        
        visitParametrosChamada(ctx.parametrosChamada());
        if(ctx.ID() == null){
            System.out.println("Satan " + ctx.getText());
        }else{
            System.out.println("782785");
                    String funName = findAN(ctx.ID().getText()).toString();
        comando("CALL", funName);
        }

        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIfdeselseif(MemelangParser.IfdeselseifContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("else_if_" + contEscopo++, escopoAtual);
        return super.visitIfdeselseif(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitRetorno(MemelangParser.RetornoContext ctx) {
        visitExpressao(ctx.expressao());
        this.codigo.append("\tRETURN\n");
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDefaultdes(MemelangParser.DefaultdesContext ctx) {
        return super.visitDefaultdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_neg(MemelangParser.Op_negContext ctx) {
        return super.visitOp_neg(ctx); //To change body of generated methods, choose Tools | Templates.
    }
}
