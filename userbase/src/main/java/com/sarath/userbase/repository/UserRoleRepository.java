package com.sarath.userbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarath.userbase.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

}
