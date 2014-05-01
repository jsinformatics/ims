package com.jsi.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView openLogin() {
		System.out.println("Trying to open login.");
		ModelAndView model = new ModelAndView("login");
		
		return model;
	} 
}