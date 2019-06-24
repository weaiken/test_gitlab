package com.exam.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.exam.entity.Paper;
import com.exam.entity.PaperToQues;
import com.exam.service.ExamService1;

@Controller
public class ExamCutScreenController {
	@Autowired
	ExamService1 examService;
	
	@RequestMapping("/cutscreen")
	public void ExamCutScreen(HttpServletRequest req,HttpServletResponse res) throws IOException  {
//		int pid=(int)req.getSession().getAttribute("pid");//pid需要后台传过来
		System.out.println("--------------");
		Paper paper = examService.selectByPaperKey(2);
		System.out.println(paper.toString());//--------
		Integer limit = paper.getOutTimes();
		System.out.println(limit);
		res.getWriter().print(limit);
//		return limit;
	}
//	@RequestMapping("/cut1")
//	public ModelAndView testcut(){
//		Paper paper = examService.selectByPaperKey(2);
//		System.out.println(paper.toString());
////		Integer limit = paper.getOutTimes();
//		Integer time = paper.getTime();
//		Date countdown = examService.Countdown("2019-05-19 00:00:00", time, "2019-05-19 12:00:00");
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("paper");
//		mav.addObject("limit",countdown);
//		return mav;
//	}
	@RequestMapping("/toc")
	public String testcount() {
		return "paper";
	}
	@RequestMapping("/countdown")
	public void ExamCountdown(HttpServletRequest req,HttpServletResponse res) throws IOException, ParseException {
		System.out.println("ok------");//------------
//		int pid=(int)req.getSession().getAttribute("pid");//pid需要后台传过来
		String starttime1 = req.getParameter("serverTime");
		String jsonString = JSONObject.toJSONString(starttime1);
//		System.out.println(jsonString);
//		System.out.println("--------"+starttime1);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse = format.parse(starttime1);
//		System.out.println(parse);
		String starttime6 = format.format(parse);
		Paper paper = examService.selectByPaperKey(2);
		Integer time = paper.getTime();
		Date countdown = examService.Countdown(starttime6, time, "2019-06-21 00:00:00");
		String date1 = JSON.toJSONString(countdown);
		res.getWriter().print(date1);
	}


}
