package com.study.ioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @Author plainhu
 * @Title: MyBeanDefinitionRegistryPostProcessor
 * @Project: spring
 * @Description: TODO
 * @Date 2022/2/7 20:28
 */
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor_postProcessBeanFactory...bean的数量：" + beanFactory.getBeanDefinitionCount());
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

		System.out.println("MyBeanDefinitionRegistryPostProcessor_postProcessBeanDefinitionRegistry...bean的数量：" + registry.getBeanDefinitionCount());
		//手动注册一个BeanDefinition
		// RootBeanDefinition beanDefinition = new RootBeanDefinition(Blue.class);
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Color.class).getBeanDefinition();
		/*
		 * 第一个参数：我们将要给容器中注册的bean的名字
		 * 第二个参数：BeanDefinition对象
		 */
		registry.registerBeanDefinition("color", beanDefinition);
	}
}
