import org.junit.jupiter.api.Test;
import union.xenfork.utils.TooInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestTooInteger {
    @Test
    public void test() {
        StringBuilder a = new StringBuilder("9.");
        String repeat = "999999999999999".repeat(10000);
        a.append(repeat);
        a.append("E+393000");
        BigDecimal bigDecimal = new BigDecimal(a.toString());
        BigInteger bigInteger = bigDecimal.toBigInteger();
        System.out.println(bigInteger.multiply(bigInteger));
//        System.out.println(bigInteger);
    }
}
