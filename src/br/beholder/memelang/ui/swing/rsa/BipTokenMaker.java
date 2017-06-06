/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang.ui.swing.rsa;

import javax.swing.text.Segment;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMaker;
import org.fife.ui.rsyntaxtextarea.RSyntaxUtilities;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMap;

/**
 *
 * @author alisson
 */
public class BipTokenMaker extends AbstractTokenMaker{

    int currentTokenStart = 0;
    int currentTokenType = 0;
    
    @Override
    public TokenMap getWordsToHighlight() {
        TokenMap tokenMap = new TokenMap();
  
        tokenMap.put(".data",  Token.RESERVED_WORD);
        tokenMap.put(".text",   Token.RESERVED_WORD);
        
        tokenMap.put(":", Token.OPERATOR);
        tokenMap.put(",", Token.OPERATOR);
        
        tokenMap.put("$indr", Token.LITERAL_CHAR);
        
        tokenMap.put("LDI", Token.RESERVED_WORD_2);
        tokenMap.put("LD", Token.RESERVED_WORD_2);
        tokenMap.put("ADD", Token.RESERVED_WORD_2);
        tokenMap.put("ADDI", Token.RESERVED_WORD_2);
        tokenMap.put("SUB", Token.RESERVED_WORD_2);
        tokenMap.put("SUBI", Token.RESERVED_WORD_2);
        tokenMap.put("STO", Token.RESERVED_WORD_2);
        tokenMap.put("HLT", Token.RESERVED_WORD_2);
        tokenMap.put("SRL", Token.RESERVED_WORD_2);
        tokenMap.put("SLL", Token.RESERVED_WORD_2);
        tokenMap.put("NOT", Token.RESERVED_WORD_2);
        tokenMap.put("AND", Token.RESERVED_WORD_2);
        tokenMap.put("ANDI", Token.RESERVED_WORD_2);
        tokenMap.put("OR", Token.RESERVED_WORD_2);
        tokenMap.put("ORI", Token.RESERVED_WORD_2);
        tokenMap.put("XOR", Token.RESERVED_WORD_2);
        tokenMap.put("XORI", Token.RESERVED_WORD_2);
        tokenMap.put("LDV", Token.RESERVED_WORD_2);
        tokenMap.put("STOV", Token.RESERVED_WORD_2);
        tokenMap.put("JMP", Token.RESERVED_WORD_2);
        tokenMap.put("BLT", Token.RESERVED_WORD_2);
        
        

        return tokenMap;
    }

    @Override
    public void addToken(Segment segment, int start, int end, int tokenType, int startOffset) {
        // This assumes all keywords, etc. were parsed as "identifiers."
        if (tokenType==Token.IDENTIFIER) {
           int value = wordsToHighlight.get(segment, start, end);
           if (value != -1) {
              tokenType = value;
           }
        }
        super.addToken(segment, start, end, tokenType, startOffset);
    }
    
    

