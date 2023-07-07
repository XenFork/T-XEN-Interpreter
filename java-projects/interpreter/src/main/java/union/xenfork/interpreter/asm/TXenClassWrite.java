package union.xenfork.interpreter.asm;

import org.objectweb.asm.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.objectweb.asm.Opcodes.*;

public class TXenClassWrite extends ClassWriter {

    public static final TXenClassLoader classLoader = new TXenClassLoader();
    private final List<String> fieldName = new ArrayList<>();
    private final String name;

    public TXenClassWrite(int flags, String name) {
        super(flags);
        this.name = name.replace(".", File.separator);
        super.visit(V17, ACC_PUBLIC, this.name, null, "java/lang/Object", null);
        MethodVisitor mw =super.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
        mw.visitVarInsn(ALOAD, 0);
        mw.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        mw.visitInsn(RETURN);
        mw.visitMaxs(0, 0);
        mw.visitEnd();
    }


    public void visitIntVar(String name) {
        FieldVisitor fieldVisitor = super.visitField(ACC_PUBLIC + ACC_STATIC, name, Type.INT_TYPE.getDescriptor(), null, null);
        fieldVisitor.visitEnd();
    }
    public void visitIntVal(String name, int integer) {
        FieldVisitor fieldVisitor = super.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL, name, Type.INT_TYPE.getDescriptor(), null, integer);
        fieldVisitor.visitEnd();
    }

    public Class<?> createClass() {
        super.visitEnd();
        return classLoader.createClass(name,this);
    }
}
