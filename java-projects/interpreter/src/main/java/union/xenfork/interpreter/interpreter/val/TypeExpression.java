package union.xenfork.interpreter.interpreter.val;

import union.xenfork.interpreter.interpreter.IExpression;

import java.util.HashMap;

public class TypeExpression implements IExpression {
    protected Class<?> type;
    protected String name;
    protected IExpression expression;

    public TypeExpression(String name, IExpression expression) {
        this.name = name;
        this.expression = expression;
    }

    @Override
    public Object interpret(HashMap<String, Object> map) {
        type = expression.interpret(map).getClass();
        map.put(name, expression.interpret(map));
        return expression.interpret(map);
    }
}
