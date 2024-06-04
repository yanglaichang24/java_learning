package sdk.java.nio.files;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_test {

    private static String index_dir = "D:/luceneTxt";

    @Test
    public void newDirectoryStream() throws IOException {
        Path path = Paths.get(index_dir);
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path p : stream) {
                String name = p.getFileName().toString();
                System.out.println(name);
            }
        }
    }


}
