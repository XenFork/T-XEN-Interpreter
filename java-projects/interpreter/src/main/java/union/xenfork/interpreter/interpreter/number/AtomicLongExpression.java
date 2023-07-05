package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongExpression extends AbstractNumberExpression {
    public AtomicLongExpression(AtomicLong number) {
        super(number);
    }

    @Override
    public AtomicLong interpret(HashMap<String, Object> map) {
        return (AtomicLong) super.interpret(map);
    }
}
