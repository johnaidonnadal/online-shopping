package com.nadal.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView modelView = new ModelAndView("page");
		modelView.addObject("greeting", "Welcome to Spring MVC");
		
		return modelView;
	}
	
	
}
