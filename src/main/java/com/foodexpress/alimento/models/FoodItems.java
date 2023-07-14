package com.foodexpress.alimento.models;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class FoodItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fId;
	@Column(nullable=false)
	private String fName;
	@Column
	private String fDescription;
	@Column(nullable=false)
	private float fPrice;
	
	@ManyToMany(mappedBy = "foodItems")
	private List<Order> order;
	
	@ManyToOne
	@JoinColumn(name="Restaurant_ID",referencedColumnName="rId")
	private Restaurant restaurant;
	
	@Enumerated(EnumType.STRING)
	private FoodItemCategory category;

	public FoodItemCategory getCategory() {
		return category;
	}

	public void setCategory(FoodItemCategory category) {
		this.category = category;
	}

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfDescription() {
		return fDescription;
	}

	public void setfDescription(String fDescription) {
		this.fDescription = fDescription;
	}

	public float getfPrice() {
		return fPrice;
	}

	public void setfPrice(float fPrice) {
		this.fPrice = fPrice;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

}
