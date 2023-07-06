package union.xenfork.interpreter.interpreter;

import java.util.HashMap;

public interface IExpression {
    /**
     *
     * @param map save data
     * @return value
     */
    Object interpret(HashMap<String, Object> map);
}
