import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

/**
 * @author Mr.Yang
 * @desc Encrypt_AES
 * @date 2023/5/15 11:28
 */
public class Encrypt_AES {

    private static final String ALGO = "AES/ECB/PKCS5Padding";

    public static byte[] encrypt(String data, Key key) {
        try {
            Cipher cipher = Cipher.getInstance(ALGO);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return cipher.doFinal(data.getBytes());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    private static byte[] decrypt(byte[] result, Key key) {
        try {
            Cipher cipher = Cipher.getInstance(ALGO);
            cipher.init(Cipher.DECRYPT_MODE, key);
            return cipher.doFinal(result);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    private static Key createKey() {
        try {
            // 生成key
            KeyGenerator keyGenerator;
            // 构造密钥生成器，指定为AES算法,不区分大小写
            keyGenerator = KeyGenerator.getInstance("AES");
            // 生成一个128位的随机源,根据传入的字节数组
            keyGenerator.init(128);
            // 产生原始对称密钥
            SecretKey secretKey = keyGenerator.generateKey();
            // 获得原始对称密钥的字节数组
            byte[] keyBytes = secretKey.getEncoded();
            // key转换,根据字节数组生成AES密钥
            return new SecretKeySpec(keyBytes, "AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String data = "hello Test symmetric encry";
        Key key = createKey();

        System.out.println("key = "+ key);
        byte[] encryData = encrypt(data, key);
        System.out.println("encryData = " + new String(encryData));


        byte[] decryData = decrypt(encryData, key);
        System.out.println("decryData = " + new String(decryData));

        // 使用错误的密钥
        Key key1 = createKey();
        System.out.println("key1 = "+ key1);
        byte[] decryData2 = decrypt(encryData, key1);
        System.out.println("decryData2 = " + new String(decryData2));

    }

}
