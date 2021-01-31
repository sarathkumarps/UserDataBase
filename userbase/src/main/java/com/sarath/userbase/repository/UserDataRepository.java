package com.sarath.userbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarath.userbase.model.UserData;

public interface UserDataRepository extends JpaRepository<UserData, Integer>{

}
