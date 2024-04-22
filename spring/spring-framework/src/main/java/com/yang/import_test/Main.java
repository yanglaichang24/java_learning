package com.yang.import_test;

import com.yang.ImportBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BeanImportSelector.class)
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.yang");
        ImportBean bean = annotationConfigApplicationContext.getBean(ImportBean.class);
        System.out.println(bean);
    }


}
