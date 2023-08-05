package com.study.ioc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hkt
 * @Title: A
 * @ProjectName spring
 * @Description: TODO
 * @date 2020/8/13 15:50
 */
@Component
public class AService {
	@Autowired
	private BService bService;
}
