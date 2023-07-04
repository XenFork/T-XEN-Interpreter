package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;

public class LongExpression extends AbstractNumberExpression {
    public LongExpression(Long number) {
        super(number);
    }

    @Override
    public Long interpret(HashMap<String, Object> map) {
        return (Long) super.interpret(map);
    }
}
