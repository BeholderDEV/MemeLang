package br.beholder.memelang.lang;
// Generated from Memelang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MemelangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IFDES=1, ELSE=2, WHILEDES=3, FORDES=4, DODES=5, INT=6, STRING=7, DOUBLE=8, 
		BOOL=9, BIN=10, HEXA=11, VOID=12, CHAR=13, BREAK=14, SWITCHDES=15, CASE=16, 
		DEFAULTDES=17, MAIS=18, MENOS=19, MAIORQUE=20, MENORQUE=21, MAIOROUIGUAL=22, 
		MENOROUIGUAL=23, IDENTICO=24, DIFERENTE=25, AND=26, OR=27, NOT=28, BITSHIFTRIGHT=29, 
		BITSHIFTLEFT=30, BITAND=31, BITOR=32, BITXOR=33, BITNOT=34, CONSTREAL=35, 
		CONSTINTEIRO=36, CONSTBINARIO=37, CONSTHEXA=38, CONSTSTRING=39, CONSTLOGICO=40, 
		CONSTCHAR=41, COMENTARIOLINHA=42, COMENTARIOMULTIPLO=43, PONTO=44, IGUAL=45, 
		PONTOEVIRGULA=46, VIRGULA=47, DOISPONTOS=48, COLCHETESABRE=49, COLCHETESFECHA=50, 
		CHAVESABRE=51, CHAVESFECHA=52, PARENTESEABRE=53, PARENTESEFECHA=54, ASPA=55, 
		ID=56, RETORNO=57, WHITESPACE=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IFDES", "ELSE", "WHILEDES", "FORDES", "DODES", "INT", "STRING", "DOUBLE", 
		"BOOL", "BIN", "HEXA", "VOID", "CHAR", "BREAK", "SWITCHDES", "CASE", "DEFAULTDES", 
		"MAIS", "MENOS", "MAIORQUE", "MENORQUE", "MAIOROUIGUAL", "MENOROUIGUAL", 
		"IDENTICO", "DIFERENTE", "AND", "OR", "NOT", "BITSHIFTRIGHT", "BITSHIFTLEFT", 
		"BITAND", "BITOR", "BITXOR", "BITNOT", "CONSTREAL", "CONSTINTEIRO", "CONSTBINARIO", 
		"CONSTHEXA", "CONSTSTRING", "CONSTLOGICO", "CONSTCHAR", "COMENTARIOLINHA", 
		"COMENTARIOMULTIPLO", "PONTO", "IGUAL", "PONTOEVIRGULA", "VIRGULA", "DOISPONTOS", 
		"COLCHETESABRE", "COLCHETESFECHA", "CHAVESABRE", "CHAVESFECHA", "PARENTESEABRE", 
		"PARENTESEFECHA", "ASPA", "ID", "RETORNO", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'kek'", "'notSureIf'", "'everydayUntilYouLikeIt'", "'waitForIt'", 
		"'justDoIt'", "'checkEm'", "'lolicon'", "'dubs'", "'yesButNo'", "'binLaden'", 
		"'l33t'", "'missingNo'", "'batata'", "'wat'", "'chooseAPill'", "'pill'", 
		"'hipster'", "'+'", "'-'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
		"'and'", "'or'", "'nope'", "'>>'", "'<<'", "'&'", "'|'", "'^'", "'~'", 
		null, null, null, null, null, "'(yeah)|(trap)'", null, null, null, "'.'", 
		"'='", "'desu'", "'\u00C2\u00AC\u00C2\u00AC'", "':'", "'['", "']'", "'illuminati'", 
		"'confirmed'", "'L('", "')L'", "'\"'", null, "'goHomeYouAreDrunk'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IFDES", "ELSE", "WHILEDES", "FORDES", "DODES", "INT", "STRING", 
		"DOUBLE", "BOOL", "BIN", "HEXA", "VOID", "CHAR", "BREAK", "SWITCHDES", 
		"CASE", "DEFAULTDES", "MAIS", "MENOS", "MAIORQUE", "MENORQUE", "MAIOROUIGUAL", 
		"MENOROUIGUAL", "IDENTICO", "DIFERENTE", "AND", "OR", "NOT", "BITSHIFTRIGHT", 
		"BITSHIFTLEFT", "BITAND", "BITOR", "BITXOR", "BITNOT", "CONSTREAL", "CONSTINTEIRO", 
		"CONSTBINARIO", "CONSTHEXA", "CONSTSTRING", "CONSTLOGICO", "CONSTCHAR", 
		"COMENTARIOLINHA", "COMENTARIOMULTIPLO", "PONTO", "IGUAL", "PONTOEVIRGULA", 
		"VIRGULA", "DOISPONTOS", "COLCHETESABRE", "COLCHETESFECHA", "CHAVESABRE", 
		"CHAVESFECHA", "PARENTESEABRE", "PARENTESEFECHA", "ASPA", "ID", "RETORNO", 
		"WHITESPACE"
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


	public MemelangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Memelang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01ee\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\6"+
		"$\u0139\n$\r$\16$\u013a\3$\3$\6$\u013f\n$\r$\16$\u0140\3%\6%\u0144\n%"+
		"\r%\16%\u0145\3&\3&\3&\3&\3&\3&\3&\3&\6&\u0150\n&\r&\16&\u0151\3\'\3\'"+
		"\3\'\3\'\3\'\6\'\u0159\n\'\r\'\16\'\u015a\3(\3(\3(\3(\7(\u0161\n(\f(\16"+
		"(\u0164\13(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\5*\u017a\n*\3*\3*\3+\3+\3+\3+\3+\3+\3+\7+\u0185\n+\f+\16+\u0188\13+"+
		"\3+\3+\3,\3,\3,\3,\3,\3,\7,\u0192\n,\f,\16,\u0195\13,\3,\3,\3,\3,\3,\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\38\38\39\39\79\u01d1\n9\f9\169\u01d4\139\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\6;\u01e9\n;\r;\16;\u01ea\3;\3"+
		";\2\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m8o9q:s;u<\3\2\n\3\2\62;\3\2\62\63\5\2\62;CHch\4\2$$^^\4\2\f\f\17"+
		"\17\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\2\u01fa\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5{\3\2\2\2\7\u0085\3\2\2\2"+
		"\t\u009c\3\2\2\2\13\u00a6\3\2\2\2\r\u00af\3\2\2\2\17\u00b7\3\2\2\2\21"+
		"\u00bf\3\2\2\2\23\u00c4\3\2\2\2\25\u00cd\3\2\2\2\27\u00d6\3\2\2\2\31\u00db"+
		"\3\2\2\2\33\u00e5\3\2\2\2\35\u00ec\3\2\2\2\37\u00f0\3\2\2\2!\u00fc\3\2"+
		"\2\2#\u0101\3\2\2\2%\u0109\3\2\2\2\'\u010b\3\2\2\2)\u010d\3\2\2\2+\u010f"+
		"\3\2\2\2-\u0111\3\2\2\2/\u0114\3\2\2\2\61\u0117\3\2\2\2\63\u011a\3\2\2"+
		"\2\65\u011d\3\2\2\2\67\u0121\3\2\2\29\u0124\3\2\2\2;\u0129\3\2\2\2=\u012c"+
		"\3\2\2\2?\u012f\3\2\2\2A\u0131\3\2\2\2C\u0133\3\2\2\2E\u0135\3\2\2\2G"+
		"\u0138\3\2\2\2I\u0143\3\2\2\2K\u0147\3\2\2\2M\u0153\3\2\2\2O\u015c\3\2"+
		"\2\2Q\u0167\3\2\2\2S\u0175\3\2\2\2U\u017d\3\2\2\2W\u018b\3\2\2\2Y\u019d"+
		"\3\2\2\2[\u019f\3\2\2\2]\u01a1\3\2\2\2_\u01a6\3\2\2\2a\u01ab\3\2\2\2c"+
		"\u01ad\3\2\2\2e\u01af\3\2\2\2g\u01b1\3\2\2\2i\u01bc\3\2\2\2k\u01c6\3\2"+
		"\2\2m\u01c9\3\2\2\2o\u01cc\3\2\2\2q\u01ce\3\2\2\2s\u01d5\3\2\2\2u\u01e8"+
		"\3\2\2\2wx\7m\2\2xy\7g\2\2yz\7m\2\2z\4\3\2\2\2{|\7p\2\2|}\7q\2\2}~\7v"+
		"\2\2~\177\7U\2\2\177\u0080\7w\2\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2"+
		"\2\u0082\u0083\7K\2\2\u0083\u0084\7h\2\2\u0084\6\3\2\2\2\u0085\u0086\7"+
		"g\2\2\u0086\u0087\7x\2\2\u0087\u0088\7g\2\2\u0088\u0089\7t\2\2\u0089\u008a"+
		"\7{\2\2\u008a\u008b\7f\2\2\u008b\u008c\7c\2\2\u008c\u008d\7{\2\2\u008d"+
		"\u008e\7W\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\u0091\7k\2\2"+
		"\u0091\u0092\7n\2\2\u0092\u0093\7[\2\2\u0093\u0094\7q\2\2\u0094\u0095"+
		"\7w\2\2\u0095\u0096\7N\2\2\u0096\u0097\7k\2\2\u0097\u0098\7m\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7K\2\2\u009a\u009b\7v\2\2\u009b\b\3\2\2\2\u009c"+
		"\u009d\7y\2\2\u009d\u009e\7c\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7v\2\2"+
		"\u00a0\u00a1\7H\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4"+
		"\7K\2\2\u00a4\u00a5\7v\2\2\u00a5\n\3\2\2\2\u00a6\u00a7\7l\2\2\u00a7\u00a8"+
		"\7w\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7F\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\u00ad\7K\2\2\u00ad\u00ae\7v\2\2\u00ae\f\3\2\2\2\u00af"+
		"\u00b0\7e\2\2\u00b0\u00b1\7j\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7e\2\2"+
		"\u00b3\u00b4\7m\2\2\u00b4\u00b5\7G\2\2\u00b5\u00b6\7o\2\2\u00b6\16\3\2"+
		"\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb"+
		"\7k\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7p\2\2\u00be"+
		"\20\3\2\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7d\2\2\u00c2"+
		"\u00c3\7u\2\2\u00c3\22\3\2\2\2\u00c4\u00c5\7{\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\7u\2\2\u00c7\u00c8\7D\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7v\2\2"+
		"\u00ca\u00cb\7P\2\2\u00cb\u00cc\7q\2\2\u00cc\24\3\2\2\2\u00cd\u00ce\7"+
		"d\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7N\2\2\u00d1\u00d2"+
		"\7c\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7p\2\2\u00d5"+
		"\26\3\2\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7\65\2\2\u00d8\u00d9\7\65\2"+
		"\2\u00d9\u00da\7v\2\2\u00da\30\3\2\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd"+
		"\7k\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7k\2\2\u00e0"+
		"\u00e1\7p\2\2\u00e1\u00e2\7i\2\2\u00e2\u00e3\7P\2\2\u00e3\u00e4\7q\2\2"+
		"\u00e4\32\3\2\2\2\u00e5\u00e6\7d\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7"+
		"v\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7c\2\2\u00eb\34"+
		"\3\2\2\2\u00ec\u00ed\7y\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7v\2\2\u00ef"+
		"\36\3\2\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7j\2\2\u00f2\u00f3\7q\2\2\u00f3"+
		"\u00f4\7q\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7C\2\2"+
		"\u00f7\u00f8\7R\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb"+
		"\7n\2\2\u00fb \3\2\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff"+
		"\7n\2\2\u00ff\u0100\7n\2\2\u0100\"\3\2\2\2\u0101\u0102\7j\2\2\u0102\u0103"+
		"\7k\2\2\u0103\u0104\7r\2\2\u0104\u0105\7u\2\2\u0105\u0106\7v\2\2\u0106"+
		"\u0107\7g\2\2\u0107\u0108\7t\2\2\u0108$\3\2\2\2\u0109\u010a\7-\2\2\u010a"+
		"&\3\2\2\2\u010b\u010c\7/\2\2\u010c(\3\2\2\2\u010d\u010e\7@\2\2\u010e*"+
		"\3\2\2\2\u010f\u0110\7>\2\2\u0110,\3\2\2\2\u0111\u0112\7@\2\2\u0112\u0113"+
		"\7?\2\2\u0113.\3\2\2\2\u0114\u0115\7>\2\2\u0115\u0116\7?\2\2\u0116\60"+
		"\3\2\2\2\u0117\u0118\7?\2\2\u0118\u0119\7?\2\2\u0119\62\3\2\2\2\u011a"+
		"\u011b\7#\2\2\u011b\u011c\7?\2\2\u011c\64\3\2\2\2\u011d\u011e\7c\2\2\u011e"+
		"\u011f\7p\2\2\u011f\u0120\7f\2\2\u0120\66\3\2\2\2\u0121\u0122\7q\2\2\u0122"+
		"\u0123\7t\2\2\u01238\3\2\2\2\u0124\u0125\7p\2\2\u0125\u0126\7q\2\2\u0126"+
		"\u0127\7r\2\2\u0127\u0128\7g\2\2\u0128:\3\2\2\2\u0129\u012a\7@\2\2\u012a"+
		"\u012b\7@\2\2\u012b<\3\2\2\2\u012c\u012d\7>\2\2\u012d\u012e\7>\2\2\u012e"+
		">\3\2\2\2\u012f\u0130\7(\2\2\u0130@\3\2\2\2\u0131\u0132\7~\2\2\u0132B"+
		"\3\2\2\2\u0133\u0134\7`\2\2\u0134D\3\2\2\2\u0135\u0136\7\u0080\2\2\u0136"+
		"F\3\2\2\2\u0137\u0139\t\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e"+
		"\7\60\2\2\u013d\u013f\t\2\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2"+
		"\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141H\3\2\2\2\u0142\u0144\t"+
		"\2\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146J\3\2\2\2\u0147\u0148\7j\2\2\u0148\u0149\7c\2\2\u0149"+
		"\u014a\7e\2\2\u014a\u014b\7m\2\2\u014b\u014c\7g\2\2\u014c\u014d\7t\2\2"+
		"\u014d\u014f\3\2\2\2\u014e\u0150\t\3\2\2\u014f\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152L\3\2\2\2\u0153"+
		"\u0154\79\2\2\u0154\u0155\7z\2\2\u0155\u0156\7\63\2\2\u0156\u0158\3\2"+
		"\2\2\u0157\u0159\t\4\2\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015bN\3\2\2\2\u015c\u0162\5o8\2\u015d"+
		"\u0161\n\5\2\2\u015e\u015f\7^\2\2\u015f\u0161\13\2\2\2\u0160\u015d\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\5o"+
		"8\2\u0166P\3\2\2\2\u0167\u0168\7*\2\2\u0168\u0169\7{\2\2\u0169\u016a\7"+
		"g\2\2\u016a\u016b\7c\2\2\u016b\u016c\7j\2\2\u016c\u016d\7+\2\2\u016d\u016e"+
		"\7~\2\2\u016e\u016f\7*\2\2\u016f\u0170\7v\2\2\u0170\u0171\7t\2\2\u0171"+
		"\u0172\7c\2\2\u0172\u0173\7r\2\2\u0173\u0174\7+\2\2\u0174R\3\2\2\2\u0175"+
		"\u0179\5o8\2\u0176\u017a\n\5\2\2\u0177\u0178\7^\2\2\u0178\u017a\13\2\2"+
		"\2\u0179\u0176\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c"+
		"\5o8\2\u017cT\3\2\2\2\u017d\u017e\7h\2\2\u017e\u017f\7k\2\2\u017f\u0180"+
		"\7t\2\2\u0180\u0181\7u\2\2\u0181\u0182\7v\2\2\u0182\u0186\3\2\2\2\u0183"+
		"\u0185\n\6\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189"+
		"\u018a\b+\2\2\u018aV\3\2\2\2\u018b\u018c\7c\2\2\u018c\u018d\7{\2\2\u018d"+
		"\u018e\7{\2\2\u018e\u0193\3\2\2\2\u018f\u0192\13\2\2\2\u0190\u0192\7\f"+
		"\2\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0196\u0197\7n\2\2\u0197\u0198\7o\2\2\u0198\u0199\7c\2\2\u0199\u019a"+
		"\7q\2\2\u019a\u019b\3\2\2\2\u019b\u019c\b,\2\2\u019cX\3\2\2\2\u019d\u019e"+
		"\7\60\2\2\u019eZ\3\2\2\2\u019f\u01a0\7?\2\2\u01a0\\\3\2\2\2\u01a1\u01a2"+
		"\7f\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5\7w\2\2\u01a5"+
		"^\3\2\2\2\u01a6\u01a7\7\u00c4\2\2\u01a7\u01a8\7\u00ae\2\2\u01a8\u01a9"+
		"\7\u00c4\2\2\u01a9\u01aa\7\u00ae\2\2\u01aa`\3\2\2\2\u01ab\u01ac\7<\2\2"+
		"\u01acb\3\2\2\2\u01ad\u01ae\7]\2\2\u01aed\3\2\2\2\u01af\u01b0\7_\2\2\u01b0"+
		"f\3\2\2\2\u01b1\u01b2\7k\2\2\u01b2\u01b3\7n\2\2\u01b3\u01b4\7n\2\2\u01b4"+
		"\u01b5\7w\2\2\u01b5\u01b6\7o\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7p\2\2"+
		"\u01b8\u01b9\7c\2\2\u01b9\u01ba\7v\2\2\u01ba\u01bb\7k\2\2\u01bbh\3\2\2"+
		"\2\u01bc\u01bd\7e\2\2\u01bd\u01be\7q\2\2\u01be\u01bf\7p\2\2\u01bf\u01c0"+
		"\7h\2\2\u01c0\u01c1\7k\2\2\u01c1\u01c2\7t\2\2\u01c2\u01c3\7o\2\2\u01c3"+
		"\u01c4\7g\2\2\u01c4\u01c5\7f\2\2\u01c5j\3\2\2\2\u01c6\u01c7\7N\2\2\u01c7"+
		"\u01c8\7*\2\2\u01c8l\3\2\2\2\u01c9\u01ca\7+\2\2\u01ca\u01cb\7N\2\2\u01cb"+
		"n\3\2\2\2\u01cc\u01cd\7$\2\2\u01cdp\3\2\2\2\u01ce\u01d2\t\7\2\2\u01cf"+
		"\u01d1\t\b\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3r\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6"+
		"\7i\2\2\u01d6\u01d7\7q\2\2\u01d7\u01d8\7J\2\2\u01d8\u01d9\7q\2\2\u01d9"+
		"\u01da\7o\2\2\u01da\u01db\7g\2\2\u01db\u01dc\7[\2\2\u01dc\u01dd\7q\2\2"+
		"\u01dd\u01de\7w\2\2\u01de\u01df\7C\2\2\u01df\u01e0\7t\2\2\u01e0\u01e1"+
		"\7g\2\2\u01e1\u01e2\7F\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e4\7w\2\2\u01e4"+
		"\u01e5\7p\2\2\u01e5\u01e6\7m\2\2\u01e6t\3\2\2\2\u01e7\u01e9\t\t\2\2\u01e8"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\b;\2\2\u01edv\3\2\2\2\20\2\u013a"+
		"\u0140\u0145\u0151\u015a\u0160\u0162\u0179\u0186\u0191\u0193\u01d2\u01ea"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}