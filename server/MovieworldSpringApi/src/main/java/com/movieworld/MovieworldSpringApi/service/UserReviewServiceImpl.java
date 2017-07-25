package com.movieworld.MovieworldSpringApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieworld.MovieworldSpringApi.entity.UserReview;
import com.movieworld.MovieworldSpringApi.repository.UserReviewRepository;

@Service
public class UserReviewServiceImpl implements UserReviewService {

	@Autowired
	UserReviewRepository repository;
	
	@Override
	public List<UserReview> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserReview findUserReviews(UserReview comments) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserReview findUserRatings(int user_ratings) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserReview create(UserReview comments) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserReview update(UserReview comments) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UserReview comments) {
		// TODO Auto-generated method stub
		
	}

}
