package com.xworkz.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Game {
	
	@Value("Football")
	private String name;
	@Value("England")
	private String country;
	@Autowired
	public Cricket cricket;
	
	public Game() {
		System.out.println(this.getClass().getSimpleName()+"bean created");
	}

	public Game(String name, String country, Cricket cricket) {
		super();
		this.name = name;
		this.country = country;
		this.cricket = cricket;
	}
	
	public void play() {
		System.out.println("invoked play");
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", country=" + country + ", cricket=" + cricket + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Cricket getCricket() {
		return cricket;
	}

	public void setCricket(Cricket cricket) {
		this.cricket = cricket;
	}
	
	

}
