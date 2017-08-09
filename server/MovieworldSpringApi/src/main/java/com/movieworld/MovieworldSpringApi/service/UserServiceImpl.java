package com.movieworld.MovieworldSpringApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.movieworld.MovieworldSpringApi.entity.User;
import com.movieworld.MovieworldSpringApi.exception.UserAlreadyExistsException;
import com.movieworld.MovieworldSpringApi.exception.UserNotFoundException;
import com.movieworld.MovieworldSpringApi.repository.UserRepository;


@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository;
	
	@Override
	public List<User> findAll() {
		return repository.findAll();
	}
	
	@Override
	public User findOne(User userId) {
		User existing = repository.findOne(userId);
		if (existing == null) {
			throw new UserNotFoundException("User with id:" + userId + " not found");
		}
		return existing;
	}
	
	@Override
	@Transactional
	public User create(User email) {
		User existing = repository.findByEmail(email);
		if (existing != null) {
			throw new UserAlreadyExistsException("Email is already in use: " + email);
		}
		return repository.create(email);
	}


	@Override
	@Transactional
	public User update(User userId) {
		User existing = repository.findOne(userId);
		if (existing == null) {
			throw new UserNotFoundException("User with id:" + userId + " not found");
		}
		return repository.update(userId);
	}

	@Override
	@Transactional
	public void delete(User userId) {
	User existing = repository.findOne(userId);
		if (existing == null) {
			throw new UserNotFoundException("User with id:" + userId + " not found");
		}
		repository.delete(existing);
	}

}
