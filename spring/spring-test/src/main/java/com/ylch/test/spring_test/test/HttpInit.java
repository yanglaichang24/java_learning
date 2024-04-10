package com.ylch.test.spring_test.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mr.Yang
 * @desc HttpInit
 * @date 2022/7/7 02:07
 */
@Configuration
public class HttpInit {

    @Bean
    public HttpClient closeableHttpClient(){
        return new InternalHttpClient();
    }

}
