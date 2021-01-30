package com.sarath.userbase.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="sales_info")
public class SalesInfo {
	
	@Id
	@GeneratedValue()
	private int sales_id;
	
	@JsonIgnore
	private int ref_bid;
	
	private String invoice_number;
	
	private float amount;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date invoicedate;
	
	
	
	public int getSales_id() {
		return sales_id;
	}
	public void setSales_id(int sales_id) {
		this.sales_id = sales_id;
	}
	public int getRef_bid() {
		return ref_bid;
	}
	public void setRef_bid(int ref_bid) {
		this.ref_bid = ref_bid;
	}
	public String getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getInvoicedate() {
		return invoicedate;
	}
	public void setInvoicedate(Date invoicedate) {
		this.invoicedate = invoicedate;
	}
	public SalesInfo(int sales_id, int ref_bid, String invoice_number, float amount, Date invoicedate) {
		super();
		this.sales_id = sales_id;
		this.ref_bid = ref_bid;
		this.invoice_number = invoice_number;
		this.amount = amount;
		this.invoicedate = invoicedate;
	}
	public SalesInfo() {
		super();
	}
	@Override
	public String toString() {
		return "SalesInfo [sales_id=" + sales_id + ", ref_bid=" + ref_bid + ", invoice_number=" + invoice_number
				+ ", amount=" + amount + ", invoicedate=" + invoicedate + "]";
	}
	
	
	


}
