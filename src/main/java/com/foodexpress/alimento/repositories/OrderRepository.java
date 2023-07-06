package com.foodexpress.alimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodexpress.alimento.models.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
