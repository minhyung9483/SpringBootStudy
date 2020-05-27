package com.mintest.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = "/")
	public String home(){
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/valueTest")
	public String index() {
		String value = "ajax 테스트 성공";
		return value;
	}
	
	@RequestMapping("/jspTest")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("name", "minhyung");
		List<String> testList = new ArrayList<String>();
		testList.add("이");
		testList.add("민");
		testList.add("형");
		mav.addObject("list", testList);
		
		return mav;
	}

}
