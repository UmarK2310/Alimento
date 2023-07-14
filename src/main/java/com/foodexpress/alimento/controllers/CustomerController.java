package com.foodexpress.alimento.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.foodexpress.alimento.models.Customer;
import com.foodexpress.alimento.services.CustomerService;

@RestController
@RequestMapping("api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
//	@GetMapping
//	@RequestMapping( "{id}")
//	public Customer get(@PathVariable Long id) {
//		return customerRepository.getOne(id);
//	}
//	
//  @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//  public void delete(@PathVariable Long id) {
//  	customerRepository.deleteById(id);
//  }	
//  
	@PostMapping("/register")// register new customer
	public Customer create(@Valid @RequestBody final Customer customer) {
		
		return customerService.saveCustomer(customer);
	}
	 
	@GetMapping("/{id}") // findCustomr by ID in case of forgot password, requested by Admin
	public Customer find(@PathVariable("id") Long customerId) {
		return customerService.getCustomerById(customerId);
	}

    @PostMapping("/login") // login for customer
   public Customer login( @RequestParam("email") String email , @RequestParam("password") String password) {
	 return customerService.loginCustomer(email,password);
    }
    
	 @PutMapping("customer/{id}")//update customer
	 public Customer update(@PathVariable("{id}")long customerId,@RequestBody Customer customer) {
		 return customerService.updateCustomer(customer, customerId);
	 }
	 
	 @DeleteMapping("customer/{id}")
	 public void delete(@PathVariable("{id}")long customerId) {
		 customerService.deleteCustomer(customerId);
		 System.out.println("Deleted");
	 }
	 
		@PostMapping("/{cid}/{newpassword}")
		public Customer changeCustomerPassword(@PathVariable("cid") long cid,@PathVariable("newpassword") String newpassword) {
			Customer c=customerService.getCustomerById(cid);
			c.setPassword(newpassword);
			customerService.updateCustomer(c, cid);
			return c;
		}
	
}
