package com.foodexpress.alimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodexpress.alimento.models.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer >{

}
