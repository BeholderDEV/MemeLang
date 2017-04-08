package br.beholder.memelang.lang;

// Generated from memelang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link memelangParser}.
 */
public interface memelangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link memelangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(memelangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(memelangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void enterFuncoes(memelangParser.FuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void exitFuncoes(memelangParser.FuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(memelangParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(memelangParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(memelangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(memelangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(memelangParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(memelangParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(memelangParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(memelangParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(memelangParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(memelangParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#parametrosChamada}.
	 * @param ctx the parse tree
	 */
	void enterParametrosChamada(memelangParser.ParametrosChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#parametrosChamada}.
	 * @param ctx the parse tree
	 */
	void exitParametrosChamada(memelangParser.ParametrosChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#condicionais}.
	 * @param ctx the parse tree
	 */
	void enterCondicionais(memelangParser.CondicionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#condicionais}.
	 * @param ctx the parse tree
	 */
	void exitCondicionais(memelangParser.CondicionaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#ifdes}.
	 * @param ctx the parse tree
	 */
	void enterIfdes(memelangParser.IfdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#ifdes}.
	 * @param ctx the parse tree
	 */
	void exitIfdes(memelangParser.IfdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#ifdeselse}.
	 * @param ctx the parse tree
	 */
	void enterIfdeselse(memelangParser.IfdeselseContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#ifdeselse}.
	 * @param ctx the parse tree
	 */
	void exitIfdeselse(memelangParser.IfdeselseContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#ifdeselseif}.
	 * @param ctx the parse tree
	 */
	void enterIfdeselseif(memelangParser.IfdeselseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#ifdeselseif}.
	 * @param ctx the parse tree
	 */
	void exitIfdeselseif(memelangParser.IfdeselseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#whiledes}.
	 * @param ctx the parse tree
	 */
	void enterWhiledes(memelangParser.WhiledesContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#whiledes}.
	 * @param ctx the parse tree
	 */
	void exitWhiledes(memelangParser.WhiledesContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#fordes}.
	 * @param ctx the parse tree
	 */
	void enterFordes(memelangParser.FordesContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#fordes}.
	 * @param ctx the parse tree
	 */
	void exitFordes(memelangParser.FordesContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#dodes}.
	 * @param ctx the parse tree
	 */
	void enterDodes(memelangParser.DodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#dodes}.
	 * @param ctx the parse tree
	 */
	void exitDodes(memelangParser.DodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#switchdes}.
	 * @param ctx the parse tree
	 */
	void enterSwitchdes(memelangParser.SwitchdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#switchdes}.
	 * @param ctx the parse tree
	 */
	void exitSwitchdes(memelangParser.SwitchdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(memelangParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(memelangParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#defaultdes}.
	 * @param ctx the parse tree
	 */
	void enterDefaultdes(memelangParser.DefaultdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#defaultdes}.
	 * @param ctx the parse tree
	 */
	void exitDefaultdes(memelangParser.DefaultdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(memelangParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(memelangParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#multidimensional}.
	 * @param ctx the parse tree
	 */
	void enterMultidimensional(memelangParser.MultidimensionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#multidimensional}.
	 * @param ctx the parse tree
	 */
	void exitMultidimensional(memelangParser.MultidimensionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#declaracoesArray}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoesArray(memelangParser.DeclaracoesArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#declaracoesArray}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoesArray(memelangParser.DeclaracoesArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#subArrayDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterSubArrayDeclaracoes(memelangParser.SubArrayDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#subArrayDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitSubArrayDeclaracoes(memelangParser.SubArrayDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#atribuicoes}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicoes(memelangParser.AtribuicoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#atribuicoes}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicoes(memelangParser.AtribuicoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#atribuicoesIncEDec}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicoesIncEDec(memelangParser.AtribuicoesIncEDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#atribuicoesIncEDec}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicoesIncEDec(memelangParser.AtribuicoesIncEDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#tipoComVoid}.
	 * @param ctx the parse tree
	 */
	void enterTipoComVoid(memelangParser.TipoComVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#tipoComVoid}.
	 * @param ctx the parse tree
	 */
	void exitTipoComVoid(memelangParser.TipoComVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(memelangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(memelangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(memelangParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(memelangParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(memelangParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(memelangParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#op_rel}.
	 * @param ctx the parse tree
	 */
	void enterOp_rel(memelangParser.Op_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#op_rel}.
	 * @param ctx the parse tree
	 */
	void exitOp_rel(memelangParser.Op_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#op_neg}.
	 * @param ctx the parse tree
	 */
	void enterOp_neg(memelangParser.Op_negContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#op_neg}.
	 * @param ctx the parse tree
	 */
	void exitOp_neg(memelangParser.Op_negContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#op_bitwise}.
	 * @param ctx the parse tree
	 */
	void enterOp_bitwise(memelangParser.Op_bitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#op_bitwise}.
	 * @param ctx the parse tree
	 */
	void exitOp_bitwise(memelangParser.Op_bitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#op_arit_baixa}.
	 * @param ctx the parse tree
	 */
	void enterOp_arit_baixa(memelangParser.Op_arit_baixaContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#op_arit_baixa}.
	 * @param ctx the parse tree
	 */
	void exitOp_arit_baixa(memelangParser.Op_arit_baixaContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void enterOp_logica(memelangParser.Op_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void exitOp_logica(memelangParser.Op_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link memelangParser#val_final}.
	 * @param ctx the parse tree
	 */
	void enterVal_final(memelangParser.Val_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link memelangParser#val_final}.
	 * @param ctx the parse tree
	 */
	void exitVal_final(memelangParser.Val_finalContext ctx);
}