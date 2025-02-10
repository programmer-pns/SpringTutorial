package com.pns.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ApplicationTests {
	
	@Autowired
	private UserController userController;
	
	@LocalServerPort
	int port;
	

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() throws Exception{
		assertThat(userController).isNotNull();
	}

}
