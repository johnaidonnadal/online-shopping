package com.nadal.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView modelView = new ModelAndView("page");
		modelView.addObject("title", "Home");
		modelView.addObject("userClickHome", true);
		
		return modelView;
	}
	
	@RequestMapping(value= "about")
	public ModelAndView about() {
		
		ModelAndView modelView = new ModelAndView("page");
		modelView.addObject("title", "AboutUs");
		modelView.addObject("userClickAbout", true);
		
		return modelView;
	}
	
	@RequestMapping(value= "products")
	public ModelAndView products() {
		
		ModelAndView modelView = new ModelAndView("page");
		modelView.addObject("title", "Products");
		modelView.addObject("userClickProduct", true);
		
		return modelView;
	}
	
	@RequestMapping(value= "contact")
	public ModelAndView contact() {
		
		ModelAndView modelView = new ModelAndView("page");
		modelView.addObject("title", "Contact");
		modelView.addObject("userClickContact", true);
		
		return modelView;
	}
	
	
}
