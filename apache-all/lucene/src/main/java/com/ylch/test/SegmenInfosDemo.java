package com.ylch.test;

import org.apache.lucene.util.BytesRef;
import org.apache.lucene.util.StringHelper;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class SegmenInfosDemo {

    private static String index_dir = "D:/luceneTxt/segments_7";

    @Test
    public void segmentinfo() {
        BytesRef utf8Result = new BytesRef("segments");
        System.out.println(Arrays.toString(utf8Result.bytes));
        System.out.println(utf8Result.offset);
        System.out.println(utf8Result.length);
    }

    @Test
    public void head(){
        byte[] bytes = StringHelper.randomId();
        System.out.println(bytes.length);

        String s = Long.toString(7, Character.MAX_RADIX);
        System.out.println(s);

        //
        //suffixBytes.bytes, suffixBytes.offset, suffixBytes.length
        BytesRef suffixBytes = new BytesRef(s);
        System.out.println(Arrays.toString(suffixBytes.bytes));
        System.out.println(suffixBytes.length);


    }


    @Test
    public void readSegmentinfo() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(index_dir);

       /* byte[] bytes = new byte[8];

        int read = fileInputStream.read();
        System.out.println(read);
        System.out.println(Integer.toHexString(read));*/
       /* int i;
        do {
            i = fileInputStream.read();
            System.out.println(Integer.toHexString(i));
        } while (i != -1);

        byte[] s = {0x73,0x65,0x67,0x6d,0X65,0x6e,0x74,0x73};
        String s1 = new String(s, StandardCharsets.UTF_8);
        System.out.println(s1);


       /* int read1 = fileInputStream.read(bytes, 0, 4);
        System.out.println(read1);
        System.out.println(Arrays.toString(bytes));*/

        System.out.println(Integer.toHexString(-41));

        System.out.println(0xd7);



        byte[] bytes = new byte[8];
        int read1 = fileInputStream.read(bytes, 1, 5);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);

        int i = dataInputStream.readUnsignedByte();

    }


}
