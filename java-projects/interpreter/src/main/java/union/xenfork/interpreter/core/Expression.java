package union.xenfork.interpreter.core;

import java.util.HashMap;

/**
 * @author baka4n
 * @since 全局函数
 */
public abstract class Expression {
    public abstract Object interpreter(HashMap<String, Object> var);
}
