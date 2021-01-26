package com.example.accessingneo4jdatarest.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.example.accessingneo4jdatarest.model.Movie;

public interface UserRepository extends Neo4jRepository<Movie,Long> {
	
	/*List<Movie>getMovieDirector(String director);
	List<Movie>getByTitle(String title);*/
	List <Movie> findAll();
}
