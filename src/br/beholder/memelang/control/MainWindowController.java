/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.control;

import br.beholder.memelang.model.executor.MemeLanguageCompiler;
import br.beholder.memelang.ui.MainPanel;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import org.antlr.v4.gui.TreeViewer;

/**
 *
 * @author 5674867
 */
public class MainWindowController {
    private MainPanel mainWindow;
    private MemeLanguageCompiler compiler = new MemeLanguageCompiler();
    
    public MainWindowController(MainPanel mainWindow) {
        this.mainWindow = mainWindow;
    }
    
    public void prepararCompilacao(){
        this.mainWindow.getTextAreaMensagens().setText("");
        this.compiler.realizarCompilacao(this.mainWindow.getTextAreaCodigo().getText());
        
        if (this.compiler.getErroLexico().getErrors().isEmpty()){
            this.mainWindow.getTextAreaMensagens().append("Compilação realizada com Sucesso\n");
        }else{
            for (String errin : this.compiler.getErroLexico().getErrors()){
                System.out.println(errin);
                this.mainWindow.getTextAreaMensagens().append(errin + "\n");
            } 
        }
    }
    
    public void exibirArvoreSintatica(){
        if(this.compiler.getTree() == null){
            JOptionPane.showMessageDialog(this.mainWindow, "É necessário compilar antes de gerar a árvore");
            return;
        }
        JFrame frame = new JFrame("Árvore Sintática");
        frame.setContentPane(new JScrollPane(new TreeViewer(Arrays.asList(this.compiler.getParser().getRuleNames()), this.compiler.getTree())));
        frame.setPreferredSize( new Dimension(800, 600));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public void prepararCarregamentoArquivo(){
        try {
            String codigoCarregado = FileController.getMemeCode();
            if("".equals(codigoCarregado)){
                return;
            }
            this.mainWindow.getTextAreaCodigo().setText(codigoCarregado);
            this.mainWindow.getTextAreaMensagens().setText("");
            this.compiler = new MemeLanguageCompiler();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this.mainWindow, "Erro no carregamento do arquivo");
        }
    }
    
    public void prepararSalvamentoArquivo(){
        int returnSave = FileController.salvarTexto(this.mainWindow.getTextAreaCodigo().getText());
        if(returnSave == 1){
            this.mainWindow.getTextAreaMensagens().append("Código salvo com sucesso\n");
        }else if(returnSave == 0){
            this.mainWindow.getTextAreaMensagens().append("Falha ao salvar\n");
        }
    }
}
