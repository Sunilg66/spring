package com.xworkz.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatabaseTester {

	public static void main(String[] args) {
		
		String beanConfigurationPath = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(beanConfigurationPath);

		Database database = context.getBean(Database.class);
		System.out.println(database);
		
		String s = context.getBean(String.class);
		System.out.println(s);
		
		Integer i1=context.getBean(Integer.class);
		 System.out.println("Integer:"+i1);
		
		 Double d1=context.getBean(Double.class);
		 System.out.println("Double:"+d1);
		 
		 Float f1=context.getBean(Float.class);
		 System.out.println("Float:"+f1);
		 
		 Long l1=context.getBean(Long.class);
		 System.out.println("Long:"+l1);
		 
		 Boolean b1=context.getBean(Boolean.class);
		 System.out.println("Boolean:"+b1);
		 
		 Short sh1=context.getBean(Short.class);
		 System.out.println("Short:"+sh1);

	}

}
