package com.movieworld.MovieworldSpringApi.service;

import java.util.List;

import com.movieworld.MovieworldSpringApi.entity.Movie;

public interface MovieService {
	
	public  List<Movie> findAll();
	
	public  Movie findByTitle(Movie title);
	
	public Movie findByGenere(String genere);
	
	public Movie findByRatings(int imdb_ratings );
	
	public Movie findByType(String type);
	
	public Movie create(Movie title);
	
	public Movie update(Movie title); 
	
	public void delete(Movie title);

	
}
