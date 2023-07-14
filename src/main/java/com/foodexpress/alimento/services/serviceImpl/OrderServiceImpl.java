package com.foodexpress.alimento.services.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodexpress.alimento.models.Cart;
import com.foodexpress.alimento.models.Order;
import com.foodexpress.alimento.models.Restaurant;
import com.foodexpress.alimento.repositories.OrderRepository;
import com.foodexpress.alimento.repositories.RestaurantRepository;
import com.foodexpress.alimento.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepo;
	
	@Override
	public Order save(int cartId, long customerId, Order order) {
		Cart cart=new Cart();
		cart.setCartId(cartId);
		
		
		return null;
	}

	@Override
	public Order updateOrder(Order order, int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderById(int orderId) {
		// TODO Auto-generated method stub
		return orderRepo.findById(orderId).get();
	}

	@Override
	public List<Order> getOrderByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return orderRepo.findAllById(customerId);
	}

	@Override
	public List<Order> getAllOrders(long rId) {
//		RestaurantRepository restaurantRepo=new RestaurantRepository();
//		Restaurant restaurant= restaurantRepo.findById(rId).get();
		return null;
	}

	@Override
	public void deleteOrder(int orderId) {
		orderRepo.deleteById(orderId);
		
		
	}
}
