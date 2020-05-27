package com.mintest.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mintest.springboot.service.UserService;
import com.mintest.springboot.vo.UserVo;

@Controller
public class MainController {
	@Autowired
	public UserService service;

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
	
	@ResponseBody
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<UserVo> selectAll() {
		List<UserVo> userlist = service.selectAll();
		
		return userlist;
	}

}
