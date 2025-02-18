package com.pns.spring.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pns.spring.entity.DirectorEntity;
import com.pns.spring.entity.MovieEntity;
import com.pns.spring.repo.MovieRepo;

@RestController
public class MovieController {
	
	@Autowired
	MovieRepo repo;
	
	@GetMapping("generateMovie")
	public String generateMovie() {
		
		MovieEntity newMovie = new MovieEntity();
		newMovie.setMovieName("Hello");
		newMovie.setGenre("Comedy");
		newMovie.setRating(8.7f);
		newMovie.setReleaseDate(LocalDate.now());
		
		DirectorEntity director = new DirectorEntity();
		director.setDirectorAddress("Odisha");
		director.setDirectorId("DIR001");
		director.setDirectorName("Mahesh Kumar");
		newMovie.setDirector(director);
		
		newMovie = repo.save(newMovie);
		
		return "Movie Created Successfully with id: "+newMovie.getMovieId();
	}
	
}
