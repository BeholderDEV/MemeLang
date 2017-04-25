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
		MENOROUIGUAL=29, IDENTICO=30, DIFERENTE=31, AND=32, OR=33, NOT=34, BITSHIFTRIGHT=35, 
		BITSHIFTLEFT=36, BITAND=37, BITOR=38, BITXOR=39, BITNOT=40, CONSTREAL=41, 
		CONSTINTEIRO=42, CONSTBINARIO=43, CONSTHEXA=44, CONSTSTRING=45, CONSTLOGICO=46, 
		CONSTCHAR=47, COMENTARIOLINHA=48, COMENTARIOMULTIPLO=49, PONTO=50, IGUAL=51, 
		PONTOEVIRGULA=52, VIRGULA=53, DOISPONTOS=54, COLCHETESABRE=55, COLCHETESFECHA=56, 
		CHAVESABRE=57, CHAVESFECHA=58, PARENTESEABRE=59, PARENTESEFECHA=60, ASPA=61, 
		ID=62, WHITESPACE=63;
	public static final int
		RULE_prog = 0, RULE_funcaoInicio = 1, RULE_funcoes = 2, RULE_parametros = 3, 
		RULE_bloco = 4, RULE_comandos = 5, RULE_comando = 6, RULE_entradaesaida = 7, 
		RULE_retorno = 8, RULE_chamadaFuncao = 9, RULE_parametrosChamada = 10, 
		RULE_condicionais = 11, RULE_ifdes = 12, RULE_ifdeselse = 13, RULE_ifdeselseif = 14, 
		RULE_whiledes = 15, RULE_fordes = 16, RULE_dodes = 17, RULE_switchdes = 18, 
		RULE_switchCase = 19, RULE_defaultdes = 20, RULE_declaracoes = 21, RULE_multidimensional = 22, 
		RULE_declaracoesArray = 23, RULE_subArrayDeclaracoes = 24, RULE_atribuicoes = 25, 
		RULE_atribuicoesIncEDec = 26, RULE_tipoComVoid = 27, RULE_tipo = 28, RULE_expressao = 29, 
		RULE_operations = 30, RULE_op_atr = 31, RULE_op_rel = 32, RULE_op_neg = 33, 
		RULE_op_bitwise = 34, RULE_op_arit_baixa = 35, RULE_op_logica = 36, RULE_val_final = 37;
	public static final String[] ruleNames = {
		"prog", "funcaoInicio", "funcoes", "parametros", "bloco", "comandos", 
		"comando", "entradaesaida", "retorno", "chamadaFuncao", "parametrosChamada", 
		"condicionais", "ifdes", "ifdeselse", "ifdeselseif", "whiledes", "fordes", 
		"dodes", "switchdes", "switchCase", "defaultdes", "declaracoes", "multidimensional", 
		"declaracoesArray", "subArrayDeclaracoes", "atribuicoes", "atribuicoesIncEDec", 
		"tipoComVoid", "tipo", "expressao", "operations", "op_atr", "op_rel", 
		"op_neg", "op_bitwise", "op_arit_baixa", "op_logica", "val_final"
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
			setState(76);
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
			setState(78);
			match(INT);
			setState(79);
			match(ID);
			setState(80);
			match(PARENTESEABRE);
			setState(81);
			parametros();
			setState(82);
			match(PARENTESEFECHA);
			setState(83);
			bloco();
			setState(84);
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
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << VOID) | (1L << CHAR))) != 0)) {
				{
				setState(86);
				tipoComVoid();
				setState(87);
				match(ID);
				setState(88);
				match(PARENTESEABRE);
				setState(89);
				parametros();
				setState(90);
				match(PARENTESEFECHA);
				setState(91);
				bloco();
				setState(92);
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
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << CHAR))) != 0)) {
				{
				setState(96);
				tipo();
				setState(97);
				match(ID);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLCHETESABRE) {
					{
					setState(98);
					multidimensional();
					}
				}

				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(101);
					match(VIRGULA);
					setState(102);
					tipo();
					setState(103);
					match(ID);
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLCHETESABRE) {
						{
						setState(104);
						multidimensional();
						}
					}

					}
					}
					setState(111);
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
			setState(114);
			match(CHAVESABRE);
			setState(115);
			comandos();
			setState(116);
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
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFREAD) | (1L << DEFWRITE) | (1L << DEFRETORNO) | (1L << IFDES) | (1L << WHILEDES) | (1L << FORDES) | (1L << DODES) | (1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << BOOL) | (1L << BIN) | (1L << HEXA) | (1L << CHAR) | (1L << SWITCHDES) | (1L << ID))) != 0)) {
				{
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IFDES:
				case WHILEDES:
				case FORDES:
				case DODES:
				case SWITCHDES:
					{
					setState(118);
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
					setState(119);
					comando();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(124);
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
		enterRule(_localctx, 12, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(125);
				retorno();
				}
				break;
			case 2:
				{
				setState(126);
				declaracoes();
				}
				break;
			case 3:
				{
				setState(127);
				atribuicoes();
				}
				break;
			case 4:
				{
				setState(128);
				chamadaFuncao();
				}
				break;
			case 5:
				{
				setState(129);
				entradaesaida();
				}
				break;
			}
			setState(132);
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
		public Val_finalContext val_final() {
			return getRuleContext(Val_finalContext.class,0);
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
		enterRule(_localctx, 14, RULE_entradaesaida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==DEFREAD || _la==DEFWRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			match(PARENTESEABRE);
			setState(136);
			val_final();
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
		enterRule(_localctx, 16, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(DEFRETORNO);
			setState(140);
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
		enterRule(_localctx, 18, RULE_chamadaFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ID);
			setState(143);
			match(PARENTESEABRE);
			setState(144);
			parametrosChamada();
			setState(145);
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
		enterRule(_localctx, 20, RULE_parametrosChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOT) | (1L << BITNOT) | (1L << CONSTREAL) | (1L << CONSTINTEIRO) | (1L << CONSTBINARIO) | (1L << CONSTHEXA) | (1L << CONSTSTRING) | (1L << CONSTLOGICO) | (1L << PARENTESEABRE) | (1L << ID))) != 0)) {
				{
				setState(147);
				expressao();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(148);
					match(VIRGULA);
					setState(149);
					expressao();
					}
					}
					setState(154);
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
		enterRule(_localctx, 22, RULE_condicionais);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFDES:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				ifdes();
				}
				break;
			case WHILEDES:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				whiledes();
				}
				break;
			case FORDES:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				fordes();
				}
				break;
			case DODES:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				dodes();
				setState(161);
				match(PONTOEVIRGULA);
				}
				break;
			case SWITCHDES:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
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
		enterRule(_localctx, 24, RULE_ifdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IFDES);
			setState(167);
			match(PARENTESEABRE);
			setState(168);
			expressao();
			setState(169);
			match(PARENTESEFECHA);
			setState(170);
			bloco();
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(171);
				ifdeselse();
				}
				break;
			case 2:
				{
				setState(172);
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
		enterRule(_localctx, 26, RULE_ifdeselse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ELSE);
			setState(176);
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
		enterRule(_localctx, 28, RULE_ifdeselseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ELSE);
			setState(179);
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
		enterRule(_localctx, 30, RULE_whiledes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WHILEDES);
			setState(182);
			match(PARENTESEABRE);
			setState(183);
			expressao();
			setState(184);
			match(PARENTESEFECHA);
			setState(185);
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
		enterRule(_localctx, 32, RULE_fordes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(FORDES);
			setState(188);
			match(PARENTESEABRE);
			setState(191);
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
				setState(189);
				declaracoes();
				}
				break;
			case ID:
				{
				setState(190);
				atribuicoes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(193);
			match(PONTOEVIRGULA);
			setState(194);
			expressao();
			setState(195);
			match(PONTOEVIRGULA);
			setState(196);
			atribuicoes();
			setState(197);
			match(PARENTESEFECHA);
			setState(198);
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
		enterRule(_localctx, 34, RULE_dodes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(DODES);
			setState(201);
			bloco();
			setState(202);
			match(WHILEDES);
			setState(203);
			match(PARENTESEABRE);
			setState(204);
			expressao();
			setState(205);
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
		enterRule(_localctx, 36, RULE_switchdes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(SWITCHDES);
			setState(208);
			match(PARENTESEABRE);
			setState(209);
			expressao();
			setState(210);
			match(PARENTESEFECHA);
			setState(211);
			match(CHAVESABRE);
			setState(212);
			switchCase();
			setState(213);
			defaultdes();
			setState(214);
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
		enterRule(_localctx, 38, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(216);
				match(CASE);
				setState(217);
				expressao();
				setState(218);
				match(DOISPONTOS);
				setState(219);
				comandos();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(220);
					match(BREAK);
					}
				}

				}
				}
				setState(227);
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
		enterRule(_localctx, 40, RULE_defaultdes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULTDES) {
				{
				setState(228);
				match(DEFAULTDES);
				setState(229);
				match(DOISPONTOS);
				setState(230);
				comandos();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK) {
					{
					setState(231);
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
		enterRule(_localctx, 42, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			tipo();
			setState(237);
			match(ID);
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				{
				{
				setState(238);
				match(IGUAL);
				setState(239);
				expressao();
				}
				}
				break;
			case COLCHETESABRE:
				{
				{
				setState(240);
				multidimensional();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(241);
					match(IGUAL);
					setState(242);
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
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(247);
				match(VIRGULA);
				setState(248);
				match(ID);
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IGUAL:
					{
					{
					setState(249);
					match(IGUAL);
					setState(250);
					expressao();
					}
					}
					break;
				case COLCHETESABRE:
					{
					{
					setState(251);
					multidimensional();
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IGUAL) {
						{
						setState(252);
						match(IGUAL);
						setState(253);
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
				setState(262);
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
		enterRule(_localctx, 44, RULE_multidimensional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				match(COLCHETESABRE);
				setState(264);
				expressao();
				setState(265);
				match(COLCHETESFECHA);
				}
				}
				setState(269); 
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
		enterRule(_localctx, 46, RULE_declaracoesArray);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(CHAVESABRE);
			setState(274);
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
				setState(272);
				subArrayDeclaracoes();
				}
				break;
			case CHAVESABRE:
				{
				setState(273);
				declaracoesArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(276);
			match(CHAVESFECHA);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					match(VIRGULA);
					setState(278);
					match(CHAVESABRE);
					setState(281);
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
						setState(279);
						subArrayDeclaracoes();
						}
						break;
					case CHAVESABRE:
						{
						setState(280);
						declaracoesArray();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(283);
					match(CHAVESFECHA);
					}
					} 
				}
				setState(289);
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
		enterRule(_localctx, 48, RULE_subArrayDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			expressao();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(291);
				match(VIRGULA);
				setState(292);
				expressao();
				}
				}
				setState(297);
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
		enterRule(_localctx, 50, RULE_atribuicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(ID);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLCHETESABRE) {
				{
				setState(299);
				multidimensional();
				}
			}

			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				{
				setState(302);
				atribuicoesIncEDec();
				}
				}
				break;
			case 2:
				{
				{
				setState(305);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IGUAL:
					{
					setState(303);
					match(IGUAL);
					}
					break;
				case MAIS:
				case MENOS:
					{
					setState(304);
					op_atr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(307);
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
		enterRule(_localctx, 52, RULE_atribuicoesIncEDec);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(MAIS);
				setState(311);
				match(MAIS);
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(MENOS);
				setState(313);
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
		enterRule(_localctx, 54, RULE_tipoComVoid);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
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
				setState(317);
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
		enterRule(_localctx, 56, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
		enterRule(_localctx, 58, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << NOT) | (1L << BITNOT))) != 0)) {
				{
				setState(322);
				op_neg();
				}
			}

			{
			setState(325);
			val_final();
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIS) | (1L << MENOS) | (1L << MULTIPLICA) | (1L << DIVIDE) | (1L << MOD) | (1L << MAIORQUE) | (1L << MENORQUE) | (1L << MAIOROUIGUAL) | (1L << MENOROUIGUAL) | (1L << IDENTICO) | (1L << DIFERENTE) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << BITSHIFTRIGHT) | (1L << BITSHIFTLEFT) | (1L << BITNOT))) != 0)) {
				{
				{
				{
				setState(326);
				operations();
				}
				{
				setState(327);
				val_final();
				}
				}
				}
				setState(333);
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
		enterRule(_localctx, 60, RULE_operations);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				op_rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				op_neg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				op_bitwise();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				op_arit_baixa();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(338);
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
		enterRule(_localctx, 62, RULE_op_atr);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(MAIS);
				setState(342);
				match(IGUAL);
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(MENOS);
				setState(344);
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
		enterRule(_localctx, 64, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		enterRule(_localctx, 66, RULE_op_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		enterRule(_localctx, 68, RULE_op_bitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		enterRule(_localctx, 70, RULE_op_arit_baixa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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
		enterRule(_localctx, 72, RULE_op_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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
		enterRule(_localctx, 74, RULE_val_final);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(CONSTINTEIRO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(CONSTSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(CONSTBINARIO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				match(CONSTHEXA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				match(CONSTLOGICO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				match(CONSTREAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(364);
				chamadaFuncao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(365);
				match(ID);
				setState(366);
				multidimensional();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(367);
				match(PARENTESEABRE);
				setState(368);
				expressao();
				setState(369);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u0178\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\5\3\5\3\5\5"+
		"\5f\n\5\3\5\3\5\3\5\3\5\5\5l\n\5\7\5n\n\5\f\5\16\5q\13\5\5\5s\n\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u0085"+
		"\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\7\f\u0099\n\f\f\f\16\f\u009c\13\f\5\f\u009e\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00a7\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00b0\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\5\22\u00c2\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00e0\n\25\7\25\u00e2\n"+
		"\25\f\25\16\25\u00e5\13\25\3\26\3\26\3\26\3\26\5\26\u00eb\n\26\5\26\u00ed"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f6\n\27\5\27\u00f8\n"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0101\n\27\5\27\u0103\n\27"+
		"\7\27\u0105\n\27\f\27\16\27\u0108\13\27\3\30\3\30\3\30\3\30\6\30\u010e"+
		"\n\30\r\30\16\30\u010f\3\31\3\31\3\31\5\31\u0115\n\31\3\31\3\31\3\31\3"+
		"\31\3\31\5\31\u011c\n\31\3\31\3\31\7\31\u0120\n\31\f\31\16\31\u0123\13"+
		"\31\3\32\3\32\3\32\7\32\u0128\n\32\f\32\16\32\u012b\13\32\3\33\3\33\5"+
		"\33\u012f\n\33\3\33\3\33\3\33\5\33\u0134\n\33\3\33\5\33\u0137\n\33\3\34"+
		"\3\34\3\34\3\34\5\34\u013d\n\34\3\35\3\35\5\35\u0141\n\35\3\36\3\36\3"+
		"\37\5\37\u0146\n\37\3\37\3\37\3\37\3\37\7\37\u014c\n\37\f\37\16\37\u014f"+
		"\13\37\3 \3 \3 \3 \3 \5 \u0156\n \3!\3!\3!\3!\5!\u015c\n!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u0176\n\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJL\2\t\3\2\3\4\4\2\13\20\22\22\3\2\34!\5"+
		"\2\30\30$$**\3\2%&\4\2\27\27\31\33\3\2\"$\2\u018a\2N\3\2\2\2\4P\3\2\2"+
		"\2\6`\3\2\2\2\br\3\2\2\2\nt\3\2\2\2\f|\3\2\2\2\16\u0084\3\2\2\2\20\u0088"+
		"\3\2\2\2\22\u008d\3\2\2\2\24\u0090\3\2\2\2\26\u009d\3\2\2\2\30\u00a6\3"+
		"\2\2\2\32\u00a8\3\2\2\2\34\u00b1\3\2\2\2\36\u00b4\3\2\2\2 \u00b7\3\2\2"+
		"\2\"\u00bd\3\2\2\2$\u00ca\3\2\2\2&\u00d1\3\2\2\2(\u00e3\3\2\2\2*\u00ec"+
		"\3\2\2\2,\u00ee\3\2\2\2.\u010d\3\2\2\2\60\u0111\3\2\2\2\62\u0124\3\2\2"+
		"\2\64\u012c\3\2\2\2\66\u013c\3\2\2\28\u0140\3\2\2\2:\u0142\3\2\2\2<\u0145"+
		"\3\2\2\2>\u0155\3\2\2\2@\u015b\3\2\2\2B\u015d\3\2\2\2D\u015f\3\2\2\2F"+
		"\u0161\3\2\2\2H\u0163\3\2\2\2J\u0165\3\2\2\2L\u0175\3\2\2\2NO\5\4\3\2"+
		"O\3\3\2\2\2PQ\7\13\2\2QR\7@\2\2RS\7=\2\2ST\5\b\5\2TU\7>\2\2UV\5\n\6\2"+
		"VW\5\6\4\2W\5\3\2\2\2XY\58\35\2YZ\7@\2\2Z[\7=\2\2[\\\5\b\5\2\\]\7>\2\2"+
		"]^\5\n\6\2^_\5\6\4\2_a\3\2\2\2`X\3\2\2\2`a\3\2\2\2a\7\3\2\2\2bc\5:\36"+
		"\2ce\7@\2\2df\5.\30\2ed\3\2\2\2ef\3\2\2\2fo\3\2\2\2gh\7\67\2\2hi\5:\36"+
		"\2ik\7@\2\2jl\5.\30\2kj\3\2\2\2kl\3\2\2\2ln\3\2\2\2mg\3\2\2\2nq\3\2\2"+
		"\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rb\3\2\2\2rs\3\2\2\2s\t\3\2"+
		"\2\2tu\7;\2\2uv\5\f\7\2vw\7<\2\2w\13\3\2\2\2x{\5\30\r\2y{\5\16\b\2zx\3"+
		"\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\r\3\2\2\2~|\3\2\2\2\177"+
		"\u0085\5\22\n\2\u0080\u0085\5,\27\2\u0081\u0085\5\64\33\2\u0082\u0085"+
		"\5\24\13\2\u0083\u0085\5\20\t\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2"+
		"\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\7\66\2\2\u0087\17\3\2\2\2\u0088\u0089\t\2\2\2\u0089"+
		"\u008a\7=\2\2\u008a\u008b\5L\'\2\u008b\u008c\7>\2\2\u008c\21\3\2\2\2\u008d"+
		"\u008e\7\5\2\2\u008e\u008f\5<\37\2\u008f\23\3\2\2\2\u0090\u0091\7@\2\2"+
		"\u0091\u0092\7=\2\2\u0092\u0093\5\26\f\2\u0093\u0094\7>\2\2\u0094\25\3"+
		"\2\2\2\u0095\u009a\5<\37\2\u0096\u0097\7\67\2\2\u0097\u0099\5<\37\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u0095\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\27\3\2\2\2\u009f\u00a7\5\32\16\2\u00a0\u00a7\5 \21"+
		"\2\u00a1\u00a7\5\"\22\2\u00a2\u00a3\5$\23\2\u00a3\u00a4\7\66\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a7\5&\24\2\u00a6\u009f\3\2\2\2\u00a6\u00a0\3\2"+
		"\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\31\3\2\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\7=\2\2\u00aa\u00ab\5<\37\2"+
		"\u00ab\u00ac\7>\2\2\u00ac\u00af\5\n\6\2\u00ad\u00b0\5\34\17\2\u00ae\u00b0"+
		"\5\36\20\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\33\3\2\2\2\u00b1\u00b2\7\7\2\2\u00b2\u00b3\5\n\6\2\u00b3\35\3\2"+
		"\2\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6\5\32\16\2\u00b6\37\3\2\2\2\u00b7"+
		"\u00b8\7\b\2\2\u00b8\u00b9\7=\2\2\u00b9\u00ba\5<\37\2\u00ba\u00bb\7>\2"+
		"\2\u00bb\u00bc\5\n\6\2\u00bc!\3\2\2\2\u00bd\u00be\7\t\2\2\u00be\u00c1"+
		"\7=\2\2\u00bf\u00c2\5,\27\2\u00c0\u00c2\5\64\33\2\u00c1\u00bf\3\2\2\2"+
		"\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\66\2\2\u00c4\u00c5"+
		"\5<\37\2\u00c5\u00c6\7\66\2\2\u00c6\u00c7\5\64\33\2\u00c7\u00c8\7>\2\2"+
		"\u00c8\u00c9\5\n\6\2\u00c9#\3\2\2\2\u00ca\u00cb\7\n\2\2\u00cb\u00cc\5"+
		"\n\6\2\u00cc\u00cd\7\b\2\2\u00cd\u00ce\7=\2\2\u00ce\u00cf\5<\37\2\u00cf"+
		"\u00d0\7>\2\2\u00d0%\3\2\2\2\u00d1\u00d2\7\24\2\2\u00d2\u00d3\7=\2\2\u00d3"+
		"\u00d4\5<\37\2\u00d4\u00d5\7>\2\2\u00d5\u00d6\7;\2\2\u00d6\u00d7\5(\25"+
		"\2\u00d7\u00d8\5*\26\2\u00d8\u00d9\7<\2\2\u00d9\'\3\2\2\2\u00da\u00db"+
		"\7\25\2\2\u00db\u00dc\5<\37\2\u00dc\u00dd\78\2\2\u00dd\u00df\5\f\7\2\u00de"+
		"\u00e0\7\23\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3"+
		"\2\2\2\u00e1\u00da\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4)\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\26\2\2"+
		"\u00e7\u00e8\78\2\2\u00e8\u00ea\5\f\7\2\u00e9\u00eb\7\23\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed+\3\2\2\2\u00ee\u00ef\5:\36\2\u00ef\u00f7\7@\2\2\u00f0"+
		"\u00f1\7\65\2\2\u00f1\u00f8\5<\37\2\u00f2\u00f5\5.\30\2\u00f3\u00f4\7"+
		"\65\2\2\u00f4\u00f6\5\60\31\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6\u00f8\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u0106\3\2\2\2\u00f9\u00fa\7\67\2\2\u00fa\u0102\7@\2\2\u00fb"+
		"\u00fc\7\65\2\2\u00fc\u0103\5<\37\2\u00fd\u0100\5.\30\2\u00fe\u00ff\7"+
		"\65\2\2\u00ff\u0101\5\60\31\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2"+
		"\u0101\u0103\3\2\2\2\u0102\u00fb\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u00f9\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107-\3\2\2\2\u0108\u0106\3\2\2\2"+
		"\u0109\u010a\79\2\2\u010a\u010b\5<\37\2\u010b\u010c\7:\2\2\u010c\u010e"+
		"\3\2\2\2\u010d\u0109\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110/\3\2\2\2\u0111\u0114\7;\2\2\u0112\u0115\5\62\32\2"+
		"\u0113\u0115\5\60\31\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0121\7<\2\2\u0117\u0118\7\67\2\2\u0118\u011b\7;\2\2\u0119"+
		"\u011c\5\62\32\2\u011a\u011c\5\60\31\2\u011b\u0119\3\2\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7<\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u0117\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\61\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0129\5<\37\2\u0125\u0126"+
		"\7\67\2\2\u0126\u0128\5<\37\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\63\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012c\u012e\7@\2\2\u012d\u012f\5.\30\2\u012e\u012d\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0136\3\2\2\2\u0130\u0137\5\66\34\2\u0131\u0134\7"+
		"\65\2\2\u0132\u0134\5@!\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0137\5<\37\2\u0136\u0130\3\2\2\2\u0136\u0133\3\2"+
		"\2\2\u0137\65\3\2\2\2\u0138\u0139\7\27\2\2\u0139\u013d\7\27\2\2\u013a"+
		"\u013b\7\30\2\2\u013b\u013d\7\30\2\2\u013c\u0138\3\2\2\2\u013c\u013a\3"+
		"\2\2\2\u013d\67\3\2\2\2\u013e\u0141\7\21\2\2\u013f\u0141\5:\36\2\u0140"+
		"\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u01419\3\2\2\2\u0142\u0143\t\3\2\2"+
		"\u0143;\3\2\2\2\u0144\u0146\5D#\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u014d\5L\'\2\u0148\u0149\5> \2\u0149\u014a"+
		"\5L\'\2\u014a\u014c\3\2\2\2\u014b\u0148\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e=\3\2\2\2\u014f\u014d\3\2\2\2"+
		"\u0150\u0156\5B\"\2\u0151\u0156\5D#\2\u0152\u0156\5F$\2\u0153\u0156\5"+
		"H%\2\u0154\u0156\5J&\2\u0155\u0150\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0152"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156?\3\2\2\2\u0157"+
		"\u0158\7\27\2\2\u0158\u015c\7\65\2\2\u0159\u015a\7\30\2\2\u015a\u015c"+
		"\7\65\2\2\u015b\u0157\3\2\2\2\u015b\u0159\3\2\2\2\u015cA\3\2\2\2\u015d"+
		"\u015e\t\4\2\2\u015eC\3\2\2\2\u015f\u0160\t\5\2\2\u0160E\3\2\2\2\u0161"+
		"\u0162\t\6\2\2\u0162G\3\2\2\2\u0163\u0164\t\7\2\2\u0164I\3\2\2\2\u0165"+
		"\u0166\t\b\2\2\u0166K\3\2\2\2\u0167\u0176\7,\2\2\u0168\u0176\7/\2\2\u0169"+
		"\u0176\7-\2\2\u016a\u0176\7.\2\2\u016b\u0176\7\60\2\2\u016c\u0176\7+\2"+
		"\2\u016d\u0176\7@\2\2\u016e\u0176\5\24\13\2\u016f\u0170\7@\2\2\u0170\u0176"+
		"\5.\30\2\u0171\u0172\7=\2\2\u0172\u0173\5<\37\2\u0173\u0174\7>\2\2\u0174"+
		"\u0176\3\2\2\2\u0175\u0167\3\2\2\2\u0175\u0168\3\2\2\2\u0175\u0169\3\2"+
		"\2\2\u0175\u016a\3\2\2\2\u0175\u016b\3\2\2\2\u0175\u016c\3\2\2\2\u0175"+
		"\u016d\3\2\2\2\u0175\u016e\3\2\2\2\u0175\u016f\3\2\2\2\u0175\u0171\3\2"+
		"\2\2\u0176M\3\2\2\2\'`ekorz|\u0084\u009a\u009d\u00a6\u00af\u00c1\u00df"+
		"\u00e3\u00ea\u00ec\u00f5\u00f7\u0100\u0102\u0106\u010f\u0114\u011b\u0121"+
		"\u0129\u012e\u0133\u0136\u013c\u0140\u0145\u014d\u0155\u015b\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}