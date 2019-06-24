package com.exam.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.entity.Userinfo;
import com.exam.service.MD5Utils;
import com.exam.service.UserService;

@Controller
public class Logincontroller {
	@Autowired
	UserService userservice;

	@RequestMapping("/to_register")
	public String toRegister() {
		return "login";
	}
	
//	@RequestMapping("/toLogin")
//	public String toLogin() {
//		return "login";
//	}

	@RequestMapping("/regist")
	public String regist(Userinfo u, HttpServletResponse resp) throws Exception {
//		System.out.println("xxx");//-------------------
		String password = u.getPassword();
		String md = MD5Utils.MD5Encode(password, "utf-8");
		u.setPassword(md);
		userservice.addUser(u);
		return "redirect:to_login";
//		System.out.println(u.getEmail() + "zhuce");//-------------------------
	}

	@RequestMapping("/checkemail")
	public @ResponseBody String checkemail(@RequestParam(value = "emailcheck") String inputStr1) {
		System.out.println(inputStr1 + "check");//------------

		int i = userservice.checkemail(inputStr1);

		return i + "";
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse resp) {
		HttpSession session = request.getSession();
		session.invalidate();

		return "redirect:to_home";
	}

}
