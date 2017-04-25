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
		MENOROUIGUAL=29, IDENTICO=30, DIFERENTE=31, AND=32, OR=33, NOT=34, BITSHIFTRIGHT=35, 
		BITSHIFTLEFT=36, BITAND=37, BITOR=38, BITXOR=39, BITNOT=40, CONSTREAL=41, 
		CONSTINTEIRO=42, CONSTBINARIO=43, CONSTHEXA=44, CONSTSTRING=45, CONSTLOGICO=46, 
		CONSTCHAR=47, COMENTARIOLINHA=48, COMENTARIOMULTIPLO=49, PONTO=50, IGUAL=51, 
		PONTOEVIRGULA=52, VIRGULA=53, DOISPONTOS=54, COLCHETESABRE=55, COLCHETESFECHA=56, 
		CHAVESABRE=57, CHAVESFECHA=58, PARENTESEABRE=59, PARENTESEFECHA=60, ASPA=61, 
		ID=62, WHITESPACE=63;
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
		"IDENTICO", "DIFERENTE", "AND", "OR", "NOT", "BITSHIFTRIGHT", "BITSHIFTLEFT", 
		"BITAND", "BITOR", "BITXOR", "BITNOT", "CONSTREAL", "CONSTINTEIRO", "CONSTBINARIO", 
		"CONSTHEXA", "CONSTSTRING", "CONSTLOGICO", "CONSTCHAR", "COMENTARIOLINHA", 
		"COMENTARIOMULTIPLO", "PONTO", "IGUAL", "PONTOEVIRGULA", "VIRGULA", "DOISPONTOS", 
		"COLCHETESABRE", "COLCHETESFECHA", "CHAVESABRE", "CHAVESFECHA", "PARENTESEABRE", 
		"PARENTESEFECHA", "ASPA", "ID", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'leia'", "'escreva'", "'goHomeYouAreDrunk'", "'kek'", "'notSureIf'", 
		"'everydayUntilYouLikeIt'", "'waitForIt'", "'justDoIt'", "'checkEm'", 
		"'lolicon'", "'dubs'", "'yesButNo'", "'binLaden'", "'l33t'", "'missingNo'", 
		"'batata'", "'wat'", "'chooseAPill'", "'pill'", "'hipster'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'and'", 
		"'or'", "'nope'", "'>>'", "'<<'", "'&'", "'|'", "'^'", "'~'", null, null, 
		null, null, null, "'(yeah)|(trap)'", null, null, null, "'.'", "'='", "'desu'", 
		"','", "':'", "'['", "']'", "'illuminati'", "'confirmed'", "'L('", "')L'", 
		"'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DEFREAD", "DEFWRITE", "DEFRETORNO", "IFDES", "ELSE", "WHILEDES", 
		"FORDES", "DODES", "INT", "STRING", "DOUBLE", "BOOL", "BIN", "HEXA", "VOID", 
		"CHAR", "BREAK", "SWITCHDES", "CASE", "DEFAULTDES", "MAIS", "MENOS", "MULTIPLICA", 
		"DIVIDE", "MOD", "MAIORQUE", "MENORQUE", "MAIOROUIGUAL", "MENOROUIGUAL", 
		"IDENTICO", "DIFERENTE", "AND", "OR", "NOT", "BITSHIFTRIGHT", "BITSHIFTLEFT", 
		"BITAND", "BITOR", "BITXOR", "BITNOT", "CONSTREAL", "CONSTINTEIRO", "CONSTBINARIO", 
		"CONSTHEXA", "CONSTSTRING", "CONSTLOGICO", "CONSTCHAR", "COMENTARIOLINHA", 
		"COMENTARIOMULTIPLO", "PONTO", "IGUAL", "PONTOEVIRGULA", "VIRGULA", "DOISPONTOS", 
		"COLCHETESABRE", "COLCHETESFECHA", "CHAVESABRE", "CHAVESFECHA", "PARENTESEABRE", 
		"PARENTESEFECHA", "ASPA", "ID", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u0208\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3*\6*\u0168\n*\r*\16*\u0169\3*\3*\6*\u016e\n*"+
		"\r*\16*\u016f\3+\6+\u0173\n+\r+\16+\u0174\3,\3,\3,\3,\3,\3,\3,\3,\6,\u017f"+
		"\n,\r,\16,\u0180\3-\3-\3-\3-\3-\6-\u0188\n-\r-\16-\u0189\3.\3.\3.\3.\7"+
		".\u0190\n.\f.\16.\u0193\13.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3\60\3\60\3\60\3\60\5\60\u01a9\n\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\7\61\u01b4\n\61\f\61\16\61\u01b7\13\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\7\62\u01c1\n\62\f\62\16\62\u01c4\13\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\7?\u01fd"+
		"\n?\f?\16?\u0200\13?\3@\6@\u0203\n@\r@\16@\u0204\3@\3@\2\2A\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\3\2\n\3\2\62;\3\2\62\63\5\2\62;CHch\4\2$$^^\4\2\f\f\17\17"+
		"\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\2\u0214\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u0086\3\2\2\2\7\u008e\3\2\2\2\t\u00a0"+
		"\3\2\2\2\13\u00a4\3\2\2\2\r\u00ae\3\2\2\2\17\u00c5\3\2\2\2\21\u00cf\3"+
		"\2\2\2\23\u00d8\3\2\2\2\25\u00e0\3\2\2\2\27\u00e8\3\2\2\2\31\u00ed\3\2"+
		"\2\2\33\u00f6\3\2\2\2\35\u00ff\3\2\2\2\37\u0104\3\2\2\2!\u010e\3\2\2\2"+
		"#\u0115\3\2\2\2%\u0119\3\2\2\2\'\u0125\3\2\2\2)\u012a\3\2\2\2+\u0132\3"+
		"\2\2\2-\u0134\3\2\2\2/\u0136\3\2\2\2\61\u0138\3\2\2\2\63\u013a\3\2\2\2"+
		"\65\u013c\3\2\2\2\67\u013e\3\2\2\29\u0140\3\2\2\2;\u0143\3\2\2\2=\u0146"+
		"\3\2\2\2?\u0149\3\2\2\2A\u014c\3\2\2\2C\u0150\3\2\2\2E\u0153\3\2\2\2G"+
		"\u0158\3\2\2\2I\u015b\3\2\2\2K\u015e\3\2\2\2M\u0160\3\2\2\2O\u0162\3\2"+
		"\2\2Q\u0164\3\2\2\2S\u0167\3\2\2\2U\u0172\3\2\2\2W\u0176\3\2\2\2Y\u0182"+
		"\3\2\2\2[\u018b\3\2\2\2]\u0196\3\2\2\2_\u01a4\3\2\2\2a\u01ac\3\2\2\2c"+
		"\u01ba\3\2\2\2e\u01cc\3\2\2\2g\u01ce\3\2\2\2i\u01d0\3\2\2\2k\u01d5\3\2"+
		"\2\2m\u01d7\3\2\2\2o\u01d9\3\2\2\2q\u01db\3\2\2\2s\u01dd\3\2\2\2u\u01e8"+
		"\3\2\2\2w\u01f2\3\2\2\2y\u01f5\3\2\2\2{\u01f8\3\2\2\2}\u01fa\3\2\2\2\177"+
		"\u0202\3\2\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083\u0084\7k\2"+
		"\2\u0084\u0085\7c\2\2\u0085\4\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088\7"+
		"u\2\2\u0088\u0089\7e\2\2\u0089\u008a\7t\2\2\u008a\u008b\7g\2\2\u008b\u008c"+
		"\7x\2\2\u008c\u008d\7c\2\2\u008d\6\3\2\2\2\u008e\u008f\7i\2\2\u008f\u0090"+
		"\7q\2\2\u0090\u0091\7J\2\2\u0091\u0092\7q\2\2\u0092\u0093\7o\2\2\u0093"+
		"\u0094\7g\2\2\u0094\u0095\7[\2\2\u0095\u0096\7q\2\2\u0096\u0097\7w\2\2"+
		"\u0097\u0098\7C\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a\u009b"+
		"\7F\2\2\u009b\u009c\7t\2\2\u009c\u009d\7w\2\2\u009d\u009e\7p\2\2\u009e"+
		"\u009f\7m\2\2\u009f\b\3\2\2\2\u00a0\u00a1\7m\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\u00a3\7m\2\2\u00a3\n\3\2\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7q\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\u00a8\7U\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7t\2\2"+
		"\u00aa\u00ab\7g\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ad\7h\2\2\u00ad\f\3\2"+
		"\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7x\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2"+
		"\7t\2\2\u00b2\u00b3\7{\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5\7c\2\2\u00b5"+
		"\u00b6\7{\2\2\u00b6\u00b7\7W\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7v\2\2"+
		"\u00b9\u00ba\7k\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7[\2\2\u00bc\u00bd"+
		"\7q\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7N\2\2\u00bf\u00c0\7k\2\2\u00c0"+
		"\u00c1\7m\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7K\2\2\u00c3\u00c4\7v\2\2"+
		"\u00c4\16\3\2\2\2\u00c5\u00c6\7y\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7"+
		"k\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7H\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc"+
		"\7t\2\2\u00cc\u00cd\7K\2\2\u00cd\u00ce\7v\2\2\u00ce\20\3\2\2\2\u00cf\u00d0"+
		"\7l\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7v\2\2\u00d3"+
		"\u00d4\7F\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7K\2\2\u00d6\u00d7\7v\2\2"+
		"\u00d7\22\3\2\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7j\2\2\u00da\u00db\7"+
		"g\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7m\2\2\u00dd\u00de\7G\2\2\u00de\u00df"+
		"\7o\2\2\u00df\24\3\2\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3"+
		"\7n\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7q\2\2\u00e6"+
		"\u00e7\7p\2\2\u00e7\26\3\2\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7w\2\2\u00ea"+
		"\u00eb\7d\2\2\u00eb\u00ec\7u\2\2\u00ec\30\3\2\2\2\u00ed\u00ee\7{\2\2\u00ee"+
		"\u00ef\7g\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7D\2\2\u00f1\u00f2\7w\2\2"+
		"\u00f2\u00f3\7v\2\2\u00f3\u00f4\7P\2\2\u00f4\u00f5\7q\2\2\u00f5\32\3\2"+
		"\2\2\u00f6\u00f7\7d\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa"+
		"\7N\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7f\2\2\u00fc\u00fd\7g\2\2\u00fd"+
		"\u00fe\7p\2\2\u00fe\34\3\2\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7\65\2\2"+
		"\u0101\u0102\7\65\2\2\u0102\u0103\7v\2\2\u0103\36\3\2\2\2\u0104\u0105"+
		"\7o\2\2\u0105\u0106\7k\2\2\u0106\u0107\7u\2\2\u0107\u0108\7u\2\2\u0108"+
		"\u0109\7k\2\2\u0109\u010a\7p\2\2\u010a\u010b\7i\2\2\u010b\u010c\7P\2\2"+
		"\u010c\u010d\7q\2\2\u010d \3\2\2\2\u010e\u010f\7d\2\2\u010f\u0110\7c\2"+
		"\2\u0110\u0111\7v\2\2\u0111\u0112\7c\2\2\u0112\u0113\7v\2\2\u0113\u0114"+
		"\7c\2\2\u0114\"\3\2\2\2\u0115\u0116\7y\2\2\u0116\u0117\7c\2\2\u0117\u0118"+
		"\7v\2\2\u0118$\3\2\2\2\u0119\u011a\7e\2\2\u011a\u011b\7j\2\2\u011b\u011c"+
		"\7q\2\2\u011c\u011d\7q\2\2\u011d\u011e\7u\2\2\u011e\u011f\7g\2\2\u011f"+
		"\u0120\7C\2\2\u0120\u0121\7R\2\2\u0121\u0122\7k\2\2\u0122\u0123\7n\2\2"+
		"\u0123\u0124\7n\2\2\u0124&\3\2\2\2\u0125\u0126\7r\2\2\u0126\u0127\7k\2"+
		"\2\u0127\u0128\7n\2\2\u0128\u0129\7n\2\2\u0129(\3\2\2\2\u012a\u012b\7"+
		"j\2\2\u012b\u012c\7k\2\2\u012c\u012d\7r\2\2\u012d\u012e\7u\2\2\u012e\u012f"+
		"\7v\2\2\u012f\u0130\7g\2\2\u0130\u0131\7t\2\2\u0131*\3\2\2\2\u0132\u0133"+
		"\7-\2\2\u0133,\3\2\2\2\u0134\u0135\7/\2\2\u0135.\3\2\2\2\u0136\u0137\7"+
		",\2\2\u0137\60\3\2\2\2\u0138\u0139\7\61\2\2\u0139\62\3\2\2\2\u013a\u013b"+
		"\7\'\2\2\u013b\64\3\2\2\2\u013c\u013d\7@\2\2\u013d\66\3\2\2\2\u013e\u013f"+
		"\7>\2\2\u013f8\3\2\2\2\u0140\u0141\7@\2\2\u0141\u0142\7?\2\2\u0142:\3"+
		"\2\2\2\u0143\u0144\7>\2\2\u0144\u0145\7?\2\2\u0145<\3\2\2\2\u0146\u0147"+
		"\7?\2\2\u0147\u0148\7?\2\2\u0148>\3\2\2\2\u0149\u014a\7#\2\2\u014a\u014b"+
		"\7?\2\2\u014b@\3\2\2\2\u014c\u014d\7c\2\2\u014d\u014e\7p\2\2\u014e\u014f"+
		"\7f\2\2\u014fB\3\2\2\2\u0150\u0151\7q\2\2\u0151\u0152\7t\2\2\u0152D\3"+
		"\2\2\2\u0153\u0154\7p\2\2\u0154\u0155\7q\2\2\u0155\u0156\7r\2\2\u0156"+
		"\u0157\7g\2\2\u0157F\3\2\2\2\u0158\u0159\7@\2\2\u0159\u015a\7@\2\2\u015a"+
		"H\3\2\2\2\u015b\u015c\7>\2\2\u015c\u015d\7>\2\2\u015dJ\3\2\2\2\u015e\u015f"+
		"\7(\2\2\u015fL\3\2\2\2\u0160\u0161\7~\2\2\u0161N\3\2\2\2\u0162\u0163\7"+
		"`\2\2\u0163P\3\2\2\2\u0164\u0165\7\u0080\2\2\u0165R\3\2\2\2\u0166\u0168"+
		"\t\2\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\7\60\2\2\u016c\u016e\t"+
		"\2\2\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170T\3\2\2\2\u0171\u0173\t\2\2\2\u0172\u0171\3\2\2\2"+
		"\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175V\3"+
		"\2\2\2\u0176\u0177\7j\2\2\u0177\u0178\7c\2\2\u0178\u0179\7e\2\2\u0179"+
		"\u017a\7m\2\2\u017a\u017b\7g\2\2\u017b\u017c\7t\2\2\u017c\u017e\3\2\2"+
		"\2\u017d\u017f\t\3\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181X\3\2\2\2\u0182\u0183\79\2\2\u0183\u0184"+
		"\7z\2\2\u0184\u0185\7\63\2\2\u0185\u0187\3\2\2\2\u0186\u0188\t\4\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018aZ\3\2\2\2\u018b\u0191\5{>\2\u018c\u0190\n\5\2\2\u018d\u018e"+
		"\7^\2\2\u018e\u0190\13\2\2\2\u018f\u018c\3\2\2\2\u018f\u018d\3\2\2\2\u0190"+
		"\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2"+
		"\2\2\u0193\u0191\3\2\2\2\u0194\u0195\5{>\2\u0195\\\3\2\2\2\u0196\u0197"+
		"\7*\2\2\u0197\u0198\7{\2\2\u0198\u0199\7g\2\2\u0199\u019a\7c\2\2\u019a"+
		"\u019b\7j\2\2\u019b\u019c\7+\2\2\u019c\u019d\7~\2\2\u019d\u019e\7*\2\2"+
		"\u019e\u019f\7v\2\2\u019f\u01a0\7t\2\2\u01a0\u01a1\7c\2\2\u01a1\u01a2"+
		"\7r\2\2\u01a2\u01a3\7+\2\2\u01a3^\3\2\2\2\u01a4\u01a8\5{>\2\u01a5\u01a9"+
		"\n\5\2\2\u01a6\u01a7\7^\2\2\u01a7\u01a9\13\2\2\2\u01a8\u01a5\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\5{>\2\u01ab`\3\2\2\2\u01ac"+
		"\u01ad\7h\2\2\u01ad\u01ae\7k\2\2\u01ae\u01af\7t\2\2\u01af\u01b0\7u\2\2"+
		"\u01b0\u01b1\7v\2\2\u01b1\u01b5\3\2\2\2\u01b2\u01b4\n\6\2\2\u01b3\u01b2"+
		"\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\b\61\2\2\u01b9b\3\2\2\2"+
		"\u01ba\u01bb\7c\2\2\u01bb\u01bc\7{\2\2\u01bc\u01bd\7{\2\2\u01bd\u01c2"+
		"\3\2\2\2\u01be\u01c1\13\2\2\2\u01bf\u01c1\7\f\2\2\u01c0\u01be\3\2\2\2"+
		"\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3"+
		"\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7n\2\2\u01c6"+
		"\u01c7\7o\2\2\u01c7\u01c8\7c\2\2\u01c8\u01c9\7q\2\2\u01c9\u01ca\3\2\2"+
		"\2\u01ca\u01cb\b\62\2\2\u01cbd\3\2\2\2\u01cc\u01cd\7\60\2\2\u01cdf\3\2"+
		"\2\2\u01ce\u01cf\7?\2\2\u01cfh\3\2\2\2\u01d0\u01d1\7f\2\2\u01d1\u01d2"+
		"\7g\2\2\u01d2\u01d3\7u\2\2\u01d3\u01d4\7w\2\2\u01d4j\3\2\2\2\u01d5\u01d6"+
		"\7.\2\2\u01d6l\3\2\2\2\u01d7\u01d8\7<\2\2\u01d8n\3\2\2\2\u01d9\u01da\7"+
		"]\2\2\u01dap\3\2\2\2\u01db\u01dc\7_\2\2\u01dcr\3\2\2\2\u01dd\u01de\7k"+
		"\2\2\u01de\u01df\7n\2\2\u01df\u01e0\7n\2\2\u01e0\u01e1\7w\2\2\u01e1\u01e2"+
		"\7o\2\2\u01e2\u01e3\7k\2\2\u01e3\u01e4\7p\2\2\u01e4\u01e5\7c\2\2\u01e5"+
		"\u01e6\7v\2\2\u01e6\u01e7\7k\2\2\u01e7t\3\2\2\2\u01e8\u01e9\7e\2\2\u01e9"+
		"\u01ea\7q\2\2\u01ea\u01eb\7p\2\2\u01eb\u01ec\7h\2\2\u01ec\u01ed\7k\2\2"+
		"\u01ed\u01ee\7t\2\2\u01ee\u01ef\7o\2\2\u01ef\u01f0\7g\2\2\u01f0\u01f1"+
		"\7f\2\2\u01f1v\3\2\2\2\u01f2\u01f3\7N\2\2\u01f3\u01f4\7*\2\2\u01f4x\3"+
		"\2\2\2\u01f5\u01f6\7+\2\2\u01f6\u01f7\7N\2\2\u01f7z\3\2\2\2\u01f8\u01f9"+
		"\7$\2\2\u01f9|\3\2\2\2\u01fa\u01fe\t\7\2\2\u01fb\u01fd\t\b\2\2\u01fc\u01fb"+
		"\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"~\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0203\t\t\2\2\u0202\u0201\3\2\2\2"+
		"\u0203\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206"+
		"\3\2\2\2\u0206\u0207\b@\2\2\u0207\u0080\3\2\2\2\20\2\u0169\u016f\u0174"+
		"\u0180\u0189\u018f\u0191\u01a8\u01b5\u01c0\u01c2\u01fe\u0204\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}