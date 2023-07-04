package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;

public class DoubleExpression extends AbstractNumberExpression {
    public DoubleExpression(Double number) {
        super(number);
    }

    @Override
    public Double interpret(HashMap<String, Object> map) {
        return (Double) super.interpret(map);
    }
}
