package com.xworkz.airport;

public class Airport {

	private String name;
	private String location;
	
	public Airport() {
		super();
		System.out.println(this.getClass().getSimpleName() + "Bean created");
	}
	
	public Airport(String name) {
		super();
		this.name=name;
		System.out.println(this.getClass().getSimpleName() + "Bean created");
	}
	
	

	public Airport(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		System.out.println(this.getClass().getSimpleName() + "Bean created");
	}

	public void runway() {
		System.out.println("invoked runway");

	}

	public void maintainance() {
		System.out.println("invoked maintainance");
	}

	@Override
	public String toString() {
		return "Airport [name=" + name + ", location=" + location + "]";
	}
	
	

}
