package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * {@link AtomicLong}
 * {@link AbstractNumberExpression} is extends
 */
public class AtomicLongExpression extends AbstractNumberExpression {
    /**
     * @apiNote new
     * @param number {@link AtomicLong}
     */
    public AtomicLongExpression(AtomicLong number) {
        super(number);
    }
    /**
     * @apiNote interpret to return
     * @param map save data
     * @return {@link AtomicLong}
     */
    @Override
    public AtomicLong interpret(HashMap<String, Object> map) {
        return (AtomicLong) super.interpret(map);
    }
}
