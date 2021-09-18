package com.xworkz.footwear;

public class Footwear {
	
	public String brand;
	public String color;
	public double price;
	public Material material;
	public Footwear(String brand, String color, double price, Material material) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.material = material;
	}
	
	public void walk() {
		System.out.println("invoked walk");
	}

	@Override
	public String toString() {
		return "Footwear [brand=" + brand + ", color=" + color + ", price=" + price + ", material=" + material + "]";
	}
	
	

}
