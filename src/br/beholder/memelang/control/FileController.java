/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Augustop
 */

public class FileController {
    private static String currentDirectory = "./Exemplos Codigo";
    
    public static String getMemeCode() throws FileNotFoundException{
        JFileChooser fc = new JFileChooser(currentDirectory);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Meme Code", "meme", "txt");
        fc.setFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false);
        File file = null;
        int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            currentDirectory = file.getParentFile().getPath();
            return formatarArquivoTexto(file);
        } 
        return "";
    }
    
    public static String formatarArquivoTexto(File file) throws FileNotFoundException{
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder text = new StringBuilder();
        String NL = System.getProperty("line.separator");
        Scanner scanner = new Scanner(file, "ISO-8859-1");
        while (scanner.hasNextLine()){
            text.append(scanner.nextLine() + NL);
        }
        scanner.close();
        return text.toString();
    }
    public static int salvarTexto(String txt){
        return salvarTexto(txt, ".meme");
    }
    public static int salvarTexto(String txt, String ext){
        JFileChooser chooser = new JFileChooser(currentDirectory);
        int returnVal = chooser.showSaveDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter fw = new FileWriter (chooser.getSelectedFile() + ext);
                fw.write(txt);
                fw.close();
                return 1;
            } catch (Exception ex) {
                ex.printStackTrace();
                return 0;
            }
        }
        return 2;
    }
    
    
}
