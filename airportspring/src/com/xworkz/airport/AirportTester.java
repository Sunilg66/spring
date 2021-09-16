package com.xworkz.airport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AirportTester {

	public static void main(String[] args) {
		
		String beanConfigurationFile="spring.xml";
		
	ApplicationContext container = new ClassPathXmlApplicationContext(beanConfigurationFile);
	Airport airport = container.getBean(Airport.class);
	airport.runway();
	airport.maintainance();
	System.out.println(airport);

		
	}

}
