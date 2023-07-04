package union.xenfork.interpreter.interpreter;

import java.util.HashMap;

public interface IExpression {
    Object interpret(HashMap<String, Object> map);
}
