package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.math.BigInteger;
import java.util.HashMap;

public class BigIntegerExpression extends AbstractNumberExpression {
    public BigIntegerExpression(BigInteger number) {
        super(number);
    }

    @Override
    public BigInteger interpret(HashMap<String, Object> map) {
        return (BigInteger) super.interpret(map);
    }
}
