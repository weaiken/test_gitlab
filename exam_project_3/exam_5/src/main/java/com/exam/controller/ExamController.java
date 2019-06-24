package com.exam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.exam.entity.Paper;
import com.exam.service.ExamService;
import com.exam.service.PaperService;
import com.exam.service.UserService;

@Controller
public class ExamController {
	
	@Autowired
	UserService u;
	
	@Autowired
	ExamService es;
	
	@RequestMapping("/toexam")
	public ModelAndView login() {
		ModelAndView  b = new ModelAndView();
		 b.setViewName("exam");
		return b;
	}
	
	@RequestMapping("/getPaperByPid")
	public String examcontro(@RequestParam("pid") Integer pid){
		Paper paper = es.getPaper(pid);
		List<Paper> pls = new ArrayList<Paper>();
		pls.add(paper);
		return "index::show_exam_div";
	}
}
