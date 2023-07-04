package union.xenfork.interpreter.interpreter.val;

import union.xenfork.interpreter.interpreter.IExpression;

import java.util.HashMap;

public class ValExpression extends TypeExpression {

    public ValExpression(String name, IExpression expression) {
        super(name, expression);

    }

    @Override
    public Object interpret(HashMap<String, Object> map) {
        return super.interpret(map);
    }
}
