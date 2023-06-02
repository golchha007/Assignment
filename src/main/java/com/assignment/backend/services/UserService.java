package com.assignment.backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.backend.models.User;
import com.assignment.backend.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getAllUser() {
		return  this.userRepository.findAll();
	}

	public User addUser(User user) {
		return this.userRepository.save(user);
	}
}
