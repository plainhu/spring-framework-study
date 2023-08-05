package com.study.ioc.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author plainhu
 * @Title: ColorFactoryBean
 * @Project: spring
 * @Description: TODO
 * @Date 2022/1/16 18:20
 */
//创建一个Spring定义的FactoryBean
public class ColorFactoryBean implements FactoryBean<Color> {

	//返回一个Color对象，这个对象会添加到容器中
	@Override
	public Color getObject() throws Exception {
		return new Color();
	}

	@Override
	public Class<?> getObjectType() {
		return Color.class;
	}

	//是否单例
	@Override
	public boolean isSingleton() {
		return false;
	}
}
