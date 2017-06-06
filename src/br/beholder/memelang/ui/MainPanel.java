/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.ui;

import br.beholder.memelang.control.MainWindowController;
import br.beholder.memelang.ui.swing.rsa.MemeFoldParser;
import br.beholder.memelang.ui.swing.webLaf.PSOutTabbedPaneUI;
import br.beholder.memelang.ui.swing.webLaf.PSWebTabbedPaneUI;
import br.beholder.memelang.ui.swing.webLaf.WeblafUtils;
import br.beholder.memelang.ui.utils.ColorController;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
    RSyntaxTextArea memeCodeTextArea;
    RTextScrollPane memeCodeScrollPane;
    
    RSyntaxTextArea assemblyTextArea;
    RTextScrollPane assemblyScrollPane;
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
        memeCodeTextArea = new RSyntaxTextArea(20, 60);
        assemblyTextArea = new RSyntaxTextArea(20, 60);
        
        AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory)TokenMakerFactory.getDefaultInstance();
        atmf.putMapping("text/myLanguage", "br.beholder.memelang.ui.swing.rsa.MemeTokenMaker");
        atmf.putMapping("text/bipLanguage", "br.beholder.memelang.ui.swing.rsa.BipTokenMaker");
        
        FoldParserManager.get().addFoldParserMapping("text/myLanguage", new MemeFoldParser());
        memeCodeTextArea.setSyntaxEditingStyle("text/myLanguage");
        memeCodeTextArea.setCodeFoldingEnabled(true);
        
        assemblyTextArea.setEditable(false);
        assemblyTextArea.setSyntaxEditingStyle("text/bipLanguage");
        //assemblyTextArea.setCodeFoldingEnabled(true);
        
        Theme theme = carregarTema();
        theme.apply(memeCodeTextArea);
        theme.apply(assemblyTextArea);
        memeCodeScrollPane = new RTextScrollPane(memeCodeTextArea);
        assemblyScrollPane = new RTextScrollPane(assemblyTextArea);
        editorPane.add(memeCodeScrollPane);
        assemblyPanel.add(assemblyScrollPane);
        configurarCores();
    }
    private void configurarCores(){
        
        WeblafUtils.instalaWeblaf();
        if(WeblafUtils.weblafEstaInstalado()){
            this.setBackground(ColorController.COR_PRINCIPAL);
            jPanel1.setBackground(ColorController.COR_PRINCIPAL);
            jPanel2.setBackground(ColorController.COR_PRINCIPAL);
            jPanel4.setBackground(ColorController.COR_PRINCIPAL);
            jPanel7.setBackground(ColorController.COR_PRINCIPAL);
            messagesPane.setBackground(ColorController.COR_DESTAQUE);
            editorPane.setBackground(ColorController.COR_DESTAQUE);
            assemblyPanel.setBackground(ColorController.COR_DESTAQUE);
            identifiersPane.setBackground(ColorController.COR_DESTAQUE);
            console.setBackground(ColorController.FUNDO_ESCURO);
            console.setForeground(ColorController.COR_LETRA);
            WeblafUtils.configuraWebLaf(jScrollPane1);
            jTabbedPane1.setUI(new PSOutTabbedPaneUI());
            jTabbedPane1.setForeground(ColorController.COR_LETRA);
            jTabbedPane2.setUI(new PSOutTabbedPaneUI());
            jTabbedPane2.setForeground(ColorController.COR_LETRA);
            WeblafUtils.configuraWebLaf(memeCodeScrollPane);
            WeblafUtils.configuraWebLaf(assemblyScrollPane);
            WeblafUtils.configurarBotao(compileButton, ColorController.COR_PRINCIPAL, ColorController.COR_LETRA, ColorController.COR_DESTAQUE, ColorController.COR_LETRA, 5);
            WeblafUtils.configurarBotao(generateCodeButton, ColorController.COR_PRINCIPAL, ColorController.COR_LETRA, ColorController.COR_DESTAQUE, ColorController.COR_LETRA, 5);
            WeblafUtils.configurarBotao(openfileButton, ColorController.COR_PRINCIPAL, ColorController.COR_LETRA, ColorController.COR_DESTAQUE, ColorController.COR_LETRA, 5);
            WeblafUtils.configurarBotao(savefileButton, ColorController.COR_PRINCIPAL, ColorController.COR_LETRA, ColorController.COR_DESTAQUE, ColorController.COR_LETRA, 5);
            WeblafUtils.configurarBotao(generatetreeButton, ColorController.COR_PRINCIPAL, ColorController.COR_LETRA, ColorController.COR_DESTAQUE, ColorController.COR_LETRA, 5);
            WeblafUtils.configurarBotao(tabelatiposButton, ColorController.COR_PRINCIPAL, ColorController.COR_LETRA, ColorController.COR_DESTAQUE, ColorController.COR_LETRA, 5);
        }
    }
    
    public JTextArea getTextAreaCodigo() {
        return memeCodeTextArea;
    }

    public JTextArea getTextAreaAssembly() {
        return assemblyTextArea;
    }
    
    public JTextArea getTextAreaMensagens() {
        return console;
    }
    
    public JPanel getMessagesPane() {
        return messagesPane;
    }
