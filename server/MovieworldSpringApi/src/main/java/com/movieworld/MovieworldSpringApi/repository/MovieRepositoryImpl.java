package com.movieworld.MovieworldSpringApi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.movieworld.MovieworldSpringApi.entity.Movie;

@Repository
public class MovieRepositoryImpl implements MovieRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie findByTitle(Movie title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie findByGenere(String genere) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie findByRatings(int imdb_ratings) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie findByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie create(Movie title) {
		em.persist(title);;
		return title;
	}

	@Override
	public Movie update(Movie title) {
		return em.merge(title);
	}

	@Override
	public void delete(Movie title) {
		em.remove(title);
		
	}

}
