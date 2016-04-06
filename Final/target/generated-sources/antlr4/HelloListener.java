// Generated from Hello.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(HelloParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(HelloParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(HelloParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(HelloParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(HelloParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(HelloParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#asop}.
	 * @param ctx the parse tree
	 */
	void enterAsop(HelloParser.AsopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#asop}.
	 * @param ctx the parse tree
	 */
	void exitAsop(HelloParser.AsopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mdop}.
	 * @param ctx the parse tree
	 */
	void enterMdop(HelloParser.MdopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mdop}.
	 * @param ctx the parse tree
	 */
	void exitMdop(HelloParser.MdopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#adexpr}.
	 * @param ctx the parse tree
	 */
	void enterAdexpr(HelloParser.AdexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#adexpr}.
	 * @param ctx the parse tree
	 */
	void exitAdexpr(HelloParser.AdexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mdexpr}.
	 * @param ctx the parse tree
	 */
	void enterMdexpr(HelloParser.MdexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mdexpr}.
	 * @param ctx the parse tree
	 */
	void exitMdexpr(HelloParser.MdexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#negexpr}.
	 * @param ctx the parse tree
	 */
	void enterNegexpr(HelloParser.NegexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#negexpr}.
	 * @param ctx the parse tree
	 */
	void exitNegexpr(HelloParser.NegexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#incdec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIncdec_stmt(HelloParser.Incdec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#incdec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIncdec_stmt(HelloParser.Incdec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(HelloParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(HelloParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(HelloParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(HelloParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#var_dec_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec_list(HelloParser.Var_dec_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#var_dec_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec_list(HelloParser.Var_dec_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#asgn_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsgn_stmt(HelloParser.Asgn_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#asgn_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsgn_stmt(HelloParser.Asgn_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(HelloParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(HelloParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(HelloParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(HelloParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#param_list_pass}.
	 * @param ctx the parse tree
	 */
	void enterParam_list_pass(HelloParser.Param_list_passContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#param_list_pass}.
	 * @param ctx the parse tree
	 */
	void exitParam_list_pass(HelloParser.Param_list_passContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#func_dec}.
	 * @param ctx the parse tree
	 */
	void enterFunc_dec(HelloParser.Func_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#func_dec}.
	 * @param ctx the parse tree
	 */
	void exitFunc_dec(HelloParser.Func_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#param_list_rcv}.
	 * @param ctx the parse tree
	 */
	void enterParam_list_rcv(HelloParser.Param_list_rcvContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#param_list_rcv}.
	 * @param ctx the parse tree
	 */
	void exitParam_list_rcv(HelloParser.Param_list_rcvContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(HelloParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(HelloParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCond_stmt(HelloParser.Cond_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#cond_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCond_stmt(HelloParser.Cond_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(HelloParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(HelloParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stmt(HelloParser.Switch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stmt(HelloParser.Switch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_block(HelloParser.Switch_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#switch_block}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_block(HelloParser.Switch_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(HelloParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(HelloParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(HelloParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(HelloParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(HelloParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(HelloParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(HelloParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(HelloParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(HelloParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(HelloParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(HelloParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(HelloParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(HelloParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(HelloParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(HelloParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(HelloParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(HelloParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(HelloParser.TerminatorContext ctx);
}