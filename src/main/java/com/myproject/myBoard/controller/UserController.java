package com.myproject.myBoard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value = "/user")
	public String main(Model model) {
		model.addAttribute("data", "hell!!!!!");
		return "hello";
	}
	
	
	
}
