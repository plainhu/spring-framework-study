package com.study.aop.bean;

/**
 * @Author plainhu
 * @Title: User
 * @Project: spring
 * @Description: TODO
 * @Date 2021/11/7 16:33
 */
public class User {
	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}
