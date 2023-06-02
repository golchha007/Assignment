package com.assignment.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.backend.models.User;
import com.assignment.backend.services.UserService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private UserService userService;

	public LoginController(UserService loginService) {
		this.userService = loginService;
	}

	@PostMapping("")
	public User addUser(@RequestBody User user) {

		return this.userService.addUser(user);
	}

	@GetMapping("")
	public List<User> getAllUser(){

		return userService.getAllUser();
	}
}
