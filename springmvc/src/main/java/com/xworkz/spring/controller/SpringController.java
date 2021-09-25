package com.xworkz.spring.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class SpringController {

	public SpringController() {
		super();
		System.out.println(this.getClass().getSimpleName() + " bean created");
	}
	
	
	

	@RequestMapping(value="/actor.xworkz")
	public String onClickRequest(@RequestParam String actorName,@RequestParam String heroine,
			@RequestParam String directorName,Model model) {
		
		System.out.println("invoked onClickRequest");
		System.out.println("actor name "+ actorName);
		System.out.println("heroine name "+ heroine);
		System.out.println("director name "+ directorName);
		
		model.addAttribute("actorName", actorName);
		
		return "/WEB-INF/pages/abc.jsp";

	}
	
	@RequestMapping(value="getactorpage.xworkz")
	public String getactorpage() {
		return "/WEB-INF/views/actor.jsp";
		
	}
	
	

	@RequestMapping(value = "/sunil.xworkz")
	public String onClick() {
		System.out.println("invoked click");
		return "/WEB-INF/pages/ABCResponse.jsp";
	}
	
	
	

	@RequestMapping(value = "/abc.xworkz")
	public String onSubmit() {
		System.out.println("involed submit");
		return "/WEB-INF/pages/xyzResponse.jsp";
	}
	
	
	

	@RequestMapping(value = "/xyz.xworkz")
	public String onVerify() {
		System.out.println("invoked verify");
		return "/WEB-INF/pages/cric.jsp";
	}
	
	@RequestMapping(value="/registration.xworkz")
	public String registration(@RequestParam String username,@RequestParam String email,@RequestParam String password,
			@RequestParam String confirmpassword,@RequestParam long phoneNumber,@RequestParam String gender,
			@RequestParam String state,Model model) {
		System.out.println("username " +username );
		System.out.println("email " + email);
		System.out.println("password " + password);
		System.out.println("confirmpassword " + confirmpassword);
		System.out.println("phonenumber " + phoneNumber);
		System.out.println("gender " + gender);
		System.out.println("state "+ state);
		
		model.addAttribute("username", username);
		return "/WEB-INF/views/reg.jsp";
		
	}
	
	@RequestMapping(value="getregistrationpage.xworkz")
	public String getregistrationpage() {
		return "/WEB-INF/views/registration.jsp";
		
	}
	
	
	
	

}
