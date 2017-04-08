package br.beholder.memelang.lang;

// Generated from memelang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class memelangParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_funcoes = 1, RULE_parametros = 2, RULE_bloco = 3, 
		RULE_comandos = 4, RULE_retorno = 5, RULE_chamadaFuncao = 6, RULE_parametrosChamada = 7, 
		RULE_condicionais = 8, RULE_ifdes = 9, RULE_ifdeselse = 10, RULE_ifdeselseif = 11, 
		RULE_whiledes = 12, RULE_fordes = 13, RULE_dodes = 14, RULE_switchdes = 15, 
		RULE_switchCase = 16, RULE_defaultdes = 17, RULE_declaracoes = 18, RULE_multidimensional = 19, 
		RULE_declaracoesArray = 20, RULE_subArrayDeclaracoes = 21, RULE_atribuicoes = 22, 
		RULE_atribuicoesIncEDec = 23, RULE_tipoComVoid = 24, RULE_tipo = 25, RULE_expressao = 26, 
		RULE_operations = 27, RULE_op_rel = 28, RULE_op_neg = 29, RULE_op_bitwise = 30, 
		RULE_op_arit_baixa = 31, RULE_op_logica = 32, RULE_val_final = 33;
	public static final String[] ruleNames = {
		"prog", "funcoes", "parametros", "bloco", "comandos", "retorno", "chamadaFuncao", 
		"parametrosChamada", "condicionais", "ifdes", "ifdeselse", "ifdeselseif", 
		"whiledes", "fordes", "dodes", "switchdes", "switchCase", "defaultdes", 
		"declaracoes", "multidimensional", "declaracoesArray", "subArrayDeclaracoes", 
		"atribuicoes", "atribuicoesIncEDec", "tipoComVoid", "tipo", "expressao", 
		"operations", "op_rel", "op_neg", "op_bitwise", "op_arit_baixa", "op_logica", 
		"val_final"
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

	@Override
	public String getGrammarFileName() { return "memelang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public memelangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public FuncoesContext funcoes() {
			return getRuleContext(FuncoesContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			funcoes();
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

	public static class FuncoesContext extends ParserRuleContext {
		public TipoComVoidContext tipoComVoid() {
			return getRuleContext(TipoComVoidContext.class,0);
		}
		public TerminalNode ID() { return getToken(memelangParser.ID, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(memelangParser.PARENTESEABRE, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(memelangParser.PARENTESEFECHA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public FuncoesContext funcoes() {
			return getRuleContext(FuncoesContext.class,0);
		}
		public FuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitFuncoes(this);
		}
	}

	public final FuncoesContext funcoes() throws RecognitionException {
		FuncoesContext _localctx = new FuncoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << VOID))) != 0)) {
				{
				setState(70);
				tipoComVoid();
				setState(71);
				match(ID);
				setState(72);
				match(PARENTESEABRE);
				setState(73);
				parametros();
				setState(74);
				match(PARENTESEFECHA);
				setState(75);
				bloco();
				setState(76);
				funcoes();
				}
			}

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

	public static class ParametrosContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(memelangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(memelangParser.ID, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(memelangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(memelangParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA))) != 0)) {
				{
				setState(80);
				tipo();
				setState(81);
				match(ID);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(82);
					match(VIRGULA);
					setState(83);
					tipo();
					setState(84);
					match(ID);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode CHAVESABRE() { return getToken(memelangParser.CHAVESABRE, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode CHAVESFECHA() { return getToken(memelangParser.CHAVESFECHA, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(CHAVESABRE);
			setState(94);
			comandos();
			setState(95);
			match(CHAVESFECHA);
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

	public static class ComandosContext extends ParserRuleContext {
		public List<CondicionaisContext> condicionais() {
			return getRuleContexts(CondicionaisContext.class);
		}
		public CondicionaisContext condicionais(int i) {
			return getRuleContext(CondicionaisContext.class,i);
		}
		public List<TerminalNode> PONTOEVIRGULA() { return getTokens(memelangParser.PONTOEVIRGULA); }
		public TerminalNode PONTOEVIRGULA(int i) {
			return getToken(memelangParser.PONTOEVIRGULA, i);
		}
		public List<RetornoContext> retorno() {
			return getRuleContexts(RetornoContext.class);
		}
		public RetornoContext retorno(int i) {
			return getRuleContext(RetornoContext.class,i);
		}
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public List<AtribuicoesContext> atribuicoes() {
			return getRuleContexts(AtribuicoesContext.class);
		}
		public AtribuicoesContext atribuicoes(int i) {
			return getRuleContext(AtribuicoesContext.class,i);
		}
		public List<ChamadaFuncaoContext> chamadaFuncao() {
			return getRuleContexts(ChamadaFuncaoContext.class);
		}
		public ChamadaFuncaoContext chamadaFuncao(int i) {
			return getRuleContext(ChamadaFuncaoContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IFDES) | (1L << WHILEDES) | (1L << FORDES) | (1L << DODES) | (1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << SWITCHDES) | (1L << ID) | (1L << RETORNO))) != 0)) {
				{
				setState(106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IFDES:
				case WHILEDES:
				case FORDES:
				case DODES:
				case SWITCHDES:
					{
					setState(97);
					condicionais();
					}
					break;
				case INT:
				case STRING:
				case DOUBLE:
				case BOOL:
				case BIN:
				case HEXA:
				case ID:
				case RETORNO:
					{
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(98);
						retorno();
						}
						break;
					case 2:
						{
						setState(99);
						declaracoes();
						}
						break;
					case 3:
						{
						setState(100);
						atribuicoes();
						}
						break;
					case 4:
						{
						setState(101);
						chamadaFuncao();
						}
						break;
					}
					setState(104);
					match(PONTOEVIRGULA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNO() { return getToken(memelangParser.RETORNO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(RETORNO);
			setState(112);
			expressao();
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

	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(memelangParser.ID, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(memelangParser.PARENTESEABRE, 0); }
		public ParametrosChamadaContext parametrosChamada() {
			return getRuleContext(ParametrosChamadaContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(memelangParser.PARENTESEFECHA, 0); }
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitChamadaFuncao(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chamadaFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			setState(115);
			match(PARENTESEABRE);
			setState(116);
			parametrosChamada();
			setState(117);
			match(PARENTESEFECHA);
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

	public static class ParametrosChamadaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(memelangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(memelangParser.VIRGULA, i);
		}
		public ParametrosChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterParametrosChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitParametrosChamada(this);
		}
	}

	public final ParametrosChamadaContext parametrosChamada() throws RecognitionException {
		ParametrosChamadaContext _localctx = new ParametrosChamadaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametrosChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOT) | (1L << BITNOT) | (1L << CONSTREAL) | (1L << CONSTINTEIRO) | (1L << CONSTSTRING) | (1L << CONSTLOGICO) | (1L << PARENTESEABRE) | (1L << ID))) != 0)) {
				{
				setState(119);
				expressao();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(120);
					match(VIRGULA);
					setState(121);
					expressao();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class CondicionaisContext extends ParserRuleContext {
		public IfdesContext ifdes() {
			return getRuleContext(IfdesContext.class,0);
		}
		public WhiledesContext whiledes() {
			return getRuleContext(WhiledesContext.class,0);
		}
		public FordesContext fordes() {
			return getRuleContext(FordesContext.class,0);
		}
		public DodesContext dodes() {
			return getRuleContext(DodesContext.class,0);
		}
		public TerminalNode PONTOEVIRGULA() { return getToken(memelangParser.PONTOEVIRGULA, 0); }
		public SwitchdesContext switchdes() {
			return getRuleContext(SwitchdesContext.class,0);
		}
		public CondicionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterCondicionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitCondicionais(this);
		}
	}

	public final CondicionaisContext condicionais() throws RecognitionException {
		CondicionaisContext _localctx = new CondicionaisContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicionais);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFDES:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				ifdes();
				}
				break;
			case WHILEDES:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				whiledes();
				}
				break;
			case FORDES:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				fordes();
				}
				break;
			case DODES:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				dodes();
				setState(133);
				match(PONTOEVIRGULA);
				}
				break;
			case SWITCHDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				switchdes();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IfdesContext extends ParserRuleContext {
		public TerminalNode IFDES() { return getToken(memelangParser.IFDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(memelangParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(memelangParser.PARENTESEFECHA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public IfdeselseContext ifdeselse() {
			return getRuleContext(IfdeselseContext.class,0);
		}
		public IfdeselseifContext ifdeselseif() {
			return getRuleContext(IfdeselseifContext.class,0);
		}
		public IfdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterIfdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitIfdes(this);
		}
	}

	public final IfdesContext ifdes() throws RecognitionException {
		IfdesContext _localctx = new IfdesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IFDES);
			setState(139);
			match(PARENTESEABRE);
			setState(140);
			expressao();
			setState(141);
			match(PARENTESEFECHA);
			setState(142);
			bloco();
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(143);
				ifdeselse();
				}
				break;
			case 2:
				{
				setState(144);
				ifdeselseif();
				}
				break;
			}
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

	public static class IfdeselseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(memelangParser.ELSE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public IfdeselseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdeselse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterIfdeselse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitIfdeselse(this);
		}
	}

	public final IfdeselseContext ifdeselse() throws RecognitionException {
		IfdeselseContext _localctx = new IfdeselseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifdeselse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ELSE);
			setState(148);
			bloco();
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

	public static class IfdeselseifContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(memelangParser.ELSE, 0); }
		public IfdesContext ifdes() {
			return getRuleContext(IfdesContext.class,0);
		}
		public IfdeselseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdeselseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterIfdeselseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitIfdeselseif(this);
		}
	}

	public final IfdeselseifContext ifdeselseif() throws RecognitionException {
		IfdeselseifContext _localctx = new IfdeselseifContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifdeselseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ELSE);
			setState(151);
			ifdes();
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

	public static class WhiledesContext extends ParserRuleContext {
		public TerminalNode WHILEDES() { return getToken(memelangParser.WHILEDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(memelangParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(memelangParser.PARENTESEFECHA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public WhiledesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiledes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterWhiledes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitWhiledes(this);
		}
	}

	public final WhiledesContext whiledes() throws RecognitionException {
		WhiledesContext _localctx = new WhiledesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whiledes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(WHILEDES);
			setState(154);
			match(PARENTESEABRE);
			setState(155);
			expressao();
			setState(156);
			match(PARENTESEFECHA);
			setState(157);
			bloco();
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

	public static class FordesContext extends ParserRuleContext {
		public TerminalNode FORDES() { return getToken(memelangParser.FORDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(memelangParser.PARENTESEABRE, 0); }
		public List<TerminalNode> PONTOEVIRGULA() { return getTokens(memelangParser.PONTOEVIRGULA); }
		public TerminalNode PONTOEVIRGULA(int i) {
			return getToken(memelangParser.PONTOEVIRGULA, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<AtribuicoesContext> atribuicoes() {
			return getRuleContexts(AtribuicoesContext.class);
		}
		public AtribuicoesContext atribuicoes(int i) {
			return getRuleContext(AtribuicoesContext.class,i);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(memelangParser.PARENTESEFECHA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public FordesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fordes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterFordes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitFordes(this);
		}
	}

	public final FordesContext fordes() throws RecognitionException {
		FordesContext _localctx = new FordesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fordes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(FORDES);
			setState(160);
			match(PARENTESEABRE);
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case DOUBLE:
			case BOOL:
			case BIN:
			case HEXA:
				{
				setState(161);
				declaracoes();
				}
				break;
			case ID:
				{
				setState(162);
				atribuicoes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(165);
			match(PONTOEVIRGULA);
			setState(166);
			expressao();
			setState(167);
			match(PONTOEVIRGULA);
			setState(168);
			atribuicoes();
			setState(169);
			match(PARENTESEFECHA);
			setState(170);
			bloco();
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

	public static class DodesContext extends ParserRuleContext {
		public TerminalNode DODES() { return getToken(memelangParser.DODES, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode WHILEDES() { return getToken(memelangParser.WHILEDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(memelangParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(memelangParser.PARENTESEFECHA, 0); }
		public DodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterDodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitDodes(this);
		}
	}

	public final DodesContext dodes() throws RecognitionException {
		DodesContext _localctx = new DodesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dodes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(DODES);
			setState(173);
			bloco();
			setState(174);
			match(WHILEDES);
			setState(175);
			match(PARENTESEABRE);
			setState(176);
			expressao();
			setState(177);
			match(PARENTESEFECHA);
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

	public static class SwitchdesContext extends ParserRuleContext {
		public TerminalNode SWITCHDES() { return getToken(memelangParser.SWITCHDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(memelangParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(memelangParser.PARENTESEFECHA, 0); }
		public TerminalNode CHAVESABRE() { return getToken(memelangParser.CHAVESABRE, 0); }
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public DefaultdesContext defaultdes() {
			return getRuleContext(DefaultdesContext.class,0);
		}
		public TerminalNode CHAVESFECHA() { return getToken(memelangParser.CHAVESFECHA, 0); }
		public SwitchdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterSwitchdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitSwitchdes(this);
		}
	}

	public final SwitchdesContext switchdes() throws RecognitionException {
		SwitchdesContext _localctx = new SwitchdesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_switchdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(SWITCHDES);
			setState(180);
			match(PARENTESEABRE);
			setState(181);
			expressao();
			setState(182);
			match(PARENTESEFECHA);
			setState(183);
			match(CHAVESABRE);
			setState(184);
			switchCase();
			setState(185);
			defaultdes();
			setState(186);
			match(CHAVESFECHA);
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(memelangParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(memelangParser.CASE, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> DOISPONTOS() { return getTokens(memelangParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(memelangParser.DOISPONTOS, i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(memelangParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(memelangParser.BREAK, i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitSwitchCase(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(188);
				match(CASE);
				setState(189);
				expressao();
				setState(190);
				match(DOISPONTOS);
				setState(191);
				comandos();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(192);
					match(BREAK);
					}
				}

				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class DefaultdesContext extends ParserRuleContext {
		public TerminalNode DEFAULTDES() { return getToken(memelangParser.DEFAULTDES, 0); }
		public TerminalNode DOISPONTOS() { return getToken(memelangParser.DOISPONTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(memelangParser.BREAK, 0); }
		public DefaultdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterDefaultdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitDefaultdes(this);
		}
	}

	public final DefaultdesContext defaultdes() throws RecognitionException {
		DefaultdesContext _localctx = new DefaultdesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_defaultdes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULTDES) {
				{
				setState(200);
				match(DEFAULTDES);
				setState(201);
				match(DOISPONTOS);
				setState(202);
				comandos();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(203);
					match(BREAK);
					}
				}

				}
			}

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

	public static class DeclaracoesContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(memelangParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(memelangParser.IGUAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public DeclaracoesArrayContext declaracoesArray() {
			return getRuleContext(DeclaracoesArrayContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			tipo();
			setState(209);
			match(ID);
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				{
				{
				setState(210);
				match(IGUAL);
				setState(211);
				expressao();
				}
				}
				break;
			case COLCHETESABRE:
				{
				{
				setState(212);
				multidimensional();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(213);
					match(IGUAL);
					setState(214);
					declaracoesArray();
					}
				}

				}
				}
				break;
			case PONTOEVIRGULA:
				break;
			default:
				break;
			}
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

	public static class MultidimensionalContext extends ParserRuleContext {
		public List<TerminalNode> COLCHETESABRE() { return getTokens(memelangParser.COLCHETESABRE); }
		public TerminalNode COLCHETESABRE(int i) {
			return getToken(memelangParser.COLCHETESABRE, i);
		}
		public List<TerminalNode> CONSTINTEIRO() { return getTokens(memelangParser.CONSTINTEIRO); }
		public TerminalNode CONSTINTEIRO(int i) {
			return getToken(memelangParser.CONSTINTEIRO, i);
		}
		public List<TerminalNode> COLCHETESFECHA() { return getTokens(memelangParser.COLCHETESFECHA); }
		public TerminalNode COLCHETESFECHA(int i) {
			return getToken(memelangParser.COLCHETESFECHA, i);
		}
		public MultidimensionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multidimensional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterMultidimensional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitMultidimensional(this);
		}
	}

	public final MultidimensionalContext multidimensional() throws RecognitionException {
		MultidimensionalContext _localctx = new MultidimensionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multidimensional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				match(COLCHETESABRE);
				setState(220);
				match(CONSTINTEIRO);
				setState(221);
				match(COLCHETESFECHA);
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLCHETESABRE );
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

	public static class DeclaracoesArrayContext extends ParserRuleContext {
		public List<TerminalNode> CHAVESABRE() { return getTokens(memelangParser.CHAVESABRE); }
		public TerminalNode CHAVESABRE(int i) {
			return getToken(memelangParser.CHAVESABRE, i);
		}
		public List<TerminalNode> CHAVESFECHA() { return getTokens(memelangParser.CHAVESFECHA); }
		public TerminalNode CHAVESFECHA(int i) {
			return getToken(memelangParser.CHAVESFECHA, i);
		}
		public List<SubArrayDeclaracoesContext> subArrayDeclaracoes() {
			return getRuleContexts(SubArrayDeclaracoesContext.class);
		}
		public SubArrayDeclaracoesContext subArrayDeclaracoes(int i) {
			return getRuleContext(SubArrayDeclaracoesContext.class,i);
		}
		public List<DeclaracoesArrayContext> declaracoesArray() {
			return getRuleContexts(DeclaracoesArrayContext.class);
		}
		public DeclaracoesArrayContext declaracoesArray(int i) {
			return getRuleContext(DeclaracoesArrayContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(memelangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(memelangParser.VIRGULA, i);
		}
		public DeclaracoesArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoesArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterDeclaracoesArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitDeclaracoesArray(this);
		}
	}

	public final DeclaracoesArrayContext declaracoesArray() throws RecognitionException {
		DeclaracoesArrayContext _localctx = new DeclaracoesArrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaracoesArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(CHAVESABRE);
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOS:
			case NOT:
			case BITNOT:
			case CONSTREAL:
			case CONSTINTEIRO:
			case CONSTSTRING:
			case CONSTLOGICO:
			case PARENTESEABRE:
			case ID:
				{
				setState(227);
				subArrayDeclaracoes();
				}
				break;
			case CHAVESABRE:
				{
				setState(228);
				declaracoesArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(231);
			match(CHAVESFECHA);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(232);
				match(VIRGULA);
				setState(233);
				match(CHAVESABRE);
				setState(236);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MENOS:
				case NOT:
				case BITNOT:
				case CONSTREAL:
				case CONSTINTEIRO:
				case CONSTSTRING:
				case CONSTLOGICO:
				case PARENTESEABRE:
				case ID:
					{
					setState(234);
					subArrayDeclaracoes();
					}
					break;
				case CHAVESABRE:
					{
					setState(235);
					declaracoesArray();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(238);
				match(CHAVESFECHA);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SubArrayDeclaracoesContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(memelangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(memelangParser.VIRGULA, i);
		}
		public SubArrayDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subArrayDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterSubArrayDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitSubArrayDeclaracoes(this);
		}
	}

	public final SubArrayDeclaracoesContext subArrayDeclaracoes() throws RecognitionException {
		SubArrayDeclaracoesContext _localctx = new SubArrayDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_subArrayDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			expressao();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(246);
				match(VIRGULA);
				setState(247);
				expressao();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AtribuicoesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(memelangParser.ID, 0); }
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public AtribuicoesIncEDecContext atribuicoesIncEDec() {
			return getRuleContext(AtribuicoesIncEDecContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(memelangParser.IGUAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterAtribuicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitAtribuicoes(this);
		}
	}

	public final AtribuicoesContext atribuicoes() throws RecognitionException {
		AtribuicoesContext _localctx = new AtribuicoesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atribuicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(ID);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLCHETESABRE) {
				{
				setState(254);
				multidimensional();
				}
			}

			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
			case MENOS:
				{
				{
				setState(257);
				atribuicoesIncEDec();
				}
				}
				break;
			case IGUAL:
				{
				{
				setState(258);
				match(IGUAL);
				setState(259);
				expressao();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class AtribuicoesIncEDecContext extends ParserRuleContext {
		public List<TerminalNode> MAIS() { return getTokens(memelangParser.MAIS); }
		public TerminalNode MAIS(int i) {
			return getToken(memelangParser.MAIS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(memelangParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(memelangParser.MENOS, i);
		}
		public AtribuicoesIncEDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicoesIncEDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterAtribuicoesIncEDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitAtribuicoesIncEDec(this);
		}
	}

	public final AtribuicoesIncEDecContext atribuicoesIncEDec() throws RecognitionException {
		AtribuicoesIncEDecContext _localctx = new AtribuicoesIncEDecContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atribuicoesIncEDec);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(MAIS);
				setState(263);
				match(MAIS);
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(MENOS);
				setState(265);
				match(MENOS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TipoComVoidContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(memelangParser.VOID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoComVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoComVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterTipoComVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitTipoComVoid(this);
		}
	}

	public final TipoComVoidContext tipoComVoid() throws RecognitionException {
		TipoComVoidContext _localctx = new TipoComVoidContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tipoComVoid);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(VOID);
				}
				break;
			case INT:
			case STRING:
			case DOUBLE:
			case BOOL:
			case BIN:
			case HEXA:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(memelangParser.INT, 0); }
		public TerminalNode STRING() { return getToken(memelangParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(memelangParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(memelangParser.BOOL, 0); }
		public TerminalNode BIN() { return getToken(memelangParser.BIN, 0); }
		public TerminalNode HEXA() { return getToken(memelangParser.HEXA, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Val_finalContext> val_final() {
			return getRuleContexts(Val_finalContext.class);
		}
		public Val_finalContext val_final(int i) {
			return getRuleContext(Val_finalContext.class,i);
		}
		public Op_negContext op_neg() {
			return getRuleContext(Op_negContext.class,0);
		}
		public List<OperationsContext> operations() {
			return getRuleContexts(OperationsContext.class);
		}
		public OperationsContext operations(int i) {
			return getRuleContext(OperationsContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOT) | (1L << BITNOT))) != 0)) {
				{
				setState(274);
				op_neg();
				}
			}

			{
			setState(277);
			val_final();
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIS) | (1L << MENOS) | (1L << MAIORQUE) | (1L << MENORQUE) | (1L << MAIOROUIGUAL) | (1L << MENOROUIGUAL) | (1L << IDENTICO) | (1L << DIFERENTE) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << BITSHIFTRIGHT) | (1L << BITSHIFTLEFT) | (1L << BITNOT))) != 0)) {
				{
				{
				{
				setState(278);
				operations();
				}
				{
				setState(279);
				val_final();
				}
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class OperationsContext extends ParserRuleContext {
		public Op_relContext op_rel() {
			return getRuleContext(Op_relContext.class,0);
		}
		public Op_negContext op_neg() {
			return getRuleContext(Op_negContext.class,0);
		}
		public Op_bitwiseContext op_bitwise() {
			return getRuleContext(Op_bitwiseContext.class,0);
		}
		public Op_arit_baixaContext op_arit_baixa() {
			return getRuleContext(Op_arit_baixaContext.class,0);
		}
		public Op_logicaContext op_logica() {
			return getRuleContext(Op_logicaContext.class,0);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitOperations(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operations);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				op_rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				op_neg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				op_bitwise();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				op_arit_baixa();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				op_logica();
				}
				break;
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

	public static class Op_relContext extends ParserRuleContext {
		public TerminalNode MAIORQUE() { return getToken(memelangParser.MAIORQUE, 0); }
		public TerminalNode MENORQUE() { return getToken(memelangParser.MENORQUE, 0); }
		public TerminalNode MAIOROUIGUAL() { return getToken(memelangParser.MAIOROUIGUAL, 0); }
		public TerminalNode MENOROUIGUAL() { return getToken(memelangParser.MENOROUIGUAL, 0); }
		public TerminalNode IDENTICO() { return getToken(memelangParser.IDENTICO, 0); }
		public TerminalNode DIFERENTE() { return getToken(memelangParser.DIFERENTE, 0); }
		public Op_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterOp_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitOp_rel(this);
		}
	}

	public final Op_relContext op_rel() throws RecognitionException {
		Op_relContext _localctx = new Op_relContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIORQUE) | (1L << MENORQUE) | (1L << MAIOROUIGUAL) | (1L << MENOROUIGUAL) | (1L << IDENTICO) | (1L << DIFERENTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Op_negContext extends ParserRuleContext {
		public TerminalNode MENOS() { return getToken(memelangParser.MENOS, 0); }
		public TerminalNode BITNOT() { return getToken(memelangParser.BITNOT, 0); }
		public TerminalNode NOT() { return getToken(memelangParser.NOT, 0); }
		public Op_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterOp_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitOp_neg(this);
		}
	}

	public final Op_negContext op_neg() throws RecognitionException {
		Op_negContext _localctx = new Op_negContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOT) | (1L << BITNOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Op_bitwiseContext extends ParserRuleContext {
		public TerminalNode BITSHIFTLEFT() { return getToken(memelangParser.BITSHIFTLEFT, 0); }
		public TerminalNode BITSHIFTRIGHT() { return getToken(memelangParser.BITSHIFTRIGHT, 0); }
		public Op_bitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterOp_bitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitOp_bitwise(this);
		}
	}

	public final Op_bitwiseContext op_bitwise() throws RecognitionException {
		Op_bitwiseContext _localctx = new Op_bitwiseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==BITSHIFTRIGHT || _la==BITSHIFTLEFT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Op_arit_baixaContext extends ParserRuleContext {
		public TerminalNode MAIS() { return getToken(memelangParser.MAIS, 0); }
		public Op_arit_baixaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_arit_baixa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterOp_arit_baixa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitOp_arit_baixa(this);
		}
	}

	public final Op_arit_baixaContext op_arit_baixa() throws RecognitionException {
		Op_arit_baixaContext _localctx = new Op_arit_baixaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_op_arit_baixa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(MAIS);
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

	public static class Op_logicaContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(memelangParser.AND, 0); }
		public TerminalNode OR() { return getToken(memelangParser.OR, 0); }
		public TerminalNode NOT() { return getToken(memelangParser.NOT, 0); }
		public Op_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterOp_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitOp_logica(this);
		}
	}

	public final Op_logicaContext op_logica() throws RecognitionException {
		Op_logicaContext _localctx = new Op_logicaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Val_finalContext extends ParserRuleContext {
		public TerminalNode CONSTINTEIRO() { return getToken(memelangParser.CONSTINTEIRO, 0); }
		public TerminalNode CONSTSTRING() { return getToken(memelangParser.CONSTSTRING, 0); }
		public TerminalNode CONSTLOGICO() { return getToken(memelangParser.CONSTLOGICO, 0); }
		public TerminalNode CONSTREAL() { return getToken(memelangParser.CONSTREAL, 0); }
		public TerminalNode ID() { return getToken(memelangParser.ID, 0); }
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public TerminalNode PARENTESEABRE() { return getToken(memelangParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(memelangParser.PARENTESEFECHA, 0); }
		public Val_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).enterVal_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof memelangListener ) ((memelangListener)listener).exitVal_final(this);
		}
	}

	public final Val_finalContext val_final() throws RecognitionException {
		Val_finalContext _localctx = new Val_finalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_val_final);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(CONSTINTEIRO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(CONSTSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(CONSTLOGICO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				match(CONSTREAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(308);
				chamadaFuncao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(309);
				match(ID);
				setState(310);
				multidimensional();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
				match(PARENTESEABRE);
				setState(312);
				expressao();
				setState(313);
				match(PARENTESEFECHA);
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0140\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\5\4^\n\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\5\t"+
		"\u0082\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008b\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0094\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00a6\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00c4\n\22"+
		"\7\22\u00c6\n\22\f\22\16\22\u00c9\13\22\3\23\3\23\3\23\3\23\5\23\u00cf"+
		"\n\23\5\23\u00d1\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00da\n"+
		"\24\5\24\u00dc\n\24\3\25\3\25\3\25\6\25\u00e1\n\25\r\25\16\25\u00e2\3"+
		"\26\3\26\3\26\5\26\u00e8\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ef\n\26"+
		"\3\26\3\26\7\26\u00f3\n\26\f\26\16\26\u00f6\13\26\3\27\3\27\3\27\7\27"+
		"\u00fb\n\27\f\27\16\27\u00fe\13\27\3\30\3\30\5\30\u0102\n\30\3\30\3\30"+
		"\3\30\5\30\u0107\n\30\3\31\3\31\3\31\3\31\5\31\u010d\n\31\3\32\3\32\5"+
		"\32\u0111\n\32\3\33\3\33\3\34\5\34\u0116\n\34\3\34\3\34\3\34\3\34\7\34"+
		"\u011c\n\34\f\34\16\34\u011f\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u0126"+
		"\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\5#\u013e\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BD\2\7\3\2\b\r\3\2\25\32\5\2\24\24\35\35##\3"+
		"\2\36\37\3\2\33\35\2\u014b\2F\3\2\2\2\4P\3\2\2\2\6]\3\2\2\2\b_\3\2\2\2"+
		"\nn\3\2\2\2\fq\3\2\2\2\16t\3\2\2\2\20\u0081\3\2\2\2\22\u008a\3\2\2\2\24"+
		"\u008c\3\2\2\2\26\u0095\3\2\2\2\30\u0098\3\2\2\2\32\u009b\3\2\2\2\34\u00a1"+
		"\3\2\2\2\36\u00ae\3\2\2\2 \u00b5\3\2\2\2\"\u00c7\3\2\2\2$\u00d0\3\2\2"+
		"\2&\u00d2\3\2\2\2(\u00e0\3\2\2\2*\u00e4\3\2\2\2,\u00f7\3\2\2\2.\u00ff"+
		"\3\2\2\2\60\u010c\3\2\2\2\62\u0110\3\2\2\2\64\u0112\3\2\2\2\66\u0115\3"+
		"\2\2\28\u0125\3\2\2\2:\u0127\3\2\2\2<\u0129\3\2\2\2>\u012b\3\2\2\2@\u012d"+
		"\3\2\2\2B\u012f\3\2\2\2D\u013d\3\2\2\2FG\5\4\3\2G\3\3\2\2\2HI\5\62\32"+
		"\2IJ\7\67\2\2JK\7\65\2\2KL\5\6\4\2LM\7\66\2\2MN\5\b\5\2NO\5\4\3\2OQ\3"+
		"\2\2\2PH\3\2\2\2PQ\3\2\2\2Q\5\3\2\2\2RS\5\64\33\2SZ\7\67\2\2TU\7/\2\2"+
		"UV\5\64\33\2VW\7\67\2\2WY\3\2\2\2XT\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2"+
		"\2\2[^\3\2\2\2\\Z\3\2\2\2]R\3\2\2\2]^\3\2\2\2^\7\3\2\2\2_`\7\63\2\2`a"+
		"\5\n\6\2ab\7\64\2\2b\t\3\2\2\2cm\5\22\n\2di\5\f\7\2ei\5&\24\2fi\5.\30"+
		"\2gi\5\16\b\2hd\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2ij\3\2\2\2jk\7.\2"+
		"\2km\3\2\2\2lc\3\2\2\2lh\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\13\3\2"+
		"\2\2pn\3\2\2\2qr\78\2\2rs\5\66\34\2s\r\3\2\2\2tu\7\67\2\2uv\7\65\2\2v"+
		"w\5\20\t\2wx\7\66\2\2x\17\3\2\2\2y~\5\66\34\2z{\7/\2\2{}\5\66\34\2|z\3"+
		"\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080~"+
		"\3\2\2\2\u0081y\3\2\2\2\u0081\u0082\3\2\2\2\u0082\21\3\2\2\2\u0083\u008b"+
		"\5\24\13\2\u0084\u008b\5\32\16\2\u0085\u008b\5\34\17\2\u0086\u0087\5\36"+
		"\20\2\u0087\u0088\7.\2\2\u0088\u008b\3\2\2\2\u0089\u008b\5 \21\2\u008a"+
		"\u0083\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2"+
		"\2\2\u008a\u0089\3\2\2\2\u008b\23\3\2\2\2\u008c\u008d\7\3\2\2\u008d\u008e"+
		"\7\65\2\2\u008e\u008f\5\66\34\2\u008f\u0090\7\66\2\2\u0090\u0093\5\b\5"+
		"\2\u0091\u0094\5\26\f\2\u0092\u0094\5\30\r\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\25\3\2\2\2\u0095\u0096\7\4\2"+
		"\2\u0096\u0097\5\b\5\2\u0097\27\3\2\2\2\u0098\u0099\7\4\2\2\u0099\u009a"+
		"\5\24\13\2\u009a\31\3\2\2\2\u009b\u009c\7\5\2\2\u009c\u009d\7\65\2\2\u009d"+
		"\u009e\5\66\34\2\u009e\u009f\7\66\2\2\u009f\u00a0\5\b\5\2\u00a0\33\3\2"+
		"\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a5\7\65\2\2\u00a3\u00a6\5&\24\2\u00a4"+
		"\u00a6\5.\30\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\7.\2\2\u00a8\u00a9\5\66\34\2\u00a9\u00aa\7.\2\2\u00aa"+
		"\u00ab\5.\30\2\u00ab\u00ac\7\66\2\2\u00ac\u00ad\5\b\5\2\u00ad\35\3\2\2"+
		"\2\u00ae\u00af\7\7\2\2\u00af\u00b0\5\b\5\2\u00b0\u00b1\7\5\2\2\u00b1\u00b2"+
		"\7\65\2\2\u00b2\u00b3\5\66\34\2\u00b3\u00b4\7\66\2\2\u00b4\37\3\2\2\2"+
		"\u00b5\u00b6\7\20\2\2\u00b6\u00b7\7\65\2\2\u00b7\u00b8\5\66\34\2\u00b8"+
		"\u00b9\7\66\2\2\u00b9\u00ba\7\63\2\2\u00ba\u00bb\5\"\22\2\u00bb\u00bc"+
		"\5$\23\2\u00bc\u00bd\7\64\2\2\u00bd!\3\2\2\2\u00be\u00bf\7\21\2\2\u00bf"+
		"\u00c0\5\66\34\2\u00c0\u00c1\7\60\2\2\u00c1\u00c3\5\n\6\2\u00c2\u00c4"+
		"\7\17\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2"+
		"\u00c5\u00be\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8#\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\22\2\2\u00cb"+
		"\u00cc\7\60\2\2\u00cc\u00ce\5\n\6\2\u00cd\u00cf\7\17\2\2\u00ce\u00cd\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1%\3\2\2\2\u00d2\u00d3\5\64\33\2\u00d3\u00db\7\67\2"+
		"\2\u00d4\u00d5\7-\2\2\u00d5\u00dc\5\66\34\2\u00d6\u00d9\5(\25\2\u00d7"+
		"\u00d8\7-\2\2\u00d8\u00da\5*\26\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dc\3\2\2\2\u00db\u00d4\3\2\2\2\u00db\u00d6\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\'\3\2\2\2\u00dd\u00de\7\61\2\2\u00de\u00df\7%\2\2"+
		"\u00df\u00e1\7\62\2\2\u00e0\u00dd\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3)\3\2\2\2\u00e4\u00e7\7\63\2\2\u00e5"+
		"\u00e8\5,\27\2\u00e6\u00e8\5*\26\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f4\7\64\2\2\u00ea\u00eb\7/\2\2\u00eb"+
		"\u00ee\7\63\2\2\u00ec\u00ef\5,\27\2\u00ed\u00ef\5*\26\2\u00ee\u00ec\3"+
		"\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\64\2\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5+\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fc"+
		"\5\66\34\2\u00f8\u00f9\7/\2\2\u00f9\u00fb\5\66\34\2\u00fa\u00f8\3\2\2"+
		"\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd-"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\7\67\2\2\u0100\u0102\5(\25\2"+
		"\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0106\3\2\2\2\u0103\u0107"+
		"\5\60\31\2\u0104\u0105\7-\2\2\u0105\u0107\5\66\34\2\u0106\u0103\3\2\2"+
		"\2\u0106\u0104\3\2\2\2\u0107/\3\2\2\2\u0108\u0109\7\23\2\2\u0109\u010d"+
		"\7\23\2\2\u010a\u010b\7\24\2\2\u010b\u010d\7\24\2\2\u010c\u0108\3\2\2"+
		"\2\u010c\u010a\3\2\2\2\u010d\61\3\2\2\2\u010e\u0111\7\16\2\2\u010f\u0111"+
		"\5\64\33\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\63\3\2\2\2\u0112"+
		"\u0113\t\2\2\2\u0113\65\3\2\2\2\u0114\u0116\5<\37\2\u0115\u0114\3\2\2"+
		"\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011d\5D#\2\u0118\u0119"+
		"\58\35\2\u0119\u011a\5D#\2\u011a\u011c\3\2\2\2\u011b\u0118\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\67\3\2\2"+
		"\2\u011f\u011d\3\2\2\2\u0120\u0126\5:\36\2\u0121\u0126\5<\37\2\u0122\u0126"+
		"\5> \2\u0123\u0126\5@!\2\u0124\u0126\5B\"\2\u0125\u0120\3\2\2\2\u0125"+
		"\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2"+
		"\2\2\u01269\3\2\2\2\u0127\u0128\t\3\2\2\u0128;\3\2\2\2\u0129\u012a\t\4"+
		"\2\2\u012a=\3\2\2\2\u012b\u012c\t\5\2\2\u012c?\3\2\2\2\u012d\u012e\7\23"+
		"\2\2\u012eA\3\2\2\2\u012f\u0130\t\6\2\2\u0130C\3\2\2\2\u0131\u013e\7%"+
		"\2\2\u0132\u013e\7(\2\2\u0133\u013e\7)\2\2\u0134\u013e\7$\2\2\u0135\u013e"+
		"\7\67\2\2\u0136\u013e\5\16\b\2\u0137\u0138\7\67\2\2\u0138\u013e\5(\25"+
		"\2\u0139\u013a\7\65\2\2\u013a\u013b\5\66\34\2\u013b\u013c\7\66\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u0131\3\2\2\2\u013d\u0132\3\2\2\2\u013d\u0133\3\2"+
		"\2\2\u013d\u0134\3\2\2\2\u013d\u0135\3\2\2\2\u013d\u0136\3\2\2\2\u013d"+
		"\u0137\3\2\2\2\u013d\u0139\3\2\2\2\u013eE\3\2\2\2 PZ]hln~\u0081\u008a"+
		"\u0093\u00a5\u00c3\u00c7\u00ce\u00d0\u00d9\u00db\u00e2\u00e7\u00ee\u00f4"+
		"\u00fc\u0101\u0106\u010c\u0110\u0115\u011d\u0125\u013d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}