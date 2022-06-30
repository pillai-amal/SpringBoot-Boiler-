package com.example.boiler.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cID;
	
	@Column
	private String customerName;
	@Column
	private String customerPhone;
	public Integer getcID() {
		return cID;
	}
	public void setcID(Integer cID) {
		this.cID = cID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public Customer(Integer cID, String customerName, String customerPhone) {
		super();
		this.cID = cID;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
	}
	
}
