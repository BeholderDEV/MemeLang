package br.beholder.memelang.model.language;
// Generated from .\Memelang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MemelangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MemelangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MemelangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MemelangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#funcaoInicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoInicio(MemelangParser.FuncaoInicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#funcoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncoes(MemelangParser.FuncoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(MemelangParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(MemelangParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(MemelangParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(MemelangParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(MemelangParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFuncao(MemelangParser.ChamadaFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#parametrosChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosChamada(MemelangParser.ParametrosChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#condicionais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionais(MemelangParser.CondicionaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#ifdes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdes(MemelangParser.IfdesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#ifdeselse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdeselse(MemelangParser.IfdeselseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#ifdeselseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdeselseif(MemelangParser.IfdeselseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#whiledes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiledes(MemelangParser.WhiledesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#fordes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFordes(MemelangParser.FordesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#dodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDodes(MemelangParser.DodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#switchdes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchdes(MemelangParser.SwitchdesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(MemelangParser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#defaultdes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultdes(MemelangParser.DefaultdesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(MemelangParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#multidimensional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultidimensional(MemelangParser.MultidimensionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#declaracoesArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoesArray(MemelangParser.DeclaracoesArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#subArrayDeclaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubArrayDeclaracoes(MemelangParser.SubArrayDeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#atribuicoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicoes(MemelangParser.AtribuicoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#atribuicoesIncEDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicoesIncEDec(MemelangParser.AtribuicoesIncEDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#tipoComVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoComVoid(MemelangParser.TipoComVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(MemelangParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(MemelangParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(MemelangParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#op_atr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_atr(MemelangParser.Op_atrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#op_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_rel(MemelangParser.Op_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#op_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_neg(MemelangParser.Op_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#op_bitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_bitwise(MemelangParser.Op_bitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#op_arit_baixa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_arit_baixa(MemelangParser.Op_arit_baixaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#op_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logica(MemelangParser.Op_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MemelangParser#val_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal_final(MemelangParser.Val_finalContext ctx);
}