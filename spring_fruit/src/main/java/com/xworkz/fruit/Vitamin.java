package com.xworkz.fruit;

public class Vitamin {
	
	public String type;
	public boolean waterSoluble;
	public boolean fatSoluble;

	public Vitamin(String type, boolean waterSoluble, boolean fatSoluble) {
		super();
		this.type = type;
		this.waterSoluble = waterSoluble;
		this.fatSoluble = fatSoluble;
	}
	public void growth() {
		System.out.println("invoked growth");
	}

	@Override
	public String toString() {
		return "Vitamin [type=" + type + ", waterSoluble=" + waterSoluble + ", fatSoluble=" + fatSoluble + "]";
	}

}
