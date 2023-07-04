package union.xenfork.interpreter.interpreter.lang;

import union.xenfork.interpreter.interpreter.abstracts.AbstractCharSequenceExpression;

import java.util.HashMap;

public class StringBuilderExpression extends AbstractCharSequenceExpression {
    public StringBuilderExpression(StringBuilder sequence) {
        super(sequence);
    }

    @Override
    public StringBuilder interpret(HashMap<String, Object> map) {
        return (StringBuilder) super.interpret(map);
    }
}
