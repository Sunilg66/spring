package com.xworkz.alcohal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.alcohal.dao.AlcohalDAO;
import com.xworkz.alcohal.dao.AlcohalDAOImpl;
import com.xworkz.alcohal.entity.AlcohalEntity;
import com.xworkz.alcohal.service.AlcohalService;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		AlcohalService service = context.getBean(AlcohalService.class);
		AlcohalEntity entity = new AlcohalEntity();
		entity.setBrand("100Pipers");
		entity.setPrice(2400.00);
		entity.setFilter(true);

		boolean valid= service.validateAndSave(entity);
		if(!valid) {
			System.out.println("Data invalid alcohal entity is not saved");
		}else {
			System.out.println("Alcohal Entity is saved");
		}

	}

}
