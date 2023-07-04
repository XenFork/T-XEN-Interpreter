package union.xenfork.interpreter.interpreter.abstracts;

import union.xenfork.interpreter.interpreter.IExpression;

import java.util.HashMap;

public abstract class AbstractNumberExpression implements IExpression {
    protected Number number;

    public AbstractNumberExpression(Number number) {
        this.number = number;
    }

    public Number interpret(HashMap<String, Object> map) {
        return number;
    }
}
