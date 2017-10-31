package com.carl.function;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @Desc: 访问index.html文件时进入filter
 * @Auth: Carl
 * @Time: 2017年10月31日 下午6:59:59
 */
public class SourcesFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String url = request.getRequestURI();
		System.out.println("SourcesFilter.doFilterInternal()");
		filterChain.doFilter(request, response);
		
	}

}
