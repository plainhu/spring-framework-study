package com.study.ioc.bean;

/**
 * @author hkt
 * @Title: beans
 * @ProjectName spring
 * @Description: TODO
 * @date 2019/11/12 13:01
 */
public class TestBean {
	private String name = "testName";

	public TestBean(String name) {
		this.name = name;
	}

	public TestBean() {
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
