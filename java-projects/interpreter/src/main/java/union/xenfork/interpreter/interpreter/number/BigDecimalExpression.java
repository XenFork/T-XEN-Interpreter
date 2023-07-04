package union.xenfork.interpreter.interpreter.number;

import union.xenfork.interpreter.interpreter.abstracts.AbstractNumberExpression;

import java.math.BigDecimal;
import java.util.HashMap;

public class BigDecimalExpression extends AbstractNumberExpression {
    public BigDecimalExpression(Number number) {
        super(number);
    }

    @Override
    public BigDecimal interpret(HashMap<String, Object> map) {
        return (BigDecimal) super.interpret(map);
    }
}
