package com.study.ioc.config;

import com.study.ioc.bean.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author plainhu
 * @Date 2023/8/5 14:36
 * @Description: TODO
 */
@Configuration
public class SimpleConfig {

	@Bean
	public TestBean testBean() {
		return new TestBean("xxx");
	}
}
