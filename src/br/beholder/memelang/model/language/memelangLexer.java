package br.beholder.memelang.model.language;
// Generated from .\Memelang.g4 by ANTLR 4.7
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
		DEFRETORNO=1, IFDES=2, ELSE=3, WHILEDES=4, FORDES=5, DODES=6, INT=7, STRING=8, 
		DOUBLE=9, BOOL=10, BIN=11, HEXA=12, VOID=13, CHAR=14, BREAK=15, SWITCHDES=16, 
		CASE=17, DEFAULTDES=18, MAIS=19, MENOS=20, MAIORQUE=21, MENORQUE=22, MAIOROUIGUAL=23, 
		MENOROUIGUAL=24, IDENTICO=25, DIFERENTE=26, AND=27, OR=28, NOT=29, BITSHIFTRIGHT=30, 
		BITSHIFTLEFT=31, BITAND=32, BITOR=33, BITXOR=34, BITNOT=35, CONSTREAL=36, 
		CONSTINTEIRO=37, CONSTBINARIO=38, CONSTHEXA=39, CONSTSTRING=40, CONSTLOGICO=41, 
		CONSTCHAR=42, COMENTARIOLINHA=43, COMENTARIOMULTIPLO=44, PONTO=45, IGUAL=46, 
		PONTOEVIRGULA=47, VIRGULA=48, DOISPONTOS=49, COLCHETESABRE=50, COLCHETESFECHA=51, 
		CHAVESABRE=52, CHAVESFECHA=53, PARENTESEABRE=54, PARENTESEFECHA=55, ASPA=56, 
		ID=57, WHITESPACE=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DEFRETORNO", "IFDES", "ELSE", "WHILEDES", "FORDES", "DODES", "INT", "STRING", 
		"DOUBLE", "BOOL", "BIN", "HEXA", "VOID", "CHAR", "BREAK", "SWITCHDES", 
		"CASE", "DEFAULTDES", "MAIS", "MENOS", "MAIORQUE", "MENORQUE", "MAIOROUIGUAL", 
		"MENOROUIGUAL", "IDENTICO", "DIFERENTE", "AND", "OR", "NOT", "BITSHIFTRIGHT", 
		"BITSHIFTLEFT", "BITAND", "BITOR", "BITXOR", "BITNOT", "CONSTREAL", "CONSTINTEIRO", 
		"CONSTBINARIO", "CONSTHEXA", "CONSTSTRING", "CONSTLOGICO", "CONSTCHAR", 
		"COMENTARIOLINHA", "COMENTARIOMULTIPLO", "PONTO", "IGUAL", "PONTOEVIRGULA", 
		"VIRGULA", "DOISPONTOS", "COLCHETESABRE", "COLCHETESFECHA", "CHAVESABRE", 
		"CHAVESFECHA", "PARENTESEABRE", "PARENTESEFECHA", "ASPA", "ID", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'goHomeYouAreDrunk'", "'kek'", "'notSureIf'", "'everydayUntilYouLikeIt'", 
		"'waitForIt'", "'justDoIt'", "'checkEm'", "'lolicon'", "'dubs'", "'yesButNo'", 
		"'binLaden'", "'l33t'", "'missingNo'", "'batata'", "'wat'", "'chooseAPill'", 
		"'pill'", "'hipster'", "'+'", "'-'", "'>'", "'<'", "'>='", "'<='", "'=='", 
		"'!='", "'and'", "'or'", "'nope'", "'>>'", "'<<'", "'&'", "'|'", "'^'", 
		"'~'", null, null, null, null, null, "'(yeah)|(trap)'", null, null, null, 
		"'.'", "'='", "'desu'", "'\u00C2\u00AC\u00C2\u00AC'", "':'", "'['", "']'", 
		"'illuminati'", "'confirmed'", "'L('", "')L'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DEFRETORNO", "IFDES", "ELSE", "WHILEDES", "FORDES", "DODES", "INT", 
		"STRING", "DOUBLE", "BOOL", "BIN", "HEXA", "VOID", "CHAR", "BREAK", "SWITCHDES", 
		"CASE", "DEFAULTDES", "MAIS", "MENOS", "MAIORQUE", "MENORQUE", "MAIOROUIGUAL", 
		"MENOROUIGUAL", "IDENTICO", "DIFERENTE", "AND", "OR", "NOT", "BITSHIFTRIGHT", 
		"BITSHIFTLEFT", "BITAND", "BITOR", "BITXOR", "BITNOT", "CONSTREAL", "CONSTINTEIRO", 
		"CONSTBINARIO", "CONSTHEXA", "CONSTSTRING", "CONSTLOGICO", "CONSTCHAR", 
		"COMENTARIOLINHA", "COMENTARIOMULTIPLO", "PONTO", "IGUAL", "PONTOEVIRGULA", 
		"VIRGULA", "DOISPONTOS", "COLCHETESABRE", "COLCHETESFECHA", "CHAVESABRE", 
		"CHAVESFECHA", "PARENTESEABRE", "PARENTESEFECHA", "ASPA", "ID", "WHITESPACE"
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
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\6%\u014b\n%\r%\16%\u014c\3%\3%\6%\u0151\n%\r%\16%\u0152\3&\6&\u0156"+
		"\n&\r&\16&\u0157\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\6\'\u0162\n\'\r\'\16"+
		"\'\u0163\3(\3(\3(\3(\3(\6(\u016b\n(\r(\16(\u016c\3)\3)\3)\3)\7)\u0173"+
		"\n)\f)\16)\u0176\13)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\5+\u018c\n+\3+\3+\3,\3,\3,\3,\3,\3,\3,\7,\u0197\n,\f,\16,\u019a"+
		"\13,\3,\3,\3-\3-\3-\3-\3-\3-\7-\u01a4\n-\f-\16-\u01a7\13-\3-\3-\3-\3-"+
		"\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\38\38\38\39\39\3:\3:\7:\u01e3\n:\f:\16:\u01e6\13:\3;\6;\u01e9"+
		"\n;\r;\16;\u01ea\3;\3;\2\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<\3\2\n\3\2\62;\3\2\62\63\5\2\62;CHch"+
		"\4\2$$^^\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\2"+
		"\u01fa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5\u0089"+
		"\3\2\2\2\7\u008d\3\2\2\2\t\u0097\3\2\2\2\13\u00ae\3\2\2\2\r\u00b8\3\2"+
		"\2\2\17\u00c1\3\2\2\2\21\u00c9\3\2\2\2\23\u00d1\3\2\2\2\25\u00d6\3\2\2"+
		"\2\27\u00df\3\2\2\2\31\u00e8\3\2\2\2\33\u00ed\3\2\2\2\35\u00f7\3\2\2\2"+
		"\37\u00fe\3\2\2\2!\u0102\3\2\2\2#\u010e\3\2\2\2%\u0113\3\2\2\2\'\u011b"+
		"\3\2\2\2)\u011d\3\2\2\2+\u011f\3\2\2\2-\u0121\3\2\2\2/\u0123\3\2\2\2\61"+
		"\u0126\3\2\2\2\63\u0129\3\2\2\2\65\u012c\3\2\2\2\67\u012f\3\2\2\29\u0133"+
		"\3\2\2\2;\u0136\3\2\2\2=\u013b\3\2\2\2?\u013e\3\2\2\2A\u0141\3\2\2\2C"+
		"\u0143\3\2\2\2E\u0145\3\2\2\2G\u0147\3\2\2\2I\u014a\3\2\2\2K\u0155\3\2"+
		"\2\2M\u0159\3\2\2\2O\u0165\3\2\2\2Q\u016e\3\2\2\2S\u0179\3\2\2\2U\u0187"+
		"\3\2\2\2W\u018f\3\2\2\2Y\u019d\3\2\2\2[\u01af\3\2\2\2]\u01b1\3\2\2\2_"+
		"\u01b3\3\2\2\2a\u01b8\3\2\2\2c\u01bd\3\2\2\2e\u01bf\3\2\2\2g\u01c1\3\2"+
		"\2\2i\u01c3\3\2\2\2k\u01ce\3\2\2\2m\u01d8\3\2\2\2o\u01db\3\2\2\2q\u01de"+
		"\3\2\2\2s\u01e0\3\2\2\2u\u01e8\3\2\2\2wx\7i\2\2xy\7q\2\2yz\7J\2\2z{\7"+
		"q\2\2{|\7o\2\2|}\7g\2\2}~\7[\2\2~\177\7q\2\2\177\u0080\7w\2\2\u0080\u0081"+
		"\7C\2\2\u0081\u0082\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084\7F\2\2\u0084"+
		"\u0085\7t\2\2\u0085\u0086\7w\2\2\u0086\u0087\7p\2\2\u0087\u0088\7m\2\2"+
		"\u0088\4\3\2\2\2\u0089\u008a\7m\2\2\u008a\u008b\7g\2\2\u008b\u008c\7m"+
		"\2\2\u008c\6\3\2\2\2\u008d\u008e\7p\2\2\u008e\u008f\7q\2\2\u008f\u0090"+
		"\7v\2\2\u0090\u0091\7U\2\2\u0091\u0092\7w\2\2\u0092\u0093\7t\2\2\u0093"+
		"\u0094\7g\2\2\u0094\u0095\7K\2\2\u0095\u0096\7h\2\2\u0096\b\3\2\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7x\2\2\u0099\u009a\7g\2\2\u009a\u009b\7t\2\2"+
		"\u009b\u009c\7{\2\2\u009c\u009d\7f\2\2\u009d\u009e\7c\2\2\u009e\u009f"+
		"\7{\2\2\u009f\u00a0\7W\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"\u00a3\7k\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7[\2\2\u00a5\u00a6\7q\2\2"+
		"\u00a6\u00a7\7w\2\2\u00a7\u00a8\7N\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa"+
		"\7m\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ad\7v\2\2\u00ad"+
		"\n\3\2\2\2\u00ae\u00af\7y\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7v\2\2\u00b2\u00b3\7H\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7t\2\2"+
		"\u00b5\u00b6\7K\2\2\u00b6\u00b7\7v\2\2\u00b7\f\3\2\2\2\u00b8\u00b9\7l"+
		"\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd"+
		"\7F\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7K\2\2\u00bf\u00c0\7v\2\2\u00c0"+
		"\16\3\2\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7e\2\2\u00c5\u00c6\7m\2\2\u00c6\u00c7\7G\2\2\u00c7\u00c8\7o\2\2"+
		"\u00c8\20\3\2\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7"+
		"n\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0\22\3\2\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4"+
		"\7d\2\2\u00d4\u00d5\7u\2\2\u00d5\24\3\2\2\2\u00d6\u00d7\7{\2\2\u00d7\u00d8"+
		"\7g\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7D\2\2\u00da\u00db\7w\2\2\u00db"+
		"\u00dc\7v\2\2\u00dc\u00dd\7P\2\2\u00dd\u00de\7q\2\2\u00de\26\3\2\2\2\u00df"+
		"\u00e0\7d\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7N\2\2"+
		"\u00e3\u00e4\7c\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7"+
		"\7p\2\2\u00e7\30\3\2\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7\65\2\2\u00ea"+
		"\u00eb\7\65\2\2\u00eb\u00ec\7v\2\2\u00ec\32\3\2\2\2\u00ed\u00ee\7o\2\2"+
		"\u00ee\u00ef\7k\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2"+
		"\7k\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7i\2\2\u00f4\u00f5\7P\2\2\u00f5"+
		"\u00f6\7q\2\2\u00f6\34\3\2\2\2\u00f7\u00f8\7d\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u00fa\7v\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7c\2\2"+
		"\u00fd\36\3\2\2\2\u00fe\u00ff\7y\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7"+
		"v\2\2\u0101 \3\2\2\2\u0102\u0103\7e\2\2\u0103\u0104\7j\2\2\u0104\u0105"+
		"\7q\2\2\u0105\u0106\7q\2\2\u0106\u0107\7u\2\2\u0107\u0108\7g\2\2\u0108"+
		"\u0109\7C\2\2\u0109\u010a\7R\2\2\u010a\u010b\7k\2\2\u010b\u010c\7n\2\2"+
		"\u010c\u010d\7n\2\2\u010d\"\3\2\2\2\u010e\u010f\7r\2\2\u010f\u0110\7k"+
		"\2\2\u0110\u0111\7n\2\2\u0111\u0112\7n\2\2\u0112$\3\2\2\2\u0113\u0114"+
		"\7j\2\2\u0114\u0115\7k\2\2\u0115\u0116\7r\2\2\u0116\u0117\7u\2\2\u0117"+
		"\u0118\7v\2\2\u0118\u0119\7g\2\2\u0119\u011a\7t\2\2\u011a&\3\2\2\2\u011b"+
		"\u011c\7-\2\2\u011c(\3\2\2\2\u011d\u011e\7/\2\2\u011e*\3\2\2\2\u011f\u0120"+
		"\7@\2\2\u0120,\3\2\2\2\u0121\u0122\7>\2\2\u0122.\3\2\2\2\u0123\u0124\7"+
		"@\2\2\u0124\u0125\7?\2\2\u0125\60\3\2\2\2\u0126\u0127\7>\2\2\u0127\u0128"+
		"\7?\2\2\u0128\62\3\2\2\2\u0129\u012a\7?\2\2\u012a\u012b\7?\2\2\u012b\64"+
		"\3\2\2\2\u012c\u012d\7#\2\2\u012d\u012e\7?\2\2\u012e\66\3\2\2\2\u012f"+
		"\u0130\7c\2\2\u0130\u0131\7p\2\2\u0131\u0132\7f\2\2\u01328\3\2\2\2\u0133"+
		"\u0134\7q\2\2\u0134\u0135\7t\2\2\u0135:\3\2\2\2\u0136\u0137\7p\2\2\u0137"+
		"\u0138\7q\2\2\u0138\u0139\7r\2\2\u0139\u013a\7g\2\2\u013a<\3\2\2\2\u013b"+
		"\u013c\7@\2\2\u013c\u013d\7@\2\2\u013d>\3\2\2\2\u013e\u013f\7>\2\2\u013f"+
		"\u0140\7>\2\2\u0140@\3\2\2\2\u0141\u0142\7(\2\2\u0142B\3\2\2\2\u0143\u0144"+
		"\7~\2\2\u0144D\3\2\2\2\u0145\u0146\7`\2\2\u0146F\3\2\2\2\u0147\u0148\7"+
		"\u0080\2\2\u0148H\3\2\2\2\u0149\u014b\t\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0150\7\60\2\2\u014f\u0151\t\2\2\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153J\3\2\2\2"+
		"\u0154\u0156\t\2\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158L\3\2\2\2\u0159\u015a\7j\2\2\u015a\u015b"+
		"\7c\2\2\u015b\u015c\7e\2\2\u015c\u015d\7m\2\2\u015d\u015e\7g\2\2\u015e"+
		"\u015f\7t\2\2\u015f\u0161\3\2\2\2\u0160\u0162\t\3\2\2\u0161\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"N\3\2\2\2\u0165\u0166\79\2\2\u0166\u0167\7z\2\2\u0167\u0168\7\63\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u016b\t\4\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016dP\3\2\2\2\u016e\u0174"+
		"\5q9\2\u016f\u0173\n\5\2\2\u0170\u0171\7^\2\2\u0171\u0173\13\2\2\2\u0172"+
		"\u016f\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0178\5q9\2\u0178R\3\2\2\2\u0179\u017a\7*\2\2\u017a\u017b\7{\2\2\u017b"+
		"\u017c\7g\2\2\u017c\u017d\7c\2\2\u017d\u017e\7j\2\2\u017e\u017f\7+\2\2"+
		"\u017f\u0180\7~\2\2\u0180\u0181\7*\2\2\u0181\u0182\7v\2\2\u0182\u0183"+
		"\7t\2\2\u0183\u0184\7c\2\2\u0184\u0185\7r\2\2\u0185\u0186\7+\2\2\u0186"+
		"T\3\2\2\2\u0187\u018b\5q9\2\u0188\u018c\n\5\2\2\u0189\u018a\7^\2\2\u018a"+
		"\u018c\13\2\2\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\3"+
		"\2\2\2\u018d\u018e\5q9\2\u018eV\3\2\2\2\u018f\u0190\7h\2\2\u0190\u0191"+
		"\7k\2\2\u0191\u0192\7t\2\2\u0192\u0193\7u\2\2\u0193\u0194\7v\2\2\u0194"+
		"\u0198\3\2\2\2\u0195\u0197\n\6\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019c\b,\2\2\u019cX\3\2\2\2\u019d\u019e\7c\2\2\u019e"+
		"\u019f\7{\2\2\u019f\u01a0\7{\2\2\u01a0\u01a5\3\2\2\2\u01a1\u01a4\13\2"+
		"\2\2\u01a2\u01a4\7\f\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4"+
		"\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7n\2\2\u01a9\u01aa\7o\2\2\u01aa\u01ab"+
		"\7c\2\2\u01ab\u01ac\7q\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\b-\2\2\u01ae"+
		"Z\3\2\2\2\u01af\u01b0\7\60\2\2\u01b0\\\3\2\2\2\u01b1\u01b2\7?\2\2\u01b2"+
		"^\3\2\2\2\u01b3\u01b4\7f\2\2\u01b4\u01b5\7g\2\2\u01b5\u01b6\7u\2\2\u01b6"+
		"\u01b7\7w\2\2\u01b7`\3\2\2\2\u01b8\u01b9\7\u00c4\2\2\u01b9\u01ba\7\u00ae"+
		"\2\2\u01ba\u01bb\7\u00c4\2\2\u01bb\u01bc\7\u00ae\2\2\u01bcb\3\2\2\2\u01bd"+
		"\u01be\7<\2\2\u01bed\3\2\2\2\u01bf\u01c0\7]\2\2\u01c0f\3\2\2\2\u01c1\u01c2"+
		"\7_\2\2\u01c2h\3\2\2\2\u01c3\u01c4\7k\2\2\u01c4\u01c5\7n\2\2\u01c5\u01c6"+
		"\7n\2\2\u01c6\u01c7\7w\2\2\u01c7\u01c8\7o\2\2\u01c8\u01c9\7k\2\2\u01c9"+
		"\u01ca\7p\2\2\u01ca\u01cb\7c\2\2\u01cb\u01cc\7v\2\2\u01cc\u01cd\7k\2\2"+
		"\u01cdj\3\2\2\2\u01ce\u01cf\7e\2\2\u01cf\u01d0\7q\2\2\u01d0\u01d1\7p\2"+
		"\2\u01d1\u01d2\7h\2\2\u01d2\u01d3\7k\2\2\u01d3\u01d4\7t\2\2\u01d4\u01d5"+
		"\7o\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7\7f\2\2\u01d7l\3\2\2\2\u01d8\u01d9"+
		"\7N\2\2\u01d9\u01da\7*\2\2\u01dan\3\2\2\2\u01db\u01dc\7+\2\2\u01dc\u01dd"+
		"\7N\2\2\u01ddp\3\2\2\2\u01de\u01df\7$\2\2\u01dfr\3\2\2\2\u01e0\u01e4\t"+
		"\7\2\2\u01e1\u01e3\t\b\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5t\3\2\2\2\u01e6\u01e4\3\2\2\2"+
		"\u01e7\u01e9\t\t\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\b;\2\2\u01ed"+
		"v\3\2\2\2\20\2\u014c\u0152\u0157\u0163\u016c\u0172\u0174\u018b\u0198\u01a3"+
		"\u01a5\u01e4\u01ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}