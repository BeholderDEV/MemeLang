// Generated from meme.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class memeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ATRIBUICAO=1, DECLARACAO_INTEIRO=2, DECLARACAO_REAL=3, DECLARACAO_LOGICO=4, 
		DECLARACAO_CARACTER=5, DECLARACAO_CADEIA=6, DECLARACAO_VAZIO=7, FUNCAO=8, 
		SE=9, SENAO=10, SENAOSE=11, PARA=12, ENQUANTO=13, FACA=14, ASPA=15, PARAR_LOOP=16, 
		CONTINUAR_LOOP=17, RETORNO_FUNCAO=18, PONTO_E_VIRGULA=19, VIRGULA=20, 
		PONTO=21, ABRE_COLCHETE=22, FECHA_COLCHETE=23, ABRE_PARENTESES=24, FECHA_PARENTESES=25, 
		ABRE_CHAVES=26, FECHA_CHAVES=27, DOIS_PONTOS=28, NAO=29, E=30, OU=31, 
		AND=32, OU_INCLUSIVO=33, OU_EXCLUSIVO=34, DESLOCAMENTO_ESQUERDA=35, DESLOCAMENTO_DIREITA=36, 
		COMPLEMENTO=37, SOMA=38, SUBTRACAO=39, MULTIPLICACAO=40, DIVISAO=41, MODULO=42, 
		MAIOR=43, MENOR=44, IGUAL=45, MAIOR_IGUAL=46, MENOR_IGUAL=47, DIFERENTE=48, 
		NUMERO_INTEIRO=49, NUMERO_REAL=50, NUMERO_BINARIO=51, NUMERO_HEXADECIMANL=52, 
		CADEIA_CONSTANTE=53, VARIAVEL=54, COMENTARIOLINHA=55, LIMBO=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ATRIBUICAO", "DECLARACAO_INTEIRO", "DECLARACAO_REAL", "DECLARACAO_LOGICO", 
		"DECLARACAO_CARACTER", "DECLARACAO_CADEIA", "DECLARACAO_VAZIO", "FUNCAO", 
		"SE", "SENAO", "SENAOSE", "PARA", "ENQUANTO", "FACA", "ASPA", "PARAR_LOOP", 
		"CONTINUAR_LOOP", "RETORNO_FUNCAO", "PONTO_E_VIRGULA", "VIRGULA", "PONTO", 
		"ABRE_COLCHETE", "FECHA_COLCHETE", "ABRE_PARENTESES", "FECHA_PARENTESES", 
		"ABRE_CHAVES", "FECHA_CHAVES", "DOIS_PONTOS", "NAO", "E", "OU", "AND", 
		"OU_INCLUSIVO", "OU_EXCLUSIVO", "DESLOCAMENTO_ESQUERDA", "DESLOCAMENTO_DIREITA", 
		"COMPLEMENTO", "SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", "MODULO", 
		"MAIOR", "MENOR", "IGUAL", "MAIOR_IGUAL", "MENOR_IGUAL", "DIFERENTE", 
		"NUMERO_INTEIRO", "NUMERO_REAL", "NUMERO_BINARIO", "NUMERO_HEXADECIMANL", 
		"CADEIA_CONSTANTE", "VARIAVEL", "COMENTARIOLINHA", "LIMBO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'checkEm'", "'dubs'", "'yesButNo'", "'batata'", "'lolicon'", 
		"'missingNo'", "'genius'", "'kek'", "'notSureIf'", "'topKek'", "'waitForIt'", 
		"'everydayUntilYouLikeIt'", "'justDoIt'", "'drEvil'", "'wat'", "'lel'", 
		"'goHomeYouAreDrunk'", "'desu'", "'\u00C2\u00AC\u00C2\u00AC'", "'.'", 
		"'['", "']'", "'L('", "')L'", "'illuminati'", "'confirmed'", "':'", "'nope'", 
		"'and'", "'or'", "'&'", "'|'", "'^'", "'<<'", "'>>'", "'~'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ATRIBUICAO", "DECLARACAO_INTEIRO", "DECLARACAO_REAL", "DECLARACAO_LOGICO", 
		"DECLARACAO_CARACTER", "DECLARACAO_CADEIA", "DECLARACAO_VAZIO", "FUNCAO", 
		"SE", "SENAO", "SENAOSE", "PARA", "ENQUANTO", "FACA", "ASPA", "PARAR_LOOP", 
		"CONTINUAR_LOOP", "RETORNO_FUNCAO", "PONTO_E_VIRGULA", "VIRGULA", "PONTO", 
		"ABRE_COLCHETE", "FECHA_COLCHETE", "ABRE_PARENTESES", "FECHA_PARENTESES", 
		"ABRE_CHAVES", "FECHA_CHAVES", "DOIS_PONTOS", "NAO", "E", "OU", "AND", 
		"OU_INCLUSIVO", "OU_EXCLUSIVO", "DESLOCAMENTO_ESQUERDA", "DESLOCAMENTO_DIREITA", 
		"COMPLEMENTO", "SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", "MODULO", 
		"MAIOR", "MENOR", "IGUAL", "MAIOR_IGUAL", "MENOR_IGUAL", "DIFERENTE", 
		"NUMERO_INTEIRO", "NUMERO_REAL", "NUMERO_BINARIO", "NUMERO_HEXADECIMANL", 
		"CADEIA_CONSTANTE", "VARIAVEL", "COMENTARIOLINHA", "LIMBO"
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


	public memeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "meme.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01c3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\62\6\62\u016e\n\62\r\62\16\62\u016f\3\63\6"+
		"\63\u0173\n\63\r\63\16\63\u0174\3\63\3\63\6\63\u0179\n\63\r\63\16\63\u017a"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\6\64\u0185\n\64\r\64\16\64\u0186"+
		"\3\65\3\65\3\65\3\65\3\65\6\65\u018e\n\65\r\65\16\65\u018f\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u019c\n\66\f\66\16\66\u019f"+
		"\13\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\7\67\u01aa\n\67\f"+
		"\67\16\67\u01ad\13\67\38\38\38\38\38\38\38\78\u01b6\n8\f8\168\u01b9\13"+
		"8\38\38\39\69\u01be\n9\r9\169\u01bf\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:\3\2\n\3\2\62;\3\2"+
		"\62\63\5\2\62;CHch\4\2$$^^\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2"+
		"\13\f\16\17\"\"\2\u01cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7"+
		"}\3\2\2\2\t\u0082\3\2\2\2\13\u008b\3\2\2\2\r\u0092\3\2\2\2\17\u009a\3"+
		"\2\2\2\21\u00a4\3\2\2\2\23\u00ab\3\2\2\2\25\u00af\3\2\2\2\27\u00b9\3\2"+
		"\2\2\31\u00c0\3\2\2\2\33\u00ca\3\2\2\2\35\u00e1\3\2\2\2\37\u00ea\3\2\2"+
		"\2!\u00f1\3\2\2\2#\u00f5\3\2\2\2%\u00f9\3\2\2\2\'\u010b\3\2\2\2)\u0110"+
		"\3\2\2\2+\u0115\3\2\2\2-\u0117\3\2\2\2/\u0119\3\2\2\2\61\u011b\3\2\2\2"+
		"\63\u011e\3\2\2\2\65\u0121\3\2\2\2\67\u012c\3\2\2\29\u0136\3\2\2\2;\u0138"+
		"\3\2\2\2=\u013d\3\2\2\2?\u0141\3\2\2\2A\u0144\3\2\2\2C\u0146\3\2\2\2E"+
		"\u0148\3\2\2\2G\u014a\3\2\2\2I\u014d\3\2\2\2K\u0150\3\2\2\2M\u0152\3\2"+
		"\2\2O\u0154\3\2\2\2Q\u0156\3\2\2\2S\u0158\3\2\2\2U\u015a\3\2\2\2W\u015c"+
		"\3\2\2\2Y\u015e\3\2\2\2[\u0160\3\2\2\2]\u0163\3\2\2\2_\u0166\3\2\2\2a"+
		"\u0169\3\2\2\2c\u016d\3\2\2\2e\u0172\3\2\2\2g\u017c\3\2\2\2i\u0188\3\2"+
		"\2\2k\u0191\3\2\2\2m\u01a7\3\2\2\2o\u01ae\3\2\2\2q\u01bd\3\2\2\2st\7?"+
		"\2\2t\4\3\2\2\2uv\7e\2\2vw\7j\2\2wx\7g\2\2xy\7e\2\2yz\7m\2\2z{\7G\2\2"+
		"{|\7o\2\2|\6\3\2\2\2}~\7f\2\2~\177\7w\2\2\177\u0080\7d\2\2\u0080\u0081"+
		"\7u\2\2\u0081\b\3\2\2\2\u0082\u0083\7{\2\2\u0083\u0084\7g\2\2\u0084\u0085"+
		"\7u\2\2\u0085\u0086\7D\2\2\u0086\u0087\7w\2\2\u0087\u0088\7v\2\2\u0088"+
		"\u0089\7P\2\2\u0089\u008a\7q\2\2\u008a\n\3\2\2\2\u008b\u008c\7d\2\2\u008c"+
		"\u008d\7c\2\2\u008d\u008e\7v\2\2\u008e\u008f\7c\2\2\u008f\u0090\7v\2\2"+
		"\u0090\u0091\7c\2\2\u0091\f\3\2\2\2\u0092\u0093\7n\2\2\u0093\u0094\7q"+
		"\2\2\u0094\u0095\7n\2\2\u0095\u0096\7k\2\2\u0096\u0097\7e\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7p\2\2\u0099\16\3\2\2\2\u009a\u009b\7o\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7u\2\2\u009d\u009e\7u\2\2\u009e\u009f\7k\2\2\u009f"+
		"\u00a0\7p\2\2\u00a0\u00a1\7i\2\2\u00a1\u00a2\7P\2\2\u00a2\u00a3\7q\2\2"+
		"\u00a3\20\3\2\2\2\u00a4\u00a5\7i\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7"+
		"p\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7u\2\2\u00aa\22"+
		"\3\2\2\2\u00ab\u00ac\7m\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7m\2\2\u00ae"+
		"\24\3\2\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\u00b3\7U\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2"+
		"\u00b6\u00b7\7K\2\2\u00b7\u00b8\7h\2\2\u00b8\26\3\2\2\2\u00b9\u00ba\7"+
		"v\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7r\2\2\u00bc\u00bd\7M\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7m\2\2\u00bf\30\3\2\2\2\u00c0\u00c1\7y\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7H\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7K\2\2\u00c8\u00c9\7v\2\2"+
		"\u00c9\32\3\2\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7x\2\2\u00cc\u00cd\7"+
		"g\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7{\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1"+
		"\7c\2\2\u00d1\u00d2\7{\2\2\u00d2\u00d3\7W\2\2\u00d3\u00d4\7p\2\2\u00d4"+
		"\u00d5\7v\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7[\2\2"+
		"\u00d8\u00d9\7q\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7N\2\2\u00db\u00dc"+
		"\7k\2\2\u00dc\u00dd\7m\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7K\2\2\u00df"+
		"\u00e0\7v\2\2\u00e0\34\3\2\2\2\u00e1\u00e2\7l\2\2\u00e2\u00e3\7w\2\2\u00e3"+
		"\u00e4\7u\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7F\2\2\u00e6\u00e7\7q\2\2"+
		"\u00e7\u00e8\7K\2\2\u00e8\u00e9\7v\2\2\u00e9\36\3\2\2\2\u00ea\u00eb\7"+
		"f\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7G\2\2\u00ed\u00ee\7x\2\2\u00ee\u00ef"+
		"\7k\2\2\u00ef\u00f0\7n\2\2\u00f0 \3\2\2\2\u00f1\u00f2\7y\2\2\u00f2\u00f3"+
		"\7c\2\2\u00f3\u00f4\7v\2\2\u00f4\"\3\2\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7"+
		"\7g\2\2\u00f7\u00f8\7n\2\2\u00f8$\3\2\2\2\u00f9\u00fa\7i\2\2\u00fa\u00fb"+
		"\7q\2\2\u00fb\u00fc\7J\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7o\2\2\u00fe"+
		"\u00ff\7g\2\2\u00ff\u0100\7[\2\2\u0100\u0101\7q\2\2\u0101\u0102\7w\2\2"+
		"\u0102\u0103\7C\2\2\u0103\u0104\7t\2\2\u0104\u0105\7g\2\2\u0105\u0106"+
		"\7F\2\2\u0106\u0107\7t\2\2\u0107\u0108\7w\2\2\u0108\u0109\7p\2\2\u0109"+
		"\u010a\7m\2\2\u010a&\3\2\2\2\u010b\u010c\7f\2\2\u010c\u010d\7g\2\2\u010d"+
		"\u010e\7u\2\2\u010e\u010f\7w\2\2\u010f(\3\2\2\2\u0110\u0111\7\u00c4\2"+
		"\2\u0111\u0112\7\u00ae\2\2\u0112\u0113\7\u00c4\2\2\u0113\u0114\7\u00ae"+
		"\2\2\u0114*\3\2\2\2\u0115\u0116\7\60\2\2\u0116,\3\2\2\2\u0117\u0118\7"+
		"]\2\2\u0118.\3\2\2\2\u0119\u011a\7_\2\2\u011a\60\3\2\2\2\u011b\u011c\7"+
		"N\2\2\u011c\u011d\7*\2\2\u011d\62\3\2\2\2\u011e\u011f\7+\2\2\u011f\u0120"+
		"\7N\2\2\u0120\64\3\2\2\2\u0121\u0122\7k\2\2\u0122\u0123\7n\2\2\u0123\u0124"+
		"\7n\2\2\u0124\u0125\7w\2\2\u0125\u0126\7o\2\2\u0126\u0127\7k\2\2\u0127"+
		"\u0128\7p\2\2\u0128\u0129\7c\2\2\u0129\u012a\7v\2\2\u012a\u012b\7k\2\2"+
		"\u012b\66\3\2\2\2\u012c\u012d\7e\2\2\u012d\u012e\7q\2\2\u012e\u012f\7"+
		"p\2\2\u012f\u0130\7h\2\2\u0130\u0131\7k\2\2\u0131\u0132\7t\2\2\u0132\u0133"+
		"\7o\2\2\u0133\u0134\7g\2\2\u0134\u0135\7f\2\2\u01358\3\2\2\2\u0136\u0137"+
		"\7<\2\2\u0137:\3\2\2\2\u0138\u0139\7p\2\2\u0139\u013a\7q\2\2\u013a\u013b"+
		"\7r\2\2\u013b\u013c\7g\2\2\u013c<\3\2\2\2\u013d\u013e\7c\2\2\u013e\u013f"+
		"\7p\2\2\u013f\u0140\7f\2\2\u0140>\3\2\2\2\u0141\u0142\7q\2\2\u0142\u0143"+
		"\7t\2\2\u0143@\3\2\2\2\u0144\u0145\7(\2\2\u0145B\3\2\2\2\u0146\u0147\7"+
		"~\2\2\u0147D\3\2\2\2\u0148\u0149\7`\2\2\u0149F\3\2\2\2\u014a\u014b\7>"+
		"\2\2\u014b\u014c\7>\2\2\u014cH\3\2\2\2\u014d\u014e\7@\2\2\u014e\u014f"+
		"\7@\2\2\u014fJ\3\2\2\2\u0150\u0151\7\u0080\2\2\u0151L\3\2\2\2\u0152\u0153"+
		"\7-\2\2\u0153N\3\2\2\2\u0154\u0155\7/\2\2\u0155P\3\2\2\2\u0156\u0157\7"+
		",\2\2\u0157R\3\2\2\2\u0158\u0159\7\61\2\2\u0159T\3\2\2\2\u015a\u015b\7"+
		"\'\2\2\u015bV\3\2\2\2\u015c\u015d\7@\2\2\u015dX\3\2\2\2\u015e\u015f\7"+
		">\2\2\u015fZ\3\2\2\2\u0160\u0161\7?\2\2\u0161\u0162\7?\2\2\u0162\\\3\2"+
		"\2\2\u0163\u0164\7@\2\2\u0164\u0165\7?\2\2\u0165^\3\2\2\2\u0166\u0167"+
		"\7>\2\2\u0167\u0168\7?\2\2\u0168`\3\2\2\2\u0169\u016a\7#\2\2\u016a\u016b"+
		"\7?\2\2\u016bb\3\2\2\2\u016c\u016e\t\2\2\2\u016d\u016c\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170d\3\2\2\2\u0171"+
		"\u0173\t\2\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\7\60\2\2\u0177"+
		"\u0179\t\2\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017bf\3\2\2\2\u017c\u017d\7j\2\2\u017d\u017e"+
		"\7c\2\2\u017e\u017f\7e\2\2\u017f\u0180\7m\2\2\u0180\u0181\7g\2\2\u0181"+
		"\u0182\7t\2\2\u0182\u0184\3\2\2\2\u0183\u0185\t\3\2\2\u0184\u0183\3\2"+
		"\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"h\3\2\2\2\u0188\u0189\79\2\2\u0189\u018a\7z\2\2\u018a\u018b\7\63\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u018e\t\4\2\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190j\3\2\2\2\u0191\u0192"+
		"\7f\2\2\u0192\u0193\7t\2\2\u0193\u0194\7G\2\2\u0194\u0195\7x\2\2\u0195"+
		"\u0196\7k\2\2\u0196\u0197\7n\2\2\u0197\u019d\3\2\2\2\u0198\u019c\n\5\2"+
		"\2\u0199\u019a\7^\2\2\u019a\u019c\13\2\2\2\u019b\u0198\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7f\2\2\u01a1\u01a2\7t\2"+
		"\2\u01a2\u01a3\7G\2\2\u01a3\u01a4\7x\2\2\u01a4\u01a5\7k\2\2\u01a5\u01a6"+
		"\7n\2\2\u01a6l\3\2\2\2\u01a7\u01ab\t\6\2\2\u01a8\u01aa\t\7\2\2\u01a9\u01a8"+
		"\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"n\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7h\2\2\u01af\u01b0\7k\2\2\u01b0"+
		"\u01b1\7t\2\2\u01b1\u01b2\7u\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b7\3\2\2"+
		"\2\u01b4\u01b6\n\b\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba"+
		"\u01bb\b8\2\2\u01bbp\3\2\2\2\u01bc\u01be\t\t\2\2\u01bd\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1\u01c2\b9\2\2\u01c2r\3\2\2\2\r\2\u016f\u0174\u017a\u0186\u018f"+
		"\u019b\u019d\u01ab\u01b7\u01bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}