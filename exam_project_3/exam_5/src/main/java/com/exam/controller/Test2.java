package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test2 {

	@RequestMapping("/test22")
	public String test2() {
		return "test22";
	}
}
