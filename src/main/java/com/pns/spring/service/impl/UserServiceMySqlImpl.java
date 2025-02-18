package com.pns.spring.service.impl;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.pns.spring.LoginException;
import com.pns.spring.dto.request.LoginRequestDto;
import com.pns.spring.dto.response.LoginResponseDto;
import com.pns.spring.entity.UserEntity;
import com.pns.spring.repo.UserRepository;
import com.pns.spring.service.UserService;

public class UserServiceMySqlImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public LoginResponseDto doLogin(LoginRequestDto loginRequest) {
		
		LoginResponseDto responseDto = new LoginResponseDto();
		if(loginRequest.getUserName().contentEquals("admin") &&
				loginRequest.getPassword().contentEquals("password")) {
			System.out.println("Login Successful with MYSQL IMPL");
			responseDto.setProfileImageUrl("profile.png");
			responseDto.setSection("SEC-A");
			responseDto.setUsername(loginRequest.getUserName());
			return responseDto;
		}
		throw new LoginException("Invalid login credentials",HttpStatus.UNAUTHORIZED);
	}

	
}
