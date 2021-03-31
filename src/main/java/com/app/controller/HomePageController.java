package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	public HomePageController() {
		System.out.println("in ctor of "+getClass().getName());
	}
	@RequestMapping("/show")
	public String showHomePage()
	{
		System.out.println("in show home page");
		return "/index";
	}
	
	@RequestMapping("/AboutUs")
	public String AboutUs()
	{
		System.out.println("in About  page");
		return "navbar/AboutUs";
	}

}
