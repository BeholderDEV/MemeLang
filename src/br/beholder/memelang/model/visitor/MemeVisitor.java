/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.model.visitor;

import br.beholder.memelang.model.language.MemelangBaseVisitor;
import br.beholder.memelang.model.analisador.Escopo;
import br.beholder.memelang.model.analisador.Identificador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alisson
 */
public abstract class MemeVisitor extends MemelangBaseVisitor<Object>{
    protected final List<Identificador> tabelaSimbolos;
    protected Escopo escopoAtual;
    protected Identificador.Tipo tipoAtual;
    protected int multidimensional;
    protected int qtdMultidimensional;
    protected enum Operation{
        OR,AND,NOT,
        MAIORQUE,MENORQUE,MAIOROUIGUAL,MENOROUIGUAL,IDENTICO,DIFERENTE,
        BITSHIFTLEFT,BITSHIFTRIGHT,BITNOT,
        SUBTRACAO,SOMA,MOD,MULTIPLICACAO,DIVISAO
    };
    protected Operation operacao;
    /**
     * Construtor do analisador semantico, Pode aceitar uma tabela de simbolos
     * pré iniciada.
     *
     * @param tabelaSimbolos pode ser NULL
     */
    protected MemeVisitor(List<Identificador> tabelaSimbolos)
    {
        if (tabelaSimbolos != null)
        {
            this.tabelaSimbolos = tabelaSimbolos;
        } else
        {
            this.tabelaSimbolos = new ArrayList();
        }
    }
    protected Escopo vaiEscopoFilho(String nome){
        List<Escopo> subs = escopoAtual.getSubEscopos();
        for (Escopo sub : subs) {
            if(sub.getNome().equals(nome)){
                return sub;
            }
        }
        return null;
    }
    protected void retornaEscopoPai()
    {
        escopoAtual = escopoAtual.getPai();
    }
}
