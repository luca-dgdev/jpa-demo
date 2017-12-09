package com.dgdev.luca.demojpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dgdev.luca.demojpa.entity.User;
import com.dgdev.luca.demojpa.repository.UserRepository;
import com.dgdev.luca.demojpa.service.DemoJpaService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class DemoJpaController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	DemoJpaService userService;

	@GetMapping("/test")
	public String retrieveCoursesForStudent() {
		System.out.println("TEST");
		return "TEST";
	}

	@GetMapping("/get/{id}")
	User getUser(@PathVariable long id) {
		System.out.println("DemoJpaController#getUser");
		return userRepository.findOne(id);
	}

	@ApiOperation(value = "Crete a new User") // <- SWAGGER DOCS
	@PostMapping(value = "/create")
	long createUser(@ApiParam("The user to be created") // <- SWAGGER DOCS
	@RequestBody User user) {
		System.out.println("DemoJpaController#createUser");
		long id = userService.saveUser(user);
		System.out.println("ID: " + id);
		return id;
	}

}
