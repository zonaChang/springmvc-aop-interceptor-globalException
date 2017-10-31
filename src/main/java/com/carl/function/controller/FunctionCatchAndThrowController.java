package com.carl.function.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc: 测试aop环绕通知捕获异常并且将异常抛出的情况
 * @Auth: Carl
 * @Time: 2017年10月31日 下午4:52:32
 */
@RestController
@RequestMapping("/api/function/catchAndThrow/")
public class FunctionCatchAndThrowController {

	@RequestMapping("normal")
	public Map<String, String> normal(){
		System.out.println("FunctionController.normal()");
		Map<String, String> map = new HashMap<String, String>();
		map.put("aa", "normal-value");
		return map;
	}
	
	@RequestMapping("error")
	public Map<String, String> error(){
		System.out.println("FunctionController.error()");
		Map<String, String> map = new HashMap<String, String>();
		int a = 3/0;
		return map;
	}
}
