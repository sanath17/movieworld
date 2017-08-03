package com.movieworld.MovieworldSpringApi.repository;

import java.util.List;

import com.movieworld.MovieworldSpringApi.entity.User;

public interface UserRepository {

	public List<User> findAll();

	public User findOne(User userId);
	
	public User findByEmail(User email);

	public User create(User userId);

	public User update(User userId);

	public void delete(User userid);

}
