package com.foodexpress.alimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.foodexpress.alimento.models.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
	
//	@Query(value = "select o from orders o where o.restaurant_id =restaurant_id") // JPQL
//	 public Order findOrderByRid(@Param("restaurant_id") long restaurant_id);
////	
//	@Query(value = "select r from orders r where id = ?1") // JPQL
//	public Order findOrderById(long cid);
}
