package com.yang.import_test;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

public class BeanImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.yang.ImportBean"};
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return null;
    }
}
