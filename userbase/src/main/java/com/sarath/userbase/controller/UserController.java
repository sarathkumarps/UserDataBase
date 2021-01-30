package com.sarath.userbase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sarath.userbase.model.User;
import com.sarath.userbase.repository.UserRepository;
import com.sarath.userbase.repository.UserRoleRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserRoleRepository UserRoleRepository;
	
	

	

	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		
		return userRepository.findAll();
	}
	
	
	
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable int id)
	{
		
		Optional<User> user=userRepository.findById(id);
		return user;
	}

}