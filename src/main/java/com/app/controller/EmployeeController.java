package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@RequestMapping("/show")
	public ModelAndView showReg()
	{
		ModelAndView m=new ModelAndView();
		m.setViewName("Home");
		return m;
	}

}
