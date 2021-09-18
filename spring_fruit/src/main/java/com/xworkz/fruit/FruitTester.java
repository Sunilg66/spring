package com.xworkz.fruit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FruitTester {

	public static void main(String[] args) {
		
		String beanConfigurationFile = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(beanConfigurationFile);
		
		Fruit fruit = context.getBean(Fruit.class);
		System.out.println(fruit.name);		
		System.out.println(fruit.color);
		System.out.println(fruit.price);
		System.out.println(fruit.taste);
		
        System.out.println(fruit.vitamin.type);
		System.out.println(fruit.vitamin.waterSoluble);
		System.out.println(fruit.vitamin.fatSoluble);
		fruit.provideEnergy();


	}

}
