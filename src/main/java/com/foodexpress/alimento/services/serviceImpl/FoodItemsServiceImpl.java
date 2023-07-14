package com.foodexpress.alimento.services.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodexpress.alimento.models.FoodItemCategory;
import com.foodexpress.alimento.models.FoodItems;
import com.foodexpress.alimento.models.Restaurant;
import com.foodexpress.alimento.repositories.FoodItemsRepository;
import com.foodexpress.alimento.services.FoodItemsService;

public class FoodItemsServiceImpl implements FoodItemsService{

		@Autowired
		FoodItemsRepository foodItemRepo;
	
	@Override
	public FoodItems addFoodItem(long restaurantId, String foodName, String foodDescription, float foodPrice,
			FoodItemCategory foodCategory) {
		FoodItems foodItem=new FoodItems();
		foodItem.setfName(foodItem.getfName());
		foodItem.setfPrice(foodItem.getfPrice());
		foodItem.setfDescription(foodItem.getfDescription());
		Restaurant restaurant=new Restaurant();
		restaurant.setrId(restaurantId);
		foodItem.setRestaurant(restaurant);
		return foodItemRepo.saveAndFlush(foodItem);
	}

	@Override
	public List<FoodItems> getAllFoodItems() {
	
		return foodItemRepo.findAll();
	}

	@Override
	public FoodItems updateFoodItem(FoodItems foodItem, int fId) {
		// TODO Auto-generated method stub
		FoodItems existingFItems = foodItemRepo.findById(fId).get();
		existingFItems.setfName(foodItem.getfName());
		existingFItems.setfPrice(foodItem.getfPrice());
		existingFItems.setfDescription(foodItem.getfDescription());
	//	existingFItems.setRestaurant(foodItem.getRestaurant());
		return existingFItems;
	}

	@Override
	public void deleteFoodItem(int foodId) {
		foodItemRepo.deleteById(foodId);
	}

	@Override
	public FoodItems getFoodItemById(int foodId) {

		return foodItemRepo.findById(foodId).get();
	}

	@Override
	public List<FoodItems> getByCategory(FoodItemCategory category) {
		return foodItemRepo.findByCategory(category);
	}



}
