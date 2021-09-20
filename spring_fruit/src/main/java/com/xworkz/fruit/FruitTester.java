package com.xworkz.fruit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FruitTester {

	public static void main(String[] args) {
		
		String beanConfigurationFile = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(beanConfigurationFile);
		
		Fruit fruit = context.getBean(Fruit.class);
		System.out.println(fruit.hashCode());
		
		Fruit fruit1 = context.getBean(Fruit.class);
		System.out.println(fruit1.hashCode());
		
		Fruit fruit2 = context.getBean(Fruit.class);
		System.out.println(fruit2.hashCode());
		
	}

}
