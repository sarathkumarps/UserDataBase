package com.sarath.userbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarath.userbase.model.Business;

public interface BusinessRepository extends JpaRepository<Business, Integer> {

}
