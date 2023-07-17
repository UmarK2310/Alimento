package com.foodexpress.alimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.foodexpress.alimento.models.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
	
//	Restaurant findRestaurantBy(long rID,String password);
	@Query(value = "select r from Restaurant r where r.rId = ?1 and r.rPassword = ?2 ") // JPQL
	 public Restaurant findRestaurantByRidAndRpassword(long rId, String password);
}
