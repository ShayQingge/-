package com.online.college.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/auth")
public class TestController {
	
	@RequestMapping("/test")
	public ModelAndView index() {
//		System.out.println("aaaa");
		return new ModelAndView("test");
	}
}
