package cache;

import com.google.common.cache.*;

import javax.swing.text.html.parser.Entity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author Mr.Yang
 * @desc CacheTest
 * @date 2022/9/29 19:44
 */
public class CacheTest {

    private static LoadingCache<String, String> ENTRY_CACHE;

    static {
        ENTRY_CACHE = CacheBuilder.<String, String>newBuilder()
                .initialCapacity(2)
                .refreshAfterWrite(10, TimeUnit.SECONDS)
                .expireAfterWrite(1, TimeUnit.MINUTES)
                .removalListener((RemovalListener<String, String>) notification -> {
                    System.out.println("\n #### remove=" + LocalDateTime.now());
                })
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) throws Exception {
                        System.out.println("\n ==========load==========" + LocalDateTime.now());
                        return null;
                    }
                });
    }


    public static void main(String[] args) throws InterruptedException {
        //while (true){
            try{
                String s = ENTRY_CACHE.get("1");
                System.out.println("get="+LocalDateTime.now());
            }catch (CacheLoader.InvalidCacheLoadException e1){

            } catch (Exception e){
                e.printStackTrace();
            }
        Thread.sleep(2000);

        //}


    }



}
