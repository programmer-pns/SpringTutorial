package com.pns.spring;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class LoginException extends RuntimeException {
	private String msg;
	private HttpStatus status;
	public LoginException(String msg, HttpStatus status) {
		super(msg);
		this.msg = msg;
		this.status = status;
	}
}
