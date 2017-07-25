package com.movieworld.MovieworldSpringApi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
@NamedQueries({})
public class UserReview {

	@Id
	@GenericGenerator(name = "customUUID", strategy = "uuid2")
	@GeneratedValue(generator = "customUUID")
	private String id;
	
	private String user;
	
	@Column(unique=true)
	private Movie movie;
	
	private String comments;
	
	private int user_ratings;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getUser_ratings() {
		return user_ratings;
	}

	public void setUser_ratings(int user_ratings) {
		this.user_ratings = user_ratings;
	}
}
