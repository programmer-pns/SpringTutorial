package com.pns.spring.service.impl;

import com.pns.spring.dto.request.LoginRequestDto;
import com.pns.spring.dto.response.LoginResponseDto;
import com.pns.spring.service.UserService;

public class UserServiceMySqlImpl implements UserService{

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
		responseDto.setUsername(loginRequest.getUserName());
		return responseDto;
	}

}
