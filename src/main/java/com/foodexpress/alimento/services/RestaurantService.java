package com.foodexpress.alimento.services;

import java.util.List;

import com.foodexpress.alimento.models.Restaurant;

public interface RestaurantService {
		 
	Restaurant saveRestaurant(Restaurant restaurant);
	Restaurant loginRestaurant(long id,String password);
	Restaurant updateRestaurant(Restaurant restaurant, long restaurantId);
	Restaurant getRestaurantById(long restaurantId);
	List<Restaurant> getAllRestaurants();
	void deleteRestaurant(long restaurantId);	
}
