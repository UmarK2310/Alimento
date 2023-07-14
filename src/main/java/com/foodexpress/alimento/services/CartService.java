package com.foodexpress.alimento.services;

import com.foodexpress.alimento.models.Cart;
import com.foodexpress.alimento.models.Customer;

public interface CartService {
	Cart addCart(Cart cart,long fId,long customerId);
	Cart getCartById(long cartId);
	Cart updateCart(Cart cart, long cartId);
	void deleteCartByCustomer(Customer c);
}
