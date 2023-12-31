package com.foodexpress.alimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodexpress.alimento.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
		
	Customer findCustomerByEmailIdAndPassword(String emailId,String password);
	
}
