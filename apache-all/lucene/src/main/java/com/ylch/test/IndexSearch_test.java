package com.ylch.test;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.WildcardQuery;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class IndexSearch_test {

    private static String index_dir = "D:/luceneTxt";

    @Test
    public void search() throws IOException {
        Path path = Paths.get(index_dir);
        Directory directorty = FSDirectory.open(path);

        DirectoryReader open = DirectoryReader.open(directorty);

        IndexSearcher indexSearcher = new IndexSearcher(open);

        //TermQuery termQuery = new TermQuery(new Term("id", "1"));
        Query query = new WildcardQuery(new Term("id", "*"));

        TopDocs search = indexSearcher.search(query, 10);

        System.out.println(search.totalHits);

        Arrays.stream(search.scoreDocs)
                .forEach(t->{
                    try {
                        Document document = open.document(t.doc);
                        System.out.println(document);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });


    }
}
