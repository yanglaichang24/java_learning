package yang.java;

import java.security.MessageDigest;

/**
 * @author Mr.Yang
 * @desc MessageDigest_test
 * @date 2023/5/12 16:25
 */
public class MessageDigest_test {



    public static void main(String[] args) {
        String str1 = "yanglaichang";
        String str2 = "yanglaichang2";

        // 128位
        System.out.println(toMD("MD5",str1));// 8e957b2941c388b6bb38363cb35c80d4
        System.out.println(toMD("MD5",str2));// 0dd6ee0a93a1cf2b7a298a5a360ab1f0

        System.out.println(toMD("MD4",str1));
        System.out.println(toMD("MD4",str2));


        //160
        toSHA("SHA1",str1);//aeb343130bd4718ea30df0b84c7132c9b3b8aebe
        toSHA("SHA1",str2);//57197dcf3667b70a13c293fc93f9b6df1c43b654

        //256
        toSHA("SHA-256",str1);//aeb343130bd4718ea30df0b84c7132c9b3b8aebe
        toSHA("SHA-256",str2);//57197dcf3667b70a13c293fc93f9b6df1c43b654

        //512
        toSHA("SHA-512",str1);//aeb343130bd4718ea30df0b84c7132c9b3b8aebe
        toSHA("SHA-512",str2);//57197dcf3667b70a13c293fc93f9b6df1c43b654


    }


    private static String toMD(String algorithm,String data) {
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            byte [] bytes = md.digest(data.getBytes());
            return HexCopy.encodeHexString(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return "xxxx";
        }
    }


    private static void toSHA(String algorithm, String data) {
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            byte [] bytes = md.digest(data.getBytes());
            System.out.println(algorithm+" = "+HexCopy.encodeHexString(bytes));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }










}
