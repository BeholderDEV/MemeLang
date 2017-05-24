/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.ui.swing.webLaf;

import br.beholder.memelang.ui.utils.ColorController;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author 5663296
 */
public class ExampleTreeRender extends DefaultTreeCellRenderer{
    public ExampleTreeRender() {
        setBorder(new EmptyBorder(7, 7, 7, 7));
    }   
    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus){
        super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
        JLabel label = (JLabel) this ;
        
        
        setForeground(ColorController.COR_LETRA);
//        if(selected){
//            setOpaque(true);
//            setBackground(ColorController.COR_DESTAQUE);
//            setForeground(black);
//        }
//        else{
//            setOpaque(false);
//        }
        label.setText(value.toString());
//        if(leaf){
//            if(selected){
//                label.setIcon(IconFactory.createIcon(IconFactory.CAMINHO_ICONES_PEQUENOS, "light_pix.png"));
//            }else{
//                label.setIcon(IconFactory.createIcon(IconFactory.CAMINHO_ICONES_PEQUENOS, "light_pix_off.png"));
//            }            
//        }else{
//            label.setIcon(IconFactory.createIcon(IconFactory.CAMINHO_ICONES_PEQUENOS, "folder_closed.png"));
//        }
        
        return label;
    }
}
