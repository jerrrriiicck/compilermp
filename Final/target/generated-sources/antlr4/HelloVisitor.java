// Generated from Hello.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(HelloParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(HelloParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(HelloParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#asop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsop(HelloParser.AsopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#mdop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdop(HelloParser.MdopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HelloParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#adexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdexpr(HelloParser.AdexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#mdexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdexpr(HelloParser.MdexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#negexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegexpr(HelloParser.NegexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#incdec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncdec_stmt(HelloParser.Incdec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op(HelloParser.Cond_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#cs_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCs_op(HelloParser.Cs_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec(HelloParser.Var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#var_dec_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec_list(HelloParser.Var_dec_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#asgn_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsgn_stmt(HelloParser.Asgn_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(HelloParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(HelloParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#param_list_pass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list_pass(HelloParser.Param_list_passContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#func_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_dec(HelloParser.Func_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#param_list_rcv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list_rcv(HelloParser.Param_list_rcvContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(HelloParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#cond_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_stmt(HelloParser.Cond_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(HelloParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#switch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stmt(HelloParser.Switch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#switch_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_block(HelloParser.Switch_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(HelloParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(HelloParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(HelloParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(HelloParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(HelloParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(HelloParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(HelloParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(HelloParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#terminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminator(HelloParser.TerminatorContext ctx);
}