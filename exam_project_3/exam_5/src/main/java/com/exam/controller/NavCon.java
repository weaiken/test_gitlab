package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavCon {

	// 跳转 "首页"
	@RequestMapping("to_home")
	public String toHome() {
		return "home";
	}
	
	// 跳转 "首页"
	@RequestMapping("toIndex")
	public String toIndex() {
		return "index_web/index";
	}

}
