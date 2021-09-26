package com.xworkz.vaccine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.vaccine.dto.RegisterDTO;
import com.xworkz.vaccine.service.RegisterService;

@Component
@RequestMapping("/")
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	public RegisterController() {
		super();
		System.out.println(this.getClass().getSimpleName()+"Bean created");
	}

	@RequestMapping(value="/onRegister.do")
	public String onRegisterButton(@RequestParam String userName,@RequestParam String email,@RequestParam String password,
			@RequestParam String confirmPassword,@RequestParam String phone,@RequestParam String vaccineType,@RequestParam String gender,
			@RequestParam Long aadharNo, Model model) {
		System.out.println("invoked onRegisterButton");
		System.out.println(userName + "\t" + email + "\t" + password + "\t" + confirmPassword + "\t" + phone + "\t" + vaccineType + "\t" + gender + "\t" + aadharNo );
	
		RegisterDTO registerDTO=new RegisterDTO(userName, email, password, confirmPassword, phone, vaccineType, aadharNo, gender);
		System.out.println("data has copied " + registerDTO);
		
		boolean result = this.registerService.validateRegisterDTO(registerDTO);
		if(result) {
			System.out.println("data saved");
			model.addAttribute("message", "Registration successfull");
			return "WEB-INF/views/LoginPage.jsp";
			}else {
				System.out.println("data is not saved");
				model.addAttribute("message", "Registration not successfull");
				return "redirect:/index.jsp";
			}
		
	
	
	
	
	
	
	
	
	}
}
