package org.hechuansheng.demo.ioc.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author : hechuansheng
 * @description :
 * @date : 2021/4/18  20:43
 */
public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        String[] beans = new String[3];
        beans[0] = "org.hechuansheng.demo.ioc.config.MyConfig";
        beans[1] = "org.hechuansheng.demo.ioc.bean.Person";
        beans[2] = "org.hechuansheng.demo.ioc.bean.Address";
        return beans;
    }
}

