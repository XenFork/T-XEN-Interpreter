package union.xenfork.interpreter.interpreter.file;

import union.xenfork.interpreter.interpreter.IExpression;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

public class PathExpression implements IExpression {

    protected Path path;

    public PathExpression(String path) {
        if (path.contains(":")) {
            this.path = new File(path).toPath();
        } else {
            this.path = new File(System.getProperty("user.dir"), path).toPath();
        }
    }

    @Override
    public Path interpret(HashMap<String, Object> map) {
        return path;
    }
}
