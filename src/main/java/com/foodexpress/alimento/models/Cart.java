package com.foodexpress.alimento.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart_table")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_id")
	private long cartId;
	
	@Column(name = "quantity")
	private long quantity;

	@Column(name = "total_amount", nullable = false)
	private double total;
	
	public Cart() {

	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	


	
}
