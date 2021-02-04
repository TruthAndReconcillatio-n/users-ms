package com.fca.dev.springboot.app.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.fca.dev.springboot.app.users.commons.models.entity"})
@SpringBootApplication
public class SpringBootServiveUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServiveUsersApplication.class, args);
	}

}
