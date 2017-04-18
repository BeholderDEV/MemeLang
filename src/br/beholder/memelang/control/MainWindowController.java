/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.control;

import br.beholder.memelang.model.analisador.ErroLexico;
import br.beholder.memelang.model.language.MemelangLexer;
import br.beholder.memelang.model.language.MemelangParser;
import br.beholder.memelang.view.MainWindow;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author 5674867
 */
public class MainWindowController {
    private MainWindow mainWindow;

    public MainWindowController() {
        this.mainWindow = new MainWindow(this);
        this.mainWindow.setLocationRelativeTo(null);
        this.mainWindow.setVisible(true);
    }
    
    public void prepararCompilacao(){
        ANTLRInputStream ais = new ANTLRInputStream(this.mainWindow.getTextAreaCodigo().getText());
        MemelangLexer lexer = new MemelangLexer(ais);//*
        CommonTokenStream stream = new CommonTokenStream(lexer);//*
        MemelangParser parser = new MemelangParser(stream);//*
        lexer.removeErrorListeners();
        parser.removeErrorListeners();

        // Instala o tratador de erros personalizado que irá exibir as mensagens
        // em tela na JList
        ErroLexico erro = new ErroLexico();
        lexer.addErrorListener(erro);
        parser.addErrorListener(erro);
        
        if (erro.getErrors().isEmpty())
        {
            ParseTree tree = parser.prog(); //*
            JFrame frame = new JFrame("Antlr AST");
            JPanel panel = new JPanel();
            TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
            viewr.setScale(1);//scale a little
            panel.add(viewr);
            frame.add(panel);
            frame.setSize(200,200);
            frame.setVisible(true);
            System.out.println("oi");
            
        }
        for (String errin : erro.getErrors())
        {
            System.out.println(errin);
        } 
    }
    
    
}
