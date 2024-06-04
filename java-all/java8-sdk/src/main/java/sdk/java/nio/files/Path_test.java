package sdk.java.nio.files;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_test {

    private static String index_dir = "D:/luceneTxt";

    @Test
    public void get(){
        Path path = Paths.get(index_dir);
    }

    @Test
    public void of(){
        Path path = Path.of(index_dir);
    }

}
