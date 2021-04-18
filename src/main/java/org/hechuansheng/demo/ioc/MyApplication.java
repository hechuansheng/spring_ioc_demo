package org.hechuansheng.demo.ioc;

import org.hechuansheng.demo.ioc.filter.MyComponentScanFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * useDefaultFilters = true 默认全部扫描
 * useDefaultFilters = false  默认全部不扫描
 * @author : hechuansheng
 * @description : ComponentScan方式注册组件
 * @date : 2021/4/18  16:46
 */
@ComponentScan(basePackages="org.hechuansheng.demo.ioc", useDefaultFilters = true,
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyComponentScanFilter.class)})
public class MyApplication {
}
