package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.util.HashMap;

public class ByteExpression extends AbstractNumberExpression {
    public ByteExpression(Byte number) {
        super(number);
    }

    @Override
    public Byte interpret(HashMap<String, Object> map) {
        return (Byte) super.interpret(map);
    }
}
