package com.foodexpress.alimento.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "C_Order")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="Customer_ID",referencedColumnName = "id")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="Restaurant_Id",referencedColumnName = "rId")
	private Restaurant restaurant;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="Food_Items",referencedColumnName= "fId")
	private FoodItems foodItems;
	
	@OneToOne(mappedBy="order",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="payment_ID")
	private Payment payment;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
	
	

}
