package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExpression extends AbstractNumberExpression {
    public AtomicIntegerExpression(AtomicInteger number) {
        super(number);
    }

    @Override
    public AtomicInteger interpret(HashMap<String, Object> map) {
        return (AtomicInteger) super.interpret(map);
    }
}
