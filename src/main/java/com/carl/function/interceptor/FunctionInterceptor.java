package com.carl.function.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Desc: 
 * @Auth: Carl
 * @Time: 2017年10月31日 下午4:53:57
 */
public class FunctionInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("FunctionInterceptor.preHandle()");
		return true;
	}

	/**
	 * postHandle方法执行时机
	 * 
	 * 	1. preHandle的返回值为true
	 * 	2. 请求目标方法（controller）正常响应（未抛出异常）
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("FunctionInterceptor.postHandle()");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("FunctionInterceptor.afterCompletion()");
		
	}

}
