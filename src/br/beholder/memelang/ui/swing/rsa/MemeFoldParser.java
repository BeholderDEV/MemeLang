/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.ui.swing.rsa;


import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.folding.CurlyFoldParser;

/**
 *
 * @author alisson
 */
public class MemeFoldParser extends CurlyFoldParser {


	@Override
	public boolean isLeftCurly(Token t) {
            return t.getLexeme().equals("illuminati");
	}


	@Override
	public boolean isRightCurly(Token t) {
            return t.getLexeme().equals("confirmed");
	}


}
