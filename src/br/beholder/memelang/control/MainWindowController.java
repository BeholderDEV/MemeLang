/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.control;

import br.beholder.memelang.model.executor.MemeLanguageCompiler;
import br.beholder.memelang.ui.MainPanel;
import br.beholder.memelang.ui.swing.webLaf.AjustadorLinhaTabelaMensagensCompilador;
import br.beholder.memelang.ui.swing.webLaf.ExampleTreeRender;
import br.beholder.memelang.ui.swing.webLaf.PSTreeUI;
import br.beholder.memelang.ui.swing.webLaf.RenderizadorTabelaMensagensCompilador;
import br.beholder.memelang.ui.swing.webLaf.WebHeaderRenderer;
import br.beholder.memelang.ui.swing.webLaf.WeblafUtils;
import br.beholder.memelang.ui.utils.ColorController;
import com.alee.laf.table.WebTableHeaderUI;
import java.awt.Desktop;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.Tree;

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
            this.mainWindow.getMessagesPane().removeAll();
            if(this.compiler.getWarnings().size() > 0){
                this.mainWindow.getTextAreaMensagens().append("Porém avisos foram gerados\n");
                this.prepararTabelaErros();
                
            }
            this.exibirTabela();
            this.mainWindow.getTextAreaAssembly().setText(this.compiler.getCodigoGerado()); 
            this.mainWindow.repaint(); 
            
            
        }else{
            this.mainWindow.getIdentifiersPane().removeAll();
            this.mainWindow.getTextAreaMensagens().setText("Erros foram encontrados, visualizar aba de Mensagens");
            this.mainWindow.getTextAreaAssembly().setText(""); 
            this.prepararTabelaErros();

        }
        
    }
    public void exibirTabela(){ 
        if(this.compiler.getModel() == null){ 
            JOptionPane.showMessageDialog(this.mainWindow, "É necessário compilar antes de gerar a tabela"); 
            return; 
        }
        JTable table = new JTable(this.compiler.getModel()); 
        table.getTableHeader().setUI(new WebTableHeaderUI());
        table.getTableHeader().setBackground(ColorController.COR_PRINCIPAL);
        table.getTableHeader().setForeground(ColorController.COR_LETRA);
        RenderizadorTabelaMensagensCompilador renderizador = new RenderizadorTabelaMensagensCompilador();
        WeblafUtils.configuraWebLaf(table, renderizador, table.getColumnCount());
        AjustadorLinhaTabelaMensagensCompilador ajustadorLinha = new AjustadorLinhaTabelaMensagensCompilador(table);

        table.addComponentListener(ajustadorLinha);
        this.compiler.getModel().addTableModelListener(ajustadorLinha);
        JScrollPane identPane = new JScrollPane(table); 
        WeblafUtils.configuraWebLaf(identPane); 
        this.mainWindow.getIdentifiersPane().removeAll(); 
        this.mainWindow.getIdentifiersPane().add(identPane); 
 
    } 
    public void abrirTabelaTipos(){
        try {
            URI f = getClass().getResource("/br/beholder/memelang/web/tables.html").toURI();
            openWebpage(f);
        } catch (URISyntaxException ex) {
            Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void prepararTabelaErros(){
        Object[][] data = new Object[this.compiler.getErroLexico().getErrors().size() + this.compiler.getWarnings().size()][2];
        Object[] columnsNames = {"Tipo", "Message"};
        for (int i = 0 ; i < this.compiler.getErroLexico().getErrors().size() ; i++){
            data[i][0] = "Erro";
            data[i][1] = this.compiler.getErroLexico().getErrors().get(i);
        }
        for (int i = this.compiler.getErroLexico().getErrors().size() ; i < this.compiler.getErroLexico().getErrors().size() + this.compiler.getWarnings().size() ; i++){
            data[i][0] = "Aviso";
            data[i][1] = this.compiler.getWarnings().get(i - this.compiler.getErroLexico().getErrors().size());
        }
        TableModel error = new DefaultTableModel(data, columnsNames);
        JTable table = new JTable(error);
        table.getColumnModel().getColumn(0).setMaxWidth(50);
        table.getColumnModel().getColumn(0).setResizable(false);

        
        table.getTableHeader().setBackground(ColorController.COR_PRINCIPAL);
        table.getTableHeader().setForeground(ColorController.COR_LETRA);
        JScrollPane errorPane = new JScrollPane(table);
        
        
        RenderizadorTabelaMensagensCompilador renderizador = new RenderizadorTabelaMensagensCompilador();
        WeblafUtils.configuraWebLaf(table, renderizador, table.getColumnCount());
        AjustadorLinhaTabelaMensagensCompilador ajustadorLinha = new AjustadorLinhaTabelaMensagensCompilador(table);
        

        table.addComponentListener(ajustadorLinha);
        if(this.compiler.getModel() != null){
            this.compiler.getModel().addTableModelListener(ajustadorLinha);
        }
        
        WeblafUtils.configuraWebLaf(errorPane);
        this.mainWindow.getMessagesPane().removeAll();
        this.mainWindow.getMessagesPane().add(errorPane);
        this.mainWindow.getMessagesPane().revalidate();
        this.mainWindow.repaint();
        
    }
    
    private static void fillTree(TreeNodeWrapper node, Tree tree) {

        if (tree == null) {
            return;
        }

        for (int i = 0; i < tree.getChildCount(); i++) {

            Tree childTree = tree.getChild(i);
            TreeNodeWrapper childNode = new TreeNodeWrapper(childTree);

            node.add(childNode);

            fillTree(childNode, childTree);
        }
    }
    
    public void exibirCodigoAssembly(){
        if(this.compiler.getCodigoGerado().equals("")){
            JOptionPane.showMessageDialog(this.mainWindow, "É necessário compilar antes de gerar o código");
            return;
        }
        FileController.salvarTexto(this.compiler.getCodigoGerado(),".asm");
    }
    
    public void exibirArvoreSintatica(){
        if(this.compiler.getTree() == null){
            JOptionPane.showMessageDialog(this.mainWindow, "É necessário compilar antes de gerar a árvore");
            return;
        }
        
        Tree parseTreeRoot = this.compiler.getTree();
        TreeNodeWrapper nodeRoot = new TreeNodeWrapper(parseTreeRoot);
        fillTree(nodeRoot, parseTreeRoot);
        final JTree tree = new JTree(nodeRoot);
        tree.setCellRenderer(new ExampleTreeRender());
        tree.setUI(new PSTreeUI());
        tree.setBackground(ColorController.COR_PRINCIPAL);
        tree.setForeground(ColorController.COR_LETRA);
        
        
//        this.mainWindow.getTreePanel().removeAll();
//        this.mainWindow.getTreePanel().add(tree);
//        this.mainWindow.getTreePanel().repaint();        
    }
    
    private static class TreeNodeWrapper extends DefaultMutableTreeNode {

        TreeNodeWrapper(Tree tree) {
            super(tree);
        }

    }
    
    public void prepararCarregamentoArquivo(){
        try {
            String codigoCarregado = FileController.getMemeCode();
            if("".equals(codigoCarregado)){
                return;
            }
            codigoCarregado = codigoCarregado.replace("\r", "");
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
