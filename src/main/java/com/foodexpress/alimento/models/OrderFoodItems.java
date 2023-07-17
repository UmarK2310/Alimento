package com.foodexpress.alimento.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "order_food_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderFoodItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order orders;

    @ManyToOne
    @JoinColumn(name = "F_ID")
    private FoodItems foodItems;

    private int quantity;

}