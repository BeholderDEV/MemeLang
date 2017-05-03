/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.ui;

import br.beholder.memelang.control.MainWindowController;
import br.beholder.memelang.ui.swing.rsa.MemeFoldParser;
import br.beholder.memelang.ui.swing.webLaf.WeblafUtils;
import br.beholder.memelang.ui.utils.ColorController;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JTextArea;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.Theme;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.folding.FoldParserManager;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 *
 * @author lite
 */
public class MainPanel extends javax.swing.JPanel {
    
    int pX, pY;
    
    private MainWindowController controller;
    RSyntaxTextArea textArea;
    RTextScrollPane sp;
    
    private Theme carregarTema(){
        final String caminho = "br/beholder/memelang/ui/resources/dark.xml";
        final InputStream resourceStream = ClassLoader.getSystemClassLoader().getResourceAsStream(caminho);
        if (resourceStream != null) {
            try {
                return Theme.load(resourceStream);
            } catch (IOException e) {
                
            }
        }        return null;
    }
    
    public MainPanel() {
        controller = new MainWindowController(this);
        initComponents();
        textArea = new RSyntaxTextArea(20, 60);
        
        AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory)TokenMakerFactory.getDefaultInstance();
        atmf.putMapping("text/myLanguage", "br.beholder.memelang.ui.swing.rsa.MemeTokenMaker");
        
        FoldParserManager.get().addFoldParserMapping("text/myLanguage", new MemeFoldParser());
        textArea.setSyntaxEditingStyle("text/myLanguage");
        textArea.setCodeFoldingEnabled(true);
        Theme theme = carregarTema();
        theme.apply(textArea);
        sp = new RTextScrollPane(textArea);
        editorPane.add(sp);
        configurarCores();
    }
    private void configurarCores(){
        this.setBackground(ColorController.COR_PRINCIPAL);
        jPanel1.setBackground(ColorController.COR_PRINCIPAL);
        jPanel2.setBackground(ColorController.COR_PRINCIPAL);
        editorPane.setBackground(ColorController.COR_DESTAQUE);
        console.setBackground(ColorController.FUNDO_ESCURO);
        console.setForeground(ColorController.COR_LETRA);
        WeblafUtils.instalaWeblaf();
        WeblafUtils.configuraWebLaf(jScrollPane1);
        WeblafUtils.configuraWebLaf(sp);
        WeblafUtils.configurarBotao(compileButton, ColorController.COR_PRINCIPAL, ColorController.COR_LETRA, ColorController.COR_DESTAQUE, ColorController.COR_LETRA, 5);
        WeblafUtils.configurarBotao(openfileButton, ColorController.COR_PRINCIPAL, ColorController.COR_LETRA, ColorController.COR_DESTAQUE, ColorController.COR_LETRA, 5);
        WeblafUtils.configurarBotao(savefileButton, ColorController.COR_PRINCIPAL, ColorController.COR_LETRA, ColorController.COR_DESTAQUE, ColorController.COR_LETRA, 5);
        WeblafUtils.configurarBotao(generatetreeButton, ColorController.COR_PRINCIPAL, ColorController.COR_LETRA, ColorController.COR_DESTAQUE, ColorController.COR_LETRA, 5);
        WeblafUtils.configurarBotao(generatetableButton, ColorController.COR_PRINCIPAL, ColorController.COR_LETRA, ColorController.COR_DESTAQUE, ColorController.COR_LETRA, 5);
    }
    
    public JTextArea getTextAreaCodigo() {
        return textArea;
    }

    public JTextArea getTextAreaMensagens() {
        return console;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        openfileButton = new com.alee.laf.button.WebButton();
        savefileButton = new com.alee.laf.button.WebButton();
        compileButton = new com.alee.laf.button.WebButton();
        generatetreeButton = new com.alee.laf.button.WebButton();
        generatetableButton = new com.alee.laf.button.WebButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        editorPane = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setLayout(new java.awt.BorderLayout(5, 5));

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel2.setLayout(new java.awt.BorderLayout(5, 5));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        openfileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/beholder/memelang/ui/resources/stop.png"))); // NOI18N
        openfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openfileButtonActionPerformed(evt);
            }
        });
        jPanel1.add(openfileButton);

        savefileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/beholder/memelang/ui/resources/save.png"))); // NOI18N
        savefileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefileButtonActionPerformed(evt);
            }
        });
        jPanel1.add(savefileButton);

        compileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/beholder/memelang/ui/resources/play.png"))); // NOI18N
        compileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compileButtonActionPerformed(evt);
            }
        });
        jPanel1.add(compileButton);

        generatetreeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/beholder/memelang/ui/resources/stop.png"))); // NOI18N
        generatetreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatetreeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(generatetreeButton);

        generatetableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/beholder/memelang/ui/resources/stop.png"))); // NOI18N
        generatetableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatetableButtonActionPerformed(evt);
            }
        });
        jPanel1.add(generatetableButton);

        jPanel2.add(jPanel1, java.awt.BorderLayout.WEST);

        console.setEditable(false);
        console.setColumns(20);
        console.setRows(5);
        jScrollPane1.setViewportView(console);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.PAGE_END);

        editorPane.setLayout(new java.awt.BorderLayout());
        jPanel2.add(editorPane, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void openfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openfileButtonActionPerformed
        this.controller.prepararCarregamentoArquivo();
    }//GEN-LAST:event_openfileButtonActionPerformed

    private void savefileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefileButtonActionPerformed
        this.controller.prepararSalvamentoArquivo();
    }//GEN-LAST:event_savefileButtonActionPerformed

    private void compileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compileButtonActionPerformed
        this.controller.prepararCompilacao();
    }//GEN-LAST:event_compileButtonActionPerformed

    private void generatetreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatetreeButtonActionPerformed
        this.controller.exibirArvoreSintatica();
    }//GEN-LAST:event_generatetreeButtonActionPerformed

    private void generatetableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatetableButtonActionPerformed
        this.controller.exibirTabela();
    }//GEN-LAST:event_generatetableButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.button.WebButton compileButton;
    private javax.swing.JTextArea console;
    private javax.swing.JPanel editorPane;
    private com.alee.laf.button.WebButton generatetableButton;
    private com.alee.laf.button.WebButton generatetreeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.alee.laf.button.WebButton openfileButton;
    private com.alee.laf.button.WebButton savefileButton;
    // End of variables declaration//GEN-END:variables
}
