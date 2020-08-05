package com.fca.dev.springboot.app.users;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.fca.dev.springboot.app.users.commons.models.entity.Role;
import com.fca.dev.springboot.app.users.commons.models.entity.Users;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

		config.exposeIdsFor(Users.class,Role.class);
	}

	
}
