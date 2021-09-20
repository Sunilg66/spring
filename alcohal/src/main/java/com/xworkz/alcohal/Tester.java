package com.xworkz.alcohal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.alcohal.dao.AlcohalDAO;
import com.xworkz.alcohal.dao.AlcohalDAOImpl;
import com.xworkz.alcohal.entity.AlcohalEntity;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		AlcohalDAO dao = context.getBean(AlcohalDAOImpl.class);
		AlcohalEntity entity = new AlcohalEntity();
		entity.setBrand("100Pipers");
		entity.setPrice(2400.00);
		entity.setFilter(true);

		dao.save(entity);

	}

}
