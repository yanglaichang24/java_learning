package com.ylch.test.spring_test.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.Yang
 * @desc Main
 * @date 2022/7/7 01:58
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext("com.ylch.test.spring_test.test");
        //annotationConfigApplicationContext.refresh();

        BDSEMPlatformRequestService bDSEMPlatformRequestService = (BDSEMPlatformRequestService)annotationConfigApplicationContext.getBean("BDSEMPlatformRequestService");
        CloseableHttpClient httpClient = bDSEMPlatformRequestService.getHttpClient();
        System.out.println(httpClient);

        //annotationConfigApplicationContext.getBean("bDSEMPlatformRequestService");
        //ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring-demo.xml");

    }

}
