/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.model.executor;

import br.beholder.memelang.model.analisador.ErroLexico;
import br.beholder.memelang.model.language.MemelangLexer;
import br.beholder.memelang.model.language.MemelangParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Augustop
 */
public class MemeLanguageCompiler {
    ANTLRInputStream ais;
    MemelangLexer lexer;
    CommonTokenStream stream;
    MemelangParser parser;
    ErroLexico erroLexico;
    ParseTree tree;
    
    public void realizarCompilacao(String txt){
        this.ais = new ANTLRInputStream(txt);
        this.lexer = new MemelangLexer(ais);
        this.stream = new CommonTokenStream(lexer);
        this.parser = new MemelangParser(stream);
        this.erroLexico = new ErroLexico();
        this.lexer.removeErrorListeners();
        this.parser.removeErrorListeners();
        this.lexer.addErrorListener(erroLexico);
        this.parser.addErrorListener(erroLexico);
        this.tree = parser.prog();
    }

    public ParseTree getTree() {
        return tree;
    }

    public MemelangParser getParser() {
        return parser;
    }
    
    public ErroLexico getErroLexico() {
        return erroLexico;
    }
}
