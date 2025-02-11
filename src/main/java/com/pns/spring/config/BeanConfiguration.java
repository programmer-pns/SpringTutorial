package com.pns.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pns.spring.service.UserService;
import com.pns.spring.service.impl.UserServiceMySqlImpl;

@Configuration
public class BeanConfiguration {

	@Bean
	UserService getUserService() {
		return new UserServiceMySqlImpl();
	}
	
}
