package com.xworkz.alcohal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alcohal")
public class AlcohalEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "a_id")
	private int id;
	@Column(name = "a_brand")
	private String brand;
	@Column(name = "a_price")
	private double price;
	@Column(name = "a_filter")
	private boolean filter;

	public AlcohalEntity() {
		// TODO Auto-generated constructor stub
	}

	public AlcohalEntity(int id, String brand, double price, boolean filter) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.filter = filter;
	}

	@Override
	public String toString() {
		return "AlcohalEntity [id=" + id + ", brand=" + brand + ", price=" + price + ", filter=" + filter + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isFilter() {
		return filter;
	}

	public void setFilter(boolean filter) {
		this.filter = filter;
	}

}
