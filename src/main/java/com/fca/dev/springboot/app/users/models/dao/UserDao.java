package com.fca.dev.springboot.app.users.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import com.fca.dev.springboot.app.users.commons.models.entity.Users;

@RepositoryRestResource(path = "users")
public interface UserDao extends PagingAndSortingRepository<Users, Long> {

	@RestResource(path = "find-username")
	public Users findByUsername(@Param("username") String username);

}
