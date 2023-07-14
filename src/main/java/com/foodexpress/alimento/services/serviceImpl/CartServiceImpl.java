package com.foodexpress.alimento.services.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodexpress.alimento.models.Cart;
import com.foodexpress.alimento.models.Customer;
import com.foodexpress.alimento.repositories.CartRepository;
import com.foodexpress.alimento.services.CartService;
import com.foodexpress.alimento.services.CustomerService;
import com.foodexpress.alimento.services.FoodItemsService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	public CartRepository cartRepo;
	
	
	@Override
	public Cart addCart(Cart cart, long fId, long customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart getCartById(long cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart updateCart(Cart cart, long cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCartByCustomer(Customer c) {
		
		
	}

}
