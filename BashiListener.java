// Generated from Bashi.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BashiParser}.
 */
public interface BashiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BashiParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(BashiParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashiParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(BashiParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BashiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BashiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashiParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(BashiParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashiParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(BashiParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashiParser#simpleCommand}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCommand(BashiParser.SimpleCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashiParser#simpleCommand}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCommand(BashiParser.SimpleCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashiParser#ifCommand}.
	 * @param ctx the parse tree
	 */
	void enterIfCommand(BashiParser.IfCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashiParser#ifCommand}.
	 * @param ctx the parse tree
	 */
	void exitIfCommand(BashiParser.IfCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashiParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(BashiParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashiParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(BashiParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BashiParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BashiParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashiParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(BashiParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashiParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(BashiParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashiParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(BashiParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashiParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(BashiParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BashiParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BashiParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BashiParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(BashiParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BashiParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(BashiParser.SimpleExpressionContext ctx);
}