package com.foodexpress.alimento.models;

import java.sql.Date;
import java.util.List;

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
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	
	@Column(name = "Price")
    private double price;
	

	@Column(name = "Quantity")
	private long quantity;
	
	@Column(name = "TotalAmount")
	private double totalAmount;
	  
	@Column(name = "order_status")
	private String orderStatus;
	  
	@Column(name = "payment_status")
	private String paymentStatus;
	  
	@Column
	private Date orderDate;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="Customer_ID",referencedColumnName = "id")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="Restaurant_Id",referencedColumnName = "rId")
	private Restaurant restaurant;
	
	@ManyToMany
	 @JoinTable(name = "Order_FItems",
     joinColumns = {
         @JoinColumn(name = "orderId")
     },
     inverseJoinColumns = {
         @JoinColumn(name = "fid")
     })
	private List<FoodItems> foodItems;
	
	@OneToOne(mappedBy="order",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="payment_ID")
	private Payment payment;

	

	public Order() {
		super();
	}
	



	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public long getQuantity() {
		return quantity;
	}



	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}



	public double getTotalAmount() {
		return totalAmount;
	}



	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}



	public String getOrderStatus() {
		return orderStatus;
	}



	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
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



	public List<FoodItems> getFoodItems() {
		return foodItems;
	}


	public void setFoodItems(List<FoodItems> foodItems) {
		this.foodItems = foodItems;
	}



	public Payment getPayment() {
		return payment;
	}



	public void setPayment(Payment payment) {
		this.payment = payment;
	}



	public Order(int orderId, double price, long quantity, double totalAmount, String orderStatus,
			String paymentStatus, Date orderDate, Customer customer, Restaurant restaurant, List<FoodItems> foodItems,
			Payment payment) {
		super();
		this.orderId = orderId;
		this.price = price;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.orderStatus = orderStatus;
		this.paymentStatus = paymentStatus;
		this.orderDate = orderDate;
		this.customer = customer;
		this.restaurant = restaurant;
	//	this.foodItems = foodItems;
		this.payment = payment;
	}
	
	

	
	
	

}
