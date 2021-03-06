package com.sarath.userbase.model;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="users")
public class UserData {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	
	
	private int user_role_id;
	@Size(message = "Enter a valid name",min = 1)
	private String fname;
	
	private String lname;

	private String gender;

	private String phonenumber;

	private String email;

	
	private String password;

	@Column(name="created_time")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date created_time;

//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="last_modified_time")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date last_modified_time;
	
	private boolean active;
	
	
	@ManyToOne()
	@JoinColumn(name="user_role_id", referencedColumnName = "user_role_id", insertable = false, updatable = false)    
	private UserRole userRole;
	
	
	//Printing Status
	
//	private  List<ResponseStatus> responseStatus=new ArrayList<ResponseStatus>(Arrays.asList(new ResponseStatus("1426615606",200,"null","fetched")));
			
		
	
	
	




	public UserData() {
		super();
	}

	public UserData(int userid, int user_role_id, @Size(message = "Enter a valid name", min = 1) String fname, String lname,
			String gender, String phonenumber, String email, String password, Date created_time, Date last_modified_time,
			boolean active, UserRole userRole
//			,List<ResponseStatus> responseStatus
			) {
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
//		this.responseStatus = responseStatus;
	}
	
	






	
	
	
	public int getUserid() {
		return userid;
	}

//	public List<ResponseStatus> getResponseStatus() {
//		return responseStatus;
//	}
//
//	public void setResponseStatus(List<ResponseStatus> responseStatus) {
//		this.responseStatus = responseStatus;
//	}

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


	public UserRole getUserRole() {
		return userRole;
	}


	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}


	 


	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "UserData [userid=" + userid + ", user_role_id=" + user_role_id + ", fname=" + fname + ", lname=" + lname
				+ ", gender=" + gender + ", phonenumber=" + phonenumber + ", email=" + email + ", password=" + password
				+ ", created_time=" + created_time + ", last_modified_time=" + last_modified_time + ", active=" + active
				+ ", userRole=" + userRole + ""+ 
//				", responseStatus=" + responseStatus +
				"]";
	}
	
//	@Override
//	public String toString() {
//		return "UserData [userid=" + userid + ", user_role_id=" + user_role_id + ", fname=" + fname + ", lname=" + lname
//				+ ", gender=" + gender + ", phonenumber=" + phonenumber + ", email=" + email + ", password=" + password
//				+ ", created_time=" + created_time + ", last_modified_time=" + last_modified_time + ", active=" + active
//				+ ", userRole=" + userRole + "]" ;
//	}




	


	

	


	
}
