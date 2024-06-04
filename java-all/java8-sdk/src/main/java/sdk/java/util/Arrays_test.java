package sdk.java.util;

import org.junit.Test;

import java.util.Arrays;

public class Arrays_test {


    /*用于比较两个字节数组的无符号值*/
    @Test
    public void compareUnsigned(){


        /*在这个例子中，bytes1 和 bytes2 包含有符号字节，但是我们想要比较它们的无符号值。
        Arrays.compareUnsigned 会返回一个整数，该整数指示两个数组在进行无符号比较时的顺序。

        如果 bytes1 在无符号顺序中小于 bytes2，那么返回的结果小于 0；
        如果 bytes1 等于 bytes2，那么返回的结果等于 0；
        如果 bytes1 大于 bytes2，那么返回的结果大于 0。*/


       // byte[] bytes1 = {0, -64, 3, 127};
        //byte[] bytes2 = {0, 64, 3, -128};

        // 1000 0001
        // 1111 1110
        //        11
        System.out.println(Byte.toUnsignedInt((byte)-1));

        byte[]  bytes1 = {0,1,-1};
        byte[]  bytes2 = {0,1,2};

        int result = Arrays.compareUnsigned(bytes1, bytes2);

        if (result < 0) {
            System.out.println("bytes1 is less than bytes2");
        } else if (result > 0) {
            System.out.println("bytes1 is greater than bytes2");
        } else {
            System.out.println("bytes1 is equal to bytes2");
        }
        //Arrays.compareUnsigned()
    }

    @Test
    public void compareUnsigned2(){
       /// 使用 Arrays.compareUnsigned 比较两个字节数组的特定部分：

       /*在这个例子中，
       我们比较 bytes1 和 bytes2 的第二个到第四个字节（即 -64, 3, 127 和 64, 3, -128）。
       这次比较的结果将影响比较整个数组时的结果。

        注意：字节数组中的有符号字节在内存中是以二进制补码形式存储的，
        所以在比较无符号值时，需要特别注意这一点。
        Arrays.compareUnsigned 方法能够正确处理这种情况，
        它会按照无符号整数来比较字节数组中的每个字节。*/


        byte[] bytes1 = {0, -64, 3, 127, 0};
        byte[] bytes2 = {0, 64, 3, -128, 2};

        int result = Arrays.compareUnsigned(bytes1, 1, 3, bytes2, 1, 3);

        if (result < 0) {
            System.out.println("Part of bytes1 is less than part of bytes2");
        } else if (result > 0) {
            System.out.println("Part of bytes1 is greater than part of bytes2");
        } else {
            System.out.println("Part of bytes1 is equal to part of bytes2");
        }

    }





}
