package org.hechuansheng.demo.ioc.filter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author : hechuansheng
 * @description : 自定义包扫描过滤器
 * @date : 2021/4/18  16:11
 */
public class MyComponentScanFilter implements TypeFilter {
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        Resource resource = metadataReader.getResource();
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        metadataReader.getClassMetadata();
        return annotationMetadata.getClassName().contains("MyConfig");
    }
}
