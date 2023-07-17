package com.foodexpress.alimento.services;

import java.util.List;
import java.util.Map;

import com.foodexpress.alimento.models.Order;

public interface OrderService {
		 
	Order save(long customerId,Map<Integer, Integer> map);
	Order getOrderById(int orderId);
	
	List<Order> getOrderByCustomerId(long customerId);
	List<Order> getAllOrders(long rId);

}
