package net.divine.hellocontroller;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerMethods {

	@ExceptionHandler(value = NullPointerException.class)
	public String handlerNullPointerException(Exception e) {
		// logging
		System.out.println("NullPointerException "+e );
		return "NullPointerException";
	}
	
	@ExceptionHandler(value = IOException.class)
	public String handlerIOException(Exception e) {
		// logging
		System.out.println("IOException "+e );
		return "IOException";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String handlerException(Exception e) {
		// logging
		System.out.println("Exception "+e );
		return "Exception";
	}
}
