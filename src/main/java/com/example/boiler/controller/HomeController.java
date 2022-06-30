/*
 * MVC - MODEL VIEW CONTROLLER 
 * Model -> (data) (entity)
 * View  -> (UI Files) (html, css, bootstrapfiles ...)
 * Controller -> (java class)
 * 
 * Web Application |				Server
 * 				   |Multiple Clients /\/\
 * 
 */

package com.example.boiler.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boiler.entity.Customer;
import com.example.boiler.service.customerService;

@RestController
public class HomeController {
	@Autowired
	customerService cService;
	
	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return cService.saveCustomer(customer); //service method to be called here 
	}
	
	@RequestMapping("/getCustomerById/{id}")
	Optional<Customer> getCustomerById(@PathVariable int id){
		return cService.getCustomerById(id);
	}

	@DeleteMapping("/deleteCustomer/{id}")
	void deleteCustomer(@PathVariable int id){
		System.out.println("delete customer");
		cService.deleteCustomer(id);
	}
}
