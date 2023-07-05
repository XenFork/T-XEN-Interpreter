package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;
import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdderExpression extends AbstractNumberExpression {
    public DoubleAdderExpression(DoubleAdder number) {
        super(number);
    }

    @Override
    public DoubleAdder interpret(HashMap<String, Object> map) {
        return (DoubleAdder) super.interpret(map);
    }
}
