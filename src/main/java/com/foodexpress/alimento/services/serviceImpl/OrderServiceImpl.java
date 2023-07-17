package com.foodexpress.alimento.services.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodexpress.alimento.models.Customer;
import com.foodexpress.alimento.models.Order;
import com.foodexpress.alimento.models.OrderFoodItems;
import com.foodexpress.alimento.repositories.CustomerRepository;
import com.foodexpress.alimento.repositories.FoodItemsRepository;
import com.foodexpress.alimento.repositories.OrderRepository;
import com.foodexpress.alimento.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository orderRepo;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	FoodItemsRepository fooditemRepo;
		
	
	@Override
	public Order getOrderById(int orderId) {
		return orderRepo.findById(orderId).get();
	}

	@Override
	public List<Order> getOrderByCustomerId(long customerId) {
		// TODO Auto-generated method stub
		return null;//orderRepo.findAllById(customerId);
		//select * from order where orderid =  ?
	}

	@Override
	public List<Order> getAllOrders(long rId) {
//		RestaurantRepository restaurantRepo=new RestaurantRepository();
//		Restaurant restaurant= restaurantRepo.findById(rId).get();
		return null;}

	@Override
	public Order save(long customerId, Map<Integer, Integer> map) {
		Order order = new Order();
	Customer existingCustomer=customerRepo.findById(customerId).get();
	order.setOrderDate(order.getOrderDate());
	order.setCustomer(existingCustomer);
	order.setRestaurant(order.getRestaurant());
	order.setPaymentStatus("Paid");
	
    for (Integer key : map.keySet()) {
        System.out.println(key + "foodItemId: " + map.get(key));
    }
	
	//OrderFoodItems existingFItems=fooditemRepo.findById(foodItemid);
	float totalItemAmount=0;
	for(int i=0; i<=no of items;i++) {
		
		totalItemAmount = exisitngFoodORderID from FoodItems * FoodItemQuantity from OrderItems;
		double totalAmount=0; 
		totalAmount = totalAmount + totalItemAmount;
		order.setTotalAmount(customerId);
		
	}
	
		return null;
	}
	
	

	}

