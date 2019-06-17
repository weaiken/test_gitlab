package com.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.service.UserService;

@RestController
public class Test1 {
	
	@Autowired
	UserService us;

	@RequestMapping("/test1")
	public String test1() {
		System.out.println("test1");
		return "test1";
	}
	
	@RequestMapping("/getuser")
	public String getUser() {
		return us.getUser();
	}
	
}
