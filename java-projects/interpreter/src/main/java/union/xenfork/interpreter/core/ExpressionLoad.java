package union.xenfork.interpreter.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ExpressionLoad {
    public static final HashMap<String, Object> global_var = new HashMap<>();
    private final HashMap<String, Object> local_var = new HashMap<>();
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
