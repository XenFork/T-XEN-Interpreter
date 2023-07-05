package union.xenfork.interpreter.interpreter.chars;

import union.xenfork.interpreter.interpreter.abstracts.AbstractCharSequenceExpression;

import java.nio.CharBuffer;
import java.util.HashMap;

public class CharBufferExpression extends AbstractCharSequenceExpression {
    public CharBufferExpression(CharBuffer sequence) {
        super(sequence);
    }

    @Override
    public CharBuffer interpret(HashMap<String, Object> map) {
        return (CharBuffer) super.interpret(map);
    }
}
