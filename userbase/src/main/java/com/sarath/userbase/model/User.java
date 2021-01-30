package com.sarath.userbase.model;
//This is a test
//Hai




import java.util.Date;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="users")
public class User {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	
	
	private int user_role_id;
	
	private String fname;
	
	private String lname;

	private String gender;

	private String phonenumber;

	private String email;

	@JsonIgnore
	private String password;

	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date created_time;

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date last_modified_time;
	
	private boolean active;
	
	
	@ManyToOne()
	@JoinColumn(name="user_role_id", referencedColumnName = "user_role_id", insertable = false, updatable = false)    
	private UserRole userRole;


	public User() {
		super();
	}


	public User(int userid, int user_role_id, String fname, String lname, String gender, String phonenumber,
			String email, String password, Date created_time, Date last_modified_time, boolean active,
			UserRole userRole) {
		super();
		this.userid = userid;
		this.user_role_id = user_role_id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.phonenumber = phonenumber;
		this.email = email;
		this.password = password;
		this.created_time = created_time;
		this.last_modified_time = last_modified_time;
		this.active = active;
		this.userRole = userRole;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public int getUser_role_id() {
		return user_role_id;
	}


	public void setUser_role_id(int user_role_id) {
		this.user_role_id = user_role_id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getCreated_time() {
		return created_time;
	}


	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}


	public Date getLast_modified_time() {
		return last_modified_time;
	}


	public void setLast_modified_time(Date last_modified_time) {
		this.last_modified_time = last_modified_time;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public UserRole getUserRole() {
		return userRole;
	}


	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}


	@Override
	public String toString() {
		return "User [userid=" + userid + ", user_role_id=" + user_role_id + ", fname=" + fname + ", lname=" + lname
				+ ", gender=" + gender + ", phonenumber=" + phonenumber + ", email=" + email + ", password=" + password
				+ ", created_time=" + created_time + ", last_modified_time=" + last_modified_time + ", active=" + active
				+ ", userRole=" + userRole + "]";
	}
	
	


	

	


	
}
