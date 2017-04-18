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
		CASE=17, DEFAULTDES=18, MAIS=19, MENOS=20, MAIORQUE=21, MENORQUE=22, MAIOROUIGUAL=23, 
		MENOROUIGUAL=24, IDENTICO=25, DIFERENTE=26, AND=27, OR=28, NOT=29, BITSHIFTRIGHT=30, 
		BITSHIFTLEFT=31, BITAND=32, BITOR=33, BITXOR=34, BITNOT=35, CONSTREAL=36, 
		CONSTINTEIRO=37, CONSTBINARIO=38, CONSTHEXA=39, CONSTSTRING=40, CONSTLOGICO=41, 
		CONSTCHAR=42, COMENTARIOLINHA=43, COMENTARIOMULTIPLO=44, PONTO=45, IGUAL=46, 
		PONTOEVIRGULA=47, VIRGULA=48, DOISPONTOS=49, COLCHETESABRE=50, COLCHETESFECHA=51, 
		CHAVESABRE=52, CHAVESFECHA=53, PARENTESEABRE=54, PARENTESEFECHA=55, ASPA=56, 
		ID=57, WHITESPACE=58;
	public static final int
		RULE_prog = 0, RULE_funcaoInicio = 1, RULE_funcoes = 2, RULE_parametros = 3, 
		RULE_bloco = 4, RULE_comandos = 5, RULE_comando = 6, RULE_retorno = 7, 
		RULE_chamadaFuncao = 8, RULE_parametrosChamada = 9, RULE_condicionais = 10, 
		RULE_ifdes = 11, RULE_ifdeselse = 12, RULE_ifdeselseif = 13, RULE_whiledes = 14, 
		RULE_fordes = 15, RULE_dodes = 16, RULE_switchdes = 17, RULE_switchCase = 18, 
		RULE_defaultdes = 19, RULE_declaracoes = 20, RULE_multidimensional = 21, 
		RULE_declaracoesArray = 22, RULE_subArrayDeclaracoes = 23, RULE_atribuicoes = 24, 
		RULE_atribuicoesIncEDec = 25, RULE_tipoComVoid = 26, RULE_tipo = 27, RULE_expressao = 28, 
		RULE_operations = 29, RULE_op_rel = 30, RULE_op_neg = 31, RULE_op_bitwise = 32, 
		RULE_op_arit_baixa = 33, RULE_op_logica = 34, RULE_val_final = 35;
	public static final String[] ruleNames = {
		"prog", "funcaoInicio", "funcoes", "parametros", "bloco", "comandos", 
		"comando", "retorno", "chamadaFuncao", "parametrosChamada", "condicionais", 
		"ifdes", "ifdeselse", "ifdeselseif", "whiledes", "fordes", "dodes", "switchdes", 
		"switchCase", "defaultdes", "declaracoes", "multidimensional", "declaracoesArray", 
		"subArrayDeclaracoes", "atribuicoes", "atribuicoesIncEDec", "tipoComVoid", 
		"tipo", "expressao", "operations", "op_rel", "op_neg", "op_bitwise", "op_arit_baixa", 
		"op_logica", "val_final"
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
			setState(72);
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
		public TerminalNode VOID() { return getToken(MemelangParser.VOID, 0); }
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
			setState(74);
			match(VOID);
			setState(75);
			match(ID);
			setState(76);
			match(PARENTESEABRE);
			setState(77);
			parametros();
			setState(78);
			match(PARENTESEFECHA);
			setState(79);
			bloco();
			setState(80);
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
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << VOID) | (1L << CHAR))) != 0)) {
				{
				setState(82);
				tipoComVoid();
				setState(83);
				match(ID);
				setState(84);
				match(PARENTESEABRE);
				setState(85);
				parametros();
				setState(86);
				match(PARENTESEFECHA);
				setState(87);
				bloco();
				setState(88);
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
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
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
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << CHAR))) != 0)) {
				{
				setState(92);
				tipo();
				setState(93);
				match(ID);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLCHETESABRE) {
					{
					setState(94);
					multidimensional();
					}
				}

				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(97);
					match(VIRGULA);
					setState(98);
					tipo();
					setState(99);
					match(ID);
					}
					}
					setState(105);
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
			setState(108);
			match(CHAVESABRE);
			setState(109);
			comandos();
			setState(110);
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
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFRETORNO) | (1L << IFDES) | (1L << WHILEDES) | (1L << FORDES) | (1L << DODES) | (1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << CHAR) | (1L << SWITCHDES) | (1L << ID))) != 0)) {
				{
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IFDES:
				case WHILEDES:
				case FORDES:
				case DODES:
				case SWITCHDES:
					{
					setState(112);
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
					setState(113);
					comando();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(118);
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(119);
				retorno();
				}
				break;
			case 2:
				{
				setState(120);
				declaracoes();
				}
				break;
			case 3:
				{
				setState(121);
				atribuicoes();
				}
				break;
			case 4:
				{
				setState(122);
				chamadaFuncao();
				}
				break;
			}
			setState(125);
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
			setState(127);
			match(DEFRETORNO);
			setState(128);
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
			setState(130);
			match(ID);
			setState(131);
			match(PARENTESEABRE);
			setState(132);
			parametrosChamada();
			setState(133);
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
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOT) | (1L << BITNOT) | (1L << CONSTREAL) | (1L << CONSTINTEIRO) | (1L << CONSTBINARIO) | (1L << CONSTHEXA) | (1L << CONSTSTRING) | (1L << CONSTLOGICO) | (1L << PARENTESEABRE) | (1L << ID))) != 0)) {
				{
				setState(135);
				expressao();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(136);
					match(VIRGULA);
					setState(137);
					expressao();
					}
					}
					setState(142);
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
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFDES:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				ifdes();
				}
				break;
			case WHILEDES:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				whiledes();
				}
				break;
			case FORDES:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				fordes();
				}
				break;
			case DODES:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				dodes();
				setState(149);
				match(PONTOEVIRGULA);
				}
				break;
			case SWITCHDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
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
			setState(154);
			match(IFDES);
			setState(155);
			match(PARENTESEABRE);
			setState(156);
			expressao();
			setState(157);
			match(PARENTESEFECHA);
			setState(158);
			bloco();
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(159);
				ifdeselse();
				}
				break;
			case 2:
				{
				setState(160);
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
			setState(163);
			match(ELSE);
			setState(164);
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
			setState(166);
			match(ELSE);
			setState(167);
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
			setState(169);
			match(WHILEDES);
			setState(170);
			match(PARENTESEABRE);
			setState(171);
			expressao();
			setState(172);
			match(PARENTESEFECHA);
			setState(173);
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
			setState(175);
			match(FORDES);
			setState(176);
			match(PARENTESEABRE);
			setState(179);
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
				setState(177);
				declaracoes();
				}
				break;
			case ID:
				{
				setState(178);
				atribuicoes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(181);
			match(PONTOEVIRGULA);
			setState(182);
			expressao();
			setState(183);
			match(PONTOEVIRGULA);
			setState(184);
			atribuicoes();
			setState(185);
			match(PARENTESEFECHA);
			setState(186);
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
			setState(188);
			match(DODES);
			setState(189);
			bloco();
			setState(190);
			match(WHILEDES);
			setState(191);
			match(PARENTESEABRE);
			setState(192);
			expressao();
			setState(193);
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
			setState(195);
			match(SWITCHDES);
			setState(196);
			match(PARENTESEABRE);
			setState(197);
			expressao();
			setState(198);
			match(PARENTESEFECHA);
			setState(199);
			match(CHAVESABRE);
			setState(200);
			switchCase();
			setState(201);
			defaultdes();
			setState(202);
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
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(204);
				match(CASE);
				setState(205);
				expressao();
				setState(206);
				match(DOISPONTOS);
				setState(207);
				comandos();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(208);
					match(BREAK);
					}
				}

				}
				}
				setState(215);
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
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULTDES) {
				{
				setState(216);
				match(DEFAULTDES);
				setState(217);
				match(DOISPONTOS);
				setState(218);
				comandos();
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(219);
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
		public TerminalNode ID() { return getToken(MemelangParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(MemelangParser.IGUAL, 0); }
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
			setState(224);
			tipo();
			setState(225);
			match(ID);
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				{
				{
				setState(226);
				match(IGUAL);
				setState(227);
				expressao();
				}
				}
				break;
			case COLCHETESABRE:
				{
				{
				setState(228);
				multidimensional();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(229);
					match(IGUAL);
					setState(230);
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
		public List<TerminalNode> COLCHETESABRE() { return getTokens(MemelangParser.COLCHETESABRE); }
		public TerminalNode COLCHETESABRE(int i) {
			return getToken(MemelangParser.COLCHETESABRE, i);
		}
		public List<TerminalNode> CONSTINTEIRO() { return getTokens(MemelangParser.CONSTINTEIRO); }
		public TerminalNode CONSTINTEIRO(int i) {
			return getToken(MemelangParser.CONSTINTEIRO, i);
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
			setState(238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(235);
				match(COLCHETESABRE);
				setState(236);
				match(CONSTINTEIRO);
				setState(237);
				match(COLCHETESFECHA);
				}
				}
				setState(240); 
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(CHAVESABRE);
			setState(245);
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
				setState(243);
				subArrayDeclaracoes();
				}
				break;
			case CHAVESABRE:
				{
				setState(244);
				declaracoesArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(247);
			match(CHAVESFECHA);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(248);
				match(VIRGULA);
				setState(249);
				match(CHAVESABRE);
				setState(252);
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
					setState(250);
					subArrayDeclaracoes();
					}
					break;
				case CHAVESABRE:
					{
					setState(251);
					declaracoesArray();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(254);
				match(CHAVESFECHA);
				}
				}
				setState(260);
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
			setState(261);
			expressao();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(262);
				match(VIRGULA);
				setState(263);
				expressao();
				}
				}
				setState(268);
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
		public TerminalNode IGUAL() { return getToken(MemelangParser.IGUAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
			setState(269);
			match(ID);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLCHETESABRE) {
				{
				setState(270);
				multidimensional();
				}
			}

			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
			case MENOS:
				{
				{
				setState(273);
				atribuicoesIncEDec();
				}
				}
				break;
			case IGUAL:
				{
				{
				setState(274);
				match(IGUAL);
				setState(275);
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
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(MAIS);
				setState(279);
				match(MAIS);
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(MENOS);
				setState(281);
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
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
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
				setState(285);
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
			setState(288);
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
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOT) | (1L << BITNOT))) != 0)) {
				{
				setState(290);
				op_neg();
				}
			}

			{
			setState(293);
			val_final();
			}
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIS) | (1L << MENOS) | (1L << MAIORQUE) | (1L << MENORQUE) | (1L << MAIOROUIGUAL) | (1L << MENOROUIGUAL) | (1L << IDENTICO) | (1L << DIFERENTE) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << BITSHIFTRIGHT) | (1L << BITSHIFTLEFT) | (1L << BITNOT))) != 0)) {
				{
				{
				{
				setState(294);
				operations();
				}
				{
				setState(295);
				val_final();
				}
				}
				}
				setState(301);
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
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				op_rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				op_neg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				op_bitwise();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				op_arit_baixa();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
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
		enterRule(_localctx, 60, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		enterRule(_localctx, 62, RULE_op_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		enterRule(_localctx, 64, RULE_op_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
		enterRule(_localctx, 66, RULE_op_arit_baixa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
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
		enterRule(_localctx, 68, RULE_op_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
		enterRule(_localctx, 70, RULE_val_final);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(CONSTINTEIRO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(CONSTSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(CONSTBINARIO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(CONSTHEXA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(CONSTLOGICO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
				match(CONSTREAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(326);
				chamadaFuncao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(327);
				match(ID);
				setState(328);
				multidimensional();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(329);
				match(PARENTESEABRE);
				setState(330);
				expressao();
				setState(331);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0152\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4]\n\4\3\5\3\5\3\5\5\5b\n\5\3\5\3\5"+
		"\3\5\3\5\7\5h\n\5\f\5\16\5k\13\5\5\5m\n\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7"+
		"u\n\7\f\7\16\7x\13\7\3\b\3\b\3\b\3\b\5\b~\n\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u008d\n\13\f\13\16\13\u0090\13\13"+
		"\5\13\u0092\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009b\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00a4\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00b6\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00d4\n\24"+
		"\7\24\u00d6\n\24\f\24\16\24\u00d9\13\24\3\25\3\25\3\25\3\25\5\25\u00df"+
		"\n\25\5\25\u00e1\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ea\n"+
		"\26\5\26\u00ec\n\26\3\27\3\27\3\27\6\27\u00f1\n\27\r\27\16\27\u00f2\3"+
		"\30\3\30\3\30\5\30\u00f8\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u00ff\n\30"+
		"\3\30\3\30\7\30\u0103\n\30\f\30\16\30\u0106\13\30\3\31\3\31\3\31\7\31"+
		"\u010b\n\31\f\31\16\31\u010e\13\31\3\32\3\32\5\32\u0112\n\32\3\32\3\32"+
		"\3\32\5\32\u0117\n\32\3\33\3\33\3\33\3\33\5\33\u011d\n\33\3\34\3\34\5"+
		"\34\u0121\n\34\3\35\3\35\3\36\5\36\u0126\n\36\3\36\3\36\3\36\3\36\7\36"+
		"\u012c\n\36\f\36\16\36\u012f\13\36\3\37\3\37\3\37\3\37\3\37\5\37\u0136"+
		"\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\5%\u0150\n%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFH\2\7\4\2\t\16\20\20\3\2\27\34\5\2\26\26"+
		"\37\37%%\3\2 !\3\2\35\37\2\u015e\2J\3\2\2\2\4L\3\2\2\2\6\\\3\2\2\2\bl"+
		"\3\2\2\2\nn\3\2\2\2\fv\3\2\2\2\16}\3\2\2\2\20\u0081\3\2\2\2\22\u0084\3"+
		"\2\2\2\24\u0091\3\2\2\2\26\u009a\3\2\2\2\30\u009c\3\2\2\2\32\u00a5\3\2"+
		"\2\2\34\u00a8\3\2\2\2\36\u00ab\3\2\2\2 \u00b1\3\2\2\2\"\u00be\3\2\2\2"+
		"$\u00c5\3\2\2\2&\u00d7\3\2\2\2(\u00e0\3\2\2\2*\u00e2\3\2\2\2,\u00f0\3"+
		"\2\2\2.\u00f4\3\2\2\2\60\u0107\3\2\2\2\62\u010f\3\2\2\2\64\u011c\3\2\2"+
		"\2\66\u0120\3\2\2\28\u0122\3\2\2\2:\u0125\3\2\2\2<\u0135\3\2\2\2>\u0137"+
		"\3\2\2\2@\u0139\3\2\2\2B\u013b\3\2\2\2D\u013d\3\2\2\2F\u013f\3\2\2\2H"+
		"\u014f\3\2\2\2JK\5\4\3\2K\3\3\2\2\2LM\7\17\2\2MN\7;\2\2NO\78\2\2OP\5\b"+
		"\5\2PQ\79\2\2QR\5\n\6\2RS\5\6\4\2S\5\3\2\2\2TU\5\66\34\2UV\7;\2\2VW\7"+
		"8\2\2WX\5\b\5\2XY\79\2\2YZ\5\n\6\2Z[\5\6\4\2[]\3\2\2\2\\T\3\2\2\2\\]\3"+
		"\2\2\2]\7\3\2\2\2^_\58\35\2_a\7;\2\2`b\5,\27\2a`\3\2\2\2ab\3\2\2\2bi\3"+
		"\2\2\2cd\7\62\2\2de\58\35\2ef\7;\2\2fh\3\2\2\2gc\3\2\2\2hk\3\2\2\2ig\3"+
		"\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2l^\3\2\2\2lm\3\2\2\2m\t\3\2\2\2no"+
		"\7\66\2\2op\5\f\7\2pq\7\67\2\2q\13\3\2\2\2ru\5\26\f\2su\5\16\b\2tr\3\2"+
		"\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\r\3\2\2\2xv\3\2\2\2y~\5"+
		"\20\t\2z~\5*\26\2{~\5\62\32\2|~\5\22\n\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2"+
		"}|\3\2\2\2~\177\3\2\2\2\177\u0080\7\61\2\2\u0080\17\3\2\2\2\u0081\u0082"+
		"\7\3\2\2\u0082\u0083\5:\36\2\u0083\21\3\2\2\2\u0084\u0085\7;\2\2\u0085"+
		"\u0086\78\2\2\u0086\u0087\5\24\13\2\u0087\u0088\79\2\2\u0088\23\3\2\2"+
		"\2\u0089\u008e\5:\36\2\u008a\u008b\7\62\2\2\u008b\u008d\5:\36\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0089\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\25\3\2\2\2\u0093\u009b\5\30\r\2\u0094\u009b\5\36"+
		"\20\2\u0095\u009b\5 \21\2\u0096\u0097\5\"\22\2\u0097\u0098\7\61\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u009b\5$\23\2\u009a\u0093\3\2\2\2\u009a\u0094\3\2"+
		"\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\27\3\2\2\2\u009c\u009d\7\4\2\2\u009d\u009e\78\2\2\u009e\u009f\5:\36\2"+
		"\u009f\u00a0\79\2\2\u00a0\u00a3\5\n\6\2\u00a1\u00a4\5\32\16\2\u00a2\u00a4"+
		"\5\34\17\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a4\31\3\2\2\2\u00a5\u00a6\7\5\2\2\u00a6\u00a7\5\n\6\2\u00a7\33\3\2"+
		"\2\2\u00a8\u00a9\7\5\2\2\u00a9\u00aa\5\30\r\2\u00aa\35\3\2\2\2\u00ab\u00ac"+
		"\7\6\2\2\u00ac\u00ad\78\2\2\u00ad\u00ae\5:\36\2\u00ae\u00af\79\2\2\u00af"+
		"\u00b0\5\n\6\2\u00b0\37\3\2\2\2\u00b1\u00b2\7\7\2\2\u00b2\u00b5\78\2\2"+
		"\u00b3\u00b6\5*\26\2\u00b4\u00b6\5\62\32\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\5:\36\2"+
		"\u00b9\u00ba\7\61\2\2\u00ba\u00bb\5\62\32\2\u00bb\u00bc\79\2\2\u00bc\u00bd"+
		"\5\n\6\2\u00bd!\3\2\2\2\u00be\u00bf\7\b\2\2\u00bf\u00c0\5\n\6\2\u00c0"+
		"\u00c1\7\6\2\2\u00c1\u00c2\78\2\2\u00c2\u00c3\5:\36\2\u00c3\u00c4\79\2"+
		"\2\u00c4#\3\2\2\2\u00c5\u00c6\7\22\2\2\u00c6\u00c7\78\2\2\u00c7\u00c8"+
		"\5:\36\2\u00c8\u00c9\79\2\2\u00c9\u00ca\7\66\2\2\u00ca\u00cb\5&\24\2\u00cb"+
		"\u00cc\5(\25\2\u00cc\u00cd\7\67\2\2\u00cd%\3\2\2\2\u00ce\u00cf\7\23\2"+
		"\2\u00cf\u00d0\5:\36\2\u00d0\u00d1\7\63\2\2\u00d1\u00d3\5\f\7\2\u00d2"+
		"\u00d4\7\21\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3"+
		"\2\2\2\u00d5\u00ce\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\'\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\24\2"+
		"\2\u00db\u00dc\7\63\2\2\u00dc\u00de\5\f\7\2\u00dd\u00df\7\21\2\2\u00de"+
		"\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00da\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1)\3\2\2\2\u00e2\u00e3\58\35\2\u00e3\u00eb"+
		"\7;\2\2\u00e4\u00e5\7\60\2\2\u00e5\u00ec\5:\36\2\u00e6\u00e9\5,\27\2\u00e7"+
		"\u00e8\7\60\2\2\u00e8\u00ea\5.\30\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3"+
		"\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e4\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec+\3\2\2\2\u00ed\u00ee\7\64\2\2\u00ee\u00ef\7\'\2\2"+
		"\u00ef\u00f1\7\65\2\2\u00f0\u00ed\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3-\3\2\2\2\u00f4\u00f7\7\66\2\2\u00f5"+
		"\u00f8\5\60\31\2\u00f6\u00f8\5.\30\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0104\7\67\2\2\u00fa\u00fb\7\62\2\2\u00fb"+
		"\u00fe\7\66\2\2\u00fc\u00ff\5\60\31\2\u00fd\u00ff\5.\30\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\67\2\2"+
		"\u0101\u0103\3\2\2\2\u0102\u00fa\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105/\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u010c\5:\36\2\u0108\u0109\7\62\2\2\u0109\u010b\5:\36\2\u010a\u0108\3"+
		"\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\61\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\7;\2\2\u0110\u0112\5,\27\2"+
		"\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0116\3\2\2\2\u0113\u0117"+
		"\5\64\33\2\u0114\u0115\7\60\2\2\u0115\u0117\5:\36\2\u0116\u0113\3\2\2"+
		"\2\u0116\u0114\3\2\2\2\u0117\63\3\2\2\2\u0118\u0119\7\25\2\2\u0119\u011d"+
		"\7\25\2\2\u011a\u011b\7\26\2\2\u011b\u011d\7\26\2\2\u011c\u0118\3\2\2"+
		"\2\u011c\u011a\3\2\2\2\u011d\65\3\2\2\2\u011e\u0121\7\17\2\2\u011f\u0121"+
		"\58\35\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\67\3\2\2\2\u0122"+
		"\u0123\t\2\2\2\u01239\3\2\2\2\u0124\u0126\5@!\2\u0125\u0124\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012d\5H%\2\u0128\u0129\5<\37"+
		"\2\u0129\u012a\5H%\2\u012a\u012c\3\2\2\2\u012b\u0128\3\2\2\2\u012c\u012f"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e;\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0136\5> \2\u0131\u0136\5@!\2\u0132\u0136\5B\"\2"+
		"\u0133\u0136\5D#\2\u0134\u0136\5F$\2\u0135\u0130\3\2\2\2\u0135\u0131\3"+
		"\2\2\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"=\3\2\2\2\u0137\u0138\t\3\2\2\u0138?\3\2\2\2\u0139\u013a\t\4\2\2\u013a"+
		"A\3\2\2\2\u013b\u013c\t\5\2\2\u013cC\3\2\2\2\u013d\u013e\7\25\2\2\u013e"+
		"E\3\2\2\2\u013f\u0140\t\6\2\2\u0140G\3\2\2\2\u0141\u0150\7\'\2\2\u0142"+
		"\u0150\7*\2\2\u0143\u0150\7(\2\2\u0144\u0150\7)\2\2\u0145\u0150\7+\2\2"+
		"\u0146\u0150\7&\2\2\u0147\u0150\7;\2\2\u0148\u0150\5\22\n\2\u0149\u014a"+
		"\7;\2\2\u014a\u0150\5,\27\2\u014b\u014c\78\2\2\u014c\u014d\5:\36\2\u014d"+
		"\u014e\79\2\2\u014e\u0150\3\2\2\2\u014f\u0141\3\2\2\2\u014f\u0142\3\2"+
		"\2\2\u014f\u0143\3\2\2\2\u014f\u0144\3\2\2\2\u014f\u0145\3\2\2\2\u014f"+
		"\u0146\3\2\2\2\u014f\u0147\3\2\2\2\u014f\u0148\3\2\2\2\u014f\u0149\3\2"+
		"\2\2\u014f\u014b\3\2\2\2\u0150I\3\2\2\2!\\ailtv}\u008e\u0091\u009a\u00a3"+
		"\u00b5\u00d3\u00d7\u00de\u00e0\u00e9\u00eb\u00f2\u00f7\u00fe\u0104\u010c"+
		"\u0111\u0116\u011c\u0120\u0125\u012d\u0135\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}