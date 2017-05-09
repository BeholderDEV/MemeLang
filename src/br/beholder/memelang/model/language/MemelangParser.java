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
		ASPA=62, ASPASIMPLES=63, ID=64, WHITESPACE=65;
	public static final int
		RULE_prog = 0, RULE_funcaoInicio = 1, RULE_funcoes = 2, RULE_parametros = 3, 
		RULE_parametro = 4, RULE_bloco = 5, RULE_comandos = 6, RULE_comando = 7, 
		RULE_entradaesaida = 8, RULE_retorno = 9, RULE_chamadaFuncao = 10, RULE_parametrosChamada = 11, 
		RULE_condicionais = 12, RULE_ifdes = 13, RULE_ifdeselse = 14, RULE_ifdeselseif = 15, 
		RULE_whiledes = 16, RULE_fordes = 17, RULE_dodes = 18, RULE_switchdes = 19, 
		RULE_switchCase = 20, RULE_defaultdes = 21, RULE_declaracoes = 22, RULE_declaracao = 23, 
		RULE_multidimensional = 24, RULE_declaracoesArray = 25, RULE_subArrayDeclaracoes = 26, 
		RULE_atribuicoes = 27, RULE_atribuicoesIncEDec = 28, RULE_tipoComVoid = 29, 
		RULE_tipo = 30, RULE_expressao = 31, RULE_operations = 32, RULE_op_atr = 33, 
		RULE_op_rel = 34, RULE_op_neg = 35, RULE_op_bitwise = 36, RULE_op_arit_baixa = 37, 
		RULE_op_logica = 38, RULE_val_final = 39;
	public static final String[] ruleNames = {
		"prog", "funcaoInicio", "funcoes", "parametros", "parametro", "bloco", 
		"comandos", "comando", "entradaesaida", "retorno", "chamadaFuncao", "parametrosChamada", 
		"condicionais", "ifdes", "ifdeselse", "ifdeselseif", "whiledes", "fordes", 
		"dodes", "switchdes", "switchCase", "defaultdes", "declaracoes", "declaracao", 
		"multidimensional", "declaracoesArray", "subArrayDeclaracoes", "atribuicoes", 
		"atribuicoesIncEDec", "tipoComVoid", "tipo", "expressao", "operations", 
		"op_atr", "op_rel", "op_neg", "op_bitwise", "op_arit_baixa", "op_logica", 
		"val_final"
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
		"'\"'", "'''"
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
		"CHAVESFECHA", "PARENTESEABRE", "PARENTESEFECHA", "ASPA", "ASPASIMPLES", 
		"ID", "WHITESPACE"
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
			setState(80);
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
			setState(82);
			match(INT);
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
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << VOID) | (1L << CHAR))) != 0)) {
				{
				setState(90);
				tipoComVoid();
				setState(91);
				match(ID);
				setState(92);
				match(PARENTESEABRE);
				setState(93);
				parametros();
				setState(94);
				match(PARENTESEFECHA);
				setState(95);
				bloco();
				setState(96);
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
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
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
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << CHAR))) != 0)) {
				{
				setState(100);
				parametro();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(101);
					match(VIRGULA);
					setState(102);
					parametro();
					}
					}
					setState(107);
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

	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MemelangParser.ID, 0); }
		public TerminalNode REFERENCIA() { return getToken(MemelangParser.REFERENCIA, 0); }
		public MultidimensionalContext multidimensional() {
			return getRuleContext(MultidimensionalContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			tipo();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REFERENCIA) {
				{
				setState(111);
				match(REFERENCIA);
				}
			}

			setState(114);
			match(ID);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLCHETESABRE) {
				{
				setState(115);
				multidimensional();
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
		enterRule(_localctx, 10, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(CHAVESABRE);
			setState(119);
			comandos();
			setState(120);
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
		enterRule(_localctx, 12, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (DEFREAD - 1)) | (1L << (DEFWRITE - 1)) | (1L << (DEFRETORNO - 1)) | (1L << (IFDES - 1)) | (1L << (WHILEDES - 1)) | (1L << (FORDES - 1)) | (1L << (DODES - 1)) | (1L << (INT - 1)) | (1L << (STRING - 1)) | (1L << (DOUBLE - 1)) | (1L << (BOOL - 1)) | (1L << (BIN - 1)) | (1L << (HEXA - 1)) | (1L << (CHAR - 1)) | (1L << (SWITCHDES - 1)) | (1L << (ID - 1)))) != 0)) {
				{
				setState(124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IFDES:
				case WHILEDES:
				case FORDES:
				case DODES:
				case SWITCHDES:
					{
					setState(122);
					condicionais();
					}
					break;
				case DEFREAD:
				case DEFWRITE:
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
					setState(123);
					comando();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(128);
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
		public EntradaesaidaContext entradaesaida() {
			return getRuleContext(EntradaesaidaContext.class,0);
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
		enterRule(_localctx, 14, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(129);
				retorno();
				}
				break;
			case 2:
				{
				setState(130);
				declaracoes();
				}
				break;
			case 3:
				{
				setState(131);
				atribuicoes();
				}
				break;
			case 4:
				{
				setState(132);
				chamadaFuncao();
				}
				break;
			case 5:
				{
				setState(133);
				entradaesaida();
				}
				break;
			}
			setState(136);
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

	public static class EntradaesaidaContext extends ParserRuleContext {
		public TerminalNode PARENTESEABRE() { return getToken(MemelangParser.PARENTESEABRE, 0); }
		public ParametrosChamadaContext parametrosChamada() {
			return getRuleContext(ParametrosChamadaContext.class,0);
		}
		public TerminalNode PARENTESEFECHA() { return getToken(MemelangParser.PARENTESEFECHA, 0); }
		public TerminalNode DEFREAD() { return getToken(MemelangParser.DEFREAD, 0); }
		public TerminalNode DEFWRITE() { return getToken(MemelangParser.DEFWRITE, 0); }
		public EntradaesaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entradaesaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterEntradaesaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitEntradaesaida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitEntradaesaida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntradaesaidaContext entradaesaida() throws RecognitionException {
		EntradaesaidaContext _localctx = new EntradaesaidaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_entradaesaida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==DEFREAD || _la==DEFWRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(139);
			match(PARENTESEABRE);
			setState(140);
			parametrosChamada();
			setState(141);
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
		enterRule(_localctx, 18, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(DEFRETORNO);
			setState(144);
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
		enterRule(_localctx, 20, RULE_chamadaFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ID);
			setState(147);
			match(PARENTESEABRE);
			setState(148);
			parametrosChamada();
			setState(149);
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
		enterRule(_localctx, 22, RULE_parametrosChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (MENOS - 22)) | (1L << (NOT - 22)) | (1L << (BITNOT - 22)) | (1L << (CONSTREAL - 22)) | (1L << (CONSTINTEIRO - 22)) | (1L << (CONSTBINARIO - 22)) | (1L << (CONSTHEXA - 22)) | (1L << (CONSTSTRING - 22)) | (1L << (CONSTLOGICO - 22)) | (1L << (CONSTCHAR - 22)) | (1L << (PARENTESEABRE - 22)) | (1L << (ID - 22)))) != 0)) {
				{
				setState(151);
				expressao();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(152);
					match(VIRGULA);
					setState(153);
					expressao();
					}
					}
					setState(158);
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
		enterRule(_localctx, 24, RULE_condicionais);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFDES:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				ifdes();
				}
				break;
			case WHILEDES:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				whiledes();
				}
				break;
			case FORDES:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				fordes();
				}
				break;
			case DODES:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				dodes();
				setState(165);
				match(PONTOEVIRGULA);
				}
				break;
			case SWITCHDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
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
		enterRule(_localctx, 26, RULE_ifdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(IFDES);
			setState(171);
			match(PARENTESEABRE);
			setState(172);
			expressao();
			setState(173);
			match(PARENTESEFECHA);
			setState(174);
			bloco();
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(175);
				ifdeselse();
				}
				break;
			case 2:
				{
				setState(176);
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
		enterRule(_localctx, 28, RULE_ifdeselse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ELSE);
			setState(180);
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
		enterRule(_localctx, 30, RULE_ifdeselseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(ELSE);
			setState(183);
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
		enterRule(_localctx, 32, RULE_whiledes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(WHILEDES);
			setState(186);
			match(PARENTESEABRE);
			setState(187);
			expressao();
			setState(188);
			match(PARENTESEFECHA);
			setState(189);
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
		enterRule(_localctx, 34, RULE_fordes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(FORDES);
			setState(192);
			match(PARENTESEABRE);
			setState(195);
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
				setState(193);
				declaracoes();
				}
				break;
			case ID:
				{
				setState(194);
				atribuicoes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(197);
			match(PONTOEVIRGULA);
			setState(198);
			expressao();
			setState(199);
			match(PONTOEVIRGULA);
			setState(200);
			atribuicoes();
			setState(201);
			match(PARENTESEFECHA);
			setState(202);
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
		enterRule(_localctx, 36, RULE_dodes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(DODES);
			setState(205);
			bloco();
			setState(206);
			match(WHILEDES);
			setState(207);
			match(PARENTESEABRE);
			setState(208);
			expressao();
			setState(209);
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
		enterRule(_localctx, 38, RULE_switchdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(SWITCHDES);
			setState(212);
			match(PARENTESEABRE);
			setState(213);
			expressao();
			setState(214);
			match(PARENTESEFECHA);
			setState(215);
			match(CHAVESABRE);
			setState(216);
			switchCase();
			setState(217);
			defaultdes();
			setState(218);
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
		enterRule(_localctx, 40, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(220);
				match(CASE);
				setState(221);
				expressao();
				setState(222);
				match(DOISPONTOS);
				setState(223);
				comandos();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(224);
					match(BREAK);
					}
				}

				}
				}
				setState(231);
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
		enterRule(_localctx, 42, RULE_defaultdes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULTDES) {
				{
				setState(232);
				match(DEFAULTDES);
				setState(233);
				match(DOISPONTOS);
				setState(234);
				comandos();
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(235);
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
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MemelangParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MemelangParser.VIRGULA, i);
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
		enterRule(_localctx, 44, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			tipo();
			setState(241);
			declaracao();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(242);
				match(VIRGULA);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(243);
					declaracao();
					}
				}

				}
				}
				setState(250);
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

	public static class DeclaracaoContext extends ParserRuleContext {
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
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MemelangListener ) ((MemelangListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MemelangVisitor ) return ((MemelangVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ID);
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				{
				{
				setState(252);
				match(IGUAL);
				setState(253);
				expressao();
				}
				}
				break;
			case COLCHETESABRE:
				{
				{
				setState(254);
				multidimensional();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(255);
					match(IGUAL);
					setState(256);
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
		enterRule(_localctx, 48, RULE_multidimensional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(261);
				match(COLCHETESABRE);
				setState(262);
				expressao();
				setState(263);
				match(COLCHETESFECHA);
				}
				}
				setState(267); 
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
		enterRule(_localctx, 50, RULE_declaracoesArray);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(CHAVESABRE);
			setState(272);
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
			case CONSTCHAR:
			case PARENTESEABRE:
			case ID:
				{
				setState(270);
				subArrayDeclaracoes();
				}
				break;
			case CHAVESABRE:
				{
				setState(271);
				declaracoesArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(274);
			match(CHAVESFECHA);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(275);
					match(VIRGULA);
					setState(276);
					match(CHAVESABRE);
					setState(279);
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
					case CONSTCHAR:
					case PARENTESEABRE:
					case ID:
						{
						setState(277);
						subArrayDeclaracoes();
						}
						break;
					case CHAVESABRE:
						{
						setState(278);
						declaracoesArray();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(281);
					match(CHAVESFECHA);
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 52, RULE_subArrayDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			expressao();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(289);
				match(VIRGULA);
				setState(290);
				expressao();
				}
				}
				setState(295);
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
		enterRule(_localctx, 54, RULE_atribuicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ID);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLCHETESABRE) {
				{
				setState(297);
				multidimensional();
				}
			}

			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				{
				setState(300);
				atribuicoesIncEDec();
				}
				}
				break;
			case 2:
				{
				{
				setState(303);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IGUAL:
					{
					setState(301);
					match(IGUAL);
					}
					break;
				case MAIS:
				case MENOS:
					{
					setState(302);
					op_atr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(305);
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
		enterRule(_localctx, 56, RULE_atribuicoesIncEDec);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(MAIS);
				setState(309);
				match(MAIS);
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(MENOS);
				setState(311);
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
		enterRule(_localctx, 58, RULE_tipoComVoid);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
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
				setState(315);
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
		enterRule(_localctx, 60, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
		enterRule(_localctx, 62, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOT) | (1L << BITNOT))) != 0)) {
				{
				setState(320);
				op_neg();
				}
			}

			{
			setState(323);
			val_final();
			}
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIS) | (1L << MENOS) | (1L << MULTIPLICA) | (1L << DIVIDE) | (1L << MOD) | (1L << MAIORQUE) | (1L << MENORQUE) | (1L << MAIOROUIGUAL) | (1L << MENOROUIGUAL) | (1L << IDENTICO) | (1L << DIFERENTE) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << BITSHIFTRIGHT) | (1L << BITSHIFTLEFT) | (1L << BITNOT))) != 0)) {
				{
				{
				{
				setState(324);
				operations();
				}
				{
				setState(325);
				val_final();
				}
				}
				}
				setState(331);
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
		enterRule(_localctx, 64, RULE_operations);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				op_rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				op_neg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				op_bitwise();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				op_arit_baixa();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
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
		enterRule(_localctx, 66, RULE_op_atr);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(MAIS);
				setState(340);
				match(IGUAL);
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(MENOS);
				setState(342);
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
		enterRule(_localctx, 68, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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
		enterRule(_localctx, 70, RULE_op_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		enterRule(_localctx, 72, RULE_op_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		enterRule(_localctx, 74, RULE_op_arit_baixa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		enterRule(_localctx, 76, RULE_op_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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
		public TerminalNode CONSTCHAR() { return getToken(MemelangParser.CONSTCHAR, 0); }
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
		enterRule(_localctx, 78, RULE_val_final);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(CONSTINTEIRO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(CONSTSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(CONSTBINARIO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				match(CONSTHEXA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				match(CONSTCHAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(360);
				match(CONSTLOGICO);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(361);
				match(CONSTREAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(362);
				match(ID);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(363);
				chamadaFuncao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(364);
				match(ID);
				setState(365);
				multidimensional();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(366);
				match(PARENTESEABRE);
				setState(367);
				expressao();
				setState(368);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u0177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4e\n\4\3"+
		"\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\5\5o\n\5\3\6\3\6\5\6s\n\6\3\6\3\6\5"+
		"\6w\n\6\3\7\3\7\3\7\3\7\3\b\3\b\7\b\177\n\b\f\b\16\b\u0082\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0089\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u009d\n\r\f\r\16\r\u00a0\13\r\5\r"+
		"\u00a2\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ab\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00b4\n\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00c6\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00e4\n\26\7\26\u00e6\n\26\f\26\16\26\u00e9\13\26\3\27\3\27\3\27\3\27"+
		"\5\27\u00ef\n\27\5\27\u00f1\n\27\3\30\3\30\3\30\3\30\5\30\u00f7\n\30\7"+
		"\30\u00f9\n\30\f\30\16\30\u00fc\13\30\3\31\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u0104\n\31\5\31\u0106\n\31\3\32\3\32\3\32\3\32\6\32\u010c\n\32\r\32"+
		"\16\32\u010d\3\33\3\33\3\33\5\33\u0113\n\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u011a\n\33\3\33\3\33\7\33\u011e\n\33\f\33\16\33\u0121\13\33\3\34\3"+
		"\34\3\34\7\34\u0126\n\34\f\34\16\34\u0129\13\34\3\35\3\35\5\35\u012d\n"+
		"\35\3\35\3\35\3\35\5\35\u0132\n\35\3\35\5\35\u0135\n\35\3\36\3\36\3\36"+
		"\3\36\5\36\u013b\n\36\3\37\3\37\5\37\u013f\n\37\3 \3 \3!\5!\u0144\n!\3"+
		"!\3!\3!\3!\7!\u014a\n!\f!\16!\u014d\13!\3\"\3\"\3\"\3\"\3\"\5\"\u0154"+
		"\n\"\3#\3#\3#\3#\5#\u015a\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0175\n)\3)\2\2*\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\t\3\2\3\4"+
		"\4\2\13\20\22\22\3\2\34!\5\2\30\30$$++\3\2&\'\4\2\27\27\31\33\3\2\"$\2"+
		"\u0186\2R\3\2\2\2\4T\3\2\2\2\6d\3\2\2\2\bn\3\2\2\2\np\3\2\2\2\fx\3\2\2"+
		"\2\16\u0080\3\2\2\2\20\u0088\3\2\2\2\22\u008c\3\2\2\2\24\u0091\3\2\2\2"+
		"\26\u0094\3\2\2\2\30\u00a1\3\2\2\2\32\u00aa\3\2\2\2\34\u00ac\3\2\2\2\36"+
		"\u00b5\3\2\2\2 \u00b8\3\2\2\2\"\u00bb\3\2\2\2$\u00c1\3\2\2\2&\u00ce\3"+
		"\2\2\2(\u00d5\3\2\2\2*\u00e7\3\2\2\2,\u00f0\3\2\2\2.\u00f2\3\2\2\2\60"+
		"\u00fd\3\2\2\2\62\u010b\3\2\2\2\64\u010f\3\2\2\2\66\u0122\3\2\2\28\u012a"+
		"\3\2\2\2:\u013a\3\2\2\2<\u013e\3\2\2\2>\u0140\3\2\2\2@\u0143\3\2\2\2B"+
		"\u0153\3\2\2\2D\u0159\3\2\2\2F\u015b\3\2\2\2H\u015d\3\2\2\2J\u015f\3\2"+
		"\2\2L\u0161\3\2\2\2N\u0163\3\2\2\2P\u0174\3\2\2\2RS\5\4\3\2S\3\3\2\2\2"+
		"TU\7\13\2\2UV\7B\2\2VW\7>\2\2WX\5\b\5\2XY\7?\2\2YZ\5\f\7\2Z[\5\6\4\2["+
		"\5\3\2\2\2\\]\5<\37\2]^\7B\2\2^_\7>\2\2_`\5\b\5\2`a\7?\2\2ab\5\f\7\2b"+
		"c\5\6\4\2ce\3\2\2\2d\\\3\2\2\2de\3\2\2\2e\7\3\2\2\2fk\5\n\6\2gh\78\2\2"+
		"hj\5\n\6\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2"+
		"nf\3\2\2\2no\3\2\2\2o\t\3\2\2\2pr\5> \2qs\7%\2\2rq\3\2\2\2rs\3\2\2\2s"+
		"t\3\2\2\2tv\7B\2\2uw\5\62\32\2vu\3\2\2\2vw\3\2\2\2w\13\3\2\2\2xy\7<\2"+
		"\2yz\5\16\b\2z{\7=\2\2{\r\3\2\2\2|\177\5\32\16\2}\177\5\20\t\2~|\3\2\2"+
		"\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\17\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0089\5\24\13\2\u0084\u0089\5.\30"+
		"\2\u0085\u0089\58\35\2\u0086\u0089\5\26\f\2\u0087\u0089\5\22\n\2\u0088"+
		"\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\67\2\2\u008b"+
		"\21\3\2\2\2\u008c\u008d\t\2\2\2\u008d\u008e\7>\2\2\u008e\u008f\5\30\r"+
		"\2\u008f\u0090\7?\2\2\u0090\23\3\2\2\2\u0091\u0092\7\5\2\2\u0092\u0093"+
		"\5@!\2\u0093\25\3\2\2\2\u0094\u0095\7B\2\2\u0095\u0096\7>\2\2\u0096\u0097"+
		"\5\30\r\2\u0097\u0098\7?\2\2\u0098\27\3\2\2\2\u0099\u009e\5@!\2\u009a"+
		"\u009b\78\2\2\u009b\u009d\5@!\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2"+
		"\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\31\3\2\2\2\u00a3"+
		"\u00ab\5\34\17\2\u00a4\u00ab\5\"\22\2\u00a5\u00ab\5$\23\2\u00a6\u00a7"+
		"\5&\24\2\u00a7\u00a8\7\67\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00ab\5(\25\2"+
		"\u00aa\u00a3\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6"+
		"\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\33\3\2\2\2\u00ac\u00ad\7\6\2\2\u00ad"+
		"\u00ae\7>\2\2\u00ae\u00af\5@!\2\u00af\u00b0\7?\2\2\u00b0\u00b3\5\f\7\2"+
		"\u00b1\u00b4\5\36\20\2\u00b2\u00b4\5 \21\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\7\7\2\2\u00b6"+
		"\u00b7\5\f\7\2\u00b7\37\3\2\2\2\u00b8\u00b9\7\7\2\2\u00b9\u00ba\5\34\17"+
		"\2\u00ba!\3\2\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd\7>\2\2\u00bd\u00be\5"+
		"@!\2\u00be\u00bf\7?\2\2\u00bf\u00c0\5\f\7\2\u00c0#\3\2\2\2\u00c1\u00c2"+
		"\7\t\2\2\u00c2\u00c5\7>\2\2\u00c3\u00c6\5.\30\2\u00c4\u00c6\58\35\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\67"+
		"\2\2\u00c8\u00c9\5@!\2\u00c9\u00ca\7\67\2\2\u00ca\u00cb\58\35\2\u00cb"+
		"\u00cc\7?\2\2\u00cc\u00cd\5\f\7\2\u00cd%\3\2\2\2\u00ce\u00cf\7\n\2\2\u00cf"+
		"\u00d0\5\f\7\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d3\5@!"+
		"\2\u00d3\u00d4\7?\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\7\24\2\2\u00d6\u00d7"+
		"\7>\2\2\u00d7\u00d8\5@!\2\u00d8\u00d9\7?\2\2\u00d9\u00da\7<\2\2\u00da"+
		"\u00db\5*\26\2\u00db\u00dc\5,\27\2\u00dc\u00dd\7=\2\2\u00dd)\3\2\2\2\u00de"+
		"\u00df\7\25\2\2\u00df\u00e0\5@!\2\u00e0\u00e1\79\2\2\u00e1\u00e3\5\16"+
		"\b\2\u00e2\u00e4\7\23\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00de\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8+\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb"+
		"\7\26\2\2\u00eb\u00ec\79\2\2\u00ec\u00ee\5\16\b\2\u00ed\u00ef\7\23\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ea"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1-\3\2\2\2\u00f2\u00f3\5> \2\u00f3\u00fa"+
		"\5\60\31\2\u00f4\u00f6\78\2\2\u00f5\u00f7\5\60\31\2\u00f6\u00f5\3\2\2"+
		"\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9\u00fc"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb/\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u0105\7B\2\2\u00fe\u00ff\7\66\2\2\u00ff\u0106\5@"+
		"!\2\u0100\u0103\5\62\32\2\u0101\u0102\7\66\2\2\u0102\u0104\5\64\33\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u00fe\3\2"+
		"\2\2\u0105\u0100\3\2\2\2\u0105\u0106\3\2\2\2\u0106\61\3\2\2\2\u0107\u0108"+
		"\7:\2\2\u0108\u0109\5@!\2\u0109\u010a\7;\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u0107\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\63\3\2\2\2\u010f\u0112\7<\2\2\u0110\u0113\5\66\34\2\u0111\u0113"+
		"\5\64\33\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2"+
		"\u0114\u011f\7=\2\2\u0115\u0116\78\2\2\u0116\u0119\7<\2\2\u0117\u011a"+
		"\5\66\34\2\u0118\u011a\5\64\33\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2"+
		"\2\u011a\u011b\3\2\2\2\u011b\u011c\7=\2\2\u011c\u011e\3\2\2\2\u011d\u0115"+
		"\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\65\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0127\5@!\2\u0123\u0124\78\2\2\u0124"+
		"\u0126\5@!\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2"+
		"\2\u0127\u0128\3\2\2\2\u0128\67\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c"+
		"\7B\2\2\u012b\u012d\5\62\32\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2"+
		"\u012d\u0134\3\2\2\2\u012e\u0135\5:\36\2\u012f\u0132\7\66\2\2\u0130\u0132"+
		"\5D#\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0135\5@!\2\u0134\u012e\3\2\2\2\u0134\u0131\3\2\2\2\u01359\3\2\2\2\u0136"+
		"\u0137\7\27\2\2\u0137\u013b\7\27\2\2\u0138\u0139\7\30\2\2\u0139\u013b"+
		"\7\30\2\2\u013a\u0136\3\2\2\2\u013a\u0138\3\2\2\2\u013b;\3\2\2\2\u013c"+
		"\u013f\7\21\2\2\u013d\u013f\5> \2\u013e\u013c\3\2\2\2\u013e\u013d\3\2"+
		"\2\2\u013f=\3\2\2\2\u0140\u0141\t\3\2\2\u0141?\3\2\2\2\u0142\u0144\5H"+
		"%\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u014b\5P)\2\u0146\u0147\5B\"\2\u0147\u0148\5P)\2\u0148\u014a\3\2\2\2"+
		"\u0149\u0146\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014cA\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0154\5F$\2\u014f\u0154"+
		"\5H%\2\u0150\u0154\5J&\2\u0151\u0154\5L\'\2\u0152\u0154\5N(\2\u0153\u014e"+
		"\3\2\2\2\u0153\u014f\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0152\3\2\2\2\u0154C\3\2\2\2\u0155\u0156\7\27\2\2\u0156\u015a\7\66\2"+
		"\2\u0157\u0158\7\30\2\2\u0158\u015a\7\66\2\2\u0159\u0155\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015aE\3\2\2\2\u015b\u015c\t\4\2\2\u015cG\3\2\2\2\u015d"+
		"\u015e\t\5\2\2\u015eI\3\2\2\2\u015f\u0160\t\6\2\2\u0160K\3\2\2\2\u0161"+
		"\u0162\t\7\2\2\u0162M\3\2\2\2\u0163\u0164\t\b\2\2\u0164O\3\2\2\2\u0165"+
		"\u0175\7-\2\2\u0166\u0175\7\60\2\2\u0167\u0175\7.\2\2\u0168\u0175\7/\2"+
		"\2\u0169\u0175\7\62\2\2\u016a\u0175\7\61\2\2\u016b\u0175\7,\2\2\u016c"+
		"\u0175\7B\2\2\u016d\u0175\5\26\f\2\u016e\u016f\7B\2\2\u016f\u0175\5\62"+
		"\32\2\u0170\u0171\7>\2\2\u0171\u0172\5@!\2\u0172\u0173\7?\2\2\u0173\u0175"+
		"\3\2\2\2\u0174\u0165\3\2\2\2\u0174\u0166\3\2\2\2\u0174\u0167\3\2\2\2\u0174"+
		"\u0168\3\2\2\2\u0174\u0169\3\2\2\2\u0174\u016a\3\2\2\2\u0174\u016b\3\2"+
		"\2\2\u0174\u016c\3\2\2\2\u0174\u016d\3\2\2\2\u0174\u016e\3\2\2\2\u0174"+
		"\u0170\3\2\2\2\u0175Q\3\2\2\2&dknrv~\u0080\u0088\u009e\u00a1\u00aa\u00b3"+
		"\u00c5\u00e3\u00e7\u00ee\u00f0\u00f6\u00fa\u0103\u0105\u010d\u0112\u0119"+
		"\u011f\u0127\u012c\u0131\u0134\u013a\u013e\u0143\u014b\u0153\u0159\u0174";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}