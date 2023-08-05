package com.study.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @Author plainhu
 * @Title: LogAspect
 * @Project: spring
 * @Description: TODO
 * @Date 2022/1/18 22:10
 */
@Aspect
public class LogAspect {

	@Pointcut("execution(public int com.study.aop.bean.MathCalculator.div(int,int))")
	public void pointCut() {
	}

	;

	//在目标方法之前切入
	@Before("pointCut()")
	public void logStart(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		Object[] pointArgs = joinPoint.getArgs();
		System.out.println("方法名" + name + ",参数列表" + Arrays.toString(pointArgs) + ",除法开始");
	}

	@After("pointCut()")
	public void logEnd() {
		System.out.println("除法结束");
	}

	@AfterReturning(value = "pointCut()", returning = "result")
	public void logReturn(Object result) {
		System.out.println("除法返回:" + result);
	}

	@AfterThrowing(value = "pointCut()", throwing = "exception")
	public void logException(Exception exception) {
		System.out.println("除法异常:" + exception);
	}
}
