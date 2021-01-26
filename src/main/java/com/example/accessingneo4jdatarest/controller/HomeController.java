package com.example.accessingneo4jdatarest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@GetMapping("")
	public String msg (String hello) {
		hello = "Hello World";
		return hello;
	}
}
