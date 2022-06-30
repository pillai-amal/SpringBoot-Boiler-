package com.example.boiler.DAO;

import java.util.Optional;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.boiler.entity.Customer;

public interface CustomerDAO {
	public Customer saveCustomer(@RequestBody Customer customer);
	Optional<Customer> getCustomerById(int id);
	void deleteCustomer(int id);
}
