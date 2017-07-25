package com.movieworld.MovieworldSpringApi.repository;

import java.util.List;

import com.movieworld.MovieworldSpringApi.entity.UserReview;

public interface UserReviewRepository {

public List<UserReview> findAll();
	
	public UserReview findUserReviews(UserReview comments);
	
	public UserReview findUserRatings(int user_ratings);
	
	public UserReview create(UserReview comments);
	
	public UserReview update(UserReview comments);
	
	public void delete(UserReview comments);
}
