package union.xenfork.interpreter.records;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.*;

public class CodeBase {
    private int priority = 0;
    private CodeBase[] codeBases;
    private StringBuilder codeNote = new StringBuilder();
    public CodeBase() {
        codeBases = new CodeBase[0];

    }

    public CodeBase[] getCodeBases() {
        return codeBases;
    }

    public void add(CodeBase base) {
        codeBases = Arrays.copyOf(codeBases, codeBases.length + 1);
        codeBases[codeBases.length - 1] = base;
    }

    /**
     * @since 从语句记录
     */
    public CodeBase gen(Path get) throws IOException {
        BufferedReader br = Files.newBufferedReader(get);
        String line;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String record = "";
        while ((line = br.readLine()) != null) {
            if (count > 0) {
                if (line.endsWith("}")) {
                    count--;
                }
            }
            if (line.startsWith("for")) {
                if (count > 0)
                    record = "for";
                count++;

            } else if (line.startsWith("switch")) {
                if (count > 0)
                    record = "switch";
                count++;
            } else if (line.startsWith("while")) {
                if (count > 0)
                    record = "while";
                count++;
            }
            if (count == 0) {
                if (record.isEmpty()) {
                    sb.append(line).append("\n");
                    if (sb.toString().contains(";")) {
                        CodeBase codeBase = new CodeBase();
                        codeBase.codeNote = sb;
                        add(codeBase);
                        sb = new StringBuilder();
                    }
                } else if (record.equals("for")) {
                    ForCode forCode = new ForCode();
                    forCode.gen(sb);
                    add(forCode);
                    sb = new StringBuilder();
                } else if (record.equals("while")) {
                    WhileCode whileCode = new WhileCode();
                    whileCode.gen(sb);
                    add(whileCode);
                    sb = new StringBuilder();
                } else if (record.equals("switch")) {
                    SwitchCode switchCode = new SwitchCode();
                    switchCode.gen(sb);
                    add(switchCode);
                    sb = new StringBuilder();
                }
            }
        }
        br.close();
        return this;
    }



    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return MessageFormat.format("CodeBase'{'priority={0}, codeBases={1}, codeNote={2}'}'", priority, Arrays.toString(codeBases), codeNote);
    }
}
