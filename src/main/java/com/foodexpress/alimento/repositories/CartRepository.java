package com.foodexpress.alimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodexpress.alimento.models.Cart;
import com.foodexpress.alimento.models.Customer;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

	//void deleteCartByCustomer(Customer c);
}
