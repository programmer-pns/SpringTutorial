package com.pns.spring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.pns.spring.dto.response.LoginResponseDto;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler(LoginException.class)
	protected ResponseEntity<LoginResponseDto> handleLoginException(LoginException ex, HttpServletRequest request){
		
		LoginResponseDto responseDto = new LoginResponseDto();
		ResponseEntity<LoginResponseDto> responseEntity = new ResponseEntity<LoginResponseDto>(responseDto,ex.getStatus());
 		return responseEntity;
		
	}
	
	
	
}
