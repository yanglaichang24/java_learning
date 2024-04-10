import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 *
 * <p>
 *
 *     -Xms50m
 *     -Xmx50m
 *
 *     -XX:+HeapDumpOnOutOfMemoryError
 *     -XX:HeapDumpPath=/Users/a58/git/github/test/jvm
 *     -Xloggc:/Users/a58/git/github/test/jvm/gc.log
 *
 *     -XX:+PrintGCDetails
 *     -XX:+PrintGCCause
 *     -XX:+PrintGCDateStamps
 *     -XX:+PrintTenuringDistribution
 *
 * </p>
 * @author Mr.Yang
 * @desc Oom
 * @date 2023/3/15 16:24
 *
 *
 *
 */
public class Oom {


    public static void main(String[] args) {
        List<Data> list = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
            list.add(new Data(new Random().nextInt(1000 * 50)));
        }

    }


    static class Data {
        private byte[] datas;

        public Data(int l) {
            datas = new byte[l];
        }


    }


}
