package com.xworkz.game;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cricket {
	@Value("odi")
	private String type;
	@Value("India")
	private String location;
	
	public Cricket() {
		System.out.println(this.getClass().getSimpleName()+"bean created");
	}

	public void bat() {
		System.out.println("invoked bat()");
	}
	
	@Override
	public String toString() {
		return "Cricket [type=" + type + ", location=" + location + "]";
	}

	public Cricket(String type, String location) {
		super();
		this.type = type;
		this.location = location;
	}

}
