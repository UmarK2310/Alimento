package com.foodexpress.alimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodexpress.alimento.models.FoodItems;

public interface FoodItemsRepository extends JpaRepository<FoodItems, Integer>{

}
