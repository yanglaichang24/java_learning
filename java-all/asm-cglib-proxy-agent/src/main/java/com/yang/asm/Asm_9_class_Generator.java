package com.yang.asm;

import com.yang.MyclassLoad;
import org.junit.Test;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by yanglaichang1 on 2017/6/15.
 */
public class Asm_9_class_Generator {


    /***
     * asm new class/来一个无实现的简单类
     *
     */
    @Test
    public void asm_write_class_2_classLoad() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassWriter classWriter = new ClassWriter(0);

        // 通过visit方法确定类的头部信息
        classWriter.visit(
                Opcodes.V1_8,// java版本
                Opcodes.ACC_PUBLIC,// 类修饰符
                "com.yang.Demo", // 类的全限定名
                null,
                "java/lang/Object",
               null
        );

        //创建构造函数
        MethodVisitor mv = classWriter.visitMethod(
                Opcodes.ACC_PUBLIC,
                "<init>",
                "()V",
                null,
                null);
        mv.visitCode();

        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitMethodInsn(
                Opcodes.INVOKESPECIAL, "java/lang/Object",
                "<init>",
                "()V",
                false

        );
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(1, 1);
        mv.visitEnd();

        // 定义方法
        MethodVisitor methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC, "code", "()V",
                null, null);
        methodVisitor.visitCode();
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out",
                "Ljava/io/PrintStream;");
        methodVisitor.visitLdcInsn("I'm a Programmer,Just Coding.....");
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println",
                "(Ljava/lang/String;)V");
        methodVisitor.visitInsn(Opcodes.RETURN);
        methodVisitor.visitMaxs(2, 2);
        methodVisitor.visitEnd();
        classWriter.visitEnd();


        // 使classWriter类已经完成
        // 将classWriter转换成字节数组写到文件里面去
        byte[] data = classWriter.toByteArray();

        MyclassLoad myclassLoad = new MyclassLoad();

        Class<?> aClass = myclassLoad.defineMyClass(data, 0, data.length);

        Object o = aClass.newInstance();

        Object aClass1 = aClass.getMethod("code", null).invoke(o, null);

       /* File file = new File("D://Programmer.class");
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(data);
        fout.close();*/
    }

}
