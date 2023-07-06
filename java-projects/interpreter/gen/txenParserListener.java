// Generated from F:/github/xenFork/T-XEN-Interpreter/java-projects/interpreter/g4\txenParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link txenParser}.
 */
public interface txenParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link txenParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(txenParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link txenParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(txenParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link txenParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(txenParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link txenParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(txenParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link txenParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(txenParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link txenParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(txenParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link txenParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(txenParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link txenParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(txenParser.FloatContext ctx);
}