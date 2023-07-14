package com.foodexpress.alimento.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foodexpress.alimento.models.FoodItemCategory;
import com.foodexpress.alimento.models.FoodItems;

@Service
public interface FoodItemsService {
		
		FoodItems addFoodItem(long restaurantId,String foodName,String foodDescription,float foodPrice,
				FoodItemCategory foodCategory);
		List<FoodItems> getAllFoodItems();
		FoodItems updateFoodItem(FoodItems foodItem,int fId);
		void deleteFoodItem(int foodId);
		FoodItems getFoodItemById(int foodid);
		List<FoodItems> getByCategory(FoodItemCategory category);
}
