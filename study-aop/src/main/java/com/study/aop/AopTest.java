package com.study.aop;

import com.study.aop.bean.MathCalculator;
import com.study.aop.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author plainhu
 * @Title: AopTest
 * @Project: spring
 * @Description: TODO
 * @Date 2021/11/7 16:32
 */
public class AopTest {
	public static void main(String[] args) {
		//注意：这行初始化代码会调用org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean方法
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MathCalculator mathCalculator = context.getBean(MathCalculator.class);
		int result = mathCalculator.div(1, 2);
		System.out.println(result);
	}
	//getBean方法也会调用org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean方法
	//最终的业务逻辑就是直接从单例缓存池中获取已经创建好的代理对象
//		UserService userService = context.getBean(UserService.class);
//		UserService userService2 = (UserService) context.getBean("userService");
//		System.out.println(userService);
//		String res = userService.queryUser();
//		System.out.println(res);
//		System.out.println(userService instanceof UserServiceImpl);
}
