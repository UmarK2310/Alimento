package com.foodexpress.alimento.services;

import com.foodexpress.alimento.models.Customer;

public interface CustomerService {
		
	Customer saveCustomer(Customer customer);
	Customer loginCustomer(String email, String password);
	Customer updateCustomer(Customer customer, long customerId);
	Customer getCustomerById(long customerId);
	void deleteCustomer(long customerId);

}
