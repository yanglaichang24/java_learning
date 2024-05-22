package com.ylch.test;

import org.apache.lucene.store.OutputStreamIndexOutput;
import org.junit.Test;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.*;
import java.util.Arrays;

public class DataOutput_test {

    private static String index_dir = "D:/luceneTxt/output.txt";

    @Test
    public void test() throws IOException {
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-1));

        System.out.println("========= 第一个字节========");

        int i = 255;
        System.out.println(Integer.toBinaryString(i));
        System.out.println("8   " + (byte)i);
        System.out.println(i & 0XFF);

        System.out.println("========= 第二个字节========");

         i = 256;
        System.out.println(Integer.toBinaryString(i));
        System.out.println("16   " + (byte)(i >> 8));
        System.out.println( (i>> 8) & 0xFF);

        System.out.println("========= 第三个字节========");

        i = 2 << 15;
        System.out.println(Integer.toBinaryString(i));
        System.out.println("16   " + (byte)(i >> 16));
        System.out.println( (i >> 16) & 0xFF);


        System.out.println("========= 第四个字节========");

        i = 2 << 23;
        System.out.println(Integer.toBinaryString(i));
        System.out.println("24   " + (byte)(i >> 24));
        System.out.println( (i >> 24) & 0xFF);

        System.out.println("===========  负数  ===================");

        i = Integer.MIN_VALUE+1 ;
        System.out.println(Integer.toBinaryString(i));
        System.out.println("8   " + (byte)i);
        System.out.println(i & 0XFF);

        System.out.println("========= 第二个字节========");

        System.out.println(Integer.toBinaryString(i));
        System.out.println("16   " + (byte)(i >> 8));
        System.out.println( (i >> 8) & 0xFF);

        System.out.println("========= 第三个字节========");

        System.out.println(Integer.toBinaryString(i));
        System.out.println("16   " + (byte)(i >> 16));
        System.out.println( (i >> 16) & 0xFF);


        System.out.println("========= 第四个字节========");

        System.out.println(Integer.toBinaryString(i));
        System.out.println("24   " + (byte)(i >> 24));
        System.out.println( (i >> 24) & 0xFF);


    }

    @Test
    public void w_byte() throws IOException {
        FSIndexOutput test = new FSIndexOutput("int");
        test.writeByte((byte)1);
        test.close();
    }




    @Test
    public void vint_zInt() throws IOException {
        FSIndexOutput test = new FSIndexOutput("test");
        test.writeVInt(1);
        test.writeByte((byte)0);
        test.writeVInt(-1);
        test.writeByte((byte)0);
        test.writeZInt(1);
        test.writeByte((byte)0);
        test.writeZInt(-1);
        test.close();
    }


    static class FSIndexOutput extends OutputStreamIndexOutput{
        /**
         * The maximum chunk size is 8192 bytes, because file channel mallocs a native buffer outside of
         * stack if the write buffer size is larger.
         */
        static final int CHUNK_SIZE = 8192;

        public FSIndexOutput(String name) throws IOException {
            this(name, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
        }

        FSIndexOutput(String name, OpenOption... options) throws IOException {
            super(
                    "FSIndexOutput(path=\"" + index_dir + "\")",
                    name,
                    new FilterOutputStream(Files.newOutputStream(Paths.get(index_dir), options)) {
                        // This implementation ensures, that we never write more than CHUNK_SIZE bytes:
                        @Override
                        public void write(byte[] b, int offset, int length) throws IOException {
                            while (length > 0) {
                                final int chunk = Math.min(length, CHUNK_SIZE);
                                System.out.println(Arrays.toString(b));
                                out.write(b, offset, chunk);
                                length -= chunk;
                                offset += chunk;
                            }
                        }
                    },
                    CHUNK_SIZE);
        }
    }


}
