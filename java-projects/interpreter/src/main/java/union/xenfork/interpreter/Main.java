package union.xenfork.interpreter;

import union.xenfork.interpreter.records.CodeBase;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static final ArrayList<Path> paths = new ArrayList<>();
    public static final ArrayList<String> extensions = new ArrayList<>();

    static {
        extensions.add("xs");
        extensions.add("xen-script");
        extensions.add("xen");
    }

    public static void interpreter(Path path) throws IOException {
        //初始化解释器文本索引
        if (Files.isDirectory(path)) {
            Stream<Path> list = Files.list(path);
            for (Path path1 : list.toList()) {
                interpreter(path1);
            }
            list.close();
        } else {
            for (String extension : extensions) {
                if (path.toString().endsWith(".%s".formatted(extension)))
                    paths.add(path);
            }
        }
    }



    public static void main(String[] args) {
        try {
            interpreter(new File(System.getProperty("user.dir")).toPath().resolve("test"));
        } catch (IOException ignored) {}
        for (Path path : paths) {
            CodeBase codeBase = new CodeBase();
            try {
                codeBase.gen(path);
            } catch (IOException ignored) {}
            System.out.println(codeBase);
        }
    }
}
