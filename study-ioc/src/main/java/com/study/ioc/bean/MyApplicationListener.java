package com.study.ioc.bean;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author plainhu
 * @Title: MyApplicationListener
 * @Project: spring
 * @Description: TODO
 * @Date 2022/2/7 21:56
 */
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

	//当容器中发布此事件之后，此方法会被触发
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("收到的事件" + event);
	}
}
