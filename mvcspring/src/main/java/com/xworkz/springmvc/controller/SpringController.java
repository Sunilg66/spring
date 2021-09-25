package com.xworkz.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/")
public class SpringController {
	
	public SpringController() {
		super();
		System.out.println(this.getClass().getSimpleName()+" bean created");
	}
	@RequestMapping(value= "/sunil.xworkz")
	public void onClick() {
		System.out.println("invoked click");
	}
	@RequestMapping(value="/abc.xworkz")
	public void onSubmit() {
		System.out.println("involed submit");
	}
	@RequestMapping(value="/xyz.xworkz")
	public void onVerify() {
		System.out.println("invoked verify");
	}
}
