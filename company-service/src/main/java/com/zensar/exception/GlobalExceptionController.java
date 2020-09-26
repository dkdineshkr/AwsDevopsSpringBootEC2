package com.zensar.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionController {

	@ExceptionHandler(GlobalException.class)
	public ResponseEntity<Object> exception(){
		return new ResponseEntity<Object>("Global exception", HttpStatus.NOT_FOUND);
	}
}
