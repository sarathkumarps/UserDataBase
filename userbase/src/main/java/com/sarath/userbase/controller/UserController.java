//package com.sarath.userbase.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.sarath.userbase.model.User;
//import com.sarath.userbase.repository.UserRepository;
//
//@RestController
//public class UserController {
//	
//	
//	@Autowired
//	UserRepository userRepository;
//	
//	@GetMapping("/user-info")
//	public List<User> getAllUsersInfo()
//	{
//		return userRepository.findAll();
//	}
//
//}
