package com.pns.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pns.spring.dto.request.LoginRequestDto;
import com.pns.spring.dto.response.LoginResponseDto;
import com.pns.spring.service.UserService;



@RestController
@RequestMapping( "user")
public class UserController {
	
	//Dependency Injection
	@Autowired
	private UserService userService;
	
	@PostMapping("login")
	public LoginResponseDto doLogin(@RequestBody(required = true) LoginRequestDto loginRequest) {
		return userService.doLogin(loginRequest);
	}
	
}
