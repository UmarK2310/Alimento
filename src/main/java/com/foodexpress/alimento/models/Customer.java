package com.foodexpress.alimento.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonIgnore;

	@Entity
	@Table(name="customer")
	public class Customer {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		
		@Column(name = "first_name", nullable = false)
		@Size(min=3 , message="firstName must contain atleast 3 characters")
		private String firstName;
		
		@Column(name = "last_name", nullable = false)
		private String lastName;
		
		@Column(name = "email_address", nullable = false , unique = true)
		@Email(message="Email  is not valid!")
		
		private String emailId;
		
		@Column(name = "address", nullable = false)
		private String address;
		
		@Column(name = "mobile_number", nullable = false)
		@Size(min=10 ,max=10, message="phoneNumber must contain  10 digits")
		private String mobilenumber;
		
		@Column(name="password",length=20)
		@Size(min=8, message="Password length must be 8 and contain uppercase,lowercase,digits")
		@Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")
		private String password;
		
//		@OneToMany(fetch = FetchType.EAGER, mappedBy = "customer", cascade = CascadeType.ALL)
		@OneToMany(mappedBy = "customer")
		@JsonIgnore
		private List<Order> orders;

public Customer(long id, @Size(min = 3, message = "firstName must contain atleast 3 characters") String firstName,
		String lastName, @UniqueElements @Email(message = "Email  is not valid!") String emailId, String address,
		@Size(min = 10, max = 10, message = "phoneNumber must contain  10 digits") String mobilenumber,
		@Size(min = 8, message = "Password length must be 8 and contain uppercase,lowercase,digits") @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}") String password,
		List<Order> orders) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.address = address;
	this.mobilenumber = mobilenumber;
	this.password = password;
	this.orders = orders;
}


public Customer() {
	super();
}


public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getMobilenumber() {
	return mobilenumber;
}

public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public List<Order> getOrders() {
	return orders;
}

public void setOrders(List<Order> orders) {
	this.orders = orders;
}

		
		

}


