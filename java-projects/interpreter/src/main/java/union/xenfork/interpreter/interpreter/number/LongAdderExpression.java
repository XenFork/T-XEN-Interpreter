package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;
import java.util.concurrent.atomic.LongAdder;

public class LongAdderExpression extends AbstractNumberExpression {
    public LongAdderExpression(LongAdder number) {
        super(number);
    }

    @Override
    public LongAdder interpret(HashMap<String, Object> map) {
        return (LongAdder) super.interpret(map);
    }
}
