/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.beholder.memelang;

import br.beholder.memelang.lang.memelangLexer;
import br.beholder.memelang.lang.memelangParser;
import br.beholder.memelang.model.ErroLexico;
import javax.swing.DefaultListModel;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Alisson
 */
public class MemeLang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String code = "genius checkEm divideByZero L( )L illuminati\n" +
"	checkEm a = 1 ¬¬ b = 2 desu\n" +
"	yesButNo xoxo = trap desu\n" +
"	checkEm halflife = hacker100110101001 desu\n" +
"\n" +
"	waitForIt L( checkEm i=0 desu i<10 desu i++ )L illuminati\n" +
"		everydayUntilYouLikeIt L( yeah )L illuminati\n" +
"			kek L( i == 5)L illuminati\n" +
"				batata a = drEvilsdrEvil desu\n" +
"				lolicon b = drEvilbatatadrEvil+a desu\n" +
"			confirmed\n" +
"			topKek L( i != 6 or i==24)L illuminati\n" +
"				first lel desu\n" +
"				a << b desu\n" +
"			confirmed\n" +
"			notSureIf illuminati\n" +
"				goHomeYouAreDrunk halflife desu\n" +
"			confirmed\n" +
"		confirmed\n" +
"	confirmed\n" +
"	goHomeYouAreDrunk 0 desu\n" +
"confirmed";
        ANTLRInputStream ais = new ANTLRInputStream(code);//*
        memelangLexer lexer = new memelangLexer(ais);//*
        CommonTokenStream stream = new CommonTokenStream(lexer);//*
        memelangParser parser = new memelangParser(stream);//*

        DefaultListModel modeloLista = new DefaultListModel();

        //TratadorErrosLexico tratadorErrosLexico = new TratadorErrosLexico(modeloLista);
        //TratadorErrosSintatico tratadorErrosSintatico = new TratadorErrosSintatico(modeloLista);
        // Remove o tratador de erros padrão do lexer e do parser
        lexer.removeErrorListeners();
        parser.removeErrorListeners();

        // Instala o tratador de erros personalizado que irá exibir as mensagens
        // em tela na JList
        ErroLexico erro = new ErroLexico();
        lexer.addErrorListener(erro);
        parser.addErrorListener(erro);

        // Chama a regar inicial do parser, esta regra deve estar definida na gramática
        if (erro.getErrors().isEmpty())
        {
            ParseTree tree = parser.prog();     //*
            VisitanteDoDesesperoSemantico visitor = new VisitanteDoDesesperoSemantico(FuncoesPadroes.gerarFuncoesPadroes(FuncoesPadroes.Compilador.BIPIDE));
            try
            {
                visitor.visit(tree);
                ids = visitor.getTabelaSimbolos();
                VisitanteDoDesesperoGeradorBipide gerador = new VisitanteDoDesesperoGeradorBipide(ids);
                gerador.visit(tree);
                new CodigoApresentado(gerador.getCodigo()).setVisible(true);
            } catch (Exception e)
            {
                erro.getErrors().add(e.getLocalizedMessage());
            }
        }
        for (String errin : erro.getErrors())
        {
            modeloLista.addElement(errin);
        }
        listaMensagens.setModel(modeloLista);
    }
    
}
