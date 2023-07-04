package union.xenfork.interpreter.interpreter.val;

import union.xenfork.interpreter.interpreter.IExpression;

import java.util.HashMap;

public class VarExpression extends TypeExpression {
    public VarExpression(String name, IExpression expression) {
        super(name, expression);
    }

    @Override
    public Object interpret(HashMap<String, Object> map) {
        return super.interpret(map);
    }
}
