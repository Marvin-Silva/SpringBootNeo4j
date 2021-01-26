package com.example.accessingneo4jdatarest.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Node
public class Movie {

	@Id @GeneratedValue
	private Long id;
	
	private String title;
	private String director;
	
	@Relationship(type = "actor")
	@JsonIgnoreProperties("movies")
	List <User>users = new ArrayList<>();

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie( Long id, String title, String director) {
		this.id = id;
		this.title = title;
		this.director = director;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
