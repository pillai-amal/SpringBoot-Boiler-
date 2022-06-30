package com.example.boiler.DAO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.boiler.entity.Customer;
import com.example.boiler.repository.CustomerCRUDRepo;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	CustomerCRUDRepo customerCRUDRepo;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerCRUDRepo.save(customer);
	}
	
	@Override
	public Optional<Customer> getCustomerById(int id) {
		return customerCRUDRepo.findById(id);
	}
	
	@Override
	public void deleteCustomer(int id) {
		System.out.println("delete dao method");
		customerCRUDRepo.deleteById(id);
	}
}
