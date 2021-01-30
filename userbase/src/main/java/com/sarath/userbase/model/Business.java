package com.sarath.userbase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="business")
public class Business {
	
	@Id
	@GeneratedValue
	private int business_id;
	
	private String business_name;
	private String business_email;
	private long business_contact_no;
	private String business_city;
	@JsonIgnore
	private int ref_uid;
	public int getBusiness_id() {
		return business_id;
	}
	public void setBusiness_id(int business_id) {
		this.business_id = business_id;
	}
	public String getBusiness_name() {
		return business_name;
	}
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
	public String getBusiness_email() {
		return business_email;
	}
	public void setBusiness_email(String business_email) {
		this.business_email = business_email;
	}
	public long getBusiness_contact_no() {
		return business_contact_no;
	}
	public void setBusiness_contact_no(int business_contact_no) {
		this.business_contact_no = business_contact_no;
	}
	public String getBusiness_city() {
		return business_city;
	}
	public void setBusiness_city(String business_city) {
		this.business_city = business_city;
	}
	public int getRef_uid() {
		return ref_uid;
	}
	public void setRef_uid(int ref_uid) {
		this.ref_uid = ref_uid;
	}
	public Business(int business_id, String business_name, String business_email, long business_contact_no,
			String business_city, int ref_uid) {
		super();
		this.business_id = business_id;
		this.business_name = business_name;
		this.business_email = business_email;
		this.business_contact_no = business_contact_no;
		this.business_city = business_city;
		this.ref_uid = ref_uid;
	}
	public Business() {
		super();
	}
	@Override
	public String toString() {
		return "Business [business_id=" + business_id + ", business_name=" + business_name + ", business_email="
				+ business_email + ", business_contact_no=" + business_contact_no + ", business_city=" + business_city
				+ ", ref_uid=" + ref_uid + "]";
	}
	
	
	
	

}
