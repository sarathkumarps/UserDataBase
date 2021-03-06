package com.sarath.userbase.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarath.userbase.model.SalesInfo;
import com.sarath.userbase.model.UserData;
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
	@PostMapping("/sales")
	public SalesInfo createSale(@Valid @RequestBody SalesInfo salesInfo)
	{
		return salesInfoRepository.save(salesInfo);
	}
	
	@PutMapping("/sales/{id}")
	public ResponseEntity<SalesInfo> updateSalesInfo(@Valid @PathVariable int id,@RequestBody SalesInfo salesInfo)
	{
		final SalesInfo updatedSalesInfo=salesInfoRepository.save(salesInfo);
		
		return ResponseEntity.ok(updatedSalesInfo);
		
	}
}
