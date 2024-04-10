package com.ylch.test.spring_test.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mr.Yang
 * @desc CDemo
 * @date 2022/7/7 12:51
 */
@Service
public class CDemo {

    @Autowired
    protected HttpClient httpClient;

    public HttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

}
