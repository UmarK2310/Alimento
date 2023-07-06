package com.foodexpress.alimento.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	/*private enum fCategory{
		Veg,
		NonVeg
	}
	*/
	@Column(nullable=false)
	private String fCategory;

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

	public String getfCategory() {
		return fCategory;
	}

	public void setfCategory(String fCategory) {
		this.fCategory = fCategory;
	}
	
}
