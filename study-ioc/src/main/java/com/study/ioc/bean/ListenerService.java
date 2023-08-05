package com.study.ioc.bean;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @Author plainhu
 * @Title: ListenerService
 * @Project: spring
 * @Description: TODO
 * @Date 2022/2/7 22:55
 */
@Service
public class ListenerService {
	@EventListener(classes = {ApplicationEvent.class})
	public void listen(ApplicationEvent event) {
		System.out.println("ListenerService监听事件：" + event);
	}
}
