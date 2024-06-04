package com.ylch.test;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Query_test {

    private static String index_dir = "D:/luceneTxt";

    public IndexSearcher init() throws IOException {
        Path path = Paths.get(index_dir);
        Directory directorty = FSDirectory.open(path);
        DirectoryReader open = DirectoryReader.open(directorty);
        return new IndexSearcher(open);
    }

    <T extends Query> void getResult(T query) throws IOException {
        IndexSearcher indexSearcher = init();
        TopDocs search = indexSearcher.search(query, 10);
        System.out.println(search.totalHits);
        Arrays.stream(search.scoreDocs)
                .forEach(t->{
                    try {
                        Document document = indexSearcher.getIndexReader().storedFields().document(t.doc);
                        System.out.println(document);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }


    @Test
    public void termQuery() throws IOException {
        TermQuery termQuery = new TermQuery(new Term("id", "2"));
        getResult(termQuery);
    }

}
