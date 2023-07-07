package union.xenfork.interpreter.asm;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TXenClassLoader extends ClassLoader {
    public static final  List<Class<?>> classes = new ArrayList<>();
//    public static List<Class<?>> createClasses() {
//        List<Class<?>> classes = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            ClassWriter cw = new ClassWriter(0);
//            cw.visit(Opcodes.V1_1, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
//            MethodVisitor mw =cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
//            mw.visitVarInsn(Opcodes.ALOAD, 0);
//            mw.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
//            mw.visitInsn(Opcodes.RETURN);
//            mw.visitMaxs(1, 1);
//            mw.visitEnd();
//            TXenClassLoader classLoader = new TXenClassLoader();
//            byte[] code = cw.toByteArray();
//            Class<?> clazz = classLoader.defineClass("Class" + i, code, 0, code.length);
//            classes.add(clazz);
//        }
//        return classes;
//    }

    public Class<?> createClass(String name, ClassWriter cw) {
        byte[] code = cw.toByteArray();
        Class<?> aClass = this.defineClass(name, code, 0, code.length);
        classes.add(aClass);
        return aClass;
    }
}
