package com.ylch.test;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Posting_test {

    private static String index_dir = "D:/lucene";

    @Test
    public void write() throws IOException {
        Analyzer analyzer = new StandardAnalyzer();
        Path path = Paths.get(index_dir);
        Directory directorty = FSDirectory.open(path);
        IndexWriterConfig config = new IndexWriterConfig(analyzer);
        IndexWriter writer = new IndexWriter(directorty, config);

        List<Document> documents = new ArrayList<>();
        Document doc = new Document();
        doc.add(new TextField("content", "book book is", Field.Store.YES));
        doc.add(new TextField("title", "book ", Field.Store.YES));
        documents.add(doc);

        Document doc1 = new Document();
        doc1.add(new TextField("content", "book", Field.Store.YES));
        documents.add(doc1);
        writer.addDocuments(documents);
        //writer.commit();
        writer.close();
    }

}
