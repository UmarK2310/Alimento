package com.foodexpress.alimento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.foodexpress.alimento.models.Customer;
import com.foodexpress.alimento.models.FoodItemCategory;
import com.foodexpress.alimento.models.FoodItems;
import com.foodexpress.alimento.models.Restaurant;
import com.foodexpress.alimento.repositories.FoodItemsRepository;
import com.foodexpress.alimento.services.FoodItemsService;

@RestController
@RequestMapping("api/foodItem")
public class FoodItemsController {
	@Autowired
	private FoodItemsRepository foodItemsRepository;
	
//	@Autowired
//	private FoodItemsService foodItemService;
//	
	
	
	@PostMapping 
	public FoodItems saveFoodItems(@RequestParam("fName")
	String fName , @RequestParam("fPrice") float fPrice,
	@RequestParam("restaurantId") long restaurantId ,
	@RequestParam("category") FoodItemCategory category)
	{
		FoodItems foodItems = new FoodItems ();
		foodItems.setCategory(category);
		foodItems.setfName(fName);
		foodItems.setfPrice(fPrice);
		Restaurant restaurant = new Restaurant();
		restaurant.setrId(restaurantId);
		foodItems.setRestaurant(restaurant);
		return foodItemsRepository.save(foodItems);
		
	}
	
	@GetMapping("/all")
	public FoodItems getAll() {
		return null;
	}

	 @PutMapping("foodItem/{id}")//update foodITem
	 public FoodItems update(@RequestParam("restaurantId")long restaurantId,@RequestParam("fId") int fId) {
		 return null;
	 }
	 
	 @DeleteMapping("foodItem/{id}")
	 public void delete(@PathVariable("{fid}")int fId) {
		// FoodItemService.deleteFoodItem(fId);
		 System.out.println("Deleted");
	 }
	 
		@GetMapping("foodItem/{fid}")
		public FoodItems find(@PathVariable("fId") int fId) {
			return null;//FoodItemService.getFoodItemById(fId);
}
		@GetMapping("foodItem/{category}")
		public FoodItems findByCategory(@PathVariable("category") FoodItemCategory category) {
			return null;//FoodItemService.getFoodItemB
}
		
		
}