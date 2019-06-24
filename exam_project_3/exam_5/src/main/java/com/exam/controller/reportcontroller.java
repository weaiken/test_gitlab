package com.exam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.Userinfo;
import com.exam.service.UserService;
@RestController
public class reportcontroller {
	@Autowired
	UserService us;
	
	@RequestMapping("/chaxunCJ")
	public String chaxunCJ(String grade) {
		int i = us.getReportid(grade);
		if(i ==1) {
			return "ok";
		} else {
			return "error";
		}
	}
	
//	@RequestMapping("/mod_info")
//	public @ResponseBody Integer modInfo(@RequestBody Userinfo u, HttpServletRequest req) {
//		Userinfo currentUser = (Userinfo) req.getSession().getAttribute("currentUser");
//		u.setUid( currentUser.getUid() );
//
//		int res = us.modifyUser(u);
//
//		return res;
//	}
		
}
