package com.foodexpress.alimento.services.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodexpress.alimento.models.Restaurant;
import com.foodexpress.alimento.repositories.RestaurantRepository;
import com.foodexpress.alimento.services.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService{

		@Autowired
		RestaurantRepository restaurantRepo;
		
	@Override
	public Restaurant saveRestaurant(Restaurant restaurant) {
		return restaurantRepo.saveAndFlush(restaurant);
	}

	@Override
	public Restaurant loginRestaurant(long id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurant updateRestaurant(Restaurant restaurant, long restaurantId) {
		Restaurant existingRestaurant= restaurantRepo.getById(restaurantId);
		existingRestaurant.setrPassword(restaurant.getrPassword());
		existingRestaurant.setrMobileNo(restaurant.getrMobileNo());
		existingRestaurant.setFoodItems(restaurant.getFoodItems());
		return existingRestaurant;
	}

	@Override
	public Restaurant getRestaurantById(long restaurantId) {
	
		return restaurantRepo.findById(restaurantId).get();
	}

	@Override
	public List<Restaurant> getAllRestaurants() {

		return restaurantRepo.findAll();
	}

	@Override
	public void deleteRestaurant(long restaurantId) {
		restaurantRepo.deleteById(restaurantId);
		
	}


}
