package union.xenfork.utils;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TooInteger implements Serializable {
    @Serial
    private static final long serialVersionUID = -7343907856428713228L;
//    private final Map<Integer, Integer> integerMap = new HashMap<>();//三位一存
//    public TooInteger(String integer) {
//        if (integer.length() < 4) {
//            integerMap.put(0, Integer.parseInt(integer));
//        } else {
//            StringBuilder sb = new StringBuilder();
//            for (int i = integer.length() - 1; i >= 0; i--) {
//                sb.insert(0, integer.charAt(i));
//                if (sb.length() == 3) {
//                    integerMap.put(integerMap.size(), Integer.parseInt(sb.toString()));
//                    sb = new StringBuilder();
//                }
//            }
//            if (!sb.isEmpty()) {
//                integerMap.put(integerMap.size(), Integer.parseInt(sb.toString()));
//            }
//        }
//    }
//
//    protected TooInteger(TooInteger integer) {
//        this.integerMap.putAll(integer.integerMap);
//    }
//
//    public TooInteger copy() {
//        return new TooInteger(this);
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < integerMap.size(); i++) {
//            if (i == integerMap.size() - 1) {
//                sb.insert(0, integerMap.get(i));
//            } else {
//                sb.insert(0, "%03d".formatted(integerMap.get(i)));
//            }
//        }
//        return sb.toString();
//    }
//
//    public TooInteger add(TooInteger integer) {
//        TooInteger copy = integer.copy();
//        int mod = 0;
//        int integer_ = 0;
//        for (int i = 0; i < copy.integerMap.size(); i++) {
//            int primitive;
//            integer_ = i;
//            primitive = this.integerMap.getOrDefault(i, 0);//原数
//            Integer addend = copy.integerMap.get(i);//加数
//            int i1 = primitive + addend + mod;
//            mod = i1 / 1000;
//            this.integerMap.put(i, i1 % 1000);
//        }
//        while (mod != 0) {
//            integer_++;
//            int i1 = mod + this.integerMap.getOrDefault(integer_, 0);
//            mod = i1 / 1000;
//            this.integerMap.put(integer_, i1 % 1000);
//        }
//        return this;
//    }
//
//    public TooInteger reduce(TooInteger integer) {
//        TooInteger copy = integer.copy();
//
//        return this;
//    }
}
