package br.beholder.memelang.lang;
// Generated from memelang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class memelangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IFDES=1, ELSE=2, WHILEDES=3, FORDES=4, DODES=5, INT=6, STRING=7, DOUBLE=8, 
		BOOL=9, BIN=10, HEXA=11, VOID=12, BREAK=13, SWITCHDES=14, CASE=15, DEFAULTDES=16, 
		MAIS=17, MENOS=18, MAIORQUE=19, MENORQUE=20, MAIOROUIGUAL=21, MENOROUIGUAL=22, 
		IDENTICO=23, DIFERENTE=24, AND=25, OR=26, NOT=27, BITSHIFTRIGHT=28, BITSHIFTLEFT=29, 
		BITAND=30, BITOR=31, BITXOR=32, BITNOT=33, CONSTREAL=34, CONSTINTEIRO=35, 
		CONSTBINARIO=36, CONSTHEXA=37, CONSTSTRING=38, CONSTLOGICO=39, COMENTARIOLINHA=40, 
		COMENTARIOMULTIPLO=41, PONTO=42, IGUAL=43, PONTOEVIRGULA=44, VIRGULA=45, 
		DOISPONTOS=46, COLCHETESABRE=47, COLCHETESFECHA=48, CHAVESABRE=49, CHAVESFECHA=50, 
		PARENTESEABRE=51, PARENTESEFECHA=52, ID=53, RETORNO=54, WHITESPACE=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IFDES", "ELSE", "WHILEDES", "FORDES", "DODES", "INT", "STRING", "DOUBLE", 
		"BOOL", "BIN", "HEXA", "VOID", "BREAK", "SWITCHDES", "CASE", "DEFAULTDES", 
		"MAIS", "MENOS", "MAIORQUE", "MENORQUE", "MAIOROUIGUAL", "MENOROUIGUAL", 
		"IDENTICO", "DIFERENTE", "AND", "OR", "NOT", "BITSHIFTRIGHT", "BITSHIFTLEFT", 
		"BITAND", "BITOR", "BITXOR", "BITNOT", "CONSTREAL", "CONSTINTEIRO", "CONSTBINARIO", 
		"CONSTHEXA", "CONSTSTRING", "CONSTLOGICO", "COMENTARIOLINHA", "COMENTARIOMULTIPLO", 
		"PONTO", "IGUAL", "PONTOEVIRGULA", "VIRGULA", "DOISPONTOS", "COLCHETESABRE", 
		"COLCHETESFECHA", "CHAVESABRE", "CHAVESFECHA", "PARENTESEABRE", "PARENTESEFECHA", 
		"ID", "RETORNO", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'kek'", "'notSureIf'", "'everydayUntilYouLikeIt'", "'waitForIt'", 
		"'justDoIt'", "'checkEm'", "'lolicon'", "'dubs'", "'yesButNo'", "'binLaden'", 
		"'l33t'", "'missingNo'", "'wat'", "'chooseAPill'", "'pill'", "'hipster'", 
		"'+'", "'-'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'and'", "'or'", 
		"'nope'", "'>>'", "'<<'", "'&'", "'|'", "'^'", "'~'", null, null, null, 
		null, null, "'(yeah)|(trap)'", null, null, "'.'", "'='", "'desu'", "'\u00C2\u00AC\u00C2\u00AC'", 
		"':'", "'['", "']'", "'illuminati'", "'confirmed'", "'L('", "')L'", null, 
		"'goHomeYouAreDrunk'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IFDES", "ELSE", "WHILEDES", "FORDES", "DODES", "INT", "STRING", 
		"DOUBLE", "BOOL", "BIN", "HEXA", "VOID", "BREAK", "SWITCHDES", "CASE", 
		"DEFAULTDES", "MAIS", "MENOS", "MAIORQUE", "MENORQUE", "MAIOROUIGUAL", 
		"MENOROUIGUAL", "IDENTICO", "DIFERENTE", "AND", "OR", "NOT", "BITSHIFTRIGHT", 
		"BITSHIFTLEFT", "BITAND", "BITOR", "BITXOR", "BITNOT", "CONSTREAL", "CONSTINTEIRO", 
		"CONSTBINARIO", "CONSTHEXA", "CONSTSTRING", "CONSTLOGICO", "COMENTARIOLINHA", 
		"COMENTARIOMULTIPLO", "PONTO", "IGUAL", "PONTOEVIRGULA", "VIRGULA", "DOISPONTOS", 
		"COLCHETESABRE", "COLCHETESFECHA", "CHAVESABRE", "CHAVESFECHA", "PARENTESEABRE", 
		"PARENTESEFECHA", "ID", "RETORNO", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public memelangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "memelang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u01e2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\6#\u012c\n#\r#\16#\u012d\3#\3#\6#\u0132\n#\r#\16#\u0133"+
		"\3$\6$\u0137\n$\r$\16$\u0138\3%\3%\3%\3%\3%\3%\3%\3%\6%\u0143\n%\r%\16"+
		"%\u0144\3&\3&\3&\3&\3&\6&\u014c\n&\r&\16&\u014d\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\7\'\u015a\n\'\f\'\16\'\u015d\13\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		")\3)\7)\u017b\n)\f)\16)\u017e\13)\3)\3)\3*\3*\3*\3*\3*\3*\7*\u0188\n*"+
		"\f*\16*\u018b\13*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3.\3"+
		".\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\7\66\u01c5\n\66\f\66\16\66\u01c8"+
		"\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\68\u01dd\n8\r8\168\u01de\38\38\2\29\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9\3\2"+
		"\n\3\2\62;\3\2\62\63\5\2\62;CHch\4\2$$^^\4\2\f\f\17\17\5\2C\\aac|\6\2"+
		"\62;C\\aac|\5\2\13\f\16\17\"\"\2\u01ed\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5u\3\2\2"+
		"\2\7\177\3\2\2\2\t\u0096\3\2\2\2\13\u00a0\3\2\2\2\r\u00a9\3\2\2\2\17\u00b1"+
		"\3\2\2\2\21\u00b9\3\2\2\2\23\u00be\3\2\2\2\25\u00c7\3\2\2\2\27\u00d0\3"+
		"\2\2\2\31\u00d5\3\2\2\2\33\u00df\3\2\2\2\35\u00e3\3\2\2\2\37\u00ef\3\2"+
		"\2\2!\u00f4\3\2\2\2#\u00fc\3\2\2\2%\u00fe\3\2\2\2\'\u0100\3\2\2\2)\u0102"+
		"\3\2\2\2+\u0104\3\2\2\2-\u0107\3\2\2\2/\u010a\3\2\2\2\61\u010d\3\2\2\2"+
		"\63\u0110\3\2\2\2\65\u0114\3\2\2\2\67\u0117\3\2\2\29\u011c\3\2\2\2;\u011f"+
		"\3\2\2\2=\u0122\3\2\2\2?\u0124\3\2\2\2A\u0126\3\2\2\2C\u0128\3\2\2\2E"+
		"\u012b\3\2\2\2G\u0136\3\2\2\2I\u013a\3\2\2\2K\u0146\3\2\2\2M\u014f\3\2"+
		"\2\2O\u0165\3\2\2\2Q\u0173\3\2\2\2S\u0181\3\2\2\2U\u0193\3\2\2\2W\u0195"+
		"\3\2\2\2Y\u0197\3\2\2\2[\u019c\3\2\2\2]\u01a1\3\2\2\2_\u01a3\3\2\2\2a"+
		"\u01a5\3\2\2\2c\u01a7\3\2\2\2e\u01b2\3\2\2\2g\u01bc\3\2\2\2i\u01bf\3\2"+
		"\2\2k\u01c2\3\2\2\2m\u01c9\3\2\2\2o\u01dc\3\2\2\2qr\7m\2\2rs\7g\2\2st"+
		"\7m\2\2t\4\3\2\2\2uv\7p\2\2vw\7q\2\2wx\7v\2\2xy\7U\2\2yz\7w\2\2z{\7t\2"+
		"\2{|\7g\2\2|}\7K\2\2}~\7h\2\2~\6\3\2\2\2\177\u0080\7g\2\2\u0080\u0081"+
		"\7x\2\2\u0081\u0082\7g\2\2\u0082\u0083\7t\2\2\u0083\u0084\7{\2\2\u0084"+
		"\u0085\7f\2\2\u0085\u0086\7c\2\2\u0086\u0087\7{\2\2\u0087\u0088\7W\2\2"+
		"\u0088\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a\u008b\7k\2\2\u008b\u008c"+
		"\7n\2\2\u008c\u008d\7[\2\2\u008d\u008e\7q\2\2\u008e\u008f\7w\2\2\u008f"+
		"\u0090\7N\2\2\u0090\u0091\7k\2\2\u0091\u0092\7m\2\2\u0092\u0093\7g\2\2"+
		"\u0093\u0094\7K\2\2\u0094\u0095\7v\2\2\u0095\b\3\2\2\2\u0096\u0097\7y"+
		"\2\2\u0097\u0098\7c\2\2\u0098\u0099\7k\2\2\u0099\u009a\7v\2\2\u009a\u009b"+
		"\7H\2\2\u009b\u009c\7q\2\2\u009c\u009d\7t\2\2\u009d\u009e\7K\2\2\u009e"+
		"\u009f\7v\2\2\u009f\n\3\2\2\2\u00a0\u00a1\7l\2\2\u00a1\u00a2\7w\2\2\u00a2"+
		"\u00a3\7u\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7F\2\2\u00a5\u00a6\7q\2\2"+
		"\u00a6\u00a7\7K\2\2\u00a7\u00a8\7v\2\2\u00a8\f\3\2\2\2\u00a9\u00aa\7e"+
		"\2\2\u00aa\u00ab\7j\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae"+
		"\7m\2\2\u00ae\u00af\7G\2\2\u00af\u00b0\7o\2\2\u00b0\16\3\2\2\2\u00b1\u00b2"+
		"\7n\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7k\2\2\u00b5"+
		"\u00b6\7e\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7p\2\2\u00b8\20\3\2\2\2\u00b9"+
		"\u00ba\7f\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7d\2\2\u00bc\u00bd\7u\2\2"+
		"\u00bd\22\3\2\2\2\u00be\u00bf\7{\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7"+
		"u\2\2\u00c1\u00c2\7D\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5"+
		"\7P\2\2\u00c5\u00c6\7q\2\2\u00c6\24\3\2\2\2\u00c7\u00c8\7d\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7N\2\2\u00cb\u00cc\7c\2\2\u00cc"+
		"\u00cd\7f\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7p\2\2\u00cf\26\3\2\2\2\u00d0"+
		"\u00d1\7n\2\2\u00d1\u00d2\7\65\2\2\u00d2\u00d3\7\65\2\2\u00d3\u00d4\7"+
		"v\2\2\u00d4\30\3\2\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8"+
		"\7u\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db"+
		"\u00dc\7i\2\2\u00dc\u00dd\7P\2\2\u00dd\u00de\7q\2\2\u00de\32\3\2\2\2\u00df"+
		"\u00e0\7y\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7v\2\2\u00e2\34\3\2\2\2\u00e3"+
		"\u00e4\7e\2\2\u00e4\u00e5\7j\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7q\2\2"+
		"\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7C\2\2\u00ea\u00eb"+
		"\7R\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7n\2\2\u00ee"+
		"\36\3\2\2\2\u00ef\u00f0\7r\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7n\2\2\u00f2"+
		"\u00f3\7n\2\2\u00f3 \3\2\2\2\u00f4\u00f5\7j\2\2\u00f5\u00f6\7k\2\2\u00f6"+
		"\u00f7\7r\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7g\2\2"+
		"\u00fa\u00fb\7t\2\2\u00fb\"\3\2\2\2\u00fc\u00fd\7-\2\2\u00fd$\3\2\2\2"+
		"\u00fe\u00ff\7/\2\2\u00ff&\3\2\2\2\u0100\u0101\7@\2\2\u0101(\3\2\2\2\u0102"+
		"\u0103\7>\2\2\u0103*\3\2\2\2\u0104\u0105\7@\2\2\u0105\u0106\7?\2\2\u0106"+
		",\3\2\2\2\u0107\u0108\7>\2\2\u0108\u0109\7?\2\2\u0109.\3\2\2\2\u010a\u010b"+
		"\7?\2\2\u010b\u010c\7?\2\2\u010c\60\3\2\2\2\u010d\u010e\7#\2\2\u010e\u010f"+
		"\7?\2\2\u010f\62\3\2\2\2\u0110\u0111\7c\2\2\u0111\u0112\7p\2\2\u0112\u0113"+
		"\7f\2\2\u0113\64\3\2\2\2\u0114\u0115\7q\2\2\u0115\u0116\7t\2\2\u0116\66"+
		"\3\2\2\2\u0117\u0118\7p\2\2\u0118\u0119\7q\2\2\u0119\u011a\7r\2\2\u011a"+
		"\u011b\7g\2\2\u011b8\3\2\2\2\u011c\u011d\7@\2\2\u011d\u011e\7@\2\2\u011e"+
		":\3\2\2\2\u011f\u0120\7>\2\2\u0120\u0121\7>\2\2\u0121<\3\2\2\2\u0122\u0123"+
		"\7(\2\2\u0123>\3\2\2\2\u0124\u0125\7~\2\2\u0125@\3\2\2\2\u0126\u0127\7"+
		"`\2\2\u0127B\3\2\2\2\u0128\u0129\7\u0080\2\2\u0129D\3\2\2\2\u012a\u012c"+
		"\t\2\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\7\60\2\2\u0130\u0132\t"+
		"\2\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134F\3\2\2\2\u0135\u0137\t\2\2\2\u0136\u0135\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139H\3"+
		"\2\2\2\u013a\u013b\7j\2\2\u013b\u013c\7c\2\2\u013c\u013d\7e\2\2\u013d"+
		"\u013e\7m\2\2\u013e\u013f\7g\2\2\u013f\u0140\7t\2\2\u0140\u0142\3\2\2"+
		"\2\u0141\u0143\t\3\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145J\3\2\2\2\u0146\u0147\79\2\2\u0147\u0148"+
		"\7z\2\2\u0148\u0149\7\63\2\2\u0149\u014b\3\2\2\2\u014a\u014c\t\4\2\2\u014b"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014eL\3\2\2\2\u014f\u0150\7f\2\2\u0150\u0151\7t\2\2\u0151\u0152"+
		"\7G\2\2\u0152\u0153\7x\2\2\u0153\u0154\7k\2\2\u0154\u0155\7n\2\2\u0155"+
		"\u015b\3\2\2\2\u0156\u015a\n\5\2\2\u0157\u0158\7^\2\2\u0158\u015a\13\2"+
		"\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015e\u015f\7f\2\2\u015f\u0160\7t\2\2\u0160\u0161\7G\2\2\u0161\u0162"+
		"\7x\2\2\u0162\u0163\7k\2\2\u0163\u0164\7n\2\2\u0164N\3\2\2\2\u0165\u0166"+
		"\7*\2\2\u0166\u0167\7{\2\2\u0167\u0168\7g\2\2\u0168\u0169\7c\2\2\u0169"+
		"\u016a\7j\2\2\u016a\u016b\7+\2\2\u016b\u016c\7~\2\2\u016c\u016d\7*\2\2"+
		"\u016d\u016e\7v\2\2\u016e\u016f\7t\2\2\u016f\u0170\7c\2\2\u0170\u0171"+
		"\7r\2\2\u0171\u0172\7+\2\2\u0172P\3\2\2\2\u0173\u0174\7h\2\2\u0174\u0175"+
		"\7k\2\2\u0175\u0176\7t\2\2\u0176\u0177\7u\2\2\u0177\u0178\7v\2\2\u0178"+
		"\u017c\3\2\2\2\u0179\u017b\n\6\2\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0180\b)\2\2\u0180R\3\2\2\2\u0181\u0182\7c\2\2\u0182"+
		"\u0183\7{\2\2\u0183\u0184\7{\2\2\u0184\u0189\3\2\2\2\u0185\u0188\13\2"+
		"\2\2\u0186\u0188\7\f\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7n\2\2\u018d\u018e\7o\2\2\u018e\u018f"+
		"\7c\2\2\u018f\u0190\7q\2\2\u0190\u0191\3\2\2\2\u0191\u0192\b*\2\2\u0192"+
		"T\3\2\2\2\u0193\u0194\7\60\2\2\u0194V\3\2\2\2\u0195\u0196\7?\2\2\u0196"+
		"X\3\2\2\2\u0197\u0198\7f\2\2\u0198\u0199\7g\2\2\u0199\u019a\7u\2\2\u019a"+
		"\u019b\7w\2\2\u019bZ\3\2\2\2\u019c\u019d\7\u00c4\2\2\u019d\u019e\7\u00ae"+
		"\2\2\u019e\u019f\7\u00c4\2\2\u019f\u01a0\7\u00ae\2\2\u01a0\\\3\2\2\2\u01a1"+
		"\u01a2\7<\2\2\u01a2^\3\2\2\2\u01a3\u01a4\7]\2\2\u01a4`\3\2\2\2\u01a5\u01a6"+
		"\7_\2\2\u01a6b\3\2\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7n\2\2\u01a9\u01aa"+
		"\7n\2\2\u01aa\u01ab\7w\2\2\u01ab\u01ac\7o\2\2\u01ac\u01ad\7k\2\2\u01ad"+
		"\u01ae\7p\2\2\u01ae\u01af\7c\2\2\u01af\u01b0\7v\2\2\u01b0\u01b1\7k\2\2"+
		"\u01b1d\3\2\2\2\u01b2\u01b3\7e\2\2\u01b3\u01b4\7q\2\2\u01b4\u01b5\7p\2"+
		"\2\u01b5\u01b6\7h\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7t\2\2\u01b8\u01b9"+
		"\7o\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7f\2\2\u01bbf\3\2\2\2\u01bc\u01bd"+
		"\7N\2\2\u01bd\u01be\7*\2\2\u01beh\3\2\2\2\u01bf\u01c0\7+\2\2\u01c0\u01c1"+
		"\7N\2\2\u01c1j\3\2\2\2\u01c2\u01c6\t\7\2\2\u01c3\u01c5\t\b\2\2\u01c4\u01c3"+
		"\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"l\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7i\2\2\u01ca\u01cb\7q\2\2\u01cb"+
		"\u01cc\7J\2\2\u01cc\u01cd\7q\2\2\u01cd\u01ce\7o\2\2\u01ce\u01cf\7g\2\2"+
		"\u01cf\u01d0\7[\2\2\u01d0\u01d1\7q\2\2\u01d1\u01d2\7w\2\2\u01d2\u01d3"+
		"\7C\2\2\u01d3\u01d4\7t\2\2\u01d4\u01d5\7g\2\2\u01d5\u01d6\7F\2\2\u01d6"+
		"\u01d7\7t\2\2\u01d7\u01d8\7w\2\2\u01d8\u01d9\7p\2\2\u01d9\u01da\7m\2\2"+
		"\u01dan\3\2\2\2\u01db\u01dd\t\t\2\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3"+
		"\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e1\b8\2\2\u01e1p\3\2\2\2\17\2\u012d\u0133\u0138\u0144\u014d\u0159"+
		"\u015b\u017c\u0187\u0189\u01c6\u01de\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}