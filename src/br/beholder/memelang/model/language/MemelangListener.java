package br.beholder.memelang.model.language;

// Generated from .\Memelang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MemelangParser}.
 */
public interface MemelangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MemelangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MemelangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MemelangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#funcaoInicio}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoInicio(MemelangParser.FuncaoInicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#funcaoInicio}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoInicio(MemelangParser.FuncaoInicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void enterFuncoes(MemelangParser.FuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void exitFuncoes(MemelangParser.FuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(MemelangParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(MemelangParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(MemelangParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(MemelangParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(MemelangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(MemelangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(MemelangParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(MemelangParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(MemelangParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(MemelangParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#entradaesaida}.
	 * @param ctx the parse tree
	 */
	void enterEntradaesaida(MemelangParser.EntradaesaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#entradaesaida}.
	 * @param ctx the parse tree
	 */
	void exitEntradaesaida(MemelangParser.EntradaesaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#chamadafuncaousuario}.
	 * @param ctx the parse tree
	 */
	void enterChamadafuncaousuario(MemelangParser.ChamadafuncaousuarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#chamadafuncaousuario}.
	 * @param ctx the parse tree
	 */
	void exitChamadafuncaousuario(MemelangParser.ChamadafuncaousuarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(MemelangParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(MemelangParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(MemelangParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(MemelangParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#parametrosChamada}.
	 * @param ctx the parse tree
	 */
	void enterParametrosChamada(MemelangParser.ParametrosChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#parametrosChamada}.
	 * @param ctx the parse tree
	 */
	void exitParametrosChamada(MemelangParser.ParametrosChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#condicionais}.
	 * @param ctx the parse tree
	 */
	void enterCondicionais(MemelangParser.CondicionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#condicionais}.
	 * @param ctx the parse tree
	 */
	void exitCondicionais(MemelangParser.CondicionaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#ifdes}.
	 * @param ctx the parse tree
	 */
	void enterIfdes(MemelangParser.IfdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#ifdes}.
	 * @param ctx the parse tree
	 */
	void exitIfdes(MemelangParser.IfdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#ifdeselse}.
	 * @param ctx the parse tree
	 */
	void enterIfdeselse(MemelangParser.IfdeselseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#ifdeselse}.
	 * @param ctx the parse tree
	 */
	void exitIfdeselse(MemelangParser.IfdeselseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#ifdeselseif}.
	 * @param ctx the parse tree
	 */
	void enterIfdeselseif(MemelangParser.IfdeselseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#ifdeselseif}.
	 * @param ctx the parse tree
	 */
	void exitIfdeselseif(MemelangParser.IfdeselseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#whiledes}.
	 * @param ctx the parse tree
	 */
	void enterWhiledes(MemelangParser.WhiledesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#whiledes}.
	 * @param ctx the parse tree
	 */
	void exitWhiledes(MemelangParser.WhiledesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#fordes}.
	 * @param ctx the parse tree
	 */
	void enterFordes(MemelangParser.FordesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#fordes}.
	 * @param ctx the parse tree
	 */
	void exitFordes(MemelangParser.FordesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#dodes}.
	 * @param ctx the parse tree
	 */
	void enterDodes(MemelangParser.DodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#dodes}.
	 * @param ctx the parse tree
	 */
	void exitDodes(MemelangParser.DodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#switchdes}.
	 * @param ctx the parse tree
	 */
	void enterSwitchdes(MemelangParser.SwitchdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#switchdes}.
	 * @param ctx the parse tree
	 */
	void exitSwitchdes(MemelangParser.SwitchdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(MemelangParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(MemelangParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#defaultdes}.
	 * @param ctx the parse tree
	 */
	void enterDefaultdes(MemelangParser.DefaultdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#defaultdes}.
	 * @param ctx the parse tree
	 */
	void exitDefaultdes(MemelangParser.DefaultdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(MemelangParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(MemelangParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(MemelangParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(MemelangParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#multidimensional}.
	 * @param ctx the parse tree
	 */
	void enterMultidimensional(MemelangParser.MultidimensionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#multidimensional}.
	 * @param ctx the parse tree
	 */
	void exitMultidimensional(MemelangParser.MultidimensionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#declaracoesArray}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoesArray(MemelangParser.DeclaracoesArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#declaracoesArray}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoesArray(MemelangParser.DeclaracoesArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#subArrayDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterSubArrayDeclaracoes(MemelangParser.SubArrayDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#subArrayDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitSubArrayDeclaracoes(MemelangParser.SubArrayDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#atribuicoes}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicoes(MemelangParser.AtribuicoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#atribuicoes}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicoes(MemelangParser.AtribuicoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#atribuicoesIncEDec}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicoesIncEDec(MemelangParser.AtribuicoesIncEDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#atribuicoesIncEDec}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicoesIncEDec(MemelangParser.AtribuicoesIncEDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#tipoComVoid}.
	 * @param ctx the parse tree
	 */
	void enterTipoComVoid(MemelangParser.TipoComVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#tipoComVoid}.
	 * @param ctx the parse tree
	 */
	void exitTipoComVoid(MemelangParser.TipoComVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MemelangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MemelangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(MemelangParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(MemelangParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(MemelangParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(MemelangParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#op_atr}.
	 * @param ctx the parse tree
	 */
	void enterOp_atr(MemelangParser.Op_atrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#op_atr}.
	 * @param ctx the parse tree
	 */
	void exitOp_atr(MemelangParser.Op_atrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#op_rel}.
	 * @param ctx the parse tree
	 */
	void enterOp_rel(MemelangParser.Op_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#op_rel}.
	 * @param ctx the parse tree
	 */
	void exitOp_rel(MemelangParser.Op_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#op_neg}.
	 * @param ctx the parse tree
	 */
	void enterOp_neg(MemelangParser.Op_negContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#op_neg}.
	 * @param ctx the parse tree
	 */
	void exitOp_neg(MemelangParser.Op_negContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#op_bitwise}.
	 * @param ctx the parse tree
	 */
	void enterOp_bitwise(MemelangParser.Op_bitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#op_bitwise}.
	 * @param ctx the parse tree
	 */
	void exitOp_bitwise(MemelangParser.Op_bitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#op_arit_baixa}.
	 * @param ctx the parse tree
	 */
	void enterOp_arit_baixa(MemelangParser.Op_arit_baixaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#op_arit_baixa}.
	 * @param ctx the parse tree
	 */
	void exitOp_arit_baixa(MemelangParser.Op_arit_baixaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void enterOp_logica(MemelangParser.Op_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void exitOp_logica(MemelangParser.Op_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MemelangParser#val_final}.
	 * @param ctx the parse tree
	 */
	void enterVal_final(MemelangParser.Val_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MemelangParser#val_final}.
	 * @param ctx the parse tree
	 */
	void exitVal_final(MemelangParser.Val_finalContext ctx);
}