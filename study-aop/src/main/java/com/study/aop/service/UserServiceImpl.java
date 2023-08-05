package com.study.aop.service;

import com.study.aop.bean.User;

/**
 * @Author plainhu
 * @Title: UserService
 * @Project: spring
 * @Description: TODO
 * @Date 2021/11/7 16:34
 */
//@Service("userService")
public class UserServiceImpl implements UserService {

	public UserServiceImpl() {
//		System.out.println("------初始化");
	}

	@Override
	public String queryUser() {
		User user = new User();
		return user.toString();
	}
}
