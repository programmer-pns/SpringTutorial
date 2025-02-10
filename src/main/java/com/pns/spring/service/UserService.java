package com.pns.spring.service;

import org.springframework.stereotype.Service;

import com.pns.spring.dto.request.LoginRequestDto;
import com.pns.spring.dto.response.LoginResponseDto;

@Service
public interface UserService {
	public LoginResponseDto doLogin(LoginRequestDto loginRequest);
}