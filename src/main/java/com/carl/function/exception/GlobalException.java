package com.carl.function.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * @Desc: 
 * @Auth: Carl
 * @Time: 2017年10月31日 下午4:54:57
 */
public class GlobalException implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		System.out.println("GlobalException.resolveException()");
		Map<String, String> map = new HashMap<>();
		map.put("aa", "GlobalException-value");
		ModelAndView mv = new ModelAndView(new MappingJackson2JsonView()).addObject(map);
		return mv;
	}

}
