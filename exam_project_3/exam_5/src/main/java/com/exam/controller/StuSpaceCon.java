package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StuSpaceCon {

	@RequestMapping("/to_stu_space")
	public String toStuSpace() {
		return "student_space";
	}
}
