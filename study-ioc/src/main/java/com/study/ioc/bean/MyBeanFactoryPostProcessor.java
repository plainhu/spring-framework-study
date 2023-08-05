package com.study.ioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Author plainhu
 * @Title: MyBeanFactoryPostProcessor
 * @Project: spring
 * @Description: TODO
 * @Date 2022/2/7 17:42
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanFactoryPostProcessor");
		int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
		System.out.println("当前BeanFactory中Bean定义个数" + beanDefinitionCount);
	}
}
