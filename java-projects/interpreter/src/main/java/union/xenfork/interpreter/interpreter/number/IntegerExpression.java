package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;

public class IntegerExpression extends AbstractNumberExpression {
    public IntegerExpression(Integer number) {
        super(number);
    }

    @Override
    public Integer interpret(HashMap<String, Object> map) {
        return (Integer) super.interpret(map);
    }
}
