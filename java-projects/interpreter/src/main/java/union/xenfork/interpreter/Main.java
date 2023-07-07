package union.xenfork.interpreter;

import org.objectweb.asm.ClassWriter;
import union.xenfork.interpreter.asm.TXenClassLoader;
import union.xenfork.interpreter.asm.TXenClassWrite;
import union.xenfork.interpreter.core.ExpressionLoad;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
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



    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        TXenClassWrite visit = new TXenClassWrite(
                ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS,
                "union.test"
        );
        visit.visitIntVal("age", 1);
        visit.createClass();
        for (Class<?> aClass : TXenClassLoader.classes) {
            Object o = aClass.getDeclaredConstructor().newInstance();
            Object o1 = aClass.getField("age").get(null);
            System.out.println(o1);
        }
        for (Path path : paths) {
            try {
                ExpressionLoad expressionLoad = new ExpressionLoad(path);
                expressionLoad.firstRead();
            } catch (IOException ignored) {}
        }
    }
}
