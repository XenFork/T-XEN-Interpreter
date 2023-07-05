package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;
import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccumulatorExpression extends AbstractNumberExpression {
    public DoubleAccumulatorExpression(DoubleAccumulator number) {
        super(number);
    }

    @Override
    public DoubleAccumulator interpret(HashMap<String, Object> map) {
        return (DoubleAccumulator) super.interpret(map);
    }
}
