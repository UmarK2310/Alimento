package com.foodexpress.alimento.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cart_table")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator3")
	@Column(name = "cart_id")
	private long cartId;
	
	@Column(name = "quantity")
	private long quantity;

	@Column(name = "mrp_price", nullable = false)
	private double mrpPrice;
	
	public Cart() {

	}

	
}
