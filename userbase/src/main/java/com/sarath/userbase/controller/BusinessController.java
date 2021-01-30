package com.sarath.userbase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sarath.userbase.model.Business;
import com.sarath.userbase.model.SalesInfo;
import com.sarath.userbase.repository.BusinessRepository;

@RestController
public class BusinessController {
	
	@Autowired
	BusinessRepository businessRepository;
	
	@GetMapping("/business")
	public List<Business> getAllBusiness()
	{
		
		return businessRepository.findAll();
		
	}
	
	@GetMapping("/business/{id}")
	public Optional<Business> getSalesById(@PathVariable int id)
	{
		Optional<Business> business=businessRepository.findById(id);
		return business;
	}
	

}
