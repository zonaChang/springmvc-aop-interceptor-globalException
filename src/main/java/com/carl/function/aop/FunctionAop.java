package com.carl.function.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Desc: 
 * @Auth: Carl
 * @Time: 2017年10月31日 下午4:53:29
 */
public class FunctionAop {

	/**
	 * @result: 不会触发全局异常处理
	 * @Desc: 环绕通知， 捕获异常后不在往外抛出异常
	 * @Auth: Carl
	 * @Time:2017年10月31日 下午5:51:47 
	 * @param point
	 * @return
	 */
	public Object aroundCatchException(ProceedingJoinPoint point) {
		
		Object map = null;
		try {
			System.out.println("FunctionAop.aroundCatchException()--before");
			map = point.proceed();
			System.out.println("FunctionAop.aroundCatchException()--after");
		} catch (Throwable e) {
			System.out.println("FunctionAop.aroundCatchException()--exception");
		}
		return map;
	}
	/**
	 * @result: 会触发全局异常处理
	 * @Desc: 环绕通知捕获异常后， 再抛出新的异常
	 * @Auth: Carl
	 * @Time:2017年10月31日 下午5:44:22 
	 * @param point
	 * @return
	 */
	public Object aroundCatchExceptionAndThrowNewExcpetion(ProceedingJoinPoint point) {
		
		Object map = null;
		try {
			System.out.println("FunctionAop.aroundCatchExceptionAndThrowNewExcpetion()--before");
			map = point.proceed();
			System.out.println("FunctionAop.aroundCatchExceptionAndThrowNewExcpetion()--after");
		} catch (Throwable e) {
			System.out.println("FunctionAop.aroundCatchExceptionAndThrowNewExcpetion()--exception");
			throw new RuntimeException("aop_aroundCatchExceptionAndThrowNewExcpetion_exception");
		}
		return map;
	}
	/**
	 * @result: 会触发全局异常
	 * @Desc: 环绕通知直接将异常向上抛出throws
	 * @Auth: Carl
	 * @Time:2017年10月31日 下午5:44:22 
	 * @param point
	 * @return
	 * @throws Throwable 
	 */
	public Object aroundThrowsException(ProceedingJoinPoint point) throws Throwable {
		
		Object map = null;
		System.out.println("FunctionAop.aroundThrowsException()--before");
		map = point.proceed();
		System.out.println("FunctionAop.aroundThrowsException()--after");
		return map;
	}
}
