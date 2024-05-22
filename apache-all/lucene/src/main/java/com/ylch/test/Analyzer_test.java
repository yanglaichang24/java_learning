package com.ylch.test;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.junit.Test;

import java.io.IOException;

public class Analyzer_test {

    @Test
    public void analyzer() throws IOException {

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
