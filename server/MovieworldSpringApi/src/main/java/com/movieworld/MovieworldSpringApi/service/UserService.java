package com.movieworld.MovieworldSpringApi.service;

import java.util.List;

import com.movieworld.MovieworldSpringApi.entity.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User findOne(User userId);
	
	public User create(User userId );
	
	public User update(User userId);
	
	public void delete(User userid);
}
