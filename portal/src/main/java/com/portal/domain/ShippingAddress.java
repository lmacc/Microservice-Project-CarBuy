package com.portal.domain;

import javax.persistence.*;

@Entity
public class ShippingAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ShippingAddressName;
	private String ShippingAddressStreet1;
	private String ShippingAddressStreet2;
	private String ShippingAddressCity;
	private String ShippingAddressCounty;
	private String ShippingAddressCountry;
	private String ShippingAddressEircode;
	
	
	@OneToOne
	private Order order;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getShippingAddressName() {
		return ShippingAddressName;
	}


	public void setShippingAddressName(String shippingAddressName) {
		ShippingAddressName = shippingAddressName;
	}


	public String getShippingAddressStreet1() {
		return ShippingAddressStreet1;
	}


	public void setShippingAddressStreet1(String shippingAddressStreet1) {
		ShippingAddressStreet1 = shippingAddressStreet1;
	}


	public String getShippingAddressStreet2() {
		return ShippingAddressStreet2;
	}


	public void setShippingAddressStreet2(String shippingAddressStreet2) {
		ShippingAddressStreet2 = shippingAddressStreet2;
	}


	public String getShippingAddressCity() {
		return ShippingAddressCity;
	}


	public void setShippingAddressCity(String shippingAddressCity) {
		ShippingAddressCity = shippingAddressCity;
	}


	public String getShippingAddressCounty() {
		return ShippingAddressCounty;
	}


	public void setShippingAddressCounty(String shippingAddressCounty) {
		ShippingAddressCounty = shippingAddressCounty;
	}


	public String getShippingAddressCountry() {
		return ShippingAddressCountry;
	}


	public void setShippingAddressCountry(String shippingAddressCountry) {
		ShippingAddressCountry = shippingAddressCountry;
	}


	public String getShippingAddressEircode() {
		return ShippingAddressEircode;
	}


	public void setShippingAddressEircode(String shippingAddressEircode) {
		ShippingAddressEircode = shippingAddressEircode;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}

}