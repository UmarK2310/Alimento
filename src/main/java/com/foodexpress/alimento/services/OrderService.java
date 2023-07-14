package com.foodexpress.alimento.services;

import java.util.List;

import com.foodexpress.alimento.models.Order;

public interface OrderService {
		 
	Order save(int cartId,long customerId,Order order);
	Order updateOrder(Order order, int orderId);
	Order getOrderById(int orderId);
	List<Order> getOrderByCustomerId(long customerId);
	List<Order> getAllOrders(long rId);
	void deleteOrder(int orderId);	
	
}
