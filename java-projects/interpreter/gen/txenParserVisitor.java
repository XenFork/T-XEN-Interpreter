// Generated from F:/github/xenFork/T-XEN-Interpreter/java-projects/interpreter/g4\txenParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link txenParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface txenParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link txenParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(txenParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link txenParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(txenParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link txenParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(txenParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link txenParser#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(txenParser.FloatContext ctx);
}