package com.foodexpress.alimento.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.foodexpress.alimento.models.FoodItemCategory;
import com.foodexpress.alimento.models.FoodItems;

public interface FoodItemsRepository extends JpaRepository<FoodItems, Integer>{
	
	//public List<FoodItems> findByFoodItemId(long fId);
	List<FoodItems> findByCategory(FoodItemCategory category);
	
	
	/*8
	 * 1. jpql
	 * 2. method queries
	 * 3. native qureies
	 */
	
}
