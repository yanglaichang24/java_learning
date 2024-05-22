package com.ylch.test;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class IndexWrite_test {

    private static String index_dir = "D:/luceneTxt";

    @Test
    public void write() throws IOException {
        Analyzer analyzer = new StandardAnalyzer();
        Path path = Paths.get(index_dir);
        Directory directorty = FSDirectory.open(path);
        IndexWriterConfig config = new IndexWriterConfig(analyzer);
        //config.setInfoStream(System.out);
        IndexWriter writer = new IndexWriter(directorty, config);

        Document doc = new Document();
        StringField id = new StringField("id", "2", Field.Store.YES);
        //new Field()
        TextField textField = new TextField("name", "中国我是", Field.Store.YES);

        doc.add(id);
        doc.add(textField);

        writer.addDocument(doc);
        //writer.commit();
        writer.close();
    }

    @Test
    public void update() throws IOException {
        Analyzer analyzer = new StandardAnalyzer();
        Path path = Paths.get(index_dir);
        Directory directorty = FSDirectory.open(path);
        IndexWriterConfig config = new IndexWriterConfig(analyzer);
        config.setInfoStream(System.out);
        IndexWriter writer = new IndexWriter(directorty, config);

        ArrayList<Document> docs = new ArrayList<>();
        Document doc = new Document();
        StringField id = new StringField("id", "3", Field.Store.YES);
        //new Field()
        TextField textField = new TextField("name", "中国我是  update_doc 中国你好杨来昌", Field.Store.YES);
        doc.add(id);
        doc.add(textField);
        docs.add(doc);

        writer.updateDocument(new Term("id","3"),doc);

        //writer.updateDocuments(new Term("id","2"),docs);
        //writer.commit();
        writer.close();

    }

}
