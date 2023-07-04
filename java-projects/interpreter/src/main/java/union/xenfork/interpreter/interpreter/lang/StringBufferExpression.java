package union.xenfork.interpreter.interpreter.lang;

import union.xenfork.interpreter.interpreter.abstracts.AbstractCharSequenceExpression;

import java.util.HashMap;

public class StringBufferExpression extends AbstractCharSequenceExpression {
    public StringBufferExpression(StringBuffer sequence) {
        super(sequence);
    }

    @Override
    public StringBuffer interpret(HashMap<String, Object> map) {
        return (StringBuffer) super.interpret(map);
    }
}
