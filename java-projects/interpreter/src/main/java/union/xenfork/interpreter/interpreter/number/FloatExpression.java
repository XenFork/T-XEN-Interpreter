package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;

public class FloatExpression extends AbstractNumberExpression {
    public FloatExpression(Float number) {
        super(number);
    }

    @Override
    public Float interpret(HashMap<String, Object> map) {
        return (Float) super.interpret(map);
    }
}
