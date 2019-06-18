package com.exam.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.entity.Userinfo;
import com.exam.entity.UserinfoExample;
import com.exam.entity.UserinfoExample.Criteria;
import com.exam.service.MD5Utils;
import com.exam.service.UserService;
@Controller
public class Logincontroller {
	@Autowired 
	UserService userservice;
	
	
	
	
	@RequestMapping("/toregist")
	public String regist(){
		return "login";
	}
	@RequestMapping("/regist")
	public void regist(Userinfo u ,HttpServletResponse resp) throws Exception{
		String password = u.getPassword();
		String md = MD5Utils.MD5Encode(password,"utf-8");
		u.setPassword(md);
		userservice.addUser(u);
		System.out.println(u.getEmail());
		}
	
	@RequestMapping("/checkemail")
	public @ResponseBody String checkemail(
			@RequestParam(value="emailcheck") String inputStr1) {
	System.out.println(inputStr1);

	
	
		int i = userservice.checkemail(inputStr1);
		
		return i+"";
	}

}
