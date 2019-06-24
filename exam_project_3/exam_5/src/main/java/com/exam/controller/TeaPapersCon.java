package com.exam.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.entity.Paper;
import com.exam.service.PaperService;

@Controller
public class TeaPapersCon {
	
	@Autowired
	PaperService ps;
	
	@RequestMapping("/toTeaPaperSpace")
	public String toTeaSpace() {
		return "teacher_paper";
	}
	
	// 获取教师所有的的试卷
	@RequestMapping("/getPaperLs")
	public String getPapers(Model m){
		List<Paper> pls = ps.getTeaPapers(1);
		
		m.addAttribute("paper_list", pls);
		m.addAttribute("examineeNum", ps.getPapersExamineeNum(pls));
		m.addAttribute("reportNum", ps.getPapersReportsNum(pls));
		
//		List<Integer> ls = ps.getPapersReportsNum(pls);
//		System.out.println(ls.get(0) + " " + ls.get(1) + " " + ls.get(2) + " ");
		
		return "teacher_paper::my_papers_div";
//		return "teacher_paper";
	}
	
	@RequestMapping("/setPaperType")
	public void setPaperType(@RequestParam("pid") Integer pid, @RequestParam("type") Integer type, HttpServletResponse response) {
		System.out.println(pid + " " + type);//---------------------
		
		Paper p = new Paper();
		p.setPid(pid);
		p.setType(type);
		int res = ps.setPaperType(p);
		
		try {
			response.getWriter().print(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@RequestMapping("/setExamTime")
//	public void setExamTime(@RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime, HttpServletResponse response) {
//		System.out.println(startTime + " " + endTime);
//		
//		Paper p = new Paper();
//		p.setBegTime(startTime);
//		p.setEndTime(endTime);
//		
//		
//		
//		try {
//			response.getWriter().print(1);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	@RequestMapping("/setExamTime")
	public void setExamTime(@RequestParam("pid") Integer pid, @RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime, HttpServletResponse response) {
		System.out.println(startTime + " " + endTime);//------------------
		
		Paper p = new Paper();
		p.setPid(pid);
		p.setBegTime(startTime);
		p.setEndTime(endTime);
		p.setIsLimit(1);
		int res = ps.setPaperExamTime(p);
		
		try {
			response.getWriter().print(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/setPickInfo")
	public void setPickInfo(@RequestParam("pid") Integer pid, @RequestParam("pick_info") String pick_info, HttpServletResponse response) {
		System.out.println(pid + " " + pick_info);//------------------
		
		Paper p = new Paper();
		p.setPid(pid);
		p.setPickInfo(pick_info);
		int res = ps.setPickInfo(p);
		
		try {
			response.getWriter().print(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/setPaperShare")
	public void setPaperShare(@RequestParam("pid") Integer pid, HttpServletResponse response) {
		System.out.println(pid + " " );//------------------
		
		int res = ps.setPaperShare(pid);
		
		try {
//			response.getWriter().print(res);
			response.getWriter().print(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("PaperCopy")
	public void PaperCopy(@RequestParam("pid") Integer pid, HttpServletResponse response) {
		System.out.println(pid + "***************");
		
		int res = ps.paperCopy(pid);
		
		try {
			response.getWriter().print(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/delPaper")
	public void delPaper(@RequestParam("pid") Integer pid, HttpServletResponse response) {
		int res = ps.delPaper(pid);
		
		try {
			response.getWriter().print(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@RequestMapping("/getPaperCopyName")
//	public void getPaperCopyName(@RequestParam("pid") Integer pid, HttpServletResponse response) {
//		System.out.println(pid + "***************");
//		
//		int res = ps.paperCopy(pid);
//		
//		try {
//			response.getWriter().print(res);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
