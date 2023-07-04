package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;

public class ShortExpression extends AbstractNumberExpression {
    public ShortExpression(Short number) {
        super(number);
    }

    @Override
    public Short interpret(HashMap<String, Object> map) {
        return (Short) super.interpret(map);
    }
}
