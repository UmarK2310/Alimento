package com.foodexpress.alimento.models;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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

	
	@ManyToOne
	@JoinColumn(name="Restaurant_ID",referencedColumnName="rId")
	private Restaurant restaurant;


	
	@Enumerated(EnumType.STRING)
	private FoodItemCategory category;

	@OneToMany(mappedBy = "foodItems")
	private Set<OrderFoodItems> orderFoodItems ;

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

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public FoodItemCategory getCategory() {
		return category;
	}

	public void setCategory(FoodItemCategory category) {
		this.category = category;
	}

	public Set<OrderFoodItems> getOrderFoodItems() {
		return orderFoodItems;
	}

	public void setOrderFoodItems(Set<OrderFoodItems> orderFoodItems) {
		this.orderFoodItems = orderFoodItems;
	}

	public FoodItems(int fId, String fName, String fDescription, float fPrice, Restaurant restaurant,
			FoodItemCategory category, Set<OrderFoodItems> orderFoodItems) {
		super();
		this.fId = fId;
		this.fName = fName;
		this.fDescription = fDescription;
		this.fPrice = fPrice;
		this.restaurant = restaurant;
		this.category = category;
		this.orderFoodItems = orderFoodItems;
	}

	@Override
	public String toString() {
		return "FoodItems [fId=" + fId + ", fName=" + fName + ", fDescription=" + fDescription + ", fPrice=" + fPrice
				+ ", restaurant=" + restaurant + ", category=" + category + ", orderFoodItems=" + orderFoodItems + "]";
	}

	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



}