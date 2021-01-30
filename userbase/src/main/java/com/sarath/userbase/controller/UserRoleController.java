package com.sarath.userbase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sarath.userbase.model.User;
import com.sarath.userbase.model.UserRole;
import com.sarath.userbase.repository.UserRoleRepository;

@RestController
public class UserRoleController {
	
	@Autowired
	UserRoleRepository userRoleRepository;
	
	
	@GetMapping("/roles")
	public List<UserRole> getAllUsers()
	{
		
		return userRoleRepository.findAll();
	}
	@GetMapping("/roles/{id}")
	public Optional<UserRole> getUserById(@PathVariable int id)
	{
		Optional<UserRole> userRole=userRoleRepository.findById(id);
		return userRole;
	}

}
