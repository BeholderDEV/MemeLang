/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.ui.swing.webLaf;


import br.beholder.memelang.ui.utils.ColorController;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

/**
 *
 * @author LITE
 */
public class PSMainTabbedPaneUI extends BasicTabbedPaneUI {

    
//    @Override
//    protected void paintTab(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex, Rectangle iconRect, Rectangle textRect) {
//        
//    }
//    
//
//    @Override
//    public void paint(Graphics g, JComponent c) {
//        super.paint(g, c);
//    }
//    
//    
    @Override
    protected void paintContentBorder(Graphics g, int tabPlacement, int selectedIndex) {
//        super.paintContentBorder(g, tabPlacement, selectedIndex);
        int width = tabPane.getWidth();
        int height = tabPane.getHeight();
        Insets insets = tabPane.getInsets();
        Insets tabAreaInsets = getTabAreaInsets(tabPlacement);

        int x = insets.left;
        int y = insets.top;
        int w = width - insets.right - insets.left;
        int h = height - insets.top - insets.bottom;
        
        y += calculateTabAreaHeight(tabPlacement, runCount, maxTabHeight);
        y -= tabAreaInsets.bottom;
        h -= (y - insets.top);
        
        if ( tabPane.getTabCount() > 0) {
            // Fill region behind content area
            g.setColor(ColorController.COR_PRINCIPAL);
            g.fillRect(x,y,w,h);
        }
        
    }

    @Override
    protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
        
        if(isSelected){
            g.setColor(ColorController.COR_PRINCIPAL);
            g.drawRect(rects[tabIndex].x, rects[tabIndex].y, rects[tabIndex].width, rects[tabIndex].height);
        }
        else{
            g.setColor(ColorController.FUNDO_MEDIO);
            g.drawRect(rects[tabIndex].x, rects[tabIndex].y, rects[tabIndex].width, rects[tabIndex].height);
        }
    }
    
    
    @Override
    protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
        if(tabIndex==0){
            if(isSelected){
                g.setColor(ColorController.COR_PRINCIPAL);
                g.fillRect(rects[tabIndex].x, rects[tabIndex].y, rects[tabIndex].width, rects[tabIndex].height);
            }else{
                g.setColor(ColorController.FUNDO_MEDIO);
                g.fillRect(rects[tabIndex].x, rects[tabIndex].y, rects[tabIndex].width, rects[tabIndex].height);
            }
        }else{
            if(isSelected){
                g.setColor(ColorController.COR_PRINCIPAL);
                g.fillRect(rects[tabIndex].x, rects[tabIndex].y, rects[tabIndex].width, rects[tabIndex].height);
            }else{
                g.setColor(ColorController.COR_DESTAQUE);
                g.fillRect(rects[tabIndex].x, rects[tabIndex].y, rects[tabIndex].width, rects[tabIndex].height);
            }
        }
        
    }
    
}
