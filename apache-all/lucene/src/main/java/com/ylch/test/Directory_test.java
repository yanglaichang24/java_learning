package com.ylch.test;

import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;

public class Directory_test {

    private static String index_dir = "D:/luceneTxt";

    @Test
    public void test() throws IOException {
        Path path = Paths.get(index_dir);
        Directory directorty = FSDirectory.open(path);
        String[] strings = directorty.listAll();
        System.out.println(Arrays.toString(strings));



    }

}
