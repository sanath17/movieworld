package com.movieworld.MovieworldSpringApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.movieworld.MovieworldSpringApi.exception.*;
import com.movieworld.MovieworldSpringApi.repository.MovieRepository;
import com.movieworld.MovieworldSpringApi.entity.Movie;

@Service
@EnableTransactionManagement
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository repository;

	@Override
	public List<Movie> findAll() {

		return repository.findAll();
	}

	@Override
	public Movie findByTitle(Movie title) {
		Movie existing = repository.findByTitle(title);
		if (existing == null) {
			throw new MovieNotFoundException("Movie with " + title + "notfound");
		}
		return repository.findByTitle(title);
	}

	@Override
	public Movie findByGenere(String genere) {
		Movie existing = repository.findByGenere(genere);
		if (existing == null) {
			throw new MovieNotFoundException("Movie with " + genere + "notfound");
		}
		return repository.findByGenere(genere);
	}

	@Override
	public Movie findByRatings(int imdb_ratings) {
		Movie existing = repository.findByRatings(imdb_ratings);
		if (existing == null) {
			throw new MovieNotFoundException("Movie with " + imdb_ratings + "notfound");
		}
		return repository.findByRatings(imdb_ratings);
	}

	@Override
	public Movie findByType(String type) {
		Movie existing = repository.findByType(type);
		if (existing == null) {
			throw new MovieNotFoundException("Movie with " + type + "notfound");
		}
		return repository.findByType(type);
	}

	@Override
	@Transactional
	public Movie create(Movie title) {
		Movie existing = repository.findByTitle(title);
		if (existing == null) {
			throw new MovieNotFoundException("Movie with " + title + "already exists");
		}
		return repository.create(title);
	}

	@Override
	@Transactional
	public Movie update(Movie title) {
		Movie existing = repository.findByTitle(title);
		if (existing == null) {
			throw new MovieNotFoundException("Movie with " + title + "notfound");
		}
		return repository.update(title);
	}

	@Override
	@Transactional
	public void delete(Movie title) {
		Movie existing = repository.findByTitle(title);
		if (existing == null) {
			throw new MovieNotFoundException("Movie with " + title + "notfound");
		}
		repository.delete(title);
	}

}
