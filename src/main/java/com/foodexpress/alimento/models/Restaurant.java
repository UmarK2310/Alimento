package com.foodexpress.alimento.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="Restarants" ,
		uniqueConstraints = {@UniqueConstraint(columnNames= "rName")})
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int rId;
	@Column(name="rName" , nullable = false)
	@Size(min=3 , message="firstName must contain atleast 3 characters")
	private String rName;
	@Column(name="rAddress" , nullable = false)
	private String rAddress;
	@Column(name="rMobile" , nullable = false)
	private int rMobileNo;
	
	@Column(name="RestaurantPassword",length=20)
	@Size(min=8, message="Password length must be 8 and contain uppercase,lowercase,digits")
	@Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")
	public String rPassword;
	
	public String getrPassword() {
		return rPassword;
	}

	public void setrPassword(String rPassword) {
		this.rPassword = rPassword;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<FoodItems> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItems> foodItems) {
		this.foodItems = foodItems;
	}

	@OneToMany(cascade = CascadeType.ALL,mappedBy="restaurant")
	private List<Order> orders;
	
	@OneToMany(mappedBy = "restaurant")
	private List<FoodItems> foodItems;
	
	public Restaurant() {
		this.rAddress= rAddress;
		this.rId=rId;
		this.rMobileNo=rMobileNo;
		this.rName=rName;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getrAddress() {
		return rAddress;
	}

	public void setrAddress(String rAddress) {
		this.rAddress = rAddress;
	}

	public int getrMobileNo() {
		return rMobileNo;
	}

	public void setrMobileNo(int rMobileNo) {
		this.rMobileNo = rMobileNo;
	}
		
}
