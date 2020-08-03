package com.fca.dev.springboot.app.users.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fca.dev.springboot.app.users.models.entity.Users;

@RepositoryRestResource(path="users")
public interface UserDao extends PagingAndSortingRepository<Users, Long>{
	
	public Users findByUsername(String username);
	
}
