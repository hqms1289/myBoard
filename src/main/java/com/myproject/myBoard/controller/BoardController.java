package com.myproject.myBoard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;
 
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
import com.myproject.myBoard.Service.BoardService;



@RestController
public class BoardController {

	@Resource
	private BoardService boardService;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Model model) {
		model.addAttribute("data", "hell!!!!!");
		return "hello";
	}
	
	
	
}
