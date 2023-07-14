package com.foodexpress.alimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodexpress.alimento.models.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
	
	Restaurant findByRIdAndRPassword(long rID,String password);

}
