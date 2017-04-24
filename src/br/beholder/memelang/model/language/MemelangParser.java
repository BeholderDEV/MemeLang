package br.beholder.memelang.model.language;
// Generated from .\Memelang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MemelangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEFRETORNO=1, IFDES=2, ELSE=3, WHILEDES=4, FORDES=5, DODES=6, INT=7, STRING=8, 
		DOUBLE=9, BOOL=10, BIN=11, HEXA=12, VOID=13, CHAR=14, BREAK=15, SWITCHDES=16, 
		CASE=17, DEFAULTDES=18, MAIS=19, MENOS=20, MULTIPLICA=21, DIVIDE=22, MOD=23, 
		MAIORQUE=24, MENORQUE=25, MAIOROUIGUAL=26, MENOROUIGUAL=27, IDENTICO=28, 
		DIFERENTE=29, AND=30, OR=31, NOT=32, BITSHIFTRIGHT=33, BITSHIFTLEFT=34, 
		BITAND=35, BITOR=36, BITXOR=37, BITNOT=38, CONSTREAL=39, CONSTINTEIRO=40, 
		CONSTBINARIO=41, CONSTHEXA=42, CONSTSTRING=43, CONSTLOGICO=44, CONSTCHAR=45, 
		COMENTARIOLINHA=46, COMENTARIOMULTIPLO=47, PONTO=48, IGUAL=49, PONTOEVIRGULA=50, 
		VIRGULA=51, DOISPONTOS=52, COLCHETESABRE=53, COLCHETESFECHA=54, CHAVESABRE=55, 
		CHAVESFECHA=56, PARENTESEABRE=57, PARENTESEFECHA=58, ASPA=59, ID=60, WHITESPACE=61;
	public static final int
		RULE_prog = 0, RULE_funcaoInicio = 1, RULE_funcoes = 2, RULE_parametros = 3, 
		RULE_bloco = 4, RULE_comandos = 5, RULE_comando = 6, RULE_retorno = 7, 
		RULE_chamadaFuncao = 8, RULE_parametrosChamada = 9, RULE_condicionais = 10, 
		RULE_ifdes = 11, RULE_ifdeselse = 12, RULE_ifdeselseif = 13, RULE_whiledes = 14, 
		RULE_fordes = 15, RULE_dodes = 16, RULE_switchdes = 17, RULE_switchCase = 18, 
		RULE_defaultdes = 19, RULE_declaracoes = 20, RULE_multidimensional = 21, 
		RULE_declaracoesArray = 22, RULE_subArrayDeclaracoes = 23, RULE_atribuicoes = 24, 
		RULE_atribuicoesIncEDec = 25, RULE_tipoComVoid = 26, RULE_tipo = 27, RULE_expressao = 28, 
		RULE_operations = 29, RULE_op_atr = 30, RULE_op_rel = 31, RULE_op_neg = 32, 
		RULE_op_bitwise = 33, RULE_op_arit_baixa = 34, RULE_op_logica = 35, RULE_val_final = 36;
	public static final String[] ruleNames = {
		"prog", "funcaoInicio", "funcoes", "parametros", "bloco", "comandos", 
		"comando", "retorno", "chamadaFuncao", "parametrosChamada", "condicionais", 
		"ifdes", "ifdeselse", "ifdeselseif", "whiledes", "fordes", "dodes", "switchdes", 
		"switchCase", "defaultdes", "declaracoes", "multidimensional", "declaracoesArray", 
		"subArrayDeclaracoes", "atribuicoes", "atribuicoesIncEDec", "tipoComVoid", 
		"tipo", "expressao", "operations", "op_atr", "op_rel", "op_neg", "op_bitwise", 
		"op_arit_baixa", "op_logica", "val_final"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'goHomeYouAreDrunk'", "'kek'", "'notSureIf'", "'everydayUntilYouLikeIt'", 
		"'waitForIt'", "'justDoIt'", "'checkEm'", "'lolicon'", "'dubs'", "'yesButNo'", 
		"'binLaden'", "'l33t'", "'missingNo'", "'batata'", "'wat'", "'chooseAPill'", 
		"'pill'", "'hipster'", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'<'", 
		"'>='", "'<='", "'=='", "'!='", "'and'", "'or'", "'nope'", "'>>'", "'<<'", 
		"'&'", "'|'", "'^'", "'~'", null, null, null, null, null, "'(yeah)|(trap)'", 
		null, null, null, "'.'", "'='", "'desu'", "','", "':'", "'['", "']'", 
		"'illuminati'", "'confirmed'", "'L('", "')L'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DEFRETORNO", "IFDES", "ELSE", "WHILEDES", "FORDES", "DODES", "INT", 
		"STRING", "DOUBLE", "BOOL", "BIN", "HEXA", "VOID", "CHAR", "BREAK", "SWITCHDES", 
		"CASE", "DEFAULTDES", "MAIS", "MENOS", "MULTIPLICA", "DIVIDE", "MOD", 
		"MAIORQUE", "MENORQUE", "MAIOROUIGUAL", "MENOROUIGUAL", "IDENTICO", "DIFERENTE", 
		"AND", "OR", "NOT", "BITSHIFTRIGHT", "BITSHIFTLEFT", "BITAND", "BITOR", 
		"BITXOR", "BITNOT", "CONSTREAL", "CONSTINTEIRO", "CONSTBINARIO", "CONSTHEXA", 
		"CONSTSTRING", "CONSTLOGICO", "CONSTCHAR", "COMENTARIOLINHA", "COMENTARIOMULTIPLO", 
		"PONTO", "IGUAL", "PONTOEVIRGULA", "VIRGULA", "DOISPONTOS", "COLCHETESABRE", 
		"COLCHETESFECHA", "CHAVESABRE", "CHAVESFECHA", "PARENTESEABRE", "PARENTESEFECHA", 
		"ASPA", "ID", "WHITESPACE"
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
	public String getGrammarFileName() { return "Memelang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MemelangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public FuncaoInicioContext funcaoInicio() {
			return getRuleContext(FuncaoInicioContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			funcaoInicio();
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

	public static class FuncaoInicioContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MemelangParser.INT, 0); }
		public TerminalNode ID() { return getToken(MemelangParser.ID, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(MemelangParser.PARENTESEABRE, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(MemelangParser.PARENTESEFECHA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public FuncoesContext funcoes() {
			return getRuleContext(FuncoesContext.class,0);
		}
		public FuncaoInicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoInicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterFuncaoInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitFuncaoInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitFuncaoInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoInicioContext funcaoInicio() throws RecognitionException {
		FuncaoInicioContext _localctx = new FuncaoInicioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcaoInicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(76);
			match(INT);
			setState(77);
			match(ID);
			setState(78);
			match(PARENTESEABRE);
			setState(79);
			parametros();
			setState(80);
			match(PARENTESEFECHA);
			setState(81);
			bloco();
			setState(82);
			funcoes();
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

	public static class FuncoesContext extends ParserRuleContext {
		public TipoComVoidContext tipoComVoid() {
			return getRuleContext(TipoComVoidContext.class,0);
		}
		public TerminalNode ID() { return getToken(MemelangParser.ID, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(MemelangParser.PARENTESEABRE, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(MemelangParser.PARENTESEFECHA, 0); }
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
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitFuncoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitFuncoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncoesContext funcoes() throws RecognitionException {
		FuncoesContext _localctx = new FuncoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << VOID) | (1L << CHAR))) != 0)) {
				{
				setState(84);
				tipoComVoid();
				setState(85);
				match(ID);
				setState(86);
				match(PARENTESEABRE);
				setState(87);
				parametros();
				setState(88);
				match(PARENTESEFECHA);
				setState(89);
				bloco();
				setState(90);
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
		public List<TerminalNode> ID() { return getTokens(MemelangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MemelangParser.ID, i);
		}
		public List<MultidimensionalContext> multidimensional() {
			return getRuleContexts(MultidimensionalContext.class);
		}
		public MultidimensionalContext multidimensional(int i) {
			return getRuleContext(MultidimensionalContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MemelangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MemelangParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << CHAR))) != 0)) {
				{
				setState(94);
				tipo();
				setState(95);
				match(ID);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLCHETESABRE) {
					{
					setState(96);
					multidimensional();
					}
				}

				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(99);
					match(VIRGULA);
					setState(100);
					tipo();
					setState(101);
					match(ID);
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLCHETESABRE) {
						{
						setState(102);
						multidimensional();
						}
					}

					}
					}
					setState(109);
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
		public TerminalNode CHAVESABRE() { return getToken(MemelangParser.CHAVESABRE, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode CHAVESFECHA() { return getToken(MemelangParser.CHAVESFECHA, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(CHAVESABRE);
			setState(113);
			comandos();
			setState(114);
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
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFRETORNO) | (1L << IFDES) | (1L << WHILEDES) | (1L << FORDES) | (1L << DODES) | (1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << CHAR) | (1L << SWITCHDES) | (1L << ID))) != 0)) {
				{
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IFDES:
				case WHILEDES:
				case FORDES:
				case DODES:
				case SWITCHDES:
					{
					setState(116);
					condicionais();
					}
					break;
				case DEFRETORNO:
				case INT:
				case STRING:
				case DOUBLE:
				case BOOL:
				case BIN:
				case HEXA:
				case CHAR:
				case ID:
					{
					setState(117);
					comando();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(122);
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

	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode PONTOEVIRGULA() { return getToken(MemelangParser.PONTOEVIRGULA, 0); }
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public AtribuicoesContext atribuicoes() {
			return getRuleContext(AtribuicoesContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(123);
				retorno();
				}
				break;
			case 2:
				{
				setState(124);
				declaracoes();
				}
				break;
			case 3:
				{
				setState(125);
				atribuicoes();
				}
				break;
			case 4:
				{
				setState(126);
				chamadaFuncao();
				}
				break;
			}
			setState(129);
			match(PONTOEVIRGULA);
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
		public TerminalNode DEFRETORNO() { return getToken(MemelangParser.DEFRETORNO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(DEFRETORNO);
			setState(132);
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
		public TerminalNode ID() { return getToken(MemelangParser.ID, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(MemelangParser.PARENTESEABRE, 0); }
		public ParametrosChamadaContext parametrosChamada() {
			return getRuleContext(ParametrosChamadaContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(MemelangParser.PARENTESEFECHA, 0); }
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitChamadaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chamadaFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			setState(135);
			match(PARENTESEABRE);
			setState(136);
			parametrosChamada();
			setState(137);
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
		public List<TerminalNode> VIRGULA() { return getTokens(MemelangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MemelangParser.VIRGULA, i);
		}
		public ParametrosChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterParametrosChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitParametrosChamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitParametrosChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosChamadaContext parametrosChamada() throws RecognitionException {
		ParametrosChamadaContext _localctx = new ParametrosChamadaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametrosChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOT) | (1L << BITNOT) | (1L << CONSTREAL) | (1L << CONSTINTEIRO) | (1L << CONSTBINARIO) | (1L << CONSTHEXA) | (1L << CONSTSTRING) | (1L << CONSTLOGICO) | (1L << PARENTESEABRE) | (1L << ID))) != 0)) {
				{
				setState(139);
				expressao();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(140);
					match(VIRGULA);
					setState(141);
					expressao();
					}
					}
					setState(146);
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
		public TerminalNode PONTOEVIRGULA() { return getToken(MemelangParser.PONTOEVIRGULA, 0); }
		public SwitchdesContext switchdes() {
			return getRuleContext(SwitchdesContext.class,0);
		}
		public CondicionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterCondicionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitCondicionais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitCondicionais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionaisContext condicionais() throws RecognitionException {
		CondicionaisContext _localctx = new CondicionaisContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicionais);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFDES:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				ifdes();
				}
				break;
			case WHILEDES:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				whiledes();
				}
				break;
			case FORDES:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				fordes();
				}
				break;
			case DODES:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				dodes();
				setState(153);
				match(PONTOEVIRGULA);
				}
				break;
			case SWITCHDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
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
		public TerminalNode IFDES() { return getToken(MemelangParser.IFDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(MemelangParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(MemelangParser.PARENTESEFECHA, 0); }
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
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterIfdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitIfdes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitIfdes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfdesContext ifdes() throws RecognitionException {
		IfdesContext _localctx = new IfdesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IFDES);
			setState(159);
			match(PARENTESEABRE);
			setState(160);
			expressao();
			setState(161);
			match(PARENTESEFECHA);
			setState(162);
			bloco();
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(163);
				ifdeselse();
				}
				break;
			case 2:
				{
				setState(164);
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
		public TerminalNode ELSE() { return getToken(MemelangParser.ELSE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public IfdeselseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdeselse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterIfdeselse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitIfdeselse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitIfdeselse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfdeselseContext ifdeselse() throws RecognitionException {
		IfdeselseContext _localctx = new IfdeselseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifdeselse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ELSE);
			setState(168);
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
		public TerminalNode ELSE() { return getToken(MemelangParser.ELSE, 0); }
		public IfdesContext ifdes() {
			return getRuleContext(IfdesContext.class,0);
		}
		public IfdeselseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdeselseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterIfdeselseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitIfdeselseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitIfdeselseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfdeselseifContext ifdeselseif() throws RecognitionException {
		IfdeselseifContext _localctx = new IfdeselseifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifdeselseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(ELSE);
			setState(171);
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
		public TerminalNode WHILEDES() { return getToken(MemelangParser.WHILEDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(MemelangParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(MemelangParser.PARENTESEFECHA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public WhiledesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiledes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterWhiledes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitWhiledes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitWhiledes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhiledesContext whiledes() throws RecognitionException {
		WhiledesContext _localctx = new WhiledesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whiledes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(WHILEDES);
			setState(174);
			match(PARENTESEABRE);
			setState(175);
			expressao();
			setState(176);
			match(PARENTESEFECHA);
			setState(177);
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
		public TerminalNode FORDES() { return getToken(MemelangParser.FORDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(MemelangParser.PARENTESEABRE, 0); }
		public List<TerminalNode> PONTOEVIRGULA() { return getTokens(MemelangParser.PONTOEVIRGULA); }
		public TerminalNode PONTOEVIRGULA(int i) {
			return getToken(MemelangParser.PONTOEVIRGULA, i);
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
		public TerminalNode PARENTESEFECHA() { return getToken(MemelangParser.PARENTESEFECHA, 0); }
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
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterFordes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitFordes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitFordes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FordesContext fordes() throws RecognitionException {
		FordesContext _localctx = new FordesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fordes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(FORDES);
			setState(180);
			match(PARENTESEABRE);
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case DOUBLE:
			case BOOL:
			case BIN:
			case HEXA:
			case CHAR:
				{
				setState(181);
				declaracoes();
				}
				break;
			case ID:
				{
				setState(182);
				atribuicoes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(185);
			match(PONTOEVIRGULA);
			setState(186);
			expressao();
			setState(187);
			match(PONTOEVIRGULA);
			setState(188);
			atribuicoes();
			setState(189);
			match(PARENTESEFECHA);
			setState(190);
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
		public TerminalNode DODES() { return getToken(MemelangParser.DODES, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode WHILEDES() { return getToken(MemelangParser.WHILEDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(MemelangParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(MemelangParser.PARENTESEFECHA, 0); }
		public DodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterDodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitDodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitDodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DodesContext dodes() throws RecognitionException {
		DodesContext _localctx = new DodesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dodes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(DODES);
			setState(193);
			bloco();
			setState(194);
			match(WHILEDES);
			setState(195);
			match(PARENTESEABRE);
			setState(196);
			expressao();
			setState(197);
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
		public TerminalNode SWITCHDES() { return getToken(MemelangParser.SWITCHDES, 0); }
		public TerminalNode PARENTESEABRE() { return getToken(MemelangParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(MemelangParser.PARENTESEFECHA, 0); }
		public TerminalNode CHAVESABRE() { return getToken(MemelangParser.CHAVESABRE, 0); }
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public DefaultdesContext defaultdes() {
			return getRuleContext(DefaultdesContext.class,0);
		}
		public TerminalNode CHAVESFECHA() { return getToken(MemelangParser.CHAVESFECHA, 0); }
		public SwitchdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterSwitchdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitSwitchdes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitSwitchdes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchdesContext switchdes() throws RecognitionException {
		SwitchdesContext _localctx = new SwitchdesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switchdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(SWITCHDES);
			setState(200);
			match(PARENTESEABRE);
			setState(201);
			expressao();
			setState(202);
			match(PARENTESEFECHA);
			setState(203);
			match(CHAVESABRE);
			setState(204);
			switchCase();
			setState(205);
			defaultdes();
			setState(206);
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
		public List<TerminalNode> CASE() { return getTokens(MemelangParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(MemelangParser.CASE, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> DOISPONTOS() { return getTokens(MemelangParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(MemelangParser.DOISPONTOS, i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(MemelangParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(MemelangParser.BREAK, i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(208);
				match(CASE);
				setState(209);
				expressao();
				setState(210);
				match(DOISPONTOS);
				setState(211);
				comandos();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(212);
					match(BREAK);
					}
				}

				}
				}
				setState(219);
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
		public TerminalNode DEFAULTDES() { return getToken(MemelangParser.DEFAULTDES, 0); }
		public TerminalNode DOISPONTOS() { return getToken(MemelangParser.DOISPONTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(MemelangParser.BREAK, 0); }
		public DefaultdesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultdes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterDefaultdes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitDefaultdes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitDefaultdes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultdesContext defaultdes() throws RecognitionException {
		DefaultdesContext _localctx = new DefaultdesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_defaultdes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULTDES) {
				{
				setState(220);
				match(DEFAULTDES);
				setState(221);
				match(DOISPONTOS);
				setState(222);
				comandos();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(223);
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
		public List<TerminalNode> ID() { return getTokens(MemelangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MemelangParser.ID, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MemelangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MemelangParser.VIRGULA, i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(MemelangParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(MemelangParser.IGUAL, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<MultidimensionalContext> multidimensional() {
			return getRuleContexts(MultidimensionalContext.class);
		}
		public MultidimensionalContext multidimensional(int i) {
			return getRuleContext(MultidimensionalContext.class,i);
		}
		public List<DeclaracoesArrayContext> declaracoesArray() {
			return getRuleContexts(DeclaracoesArrayContext.class);
		}
		public DeclaracoesArrayContext declaracoesArray(int i) {
			return getRuleContext(DeclaracoesArrayContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			tipo();
			setState(229);
			match(ID);
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				{
				{
				setState(230);
				match(IGUAL);
				setState(231);
				expressao();
				}
				}
				break;
			case COLCHETESABRE:
				{
				{
				setState(232);
				multidimensional();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(233);
					match(IGUAL);
					setState(234);
					declaracoesArray();
					}
				}

				}
				}
				break;
			case PONTOEVIRGULA:
			case VIRGULA:
				break;
			default:
				break;
			}
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(239);
				match(VIRGULA);
				setState(240);
				match(ID);
				setState(248);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IGUAL:
					{
					{
					setState(241);
					match(IGUAL);
					setState(242);
					expressao();
					}
					}
					break;
				case COLCHETESABRE:
					{
					{
					setState(243);
					multidimensional();
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IGUAL) {
						{
						setState(244);
						match(IGUAL);
						setState(245);
						declaracoesArray();
						}
					}

					}
					}
					break;
				case PONTOEVIRGULA:
				case VIRGULA:
					break;
				default:
					break;
				}
				}
				}
				setState(254);
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

	public static class MultidimensionalContext extends ParserRuleContext {
		public List<TerminalNode> COLCHETESABRE() { return getTokens(MemelangParser.COLCHETESABRE); }
		public TerminalNode COLCHETESABRE(int i) {
			return getToken(MemelangParser.COLCHETESABRE, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> COLCHETESFECHA() { return getTokens(MemelangParser.COLCHETESFECHA); }
		public TerminalNode COLCHETESFECHA(int i) {
			return getToken(MemelangParser.COLCHETESFECHA, i);
		}
		public MultidimensionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multidimensional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterMultidimensional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitMultidimensional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitMultidimensional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultidimensionalContext multidimensional() throws RecognitionException {
		MultidimensionalContext _localctx = new MultidimensionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multidimensional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(255);
				match(COLCHETESABRE);
				setState(256);
				expressao();
				setState(257);
				match(COLCHETESFECHA);
				}
				}
				setState(261); 
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
		public List<TerminalNode> CHAVESABRE() { return getTokens(MemelangParser.CHAVESABRE); }
		public TerminalNode CHAVESABRE(int i) {
			return getToken(MemelangParser.CHAVESABRE, i);
		}
		public List<TerminalNode> CHAVESFECHA() { return getTokens(MemelangParser.CHAVESFECHA); }
		public TerminalNode CHAVESFECHA(int i) {
			return getToken(MemelangParser.CHAVESFECHA, i);
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
		public List<TerminalNode> VIRGULA() { return getTokens(MemelangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MemelangParser.VIRGULA, i);
		}
		public DeclaracoesArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoesArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterDeclaracoesArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitDeclaracoesArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitDeclaracoesArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesArrayContext declaracoesArray() throws RecognitionException {
		DeclaracoesArrayContext _localctx = new DeclaracoesArrayContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declaracoesArray);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(CHAVESABRE);
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOS:
			case NOT:
			case BITNOT:
			case CONSTREAL:
			case CONSTINTEIRO:
			case CONSTBINARIO:
			case CONSTHEXA:
			case CONSTSTRING:
			case CONSTLOGICO:
			case PARENTESEABRE:
			case ID:
				{
				setState(264);
				subArrayDeclaracoes();
				}
				break;
			case CHAVESABRE:
				{
				setState(265);
				declaracoesArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(268);
			match(CHAVESFECHA);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					match(VIRGULA);
					setState(270);
					match(CHAVESABRE);
					setState(273);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MENOS:
					case NOT:
					case BITNOT:
					case CONSTREAL:
					case CONSTINTEIRO:
					case CONSTBINARIO:
					case CONSTHEXA:
					case CONSTSTRING:
					case CONSTLOGICO:
					case PARENTESEABRE:
					case ID:
						{
						setState(271);
						subArrayDeclaracoes();
						}
						break;
					case CHAVESABRE:
						{
						setState(272);
						declaracoesArray();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(275);
					match(CHAVESFECHA);
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public List<TerminalNode> VIRGULA() { return getTokens(MemelangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MemelangParser.VIRGULA, i);
		}
		public SubArrayDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subArrayDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterSubArrayDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitSubArrayDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitSubArrayDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubArrayDeclaracoesContext subArrayDeclaracoes() throws RecognitionException {
		SubArrayDeclaracoesContext _localctx = new SubArrayDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_subArrayDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expressao();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(283);
				match(VIRGULA);
				setState(284);
				expressao();
				}
				}
				setState(289);
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
		public TerminalNode ID() { return getToken(MemelangParser.ID, 0); }
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public AtribuicoesIncEDecContext atribuicoesIncEDec() {
			return getRuleContext(AtribuicoesIncEDecContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(MemelangParser.IGUAL, 0); }
		public Op_atrContext op_atr() {
			return getRuleContext(Op_atrContext.class,0);
		}
		public AtribuicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterAtribuicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitAtribuicoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitAtribuicoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicoesContext atribuicoes() throws RecognitionException {
		AtribuicoesContext _localctx = new AtribuicoesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atribuicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(ID);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLCHETESABRE) {
				{
				setState(291);
				multidimensional();
				}
			}

			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				{
				setState(294);
				atribuicoesIncEDec();
				}
				}
				break;
			case 2:
				{
				{
				setState(297);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IGUAL:
					{
					setState(295);
					match(IGUAL);
					}
					break;
				case MAIS:
				case MENOS:
					{
					setState(296);
					op_atr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(299);
				expressao();
				}
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

	public static class AtribuicoesIncEDecContext extends ParserRuleContext {
		public List<TerminalNode> MAIS() { return getTokens(MemelangParser.MAIS); }
		public TerminalNode MAIS(int i) {
			return getToken(MemelangParser.MAIS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(MemelangParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(MemelangParser.MENOS, i);
		}
		public AtribuicoesIncEDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicoesIncEDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterAtribuicoesIncEDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitAtribuicoesIncEDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitAtribuicoesIncEDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicoesIncEDecContext atribuicoesIncEDec() throws RecognitionException {
		AtribuicoesIncEDecContext _localctx = new AtribuicoesIncEDecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atribuicoesIncEDec);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(MAIS);
				setState(303);
				match(MAIS);
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(MENOS);
				setState(305);
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
		public TerminalNode VOID() { return getToken(MemelangParser.VOID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoComVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoComVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterTipoComVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitTipoComVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitTipoComVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoComVoidContext tipoComVoid() throws RecognitionException {
		TipoComVoidContext _localctx = new TipoComVoidContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tipoComVoid);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(VOID);
				}
				break;
			case INT:
			case STRING:
			case DOUBLE:
			case BOOL:
			case BIN:
			case HEXA:
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
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
		public TerminalNode INT() { return getToken(MemelangParser.INT, 0); }
		public TerminalNode STRING() { return getToken(MemelangParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(MemelangParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(MemelangParser.BOOL, 0); }
		public TerminalNode BIN() { return getToken(MemelangParser.BIN, 0); }
		public TerminalNode HEXA() { return getToken(MemelangParser.HEXA, 0); }
		public TerminalNode CHAR() { return getToken(MemelangParser.CHAR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << CHAR))) != 0)) ) {
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
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOT) | (1L << BITNOT))) != 0)) {
				{
				setState(314);
				op_neg();
				}
			}

			{
			setState(317);
			val_final();
			}
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIS) | (1L << MENOS) | (1L << MULTIPLICA) | (1L << DIVIDE) | (1L << MOD) | (1L << MAIORQUE) | (1L << MENORQUE) | (1L << MAIOROUIGUAL) | (1L << MENOROUIGUAL) | (1L << IDENTICO) | (1L << DIFERENTE) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << BITSHIFTRIGHT) | (1L << BITSHIFTLEFT) | (1L << BITNOT))) != 0)) {
				{
				{
				{
				setState(318);
				operations();
				}
				{
				setState(319);
				val_final();
				}
				}
				}
				setState(325);
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
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operations);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				op_rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				op_neg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				op_bitwise();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				op_arit_baixa();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
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

	public static class Op_atrContext extends ParserRuleContext {
		public TerminalNode MAIS() { return getToken(MemelangParser.MAIS, 0); }
		public TerminalNode IGUAL() { return getToken(MemelangParser.IGUAL, 0); }
		public TerminalNode MENOS() { return getToken(MemelangParser.MENOS, 0); }
		public Op_atrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_atr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterOp_atr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitOp_atr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitOp_atr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_atrContext op_atr() throws RecognitionException {
		Op_atrContext _localctx = new Op_atrContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_atr);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(MAIS);
				setState(334);
				match(IGUAL);
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(MENOS);
				setState(336);
				match(IGUAL);
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

	public static class Op_relContext extends ParserRuleContext {
		public TerminalNode MAIORQUE() { return getToken(MemelangParser.MAIORQUE, 0); }
		public TerminalNode MENORQUE() { return getToken(MemelangParser.MENORQUE, 0); }
		public TerminalNode MAIOROUIGUAL() { return getToken(MemelangParser.MAIOROUIGUAL, 0); }
		public TerminalNode MENOROUIGUAL() { return getToken(MemelangParser.MENOROUIGUAL, 0); }
		public TerminalNode IDENTICO() { return getToken(MemelangParser.IDENTICO, 0); }
		public TerminalNode DIFERENTE() { return getToken(MemelangParser.DIFERENTE, 0); }
		public Op_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterOp_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitOp_rel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitOp_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relContext op_rel() throws RecognitionException {
		Op_relContext _localctx = new Op_relContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		public TerminalNode MENOS() { return getToken(MemelangParser.MENOS, 0); }
		public TerminalNode BITNOT() { return getToken(MemelangParser.BITNOT, 0); }
		public TerminalNode NOT() { return getToken(MemelangParser.NOT, 0); }
		public Op_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterOp_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitOp_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitOp_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_negContext op_neg() throws RecognitionException {
		Op_negContext _localctx = new Op_negContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		public TerminalNode BITSHIFTLEFT() { return getToken(MemelangParser.BITSHIFTLEFT, 0); }
		public TerminalNode BITSHIFTRIGHT() { return getToken(MemelangParser.BITSHIFTRIGHT, 0); }
		public Op_bitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterOp_bitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitOp_bitwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitOp_bitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_bitwiseContext op_bitwise() throws RecognitionException {
		Op_bitwiseContext _localctx = new Op_bitwiseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		public TerminalNode MAIS() { return getToken(MemelangParser.MAIS, 0); }
		public TerminalNode DIVIDE() { return getToken(MemelangParser.DIVIDE, 0); }
		public TerminalNode MULTIPLICA() { return getToken(MemelangParser.MULTIPLICA, 0); }
		public TerminalNode MOD() { return getToken(MemelangParser.MOD, 0); }
		public Op_arit_baixaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_arit_baixa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterOp_arit_baixa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitOp_arit_baixa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitOp_arit_baixa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_arit_baixaContext op_arit_baixa() throws RecognitionException {
		Op_arit_baixaContext _localctx = new Op_arit_baixaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_op_arit_baixa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIS) | (1L << MULTIPLICA) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
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

	public static class Op_logicaContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MemelangParser.AND, 0); }
		public TerminalNode OR() { return getToken(MemelangParser.OR, 0); }
		public TerminalNode NOT() { return getToken(MemelangParser.NOT, 0); }
		public Op_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterOp_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitOp_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitOp_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logicaContext op_logica() throws RecognitionException {
		Op_logicaContext _localctx = new Op_logicaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_op_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		public TerminalNode CONSTINTEIRO() { return getToken(MemelangParser.CONSTINTEIRO, 0); }
		public TerminalNode CONSTSTRING() { return getToken(MemelangParser.CONSTSTRING, 0); }
		public TerminalNode CONSTBINARIO() { return getToken(MemelangParser.CONSTBINARIO, 0); }
		public TerminalNode CONSTHEXA() { return getToken(MemelangParser.CONSTHEXA, 0); }
		public TerminalNode CONSTLOGICO() { return getToken(MemelangParser.CONSTLOGICO, 0); }
		public TerminalNode CONSTREAL() { return getToken(MemelangParser.CONSTREAL, 0); }
		public TerminalNode ID() { return getToken(MemelangParser.ID, 0); }
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public TerminalNode PARENTESEABRE() { return getToken(MemelangParser.PARENTESEABRE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(MemelangParser.PARENTESEFECHA, 0); }
		public Val_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterVal_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitVal_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitVal_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Val_finalContext val_final() throws RecognitionException {
		Val_finalContext _localctx = new Val_finalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_val_final);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(CONSTINTEIRO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(CONSTSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(CONSTBINARIO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				match(CONSTHEXA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				match(CONSTLOGICO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(354);
				match(CONSTREAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(355);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(356);
				chamadaFuncao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(357);
				match(ID);
				setState(358);
				multidimensional();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(359);
				match(PARENTESEABRE);
				setState(360);
				expressao();
				setState(361);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0170\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\3\5\5\5d\n\5\3"+
		"\5\3\5\3\5\3\5\5\5j\n\5\7\5l\n\5\f\5\16\5o\13\5\5\5q\n\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\7\7y\n\7\f\7\16\7|\13\7\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u0091\n\13\f\13"+
		"\16\13\u0094\13\13\5\13\u0096\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009f"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a8\n\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00ba\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00d8\n\24\7\24\u00da\n\24\f\24\16\24\u00dd\13\24\3\25\3\25\3\25"+
		"\3\25\5\25\u00e3\n\25\5\25\u00e5\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u00ee\n\26\5\26\u00f0\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00f9\n\26\5\26\u00fb\n\26\7\26\u00fd\n\26\f\26\16\26\u0100\13\26"+
		"\3\27\3\27\3\27\3\27\6\27\u0106\n\27\r\27\16\27\u0107\3\30\3\30\3\30\5"+
		"\30\u010d\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u0114\n\30\3\30\3\30\7\30"+
		"\u0118\n\30\f\30\16\30\u011b\13\30\3\31\3\31\3\31\7\31\u0120\n\31\f\31"+
		"\16\31\u0123\13\31\3\32\3\32\5\32\u0127\n\32\3\32\3\32\3\32\5\32\u012c"+
		"\n\32\3\32\5\32\u012f\n\32\3\33\3\33\3\33\3\33\5\33\u0135\n\33\3\34\3"+
		"\34\5\34\u0139\n\34\3\35\3\35\3\36\5\36\u013e\n\36\3\36\3\36\3\36\3\36"+
		"\7\36\u0144\n\36\f\36\16\36\u0147\13\36\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u014e\n\37\3 \3 \3 \3 \5 \u0154\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u016e\n&\3&\2\2\'\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\b\4\2"+
		"\t\16\20\20\3\2\32\37\5\2\26\26\"\"((\3\2#$\4\2\25\25\27\31\3\2 \"\2\u0182"+
		"\2L\3\2\2\2\4N\3\2\2\2\6^\3\2\2\2\bp\3\2\2\2\nr\3\2\2\2\fz\3\2\2\2\16"+
		"\u0081\3\2\2\2\20\u0085\3\2\2\2\22\u0088\3\2\2\2\24\u0095\3\2\2\2\26\u009e"+
		"\3\2\2\2\30\u00a0\3\2\2\2\32\u00a9\3\2\2\2\34\u00ac\3\2\2\2\36\u00af\3"+
		"\2\2\2 \u00b5\3\2\2\2\"\u00c2\3\2\2\2$\u00c9\3\2\2\2&\u00db\3\2\2\2(\u00e4"+
		"\3\2\2\2*\u00e6\3\2\2\2,\u0105\3\2\2\2.\u0109\3\2\2\2\60\u011c\3\2\2\2"+
		"\62\u0124\3\2\2\2\64\u0134\3\2\2\2\66\u0138\3\2\2\28\u013a\3\2\2\2:\u013d"+
		"\3\2\2\2<\u014d\3\2\2\2>\u0153\3\2\2\2@\u0155\3\2\2\2B\u0157\3\2\2\2D"+
		"\u0159\3\2\2\2F\u015b\3\2\2\2H\u015d\3\2\2\2J\u016d\3\2\2\2LM\5\4\3\2"+
		"M\3\3\2\2\2NO\7\t\2\2OP\7>\2\2PQ\7;\2\2QR\5\b\5\2RS\7<\2\2ST\5\n\6\2T"+
		"U\5\6\4\2U\5\3\2\2\2VW\5\66\34\2WX\7>\2\2XY\7;\2\2YZ\5\b\5\2Z[\7<\2\2"+
		"[\\\5\n\6\2\\]\5\6\4\2]_\3\2\2\2^V\3\2\2\2^_\3\2\2\2_\7\3\2\2\2`a\58\35"+
		"\2ac\7>\2\2bd\5,\27\2cb\3\2\2\2cd\3\2\2\2dm\3\2\2\2ef\7\65\2\2fg\58\35"+
		"\2gi\7>\2\2hj\5,\27\2ih\3\2\2\2ij\3\2\2\2jl\3\2\2\2ke\3\2\2\2lo\3\2\2"+
		"\2mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2p`\3\2\2\2pq\3\2\2\2q\t\3\2"+
		"\2\2rs\79\2\2st\5\f\7\2tu\7:\2\2u\13\3\2\2\2vy\5\26\f\2wy\5\16\b\2xv\3"+
		"\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\r\3\2\2\2|z\3\2\2\2}\u0082"+
		"\5\20\t\2~\u0082\5*\26\2\177\u0082\5\62\32\2\u0080\u0082\5\22\n\2\u0081"+
		"}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\7\64\2\2\u0084\17\3\2\2\2\u0085\u0086\7\3\2\2\u0086"+
		"\u0087\5:\36\2\u0087\21\3\2\2\2\u0088\u0089\7>\2\2\u0089\u008a\7;\2\2"+
		"\u008a\u008b\5\24\13\2\u008b\u008c\7<\2\2\u008c\23\3\2\2\2\u008d\u0092"+
		"\5:\36\2\u008e\u008f\7\65\2\2\u008f\u0091\5:\36\2\u0090\u008e\3\2\2\2"+
		"\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\25\3\2\2\2\u0097\u009f\5\30\r\2\u0098\u009f\5\36\20\2\u0099\u009f\5 "+
		"\21\2\u009a\u009b\5\"\22\2\u009b\u009c\7\64\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009f\5$\23\2\u009e\u0097\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u0099\3\2"+
		"\2\2\u009e\u009a\3\2\2\2\u009e\u009d\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a1"+
		"\7\4\2\2\u00a1\u00a2\7;\2\2\u00a2\u00a3\5:\36\2\u00a3\u00a4\7<\2\2\u00a4"+
		"\u00a7\5\n\6\2\u00a5\u00a8\5\32\16\2\u00a6\u00a8\5\34\17\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\31\3\2\2\2\u00a9"+
		"\u00aa\7\5\2\2\u00aa\u00ab\5\n\6\2\u00ab\33\3\2\2\2\u00ac\u00ad\7\5\2"+
		"\2\u00ad\u00ae\5\30\r\2\u00ae\35\3\2\2\2\u00af\u00b0\7\6\2\2\u00b0\u00b1"+
		"\7;\2\2\u00b1\u00b2\5:\36\2\u00b2\u00b3\7<\2\2\u00b3\u00b4\5\n\6\2\u00b4"+
		"\37\3\2\2\2\u00b5\u00b6\7\7\2\2\u00b6\u00b9\7;\2\2\u00b7\u00ba\5*\26\2"+
		"\u00b8\u00ba\5\62\32\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\7\64\2\2\u00bc\u00bd\5:\36\2\u00bd\u00be\7\64\2\2"+
		"\u00be\u00bf\5\62\32\2\u00bf\u00c0\7<\2\2\u00c0\u00c1\5\n\6\2\u00c1!\3"+
		"\2\2\2\u00c2\u00c3\7\b\2\2\u00c3\u00c4\5\n\6\2\u00c4\u00c5\7\6\2\2\u00c5"+
		"\u00c6\7;\2\2\u00c6\u00c7\5:\36\2\u00c7\u00c8\7<\2\2\u00c8#\3\2\2\2\u00c9"+
		"\u00ca\7\22\2\2\u00ca\u00cb\7;\2\2\u00cb\u00cc\5:\36\2\u00cc\u00cd\7<"+
		"\2\2\u00cd\u00ce\79\2\2\u00ce\u00cf\5&\24\2\u00cf\u00d0\5(\25\2\u00d0"+
		"\u00d1\7:\2\2\u00d1%\3\2\2\2\u00d2\u00d3\7\23\2\2\u00d3\u00d4\5:\36\2"+
		"\u00d4\u00d5\7\66\2\2\u00d5\u00d7\5\f\7\2\u00d6\u00d8\7\21\2\2\u00d7\u00d6"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d2\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\'\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00de\u00df\7\24\2\2\u00df\u00e0\7\66\2\2\u00e0\u00e2"+
		"\5\f\7\2\u00e1\u00e3\7\21\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2"+
		"\u00e3\u00e5\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5)\3"+
		"\2\2\2\u00e6\u00e7\58\35\2\u00e7\u00ef\7>\2\2\u00e8\u00e9\7\63\2\2\u00e9"+
		"\u00f0\5:\36\2\u00ea\u00ed\5,\27\2\u00eb\u00ec\7\63\2\2\u00ec\u00ee\5"+
		".\30\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00e8\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00fe\3\2"+
		"\2\2\u00f1\u00f2\7\65\2\2\u00f2\u00fa\7>\2\2\u00f3\u00f4\7\63\2\2\u00f4"+
		"\u00fb\5:\36\2\u00f5\u00f8\5,\27\2\u00f6\u00f7\7\63\2\2\u00f7\u00f9\5"+
		".\30\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f3\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2"+
		"\2\2\u00fc\u00f1\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff+\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\67\2\2"+
		"\u0102\u0103\5:\36\2\u0103\u0104\78\2\2\u0104\u0106\3\2\2\2\u0105\u0101"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"-\3\2\2\2\u0109\u010c\79\2\2\u010a\u010d\5\60\31\2\u010b\u010d\5.\30\2"+
		"\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0119"+
		"\7:\2\2\u010f\u0110\7\65\2\2\u0110\u0113\79\2\2\u0111\u0114\5\60\31\2"+
		"\u0112\u0114\5.\30\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0116\7:\2\2\u0116\u0118\3\2\2\2\u0117\u010f\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a/\3\2\2\2"+
		"\u011b\u0119\3\2\2\2\u011c\u0121\5:\36\2\u011d\u011e\7\65\2\2\u011e\u0120"+
		"\5:\36\2\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\61\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\7>\2\2"+
		"\u0125\u0127\5,\27\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012e"+
		"\3\2\2\2\u0128\u012f\5\64\33\2\u0129\u012c\7\63\2\2\u012a\u012c\5> \2"+
		"\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f"+
		"\5:\36\2\u012e\u0128\3\2\2\2\u012e\u012b\3\2\2\2\u012f\63\3\2\2\2\u0130"+
		"\u0131\7\25\2\2\u0131\u0135\7\25\2\2\u0132\u0133\7\26\2\2\u0133\u0135"+
		"\7\26\2\2\u0134\u0130\3\2\2\2\u0134\u0132\3\2\2\2\u0135\65\3\2\2\2\u0136"+
		"\u0139\7\17\2\2\u0137\u0139\58\35\2\u0138\u0136\3\2\2\2\u0138\u0137\3"+
		"\2\2\2\u0139\67\3\2\2\2\u013a\u013b\t\2\2\2\u013b9\3\2\2\2\u013c\u013e"+
		"\5B\"\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0145\5J&\2\u0140\u0141\5<\37\2\u0141\u0142\5J&\2\u0142\u0144\3\2\2\2"+
		"\u0143\u0140\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146;\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014e\5@!\2\u0149\u014e"+
		"\5B\"\2\u014a\u014e\5D#\2\u014b\u014e\5F$\2\u014c\u014e\5H%\2\u014d\u0148"+
		"\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014c\3\2\2\2\u014e=\3\2\2\2\u014f\u0150\7\25\2\2\u0150\u0154\7\63\2"+
		"\2\u0151\u0152\7\26\2\2\u0152\u0154\7\63\2\2\u0153\u014f\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154?\3\2\2\2\u0155\u0156\t\3\2\2\u0156A\3\2\2\2\u0157"+
		"\u0158\t\4\2\2\u0158C\3\2\2\2\u0159\u015a\t\5\2\2\u015aE\3\2\2\2\u015b"+
		"\u015c\t\6\2\2\u015cG\3\2\2\2\u015d\u015e\t\7\2\2\u015eI\3\2\2\2\u015f"+
		"\u016e\7*\2\2\u0160\u016e\7-\2\2\u0161\u016e\7+\2\2\u0162\u016e\7,\2\2"+
		"\u0163\u016e\7.\2\2\u0164\u016e\7)\2\2\u0165\u016e\7>\2\2\u0166\u016e"+
		"\5\22\n\2\u0167\u0168\7>\2\2\u0168\u016e\5,\27\2\u0169\u016a\7;\2\2\u016a"+
		"\u016b\5:\36\2\u016b\u016c\7<\2\2\u016c\u016e\3\2\2\2\u016d\u015f\3\2"+
		"\2\2\u016d\u0160\3\2\2\2\u016d\u0161\3\2\2\2\u016d\u0162\3\2\2\2\u016d"+
		"\u0163\3\2\2\2\u016d\u0164\3\2\2\2\u016d\u0165\3\2\2\2\u016d\u0166\3\2"+
		"\2\2\u016d\u0167\3\2\2\2\u016d\u0169\3\2\2\2\u016eK\3\2\2\2\'^cimpxz\u0081"+
		"\u0092\u0095\u009e\u00a7\u00b9\u00d7\u00db\u00e2\u00e4\u00ed\u00ef\u00f8"+
		"\u00fa\u00fe\u0107\u010c\u0113\u0119\u0121\u0126\u012b\u012e\u0134\u0138"+
		"\u013d\u0145\u014d\u0153\u016d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}