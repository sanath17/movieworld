package com.movieworld.MovieworldSpringApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.movieworld.MovieworldSpringApi.entity.UserReview;
import com.movieworld.MovieworldSpringApi.service.UserReviewService;

@Controller
@ResponseBody
@RequestMapping(path = "User_Review")
public class UserReviewController {
	
	@Autowired
	UserReviewService service;

	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE  )
	public List<UserReview> findAll(){
		return service.findAll();	
	}
	
	@RequestMapping(method=RequestMethod.GET, path= "{User_Review}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE )
	public UserReview findUserReviews(@PathVariable("User_Review") UserReview comments) {
		return service.findUserReviews(comments);
	}
	
	@RequestMapping(method=RequestMethod.GET, path= "{User_Ratings}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE )
	public UserReview findUserRatings(@PathVariable("User_Ratings") int user_ratings) {
		return service.findUserRatings(user_ratings);
	}
	
	@RequestMapping(method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public UserReview create(@RequestBody UserReview comments) {
		return service.create(comments);	
	}
	
	@RequestMapping(method=RequestMethod.PUT, path= "{User_Review}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE )
	public UserReview update(@PathVariable("User_Review") UserReview comments) {
		return service.update(comments);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, path= "{User_Review}" )
	public void delete(@PathVariable("User_Review") UserReview comments) {
		 service.delete(comments);
	}
	
}
