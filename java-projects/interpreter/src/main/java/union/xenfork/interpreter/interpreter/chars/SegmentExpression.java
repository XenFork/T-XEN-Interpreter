package union.xenfork.interpreter.interpreter.chars;

import union.xenfork.interpreter.interpreter.abstracts.AbstractCharSequenceExpression;

import javax.swing.text.Segment;
import java.util.HashMap;

public class SegmentExpression extends AbstractCharSequenceExpression {
    public SegmentExpression(Segment sequence) {
        super(sequence);
    }

    @Override
    public Segment interpret(HashMap<String, Object> map) {
        return (Segment) super.interpret(map);
    }
}
