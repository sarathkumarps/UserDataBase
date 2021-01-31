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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarath.userbase.model.Business;
import com.sarath.userbase.model.UserData;
import com.sarath.userbase.repository.BusinessRepository;
import com.sarath.userbase.repository.UserDataRepository;
import com.sarath.userbase.repository.UserRoleRepository;

@RestController
public class UserDataController {
	@Autowired
	UserDataRepository userDataRepository;
	

	@GetMapping("/users")
	public List<UserData> getAllUsers()
	{
		
		return userDataRepository.findAll();
	}
	

	
	
	@GetMapping("/users/{id}")
	public Optional<UserData> getUserById(@PathVariable int id)
	{
		
		Optional<UserData> user=userDataRepository.findById(id);
		return user;
	}
	
//	@GetMapping("/users/{id}")
//	public ResponseEntity<User> getUserById(@PathVariable(value = "id") int id){
//	 
//	 User user = userRepository.findById(id);
//	   
//	 return ResponseEntity.ok().body(user);
//	}

	
	
	

//	@GetMapping("/users/{id}")
//	public ResponseEntity<Users> getUserById(@PathVariable(value = "id") int id)
//	 throws ResourceNotFoundException {
//	 User employee = userRepository.findById(id)
//	   .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
//	 return ResponseEntity.ok().body(employee);
//	}
	
	

	@PostMapping(value = "/users")
	public Optional<UserData> createUser(@Valid @RequestBody UserData user)
	{
		userDataRepository.save(user);
		return userDataRepository.findById(user.getUserid()); 
	}
	
//	@PostMapping("/users")
//	public User createUser(@Valid @RequestBody User user)
//	{
//		return userRepository.save(user);
//	}

	@PutMapping("/users/{id}")
	public ResponseEntity<UserData> updateUser(@Valid @PathVariable int id,@RequestBody UserData userData)
	{
		
//		userData.setUserid(userData.getUserid());
//		userData.setUser_role_id(userData.getUser_role_id());
//		userData.setFname(userData.getFname());
//		userData.setLname(userData.getLname());
//		userData.setGender(userData.getGender());
//		userData.setEmail(userData.getEmail());
//		userData.setPhonenumber(userData.getPhonenumber());
//		userData.setPassword(userData.getPassword());
//		userData.setCreated_time(userData.getCreated_time());
//		userData.setLast_modified_time(userData.getLast_modified_time());
//		userData.setActive(userData.isActive());
//		userData.setUserRole(userData.getUserRole());
		final UserData updatedUserData= userDataRepository.save(userData);
		return ResponseEntity.ok(updatedUserData);
		
	}
	
}
