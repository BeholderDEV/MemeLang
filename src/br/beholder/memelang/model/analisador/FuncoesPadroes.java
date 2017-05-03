/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.model.analisador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alisson
 */
public class FuncoesPadroes {
    
    public enum Compilador{
        BIPIDE
    }
    
    public enum NomeDescente {

        LEIA, ESCREVA
    }

    public static List<Identificador> gerarFuncoesPadroes(Compilador compilador) {
        switch(compilador){
            case BIPIDE:
                return gerarFuncoesPadraoBipide();
            default:
                return null;
        }
    }
    
    private static List<Identificador> gerarFuncoesPadraoBipide(){
        List<Identificador> ids = new ArrayList();
//        Escopo baseFunctionsScope = new Escopo("baseFunctions");
//        Identificador id = new Identificador(getNome(NomeDescente.LEIA), Identificador.Tipo.INTEIRO, false, true, baseFunctionsScope, false, 0, 0, true);
//        ids.add(id);
//        id = new Identificador(getNome(NomeDescente.ESCREVA), Identificador.Tipo.VOID, false, true, baseFunctionsScope, false, 0, 0, true);
//        ids.add(id);
//        id = new Identificador("parametro", Identificador.Tipo.INTEIRO, true, false, Escopo.criaEVaiEscopoNovo(getNome(NomeDescente.ESCREVA), baseFunctionsScope), true, 1, 0, false);
//        ids.add(id);
        
        return ids;
    }
    
    public static String getNome(NomeDescente nome) {
        switch (nome) {
            case ESCREVA:
                return "escreva";
            case LEIA:
                return "leia";
            default:
                return "Deu Merda lá nas funcoes padrões";
        }
    }
}
