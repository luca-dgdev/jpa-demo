package com.dgdev.luca.demojpa.configuration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public String handleRuntimeException(HttpServletRequest request, Exception ex) throws Exception {
		System.out.println("CUSTOM RUNTIME EXCEPTION HANDLER: " + ex.getClass());
		ex.printStackTrace();
		throw ex;
	}
}
