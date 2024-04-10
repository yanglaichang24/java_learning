package com.ylch.test;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.document.*;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by yanglaichang1 on 2017/4/12.
 */
public class SimpleLuceneTest {

    private static String file_dir = "D:/luceneTxt";// 带索引的本地文件目录

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


    @Test
    public void analyzer() throws IOException {

       // IKAnalyzer analyzer = new IKAnalyzer();

       // IKAnalyzer analyzer = new IKAnalyzer();
        Analyzer analyzer = new StandardAnalyzer();

        TokenStream tokenStream = analyzer.tokenStream("name", "运行此代码后，控制台将输出分词后的词元。您可以检查这些输出，以确定 ABC Lucene 是否按照您的预期进行了分词");

        // 重置TokenStream
        tokenStream.reset();

        // 循环遍历TokenStream中的所有词元
        while (tokenStream.incrementToken()) {
            // 获取词元的文本内容
            CharTermAttribute charTermAttribute = tokenStream.getAttribute(CharTermAttribute.class);
            String token = charTermAttribute.toString();
            // 打印词元
            System.out.println(token);
        }

        // 关闭TokenStream和Analyzer
        tokenStream.end();
        tokenStream.close();
        analyzer.close();

    }







}
