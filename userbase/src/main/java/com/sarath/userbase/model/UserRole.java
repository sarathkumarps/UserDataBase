package com.sarath.userbase.model;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_role")
public class UserRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_role_id;
	
	private String user_role_name;
	
	

	public UserRole() {
		super();
	}

	public UserRole(int user_role_id, String user_role_name) {
		super();
		this.user_role_id = user_role_id;
		this.user_role_name = user_role_name;
		
	}

	public int getUser_role_id() {
		return user_role_id;
	}

	public void setUser_role_id(int user_role_id) {
		this.user_role_id = user_role_id;
	}

	public String getUser_role_name() {
		return user_role_name;
	}

	public void setUser_role_name(String user_role_name) {
		this.user_role_name = user_role_name;
	}

	

	

	@Override
	public String toString() {
		return "UserRole [user_role_id=" + user_role_id + ", user_role_name=" + user_role_name + ", user=" + "]";
	}
	
	
	
	


	
	

}
