package com.xworkz.fruit;

public class Fruit {
	public String name;
	public String color;
	public double price;
	public boolean taste;
	public Vitamin vitamin;

	public void provideEnergy() {
		System.out.println("invoked provideEnergy");
		vitamin.growth();
	}

	public Fruit(String name, String color, double price, boolean taste, Vitamin vitamin) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.taste = taste;
		this.vitamin = vitamin;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + ", taste=" + taste + ", vitamin="
				+ vitamin + "]";
	}

	
}
