package com.study.ioc.config;

import com.study.ioc.bean.Color;
import com.study.ioc.bean.ColorFactoryBean;
import com.study.ioc.bean.MyPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author hkt
 * @Title: AppConfig
 * @ProjectName spring
 * @Description: TODO
 * @date 2019/11/12 13:38
 */
@Configuration
@ComponentScan(value = "com.study.ioc", useDefaultFilters = false, includeFilters = {
//		@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {MyPostProcessor.class})
})
public class AppConfig {
	//	@Bean
	public ColorFactoryBean colorFactoryBean() {
		return new ColorFactoryBean();
	}

	@Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
//	@Scope("prototype")	//多实例：创建可以触发initMethod，销毁不会触发destroyMethod
	public Color color1() {
		return new Color();
	}

}