    @Override
    public Token getTokenList(Segment text, int startTokenType, int startOffset) {
        resetTokenList();

        char[] array = text.array;
        int offset = text.offset;
        int count = text.count;
        int end = offset + count;

        // Token starting offsets are always of the form:
        // 'startOffset + (currentTokenStart-offset)', but since startOffset and
        // offset are constant, tokens' starting positions become:
        // 'newStartOffset+currentTokenStart'.
        int newStartOffset = startOffset - offset;

        currentTokenStart = offset;
        currentTokenType  = startTokenType;

        for (int i=offset; i<end; i++) {

           char c = array[i];

           switch (currentTokenType) {

              case Token.NULL:

                 currentTokenStart = i;   // Starting a new token here.

                 switch (c) {

                    case ' ':
                    case '\t':
                       currentTokenType = Token.WHITESPACE;
                       break;

                    case '"':
                       currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                       break;
                    case '\'':
                       currentTokenType = Token.LITERAL_CHAR;
                       break;
                    case '#':
                       currentTokenType = Token.COMMENT_EOL;
                       break;

                    default:
                       if (RSyntaxUtilities.isDigit(c)) {
                          currentTokenType = Token.LITERAL_NUMBER_DECIMAL_INT;
                          break;
                       }
                       else if (RSyntaxUtilities.isLetter(c) || c=='/' || c=='_') {
                          currentTokenType = Token.IDENTIFIER;
                          break;
                       }

                       // Anything not currently handled - mark as an identifier
                       currentTokenType = Token.IDENTIFIER;
                       break;

                 } // End of switch (c).

                 break;

              case Token.WHITESPACE:

                 switch (c) {

                    case ' ':
                    case '\t':
                       break;   // Still whitespace.

                    case '"':
                       addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                       break;
                    case '\'':
                       addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.LITERAL_CHAR;
                       break;
                    case '#':
                       addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.COMMENT_EOL;
                       break;

                    default:   // Add the whitespace token and start anew.

                       addToken(text, currentTokenStart,i-1, Token.WHITESPACE, newStartOffset+currentTokenStart);
                       currentTokenStart = i;

                       if (RSyntaxUtilities.isDigit(c)) {
                          currentTokenType = Token.LITERAL_NUMBER_DECIMAL_INT;
                          break;
                       }
                       else if (RSyntaxUtilities.isLetter(c) || c=='/' || c=='_') {
                          currentTokenType = Token.IDENTIFIER;
                          break;
                       }

                       // Anything not currently handled - mark as identifier
                       currentTokenType = Token.IDENTIFIER;

                 } // End of switch (c).

                 break;

              default: // Should never happen
              case Token.IDENTIFIER:

                 switch (c) {

                    case ' ':
                    case '\t':
                       addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.WHITESPACE;
                       break;

                    case '"':
                       addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                       break;
                    case '\'':
                       addToken(text, currentTokenStart,i-1, Token.IDENTIFIER, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.LITERAL_CHAR;
                       break;
                    default:
                       if (RSyntaxUtilities.isLetterOrDigit(c) || c=='/' || c=='_') {
                          break;   // Still an identifier of some type.
                       }
                       // Otherwise, we're still an identifier (?).

                 } // End of switch (c).

                 break;

              case Token.LITERAL_NUMBER_DECIMAL_INT:

                 switch (c) {

                    case ' ':
                    case '\t':
                       addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.WHITESPACE;
                       break;

                    case '"':
                       addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
                       break;
                    case '\'':
                       addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                       currentTokenStart = i;
                       currentTokenType = Token.LITERAL_CHAR;
                       break;
                    default:

                       if (RSyntaxUtilities.isDigit(c)) {
                          break;   // Still a literal number.
                       }

                       // Otherwise, remember this was a number and start over.
                       addToken(text, currentTokenStart,i-1, Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset+currentTokenStart);
                       i--;
                       currentTokenType = Token.NULL;

                 } // End of switch (c).

                 break;

              case Token.COMMENT_EOL:
                 i = end - 1;
                 addToken(text, currentTokenStart,i, currentTokenType, newStartOffset+currentTokenStart);
                 // We need to set token type to null so at the bottom we don't add one more token.
                 currentTokenType = Token.NULL;
                 break;

              case Token.LITERAL_STRING_DOUBLE_QUOTE:
                 if (c=='"') {
                    addToken(text, currentTokenStart,i, Token.LITERAL_STRING_DOUBLE_QUOTE, newStartOffset+currentTokenStart);
                    currentTokenType = Token.NULL;
                 }
                 break;
              case Token.LITERAL_CHAR:
                 if (c=='\'') {
                    addToken(text, currentTokenStart,i, Token.LITERAL_CHAR, newStartOffset+currentTokenStart);
                    currentTokenType = Token.NULL;
                 }
                 break;

           } // End of switch (currentTokenType).

        } // End of for (int i=offset; i<end; i++).

        switch (currentTokenType) {

           // Remember what token type to begin the next line with.
           case Token.LITERAL_STRING_DOUBLE_QUOTE:
              addToken(text, currentTokenStart,end-1, currentTokenType, newStartOffset+currentTokenStart);
              break;

           // Do nothing if everything was okay.
           case Token.NULL:
              addNullToken();
              break;

           // All other token types don't continue to the next line...
           default:
              addToken(text, currentTokenStart,end-1, currentTokenType, newStartOffset+currentTokenStart);
              addNullToken();

        }

        // Return the first token in our linked list.
        return firstToken;
    }
    
}
