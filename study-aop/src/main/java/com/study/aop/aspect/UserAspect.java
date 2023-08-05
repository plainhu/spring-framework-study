package com.study.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author plainhu
 * @Title: UserAspect
 * @Project: spring
 * @Description: TODO
 * @Date 2021/11/7 16:36
 */
@Aspect
public class UserAspect {
	@Pointcut("execution(* com.plainhu.aop.service.UserService.queryUser())")
	public void pointCut() {
	}

	//匹配当前指定类的代理对象
//	@Pointcut("this(com.plainhu.aop.service.UserServiceImpl)")
//	public void pointCutThis(){
//	}

	@Before("pointCut()")
	public void advice() {
		System.out.println("进行Before增强！");
	}
//
//	@Around("pointCut()")
//	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//		System.out.println("环绕前");
//		joinPoint.proceed();
//		System.out.println("环绕后");
//	}
//
//	@Before("pointCutThis()")
//	public void advice2(){
//		System.out.println("进行Before增强,pointCutThis！");
//	}

}
