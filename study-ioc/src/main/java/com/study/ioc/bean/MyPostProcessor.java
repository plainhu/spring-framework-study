package com.study.ioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author plainhu
 * @Title: BeanLifeCycle
 * @Project: spring
 * @Description: TODO
 * @Date 2021/11/9 22:04
 */
@Component
public class MyPostProcessor implements BeanPostProcessor {

	/*===================== 实现BeanPostProcessor接口 =====================*/
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor--postProcessBeforeInitialization：" + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor--postProcessAfterInitialization：" + beanName);
		return bean;
	}

}
