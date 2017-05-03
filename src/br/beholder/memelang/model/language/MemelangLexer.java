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
		DEFREAD=1, DEFWRITE=2, DEFRETORNO=3, IFDES=4, ELSE=5, WHILEDES=6, FORDES=7, 
		DODES=8, INT=9, STRING=10, DOUBLE=11, BOOL=12, BIN=13, HEXA=14, VOID=15, 
		CHAR=16, BREAK=17, SWITCHDES=18, CASE=19, DEFAULTDES=20, MAIS=21, MENOS=22, 
		MULTIPLICA=23, DIVIDE=24, MOD=25, MAIORQUE=26, MENORQUE=27, MAIOROUIGUAL=28, 
		MENOROUIGUAL=29, IDENTICO=30, DIFERENTE=31, AND=32, OR=33, NOT=34, REFERENCIA=35, 
		BITSHIFTRIGHT=36, BITSHIFTLEFT=37, BITAND=38, BITOR=39, BITXOR=40, BITNOT=41, 
		CONSTREAL=42, CONSTINTEIRO=43, CONSTBINARIO=44, CONSTHEXA=45, CONSTSTRING=46, 
		CONSTLOGICO=47, CONSTCHAR=48, COMENTARIOLINHA=49, COMENTARIOMULTIPLO=50, 
		PONTO=51, IGUAL=52, PONTOEVIRGULA=53, VIRGULA=54, DOISPONTOS=55, COLCHETESABRE=56, 
		COLCHETESFECHA=57, CHAVESABRE=58, CHAVESFECHA=59, PARENTESEABRE=60, PARENTESEFECHA=61, 
		ASPA=62, ID=63, WHITESPACE=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DEFREAD", "DEFWRITE", "DEFRETORNO", "IFDES", "ELSE", "WHILEDES", "FORDES", 
		"DODES", "INT", "STRING", "DOUBLE", "BOOL", "BIN", "HEXA", "VOID", "CHAR", 
		"BREAK", "SWITCHDES", "CASE", "DEFAULTDES", "MAIS", "MENOS", "MULTIPLICA", 
		"DIVIDE", "MOD", "MAIORQUE", "MENORQUE", "MAIOROUIGUAL", "MENOROUIGUAL", 
		"IDENTICO", "DIFERENTE", "AND", "OR", "NOT", "REFERENCIA", "BITSHIFTRIGHT", 
		"BITSHIFTLEFT", "BITAND", "BITOR", "BITXOR", "BITNOT", "CONSTREAL", "CONSTINTEIRO", 
		"CONSTBINARIO", "CONSTHEXA", "CONSTSTRING", "CONSTLOGICO", "CONSTCHAR", 
		"COMENTARIOLINHA", "COMENTARIOMULTIPLO", "PONTO", "IGUAL", "PONTOEVIRGULA", 
		"VIRGULA", "DOISPONTOS", "COLCHETESABRE", "COLCHETESFECHA", "CHAVESABRE", 
		"CHAVESFECHA", "PARENTESEABRE", "PARENTESEFECHA", "ASPA", "ID", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'leia'", "'escreva'", "'goHomeYouAreDrunk'", "'kek'", "'notSureIf'", 
		"'everydayUntilYouLikeIt'", "'waitForIt'", "'justDoIt'", "'checkEm'", 
		"'lolicon'", "'dubs'", "'yesButNo'", "'binLaden'", "'l33t'", "'missingNo'", 
		"'batata'", "'wat'", "'chooseAPill'", "'pill'", "'hipster'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'and'", 
		"'or'", "'nope'", "'sauce'", "'>>'", "'<<'", "'&'", "'|'", "'^'", "'~'", 
		null, null, null, null, null, null, null, null, null, "'.'", "'='", "'desu'", 
		"','", "':'", "'['", "']'", "'illuminati'", "'confirmed'", "'L('", "')L'", 
		"'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DEFREAD", "DEFWRITE", "DEFRETORNO", "IFDES", "ELSE", "WHILEDES", 
		"FORDES", "DODES", "INT", "STRING", "DOUBLE", "BOOL", "BIN", "HEXA", "VOID", 
		"CHAR", "BREAK", "SWITCHDES", "CASE", "DEFAULTDES", "MAIS", "MENOS", "MULTIPLICA", 
		"DIVIDE", "MOD", "MAIORQUE", "MENORQUE", "MAIOROUIGUAL", "MENOROUIGUAL", 
		"IDENTICO", "DIFERENTE", "AND", "OR", "NOT", "REFERENCIA", "BITSHIFTRIGHT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u020c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\6+\u0170\n+\r+\16"+
		"+\u0171\3+\3+\6+\u0176\n+\r+\16+\u0177\3,\6,\u017b\n,\r,\16,\u017c\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\6-\u0187\n-\r-\16-\u0188\3.\3.\3.\3.\3.\6.\u0190"+
		"\n.\r.\16.\u0191\3/\3/\3/\3/\7/\u0198\n/\f/\16/\u019b\13/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01a7\n\60\3\61\3\61\3\61\3\61"+
		"\5\61\u01ad\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u01b8"+
		"\n\62\f\62\16\62\u01bb\13\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\7"+
		"\63\u01c5\n\63\f\63\16\63\u01c8\13\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\38\38\39\3"+
		"9\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3=\3=\3=\3>\3>\3>\3?\3?\3@\3@\7@\u0201\n@\f@\16@\u0204\13@\3A\6A\u0207"+
		"\nA\rA\16A\u0208\3A\3A\2\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\3\2\n\3\2\62;\3"+
		"\2\62\63\5\2\62;CHch\4\2$$^^\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\5"+
		"\2\13\f\16\17\"\"\2\u0219\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\3\u0083\3\2\2\2\5\u0088\3\2\2\2\7\u0090\3\2\2\2\t\u00a2\3\2\2\2\13"+
		"\u00a6\3\2\2\2\r\u00b0\3\2\2\2\17\u00c7\3\2\2\2\21\u00d1\3\2\2\2\23\u00da"+
		"\3\2\2\2\25\u00e2\3\2\2\2\27\u00ea\3\2\2\2\31\u00ef\3\2\2\2\33\u00f8\3"+
		"\2\2\2\35\u0101\3\2\2\2\37\u0106\3\2\2\2!\u0110\3\2\2\2#\u0117\3\2\2\2"+
		"%\u011b\3\2\2\2\'\u0127\3\2\2\2)\u012c\3\2\2\2+\u0134\3\2\2\2-\u0136\3"+
		"\2\2\2/\u0138\3\2\2\2\61\u013a\3\2\2\2\63\u013c\3\2\2\2\65\u013e\3\2\2"+
		"\2\67\u0140\3\2\2\29\u0142\3\2\2\2;\u0145\3\2\2\2=\u0148\3\2\2\2?\u014b"+
		"\3\2\2\2A\u014e\3\2\2\2C\u0152\3\2\2\2E\u0155\3\2\2\2G\u015a\3\2\2\2I"+
		"\u0160\3\2\2\2K\u0163\3\2\2\2M\u0166\3\2\2\2O\u0168\3\2\2\2Q\u016a\3\2"+
		"\2\2S\u016c\3\2\2\2U\u016f\3\2\2\2W\u017a\3\2\2\2Y\u017e\3\2\2\2[\u018a"+
		"\3\2\2\2]\u0193\3\2\2\2_\u01a6\3\2\2\2a\u01a8\3\2\2\2c\u01b0\3\2\2\2e"+
		"\u01be\3\2\2\2g\u01d0\3\2\2\2i\u01d2\3\2\2\2k\u01d4\3\2\2\2m\u01d9\3\2"+
		"\2\2o\u01db\3\2\2\2q\u01dd\3\2\2\2s\u01df\3\2\2\2u\u01e1\3\2\2\2w\u01ec"+
		"\3\2\2\2y\u01f6\3\2\2\2{\u01f9\3\2\2\2}\u01fc\3\2\2\2\177\u01fe\3\2\2"+
		"\2\u0081\u0206\3\2\2\2\u0083\u0084\7n\2\2\u0084\u0085\7g\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7c\2\2\u0087\4\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a"+
		"\7u\2\2\u008a\u008b\7e\2\2\u008b\u008c\7t\2\2\u008c\u008d\7g\2\2\u008d"+
		"\u008e\7x\2\2\u008e\u008f\7c\2\2\u008f\6\3\2\2\2\u0090\u0091\7i\2\2\u0091"+
		"\u0092\7q\2\2\u0092\u0093\7J\2\2\u0093\u0094\7q\2\2\u0094\u0095\7o\2\2"+
		"\u0095\u0096\7g\2\2\u0096\u0097\7[\2\2\u0097\u0098\7q\2\2\u0098\u0099"+
		"\7w\2\2\u0099\u009a\7C\2\2\u009a\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7F\2\2\u009d\u009e\7t\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7p\2\2"+
		"\u00a0\u00a1\7m\2\2\u00a1\b\3\2\2\2\u00a2\u00a3\7m\2\2\u00a3\u00a4\7g"+
		"\2\2\u00a4\u00a5\7m\2\2\u00a5\n\3\2\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8"+
		"\7q\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7U\2\2\u00aa\u00ab\7w\2\2\u00ab"+
		"\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7K\2\2\u00ae\u00af\7h\2\2"+
		"\u00af\f\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7x\2\2\u00b2\u00b3\7g"+
		"\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7{\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7"+
		"\7c\2\2\u00b7\u00b8\7{\2\2\u00b8\u00b9\7W\2\2\u00b9\u00ba\7p\2\2\u00ba"+
		"\u00bb\7v\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7[\2\2"+
		"\u00be\u00bf\7q\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7N\2\2\u00c1\u00c2"+
		"\7k\2\2\u00c2\u00c3\7m\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7K\2\2\u00c5"+
		"\u00c6\7v\2\2\u00c6\16\3\2\2\2\u00c7\u00c8\7y\2\2\u00c8\u00c9\7c\2\2\u00c9"+
		"\u00ca\7k\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7H\2\2\u00cc\u00cd\7q\2\2"+
		"\u00cd\u00ce\7t\2\2\u00ce\u00cf\7K\2\2\u00cf\u00d0\7v\2\2\u00d0\20\3\2"+
		"\2\2\u00d1\u00d2\7l\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5"+
		"\7v\2\2\u00d5\u00d6\7F\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7K\2\2\u00d8"+
		"\u00d9\7v\2\2\u00d9\22\3\2\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7j\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7m\2\2\u00df\u00e0\7G\2\2"+
		"\u00e0\u00e1\7o\2\2\u00e1\24\3\2\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7"+
		"q\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8"+
		"\7q\2\2\u00e8\u00e9\7p\2\2\u00e9\26\3\2\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec"+
		"\7w\2\2\u00ec\u00ed\7d\2\2\u00ed\u00ee\7u\2\2\u00ee\30\3\2\2\2\u00ef\u00f0"+
		"\7{\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7D\2\2\u00f3"+
		"\u00f4\7w\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7P\2\2\u00f6\u00f7\7q\2\2"+
		"\u00f7\32\3\2\2\2\u00f8\u00f9\7d\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7"+
		"p\2\2\u00fb\u00fc\7N\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7f\2\2\u00fe\u00ff"+
		"\7g\2\2\u00ff\u0100\7p\2\2\u0100\34\3\2\2\2\u0101\u0102\7n\2\2\u0102\u0103"+
		"\7\65\2\2\u0103\u0104\7\65\2\2\u0104\u0105\7v\2\2\u0105\36\3\2\2\2\u0106"+
		"\u0107\7o\2\2\u0107\u0108\7k\2\2\u0108\u0109\7u\2\2\u0109\u010a\7u\2\2"+
		"\u010a\u010b\7k\2\2\u010b\u010c\7p\2\2\u010c\u010d\7i\2\2\u010d\u010e"+
		"\7P\2\2\u010e\u010f\7q\2\2\u010f \3\2\2\2\u0110\u0111\7d\2\2\u0111\u0112"+
		"\7c\2\2\u0112\u0113\7v\2\2\u0113\u0114\7c\2\2\u0114\u0115\7v\2\2\u0115"+
		"\u0116\7c\2\2\u0116\"\3\2\2\2\u0117\u0118\7y\2\2\u0118\u0119\7c\2\2\u0119"+
		"\u011a\7v\2\2\u011a$\3\2\2\2\u011b\u011c\7e\2\2\u011c\u011d\7j\2\2\u011d"+
		"\u011e\7q\2\2\u011e\u011f\7q\2\2\u011f\u0120\7u\2\2\u0120\u0121\7g\2\2"+
		"\u0121\u0122\7C\2\2\u0122\u0123\7R\2\2\u0123\u0124\7k\2\2\u0124\u0125"+
		"\7n\2\2\u0125\u0126\7n\2\2\u0126&\3\2\2\2\u0127\u0128\7r\2\2\u0128\u0129"+
		"\7k\2\2\u0129\u012a\7n\2\2\u012a\u012b\7n\2\2\u012b(\3\2\2\2\u012c\u012d"+
		"\7j\2\2\u012d\u012e\7k\2\2\u012e\u012f\7r\2\2\u012f\u0130\7u\2\2\u0130"+
		"\u0131\7v\2\2\u0131\u0132\7g\2\2\u0132\u0133\7t\2\2\u0133*\3\2\2\2\u0134"+
		"\u0135\7-\2\2\u0135,\3\2\2\2\u0136\u0137\7/\2\2\u0137.\3\2\2\2\u0138\u0139"+
		"\7,\2\2\u0139\60\3\2\2\2\u013a\u013b\7\61\2\2\u013b\62\3\2\2\2\u013c\u013d"+
		"\7\'\2\2\u013d\64\3\2\2\2\u013e\u013f\7@\2\2\u013f\66\3\2\2\2\u0140\u0141"+
		"\7>\2\2\u01418\3\2\2\2\u0142\u0143\7@\2\2\u0143\u0144\7?\2\2\u0144:\3"+
		"\2\2\2\u0145\u0146\7>\2\2\u0146\u0147\7?\2\2\u0147<\3\2\2\2\u0148\u0149"+
		"\7?\2\2\u0149\u014a\7?\2\2\u014a>\3\2\2\2\u014b\u014c\7#\2\2\u014c\u014d"+
		"\7?\2\2\u014d@\3\2\2\2\u014e\u014f\7c\2\2\u014f\u0150\7p\2\2\u0150\u0151"+
		"\7f\2\2\u0151B\3\2\2\2\u0152\u0153\7q\2\2\u0153\u0154\7t\2\2\u0154D\3"+
		"\2\2\2\u0155\u0156\7p\2\2\u0156\u0157\7q\2\2\u0157\u0158\7r\2\2\u0158"+
		"\u0159\7g\2\2\u0159F\3\2\2\2\u015a\u015b\7u\2\2\u015b\u015c\7c\2\2\u015c"+
		"\u015d\7w\2\2\u015d\u015e\7e\2\2\u015e\u015f\7g\2\2\u015fH\3\2\2\2\u0160"+
		"\u0161\7@\2\2\u0161\u0162\7@\2\2\u0162J\3\2\2\2\u0163\u0164\7>\2\2\u0164"+
		"\u0165\7>\2\2\u0165L\3\2\2\2\u0166\u0167\7(\2\2\u0167N\3\2\2\2\u0168\u0169"+
		"\7~\2\2\u0169P\3\2\2\2\u016a\u016b\7`\2\2\u016bR\3\2\2\2\u016c\u016d\7"+
		"\u0080\2\2\u016dT\3\2\2\2\u016e\u0170\t\2\2\2\u016f\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0175\7\60\2\2\u0174\u0176\t\2\2\2\u0175\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178V\3\2\2\2"+
		"\u0179\u017b\t\2\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017dX\3\2\2\2\u017e\u017f\7j\2\2\u017f\u0180"+
		"\7c\2\2\u0180\u0181\7e\2\2\u0181\u0182\7m\2\2\u0182\u0183\7g\2\2\u0183"+
		"\u0184\7t\2\2\u0184\u0186\3\2\2\2\u0185\u0187\t\3\2\2\u0186\u0185\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"Z\3\2\2\2\u018a\u018b\79\2\2\u018b\u018c\7z\2\2\u018c\u018d\7\63\2\2\u018d"+
		"\u018f\3\2\2\2\u018e\u0190\t\4\2\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\\\3\2\2\2\u0193\u0199"+
		"\5}?\2\u0194\u0198\n\5\2\2\u0195\u0196\7^\2\2\u0196\u0198\13\2\2\2\u0197"+
		"\u0194\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c"+
		"\u019d\5}?\2\u019d^\3\2\2\2\u019e\u019f\7{\2\2\u019f\u01a0\7g\2\2\u01a0"+
		"\u01a1\7c\2\2\u01a1\u01a7\7j\2\2\u01a2\u01a3\7v\2\2\u01a3\u01a4\7t\2\2"+
		"\u01a4\u01a5\7c\2\2\u01a5\u01a7\7r\2\2\u01a6\u019e\3\2\2\2\u01a6\u01a2"+
		"\3\2\2\2\u01a7`\3\2\2\2\u01a8\u01ac\5}?\2\u01a9\u01ad\n\5\2\2\u01aa\u01ab"+
		"\7^\2\2\u01ab\u01ad\13\2\2\2\u01ac\u01a9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\5}?\2\u01afb\3\2\2\2\u01b0\u01b1\7h\2\2\u01b1"+
		"\u01b2\7k\2\2\u01b2\u01b3\7t\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b5\7v\2\2"+
		"\u01b5\u01b9\3\2\2\2\u01b6\u01b8\n\6\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bc\u01bd\b\62\2\2\u01bdd\3\2\2\2\u01be\u01bf\7c\2\2"+
		"\u01bf\u01c0\7{\2\2\u01c0\u01c1\7{\2\2\u01c1\u01c6\3\2\2\2\u01c2\u01c5"+
		"\13\2\2\2\u01c3\u01c5\7\f\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2"+
		"\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9"+
		"\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7n\2\2\u01ca\u01cb\7o\2\2\u01cb"+
		"\u01cc\7c\2\2\u01cc\u01cd\7q\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\b\63"+
		"\2\2\u01cff\3\2\2\2\u01d0\u01d1\7\60\2\2\u01d1h\3\2\2\2\u01d2\u01d3\7"+
		"?\2\2\u01d3j\3\2\2\2\u01d4\u01d5\7f\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7"+
		"\7u\2\2\u01d7\u01d8\7w\2\2\u01d8l\3\2\2\2\u01d9\u01da\7.\2\2\u01dan\3"+
		"\2\2\2\u01db\u01dc\7<\2\2\u01dcp\3\2\2\2\u01dd\u01de\7]\2\2\u01der\3\2"+
		"\2\2\u01df\u01e0\7_\2\2\u01e0t\3\2\2\2\u01e1\u01e2\7k\2\2\u01e2\u01e3"+
		"\7n\2\2\u01e3\u01e4\7n\2\2\u01e4\u01e5\7w\2\2\u01e5\u01e6\7o\2\2\u01e6"+
		"\u01e7\7k\2\2\u01e7\u01e8\7p\2\2\u01e8\u01e9\7c\2\2\u01e9\u01ea\7v\2\2"+
		"\u01ea\u01eb\7k\2\2\u01ebv\3\2\2\2\u01ec\u01ed\7e\2\2\u01ed\u01ee\7q\2"+
		"\2\u01ee\u01ef\7p\2\2\u01ef\u01f0\7h\2\2\u01f0\u01f1\7k\2\2\u01f1\u01f2"+
		"\7t\2\2\u01f2\u01f3\7o\2\2\u01f3\u01f4\7g\2\2\u01f4\u01f5\7f\2\2\u01f5"+
		"x\3\2\2\2\u01f6\u01f7\7N\2\2\u01f7\u01f8\7*\2\2\u01f8z\3\2\2\2\u01f9\u01fa"+
		"\7+\2\2\u01fa\u01fb\7N\2\2\u01fb|\3\2\2\2\u01fc\u01fd\7$\2\2\u01fd~\3"+
		"\2\2\2\u01fe\u0202\t\7\2\2\u01ff\u0201\t\b\2\2\u0200\u01ff\3\2\2\2\u0201"+
		"\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0080\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0205\u0207\t\t\2\2\u0206\u0205\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020a\u020b\bA\2\2\u020b\u0082\3\2\2\2\21\2\u0171\u0177\u017c\u0188"+
		"\u0191\u0197\u0199\u01a6\u01ac\u01b9\u01c4\u01c6\u0202\u0208\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}