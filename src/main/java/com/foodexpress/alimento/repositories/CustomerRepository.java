package com.foodexpress.alimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodexpress.alimento.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
