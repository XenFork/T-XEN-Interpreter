package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;
import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulatorExpression extends AbstractNumberExpression {
    public LongAccumulatorExpression(LongAccumulator number) {
        super(number);
    }

    @Override
    public LongAccumulator interpret(HashMap<String, Object> map) {
        return (LongAccumulator) super.interpret(map);
    }
}
