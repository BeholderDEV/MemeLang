// Generated from meme.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class memeParser extends Parser {
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
	public static final int
		RULE_r = 0;
	public static final String[] ruleNames = {
		"r"
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

	@Override
	public String getGrammarFileName() { return "meme.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public memeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public TerminalNode DECLARACAO_INTEIRO() { return getToken(memeParser.DECLARACAO_INTEIRO, 0); }
		public TerminalNode VARIAVEL() { return getToken(memeParser.VARIAVEL, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(memeParser.ATRIBUICAO, 0); }
		public TerminalNode NUMERO_INTEIRO() { return getToken(memeParser.NUMERO_INTEIRO, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memeListener ) ((memeListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memeListener ) ((memeListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(DECLARACAO_INTEIRO);
			setState(3);
			match(VARIAVEL);
			setState(4);
			match(ATRIBUICAO);
			setState(5);
			match(NUMERO_INTEIRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\n\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\b\2\4\3\2\2\2\4\5\7\4\2\2\5\6\78\2\2"+
		"\6\7\7\3\2\2\7\b\7\63\2\2\b\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}