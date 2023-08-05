package com.study.ioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author plainhu
 * @Title: Color
 * @Project: spring
 * @Description: TODO
 * @Date 2022/1/16 18:20
 */
public class Color implements InitializingBean, DisposableBean, ApplicationContextAware {

	private ApplicationContext applicationContext;

	public void initMethod() {
		System.out.println("Color initMethod");
	}

	public void destroyMethod() {
		System.out.println("Color destroyMethod");
	}

	/*=============== 实现InitializingBean & DisposableBean接口 =================*/
	@Override
	public void destroy() throws Exception {
		System.out.println("Color DisposableBean--destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Color InitializingBean--afterPropertiesSet");
	}

	/*==================== 使用JSR250规范 ==================*/
	@PostConstruct
	public void postConstruct() {
		System.out.println("Color @PostConstruct postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Color @PreDestroy preDestroy");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
