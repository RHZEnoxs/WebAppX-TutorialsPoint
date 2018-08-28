package com.enoxs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("WebHome/hello")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!<Sprinf MVC>");
	      return "hello";
	   }
}

/*
@Controller
public class HelloMVCController {
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("msg", "Spring 3 MVC Hello World");
		return "hello";
	}

}*/
