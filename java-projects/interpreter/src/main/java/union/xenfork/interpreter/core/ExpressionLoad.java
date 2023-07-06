package union.xenfork.interpreter.core;

import javax.swing.text.Segment;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.atomic.*;

public class ExpressionLoad {
    public static final HashMap<String, Class<?>> global_type = new HashMap<>();

    static {

        global_type.put("int", int.class);
        global_type.put("string", String.class);
        global_type.put("charBuffer", CharBuffer.class);
        global_type.put("segment", Segment.class);
        global_type.put("stringBuffer", StringBuffer.class);
        global_type.put("stringBuilder", StringBuilder.class);
        global_type.put("file", File.class);
        global_type.put("path", Path.class);
        global_type.put("float", float.class);
        global_type.put("double", double.class);
        global_type.put("short", short.class);
        global_type.put("byte", byte.class);
        global_type.put("long", long.class);
        global_type.put("atomicInt", AtomicInteger.class);
        global_type.put("atomicLong", AtomicLong.class);
        global_type.put("bigDecimal", BigDecimal.class);
        global_type.put("bigInt", BigInteger.class);
        global_type.put("doubleAccumulator", DoubleAccumulator.class);
        global_type.put("doubleAdder", DoubleAdder.class);
        global_type.put("longAccumulator", LongAccumulator.class);
        global_type.put("longAdder", LongAdder.class);
    }
    public static final HashMap<String, Object> global_var = new HashMap<>();
    private final HashMap<String, Object> local_var = new HashMap<>();
    private final HashMap<String, Class<?>> local_type = new HashMap<>();
    private List<String> lines;
    public ExpressionLoad(Path path) throws IOException {
        BufferedReader br = Files.newBufferedReader(path);
        lines = br.lines().toList();
        br.close();
    }

    /**
     * @apiNote 移除注释
     */
    public void firstRead() {
        List<String> list = new ArrayList<>();
        /*
         i为多行注释判断
         */
        var ref = new Object() {
            int i = 0;
        };
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            StringBuilder temp = new StringBuilder(line);

            while (temp.toString().contains("/*")) {
                if (ref.i == 0) {
                    while (true) {
                        oneLine(temp);
                        if (temp.toString().contains("/*") && temp.toString().contains("*/")) {
                            substring(temp, "/*");
                            endSubstring(temp, "*/");
                            continue;
                        } else if (temp.toString().contains("/*")) {
                            sb.append(temp.substring(0, temp.indexOf("/*"))).append("\n");
                            substring(temp, "/*");
                            ref.i++;
                            continue;
                        } else {
                            sb.append(temp);
                        }
                        break;
                    }
                } else {
                    if (temp.toString().contains("*/")) {
                        ref.i--;
                    }
                }
            }
            list.add(sb.toString());
        }
        lines.clear();
        lines = list;
    }

    /**
     * @apiNote 判断单行注释
     * @param temp
     */
    public void oneLine(StringBuilder temp) {
        if (temp.toString().contains("//")) {
            endSubstring(temp, "//");
        }
    }

    /**
     *
     * @param clazz clazz
     * @param as display name
     * {@link ExpressionLoad#import_global(Class, String)}
     */
    public void import_(Class<?> clazz, String as) {// dsl中的# 带字符的传入局部库
        if (as != null) {
            local_type.put(as, clazz);
        } else {
            final var name = clazz.getName().split("\\.");
            local_type.put(name[name.length - 1], clazz);
        }
    }

    /**
     * @param clazz clazz
     * @param as display name
     * {@link ExpressionLoad#import_(Class, String)}
     */
    public void import_global(Class<?> clazz, String as) {//全局import
        if (as != null) {
            global_type.put(as, clazz);
        } else {
            final var name = clazz.getName().split("\\.");
            global_type.put(name[name.length - 1], clazz);
        }
    }

    public Set<String> typeKeys() {
        Set<String> set = new HashSet<>();
        set.addAll(global_type.keySet());
        set.addAll(local_type.keySet());
        return set;
    }

    public void read() {
        /* 待添加判断类型 */
        System.gc();//gc掉内存中没有被调用的map
    }

    public static void endSubstring(StringBuilder sb, String eSub) {
        String substring = sb.substring(0, sb.indexOf(eSub));
        sb.delete(0, sb.length());
        sb.append(substring);
    }

    public static void substring(StringBuilder sb, String sub) {
        String substring = sb.substring(sb.indexOf(sub) + sub.length());
        sb.delete(0, sb.length());
        sb.append(substring);
    }

}
