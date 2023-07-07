package com.foodexpress.alimento.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int payment_ID;
	
	@Column
	private float amount;
	
	@Column
	private String Mode;
	
	@OneToOne
	private Order order;
	
	public int getPayment_ID() {
		return payment_ID;
	}

	public void setPayment_ID(int payment_ID) {
		this.payment_ID = payment_ID;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getMode() {
		return Mode;
	}

	public void setMode(String mode) {
		Mode = mode;
	}

}
