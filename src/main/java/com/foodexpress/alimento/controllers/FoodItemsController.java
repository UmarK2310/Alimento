package com.foodexpress.alimento.controllers;

import java.util.List;

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

import com.foodexpress.alimento.models.Customer;
import com.foodexpress.alimento.models.FoodItemCategory;
import com.foodexpress.alimento.models.FoodItems;
import com.foodexpress.alimento.models.Restaurant;
import com.foodexpress.alimento.repositories.FoodItemsRepository;
import com.foodexpress.alimento.services.FoodItemsService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/foodItem")
public class FoodItemsController {
	
	@Autowired
	private FoodItemsService foodItemService;
	
	@PostMapping("/AddFoodItem")
	public FoodItems saveFoodItems(@RequestParam("fName")
	String fName , @RequestParam("fPrice") float fPrice,
	@RequestParam("restaurantId") long restaurantId ,
	@RequestParam("category") FoodItemCategory category)
	{
		return foodItemService.addFoodItem(restaurantId, fName, fName, fPrice, category);
		
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
		foodItemService.deleteFoodItem(fId);
		 System.out.println("Deleted");
	 }
	 
		@GetMapping("foodItem/{fid}")
		public FoodItems find(@PathVariable("fId") int fId) {
			return foodItemService.getFoodItemById(fId);
}
		@GetMapping("foodItem/{category}")
		public List<FoodItems> findByCategory(@PathVariable("category") FoodItemCategory category) {
			return foodItemService.getByCategory(category);
}
		
		
}