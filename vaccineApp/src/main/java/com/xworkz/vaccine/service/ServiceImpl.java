package com.xworkz.vaccine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.vaccine.dao.RegisterDAO;
import com.xworkz.vaccine.dto.RegisterDTO;
import com.xworkz.vaccine.entity.RegisterEntity;

@Component
public class ServiceImpl implements RegisterService {

	@Autowired
	private RegisterDAO registerDAO;

	public ServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + "Bean Created");
	}

	@Override
	public boolean validateRegisterDTO(RegisterDTO registerDTO) {
		boolean flag = false;
		if (registerDTO != null) {
			if (!registerDTO.getUserName().isEmpty() && registerDTO.getUserName() != null) {
				flag = true;
			}
			if (!registerDTO.getPassword().isEmpty() && registerDTO.getPassword() != null) {
				flag = true;
			}
			if (!registerDTO.getConfirmPassword().isEmpty() && registerDTO.getConfirmPassword() != null) {
				flag = true;
			}
			if (!registerDTO.getEmail().isEmpty() && registerDTO.getEmail() != null) {
				flag = true;
			}
			if (!registerDTO.getPhone().isEmpty() && registerDTO.getPhone() != null) {
				flag = true;
			}
			if (!registerDTO.getGender().isEmpty() && registerDTO.getGender() != null) {
				flag = true;
			}

		}
		if (flag) {
			RegisterEntity registerEntity = new RegisterEntity();
			registerEntity.setUserName(registerDTO.getUserName());
			registerEntity.setPassword(registerDTO.getPassword());
			registerEntity.setConfirmPassword(registerDTO.getConfirmPassword());
			registerEntity.setEmail(registerDTO.getEmail());
			registerEntity.setPhone(registerDTO.getPhone());
			registerEntity.setAadharNo(registerDTO.getAadharNo());
			registerEntity.setVaccineType(registerDTO.getVaccineType());
			registerEntity.setGender(registerDTO.getGender());

			this.registerDAO.saveRegisterDTO(registerEntity);
			return flag;
		} else {
			return flag;
		}
	}
}
