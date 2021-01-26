package com.example.accessingneo4jdatarest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accessingneo4jdatarest.model.Movie;
import com.example.accessingneo4jdatarest.repository.UserRepository;

@RestController
@RequestMapping("/home")
public class UserController {
	
	private final UserRepository userRepository;
	
	public UserController (UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/all")
	public List <Movie> findAll(){
		return userRepository.findAll();
	}
	
	/*@GetMapping(path = "/movies", produces = MediaType.APPLICATION_JSON_VALUE) 
	public List<String> getMovieTitles() {

		try (Session session = driver.session()) { 
			return session.run("MATCH (m:Movie) RETURN m ORDER BY m.name ASC")
				.list(r -> r.get("m").asNode().get("title").asString());
		}
	}*/
	
	/*@GetMapping("/director")
	public List <Movie> getMovieDirector(@PathVariable (value = "director")String director){
		return userRepository.getMovieDirector(director);
	}
	
	@GetMapping("/title")
	public List<Movie> getByTitle(@PathVariable (value="title")String title){
		return userRepository.getByTitle(title);
	}*/
}
