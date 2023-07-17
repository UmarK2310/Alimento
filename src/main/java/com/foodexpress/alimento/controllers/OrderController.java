package com.foodexpress.alimento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.foodexpress.alimento.models.Order;
import com.foodexpress.alimento.services.OrderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/Orders")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("{id}/{cartId}")
	public Order addOrder(@PathVariable long customerId,int cartId, Order order) {
		return null;//orderService.save(orderid);
	}
	
//	@PutMapping("{id}")
//	public Order updateOrder(@RequestBody Order order,@RequestParam("orderId")int orderId) {
//		return orderService.updateOrder(order, orderId);
//	}
//	
	@GetMapping("{id}")
	public Order findOrderByID(@PathVariable("orderId")int orderId) {
		return orderService.getOrderById(orderId);
	}
	
//	@GetMapping("{id}")
//	public Order findOrderByCustomerId(@PathVariable("id")long customerId) {
//		return orderService.getOrderByCustomerId(customerId);
//	}

//	@GetMapping("/AllOrders")
//	public Order findAllByRestaurantId(@RequestParam("rid")long rId) {
//		return orderService.getAllOrders(rId);
//	}
	
//	@DeleteMapping("{id}")
//	public void deleteByOrderId(@PathVariable("orderId")int orderId) {
//		orderService.deleteOrder(orderId);
//	}
	

}
