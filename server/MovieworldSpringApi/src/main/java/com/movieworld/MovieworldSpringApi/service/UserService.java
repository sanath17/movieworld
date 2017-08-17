package com.movieworld.MovieworldSpringApi.service;

import java.util.List;

import com.movieworld.MovieworldSpringApi.entity.User;

public interface UserService {

	public List<User> findAll();

	public User findByEmail(String email);

	public User create(User email);

	public User update(User email);

	public void delete(String email);

}
