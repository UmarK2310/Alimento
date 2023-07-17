package com.foodexpress.alimento.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	
	@Column(name = "TotalAmount")
	private double totalAmount;
	  
	@Column(name = "payment_status")
	private String paymentStatus= "paid";
	  
	@Column
	private Date orderDate;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="Customer_ID",referencedColumnName = "id")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="Restaurant_Id",referencedColumnName = "rId")
	private Restaurant restaurant;
	
	@OneToMany(mappedBy = "orders")
	private Set<OrderFoodItems> orderFoodItems ;

	
	@OneToOne(mappedBy="order",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="payment_ID")
	private Payment payment;


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Restaurant getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}


	public Set<OrderFoodItems> getOrderFoodItems() {
		return orderFoodItems;
	}


	public void setOrderFoodItems(Set<OrderFoodItems> orderFoodItems) {
		this.orderFoodItems = orderFoodItems;
	}


	public Payment getPayment() {
		return payment;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	

}