package com.example.boiler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.boiler.entity.Customer;
												// Which Obj      //Primary Key Type
public interface CustomerCRUDRepo extends JpaRepository<Customer, Integer> {

}
