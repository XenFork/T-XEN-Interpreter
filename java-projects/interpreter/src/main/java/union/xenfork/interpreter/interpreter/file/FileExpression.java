package union.xenfork.interpreter.interpreter.file;

import union.xenfork.interpreter.interpreter.IExpression;

import java.io.File;
import java.util.HashMap;

public class FileExpression implements IExpression {

    protected File file;

    public FileExpression(String path) {
        if (path.contains(":")) {
            file = new File(path);
        } else {
            file = new File(System.getProperty("user.dir"), path);
        }
    }

    @Override
    public File interpret(HashMap<String, Object> map) {
        return file;
    }
}
