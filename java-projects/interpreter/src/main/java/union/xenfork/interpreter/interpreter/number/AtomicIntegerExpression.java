package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * {@link AtomicInteger}
 * {@link AbstractNumberExpression} is extends
 */
public class AtomicIntegerExpression extends AbstractNumberExpression {
    /**
     * @apiNote new
     * @param number {@link AtomicInteger}
     */
    public AtomicIntegerExpression(AtomicInteger number) {
        super(number);
    }

    /**
     * @apiNote interpret to return
     * @param map save data
     * @return {@link AtomicInteger}
     */
    @Override
    public AtomicInteger interpret(HashMap<String, Object> map) {
        return (AtomicInteger) super.interpret(map);
    }
}
