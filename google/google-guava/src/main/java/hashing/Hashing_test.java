package hashing;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

/**
 * @author Mr.Yang
 * @desc Hashing
 * @date 2023/5/12 15:14
 */
public class Hashing_test {



    @Test
    public void SHA() {
        //
        String str = "yanglaichang";
        HashCode hash = Hashing.sha256().newHasher().putString(str, StandardCharsets.UTF_8).hash();
        System.out.println(hash);

        HashCode hashmd5 = Hashing.md5().newHasher().putString(str, StandardCharsets.UTF_8).hash();
        System.out.println(hashmd5);
    }


    @Test
    public void consistentHash() {

        System.out.println(Hashing.consistentHash(1741490688906248L, 32));
        System.out.println(Hashing.consistentHash(1741490688906248L, 31));

        System.out.println(Hashing.consistentHash(1741490688906248L, 16));

        System.out.println(Hashing.consistentHash(1741490688906248L, 64));
    }


}
