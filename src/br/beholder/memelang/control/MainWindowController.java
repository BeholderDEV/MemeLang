/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.control;

import br.beholder.memelang.view.MainWindow;

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
}
