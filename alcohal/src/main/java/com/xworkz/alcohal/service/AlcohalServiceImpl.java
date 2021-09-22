package com.xworkz.alcohal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.alcohal.dao.AlcohalDAO;
import com.xworkz.alcohal.entity.AlcohalEntity;
@Component
public class AlcohalServiceImpl implements AlcohalService{
	@Autowired
	private AlcohalDAO alcohalDAO;

	@Override
	public boolean validateAndSave(AlcohalEntity entity) {
		  boolean flag=false;
		  if(entity.getBrand().isEmpty() && entity.getPrice()!=0) {
			  flag=true;
		  }if(entity.getId()!=0 && entity.isFilter()==true){
			  flag=true;
			  
		  }
		  if(flag) {
			  this.alcohalDAO.save(entity);
			  System.out.println("validated and saved"+entity);
		  }
		return flag;
	}

}
