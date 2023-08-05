package com.study.ioc;

import com.study.ioc.bean.TestBean;
import com.study.ioc.config.SimpleConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author plainhu
 * @Date 2023/8/5 14:34
 * @Description: TODO
 */
public class IocTests {

	@Test
	public void test() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SimpleConfig.class);
		TestBean bean = context.getBean(TestBean.class);
		System.out.println(bean);
	}

}
