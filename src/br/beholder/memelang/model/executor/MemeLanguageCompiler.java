/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.model.executor;

import br.beholder.memelang.model.analisador.ErroLexico;
import br.beholder.memelang.model.analisador.FuncoesPadroes;
import br.beholder.memelang.model.analisador.Identificador;
import br.beholder.memelang.model.language.MemelangLexer;
import br.beholder.memelang.model.language.MemelangParser;
import br.beholder.memelang.model.visitor.SemanticVisitor;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
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
    TableModel model;

    public TableModel getModel() {
        return model;
    }
    
    
    List<Identificador> ids = null;
    private TableModel getModel(List<Identificador> ids)
    {
        DefaultTableModel tm = new DefaultTableModel();
        tm.addColumn("nome");
        tm.addColumn("tipo");
        tm.addColumn("inicializada");
        tm.addColumn("usada");
        tm.addColumn("escopo");
        tm.addColumn("parametro");
        tm.addColumn("posicaoParametro");
        tm.addColumn("dimensões");
        tm.addColumn("função");
        for (Identificador id : ids)
        {
            Vector vector = new Vector();
            vector.add(id.getNome());
            vector.add(id.getTipo());
            vector.add(id.isInicializada());
            vector.add(id.isUsada());
            vector.add(id.getEscopo());
            vector.add(id.isParametro());
            vector.add(id.getPosicaoParametro());
            vector.add(id.getDimensoes());
            vector.add(id.isFuncao());
            tm.addRow(vector);
        }
        return tm;
    }
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
        if(erroLexico.getErrors().isEmpty()){
            SemanticVisitor semantic = new SemanticVisitor(FuncoesPadroes.gerarFuncoesPadroes(FuncoesPadroes.Compilador.BIPIDE));
            try
            {
                semantic.visit(tree);
                ids = semantic.getTabelaSimbolos();
                model = getModel(ids);
                if(!semantic.getSemanticErrors().isEmpty()){
                    for (ParseCancellationException err : semantic.getSemanticErrors()) {
                        erroLexico.getErrors().add(err.getMessage());
                    }
                    return;
                }
            } catch (Exception e)
            {
                erroLexico.getErrors().add(e.getLocalizedMessage());
            }
        }
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
