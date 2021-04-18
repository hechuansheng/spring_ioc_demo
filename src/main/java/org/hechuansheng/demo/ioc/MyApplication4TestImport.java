package org.hechuansheng.demo.ioc;

import org.hechuansheng.demo.ioc.registrar.MyRegistrar;
import org.hechuansheng.demo.ioc.selector.MyImportSelector;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;

/**
 * @author : hechuansheng
 * @description : Import方式注册组件
 * @date : 2021/4/18  20:42
 */
//@Import(MyConfig.class)
//@Import(MyImportSelector.class)
@Import(MyRegistrar.class)
public class MyApplication4TestImport {
}
