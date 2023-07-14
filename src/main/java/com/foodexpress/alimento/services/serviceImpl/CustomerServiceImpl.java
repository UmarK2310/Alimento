package com.foodexpress.alimento.services.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.foodexpress.alimento.models.Customer;
import com.foodexpress.alimento.repositories.CustomerRepository;
import com.foodexpress.alimento.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

		@Autowired
		private CustomerRepository customerRepo;
	
	@Override
	public Customer saveCustomer(Customer customer) {		
		return customerRepo.saveAndFlush(customer);
	}
	
	public Customer loginCustomer(String email, String password) {
		return  this.customerRepo.findCustomerByEmailIdAndPassword(email,password);
		//return this.customerRepo.findByEmailIDAndPassword(customer.emailID,customer.password);
	}

	@Override
	public Customer updateCustomer(Customer customer, long customerId) {
		Customer existingCustomer=customerRepo.findById(customerId).get();
		existingCustomer.setAddress(customer.getAddress());
		existingCustomer.setMobilenumber(customer.getMobilenumber());
		existingCustomer.setPassword(customer.getPassword());
		customerRepo.save(existingCustomer);
		return existingCustomer;
	}

	@Override
	public Customer getCustomerById(long customerId) {
//		Customer customer = customerRepo.getById(customerId);
//		System.out.println(customer.getAddress());
		return customerRepo.findById(customerId).get();
	}

	@Override
	public void deleteCustomer(long customerId) {
		customerRepo.deleteById(customerId);
		
	}

}
