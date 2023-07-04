package union.xenfork.interpreter.interpreter.abstracts;

import union.xenfork.interpreter.interpreter.IExpression;

import java.util.HashMap;

public abstract class AbstractCharSequenceExpression implements IExpression {
    protected CharSequence sequence;

    public AbstractCharSequenceExpression(CharSequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public CharSequence interpret(HashMap<String, Object> map) {
        return sequence;
    }
}
