package com.yang.asm;

import com.yang.MyclassLoad;
import org.junit.Test;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**

 JNI（Java Native Interface）的签名用于唯一确定一个Java方法，以便在本地代码中正确地引用和调用它。JNI签名遵循特定的规则，用于描述方法的参数类型和返回类型。

 下面是一些JNI签名的例子：

 基本类型签名：

 Z：代表boolean类型
 B：代表byte类型
 C：代表char类型
 S：代表short类型
 I：代表int类型
 J：代表long类型
 F：代表float类型
 D：代表double类型
 引用类型签名：

 对于Java对象，签名以L开头，后面跟着全限定类名（用/分隔而不是.或_），最后以;结束。例如，String类型的签名是Ljava/lang/String;。
 数组类型也是引用类型。数组签名以[开头，后面跟着数组元素类型的签名。例如，int[]的签名是[I，Object[]的签名是[Ljava/lang/Object;，二维数组如int[][]的签名是[[I。
 方法签名：

 方法签名由参数类型签名列表（用括号括起来，参数之间无空格或逗号分隔）和返回值类型签名组成。例如：

 * `void myMethod(int a, String b)`的签名是`(ILjava/lang/String;)V`，其中`V`代表`void`返回类型。
 * `long anotherMethod(String[] arr, boolean flag)`的签名是`([Ljava/lang/String;Z)J`。
 *
 请注意，在JNI签名中，函数名并不包含在内，因为签名用于唯一标识方法的参数和返回类型，而函数名在Java中不是唯一的（可以有重载的方法）。

 这些签名用于在本地代码中通过JNI调用Java方法，或者从Java代码中调用本地方法。确保在使用JNI时正确地构造和使用这些签名，以避免运行时错误或未定义的行为。

 *
 * Created by yanglaichang1 on 2017/6/16.
 */
public class Asm_9_Api_Test {

    @Test
    public void asm_write_Inf_file() throws IOException {
        ClassWriter cw = new ClassWriter(0);

        cw.visit(Opcodes.V1_8,
                Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT + Opcodes.ACC_INTERFACE,
                "com/yang/Comparable",
                null,
                "java/lang/Object",
                new String[] { "com/yang/DemoInf" });

        cw.visitField(
                Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC,
                "LESS", "I",
                null,
                new Integer(-1)).visitEnd();

        cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "EQUAL", "I",
                null, new Integer(0))
                .visitEnd();

        cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "GREATER", "I",
                null,
                1)
                .visitEnd();

        cw.visitMethod(
                Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT, "compareTo",
                "(Ljava/lang/Object;)",
                null,
                null)
                .visitEnd();

        cw.visitMethod(Opcodes.ACC_PUBLIC,
                "code",
                "(Ljava/lang/Object;)I",
                null,
                new String[]{"Exception"}).visitEnd();

        cw.visitEnd();

        byte[] data = cw.toByteArray();
        File file = new File("Comparable.class");
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(data);
        fout.close();
    }

    @Test
    public void asm_write_Inf_2_classLoad() throws IOException {
        ClassWriter cw = new ClassWriter(0);

        cw.visit(Opcodes.V1_8,
                Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT + Opcodes.ACC_INTERFACE,
                "com/yang/DemoInf",
                null,
                "java/lang/Object",
                null);

        cw.visitField(
                Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC,
                "LESS", "I",
                null,
                new Integer(-1)).visitEnd();

        cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "EQUAL", "I",
                null, new Integer(0))
                .visitEnd();

        cw.visitMethod(
                Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT,
                "ok",
                "(Ljava/lang/String;)Ljava/lang/String;",
                null,
                null)
                .visitEnd();

        cw.visitMethod(Opcodes.ACC_PUBLIC+ Opcodes.ACC_ABSTRACT,
                "code",
                "(Ljava/lang/Object;)I",
                null,
                new String[]{"Exception"}).visitEnd();

        cw.visitEnd();

        byte[] data = cw.toByteArray();

        File file = new File("DemoInf.class");
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(data);
        fout.close();


        MyclassLoad myclassLoad = new MyclassLoad();
        Class<?> demoInf = myclassLoad.defineMyClass("com.yang.DemoInf", data, 0, data.length);
        System.out.println(demoInf);


    }


}
