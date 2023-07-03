import org.junit.jupiter.api.Test;
import union.xenfork.utils.TooInteger;

public class TestTooInteger {
    @Test
    public void test() {
        TooInteger tooInteger = new TooInteger("1000000000");
        System.out.println(tooInteger);
    }
    @Test
    public void addTest() {
        TooInteger tooInteger = new TooInteger("100000000");
//        tooInteger.add(tooInteger);
        tooInteger.add(new TooInteger("900000000"));
        System.out.println(tooInteger);
    }
}
