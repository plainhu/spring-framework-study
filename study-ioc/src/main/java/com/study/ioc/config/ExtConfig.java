package com.study.ioc.config;

import com.study.ioc.bean.MyApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @Author plainhu
 * @Title: ExtConfig
 * @Project: spring
 * @Description: TODO
 * @Date 2022/2/7 17:45
 */
@Configuration
@ComponentScan(value = "com.study.ioc", useDefaultFilters = false, includeFilters = {
//		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = MyBeanFactoryPostProcessor.class),
//		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = MyBeanDefinitionRegistryPostProcessor.class),
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MyApplicationListener.class)
})
public class ExtConfig {

}
