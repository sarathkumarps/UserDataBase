package com.sarath.userbase.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarath.userbase.model.Business;
import com.sarath.userbase.model.User;
import com.sarath.userbase.repository.BusinessRepository;
import com.sarath.userbase.repository.UserRepository;
import com.sarath.userbase.repository.UserRoleRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	
	

	

	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		
		return userRepository.findAll();
	}
	
//	
//	@GetMapping("/customHeader")
//	ResponseEntity<String> customHeader() {
//	    HttpHeaders headers = new HttpHeaders();
//	    headers.add("Custom-Header", "foo");
//	        
//	    return new ResponseEntity<>(
//	      "Custom header set", headers, HttpStatus.OK);
//	}
	
	
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable int id)
	{
		
		Optional<User> user=userRepository.findById(id);
		return user;
	}
	
	
	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user)
	{
		
		return userRepository.save(user);
	}

}
