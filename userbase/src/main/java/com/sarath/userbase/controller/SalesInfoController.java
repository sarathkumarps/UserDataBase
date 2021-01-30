package com.sarath.userbase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sarath.userbase.model.SalesInfo;
import com.sarath.userbase.model.User;
import com.sarath.userbase.repository.SalesInfoRepository;

@RestController
public class SalesInfoController {

	@Autowired
	SalesInfoRepository salesInfoRepository;
	
	@GetMapping("/sales")
	public List<SalesInfo> getAllSales()
	{
		return salesInfoRepository.findAll();
	}
	
	@GetMapping("/sales/{id}")
	public Optional<SalesInfo> getSalesById(@PathVariable int id)
	{
		Optional<SalesInfo> sale=salesInfoRepository.findById(id);
		return sale;
	}
}
