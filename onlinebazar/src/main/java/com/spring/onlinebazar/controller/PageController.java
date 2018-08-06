package com.spring.onlinebazar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = "/", method= RequestMethod.GET)
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("obj", "Bismillah");

		return mv;
	}

}
