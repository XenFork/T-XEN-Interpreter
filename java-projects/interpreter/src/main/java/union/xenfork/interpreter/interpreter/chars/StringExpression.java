package union.xenfork.interpreter.interpreter.chars;

import union.xenfork.interpreter.interpreter.abstracts.AbstractCharSequenceExpression;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class StringExpression extends AbstractCharSequenceExpression {
    public StringExpression(String sequence) {
        super(sequence);
    }

    @Override
    public String interpret(HashMap<String, Object> map) {
        return (String) super.interpret(map);
    }
}
