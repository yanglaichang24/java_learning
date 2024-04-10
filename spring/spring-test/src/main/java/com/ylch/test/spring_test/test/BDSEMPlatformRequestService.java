package com.ylch.test.spring_test.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Mr.Yang
 * @desc BDSEMPlatformRequestService
 * @date 2022/7/7 02:04
 */
@Service
public class BDSEMPlatformRequestService {

    @Autowired
    //@Resource(name = "closeableHttpClient")
    protected CloseableHttpClient httpClient;

    public CloseableHttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(CloseableHttpClient httpClient) {
        this.httpClient = httpClient;
    }
}
