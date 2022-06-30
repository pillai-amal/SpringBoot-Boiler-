/*
 * This is the service layer
 * Business Logic will be implemented here
 */

package com.example.boiler.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boiler.DAO.CustomerDAOImpl;
import com.example.boiler.entity.Customer;

@Service
public class CustomerServiceImpl implements customerService {
	
	@Autowired
	CustomerDAOImpl customerDAOImpl;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerDAOImpl.saveCustomer(customer);
	}
	
	@Override
	public Optional<Customer> getCustomerById(int id) {
		//business logic code
		return customerDAOImpl.getCustomerById(id);
	}


	@Override
	public void deleteCustomer(int id) {
		System.out.println("business logic code");
		System.out.println("delete service");
		customerDAOImpl.deleteCustomer(id);
	}
	
} 
