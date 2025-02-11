package com.pns.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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
		
//		List<UserEntity> users = userRepo.findAll(); //select * from ---
//		UserEntity user = userRepo.getById(1L); //select * from --- where id=1;
//		
		UserEntity newUser = new UserEntity();
		newUser.setEmail("pns120@gmail.com");
		newUser.setEnabled(false);
		newUser.setUsername("hi");
		
		
		newUser = userRepo.save(newUser); //INSERT 
		
		System.out.println(newUser.getId());
		
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
