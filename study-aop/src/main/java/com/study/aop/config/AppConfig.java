package com.study.aop.config;

import com.study.aop.aspect.LogAspect;
import com.study.aop.bean.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author hkt
 * @Title: AppConfig
 * @ProjectName spring
 * @Description: TODO
 * @date 2019/11/12 13:38
 */
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
	@Bean
	public MathCalculator mathCalculator() {
		return new MathCalculator();
	}

	@Bean
	public LogAspect logAspect() {
		return new LogAspect();
	}
}