//    public JPanel getTreePanel() {
//        return treePanel;
//    }
    
    public JPanel getIdentifiersPane() {
        return identifiersPane;
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
        jPanel4 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        openfileButton = new com.alee.laf.button.WebButton();
        savefileButton = new com.alee.laf.button.WebButton();
        compileButton = new com.alee.laf.button.WebButton();
        generatetreeButton = new com.alee.laf.button.WebButton();
        tabelatiposButton = new com.alee.laf.button.WebButton();
        generateCodeButton = new com.alee.laf.button.WebButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        editorPane = new javax.swing.JPanel();
        assemblyPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        messagesPane = new javax.swing.JPanel();
        identifiersPane = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(1024, 600));
        setLayout(new java.awt.BorderLayout(5, 5));

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel2.setLayout(new java.awt.BorderLayout(5, 5));

        jPanel4.setLayout(new java.awt.BorderLayout());

        jSplitPane2.setDividerLocation(500);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        openfileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/beholder/memelang/ui/resources/folder.png"))); // NOI18N
        openfileButton.setToolTipText("");
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

        generatetreeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/beholder/memelang/ui/resources/tree.png"))); // NOI18N
        generatetreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatetreeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(generatetreeButton);

        tabelatiposButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/beholder/memelang/ui/resources/table.png"))); // NOI18N
        tabelatiposButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabelatiposButtonActionPerformed(evt);
            }
        });
        jPanel1.add(tabelatiposButton);

        generateCodeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/beholder/memelang/ui/resources/terminal.png"))); // NOI18N
        generateCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateCodeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(generateCodeButton);

        jPanel7.add(jPanel1, java.awt.BorderLayout.WEST);

        editorPane.setLayout(new java.awt.BorderLayout());
        jTabbedPane2.addTab("Meme Code", editorPane);

        assemblyPanel.setLayout(new java.awt.BorderLayout());
        jTabbedPane2.addTab("Assembly Code", assemblyPanel);

        jPanel7.add(jTabbedPane2, java.awt.BorderLayout.CENTER);

        jSplitPane2.setLeftComponent(jPanel7);

        console.setEditable(false);
        console.setColumns(20);
        console.setRows(5);
        jScrollPane1.setViewportView(console);

        jTabbedPane1.addTab("Console", jScrollPane1);

        messagesPane.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Messages", messagesPane);

        identifiersPane.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Identifiers", identifiersPane);

        jSplitPane2.setRightComponent(jTabbedPane1);

        jPanel4.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

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

    private void tabelatiposButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabelatiposButtonActionPerformed
        this.controller.abrirTabelaTipos();
    }//GEN-LAST:event_tabelatiposButtonActionPerformed

    private void generateCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateCodeButtonActionPerformed
        this.controller.exibirCodigoAssembly();
    }//GEN-LAST:event_generateCodeButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel assemblyPanel;
    private com.alee.laf.button.WebButton compileButton;
    private javax.swing.JTextArea console;
    private javax.swing.JPanel editorPane;
    private com.alee.laf.button.WebButton generateCodeButton;
    private com.alee.laf.button.WebButton generatetreeButton;
    private javax.swing.JPanel identifiersPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel messagesPane;
    private com.alee.laf.button.WebButton openfileButton;
    private com.alee.laf.button.WebButton savefileButton;
    private com.alee.laf.button.WebButton tabelatiposButton;
    // End of variables declaration//GEN-END:variables
}
