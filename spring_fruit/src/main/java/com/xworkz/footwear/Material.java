package com.xworkz.footwear;

public class Material {
	
	public String leather;
	public String rubber;
	public String cloth;
	
	public Material(String leather, String rubber, String cloth) {
		super();
		this.leather = leather;
		this.rubber = rubber;
		this.cloth = cloth;
	}
	
	public void protection() {
		System.out.println("invoked protection");
	}

	@Override
	public String toString() {
		return "Material [leather=" + leather + ", rubber=" + rubber + ", cloth=" + cloth + "]";
	}
	
	

}
