package com.exam.controller;

import com.exam.entity.Userinfo;
import com.exam.service.MD5Utils;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginAndEditController {

	@Autowired
	UserService us;

	@RequestMapping("/to_edit_info")
	public String toEditInfo() {
//		System.out.println("yes");
		return "edit_info";

	}

	@RequestMapping("/mod_info")
	public @ResponseBody Integer modInfo(HttpServletRequest req) {
		String uname = req.getParameter("uname");
		System.out.println(uname);// ------------------
		Userinfo currentUser = (Userinfo) req.getSession().getAttribute("currentUser");
		Userinfo u = new Userinfo();
		u.setUname(uname);
		u.setUid(currentUser.getUid());

		int res = us.modifyUser(u);

		currentUser.setUname(uname);

		return res;
	}

	@RequestMapping("/mod_pw")
	public void modPW(@RequestParam(value = "old_pw") String old_pw, @RequestParam(value = "new_pw") String new_pw,
			HttpServletResponse response, HttpServletRequest req) throws Exception {

//		String old_pw = req.getParameter("old_pw");
//		String new_pw = req.getParameter("new_pw");
		System.out.println(old_pw + "__" + new_pw + "=========");// ----------------------------------

		old_pw = MD5Utils.MD5Encode(old_pw, "utf-8");

		Userinfo currentUser = (Userinfo) req.getSession().getAttribute("currentUser");

		System.out.println(currentUser.getPassword() + "=pw====old_pw====" + old_pw);// ----------------------------------

		if (old_pw.equals(currentUser.getPassword())) {
			System.out.println(new_pw);// -------------------
			Userinfo u = new Userinfo();
			u.setUid(currentUser.getUid());
			new_pw = MD5Utils.MD5Encode(new_pw, "utf-8");
			u.setPassword(new_pw);

			int i = us.modifyUser(u);

			if (1 == i) {
				currentUser.setPassword(new_pw);
			}
			response.getWriter().print(i);
		} else {
			response.getWriter().print(2);
		}

	}

	@RequestMapping("/to_login")
	public String toLogin() {
		return "login";
	}

	// 登陆验证
//	@RequestMapping("/login_2")
//	public void login_2(@RequestParam(value = "password") String pwd, @RequestParam(value = "email") String email,
//			HttpServletResponse response, HttpServletRequest httpServletRequest) throws Exception {
//
//		System.out.println(email);// ------------------
//		System.out.println(pwd);// ------------------
//		
//		Userinfo userinfo = us.getUser(email);
//		
//		if ((userinfo.getActive()) == 0) {
//			response.getWriter().print("t1");
//			System.out.println("xxxx");// ------------------
////			return "未激活";
//			return;
//		}
//		
//		pwd = MD5Utils.MD5Encode(pwd, "utf-8");
//		
//		System.out.println(userinfo.getUname());// ------------------
//		System.out.println(userinfo.getActive());// ------------------
//		
//		if (userinfo.getPassword().equals(pwd)) {
//			httpServletRequest.getSession().setAttribute("currentUser", userinfo);
//			response.getWriter().print("t");
////			return "登陆成功";
//			return;
//		} else {
//			response.getWriter().print("f");
////			return "登陆失败";
//			return;
//		}
//	}

	@RequestMapping("/login")
	public void login(@RequestParam("email") String email, @RequestParam("password") String pwd,
			HttpServletResponse response, HttpServletRequest httpServletRequest) throws Exception {

		System.out.println(email + " " + pwd);// -------------------------------

		Userinfo userinfo = us.getUser(email);

		if ((userinfo.getActive()) == 0) {
			response.getWriter().print("t1");
			System.out.println("xxxx");// ------------------
//			return "未激活";
			return;
		}

		pwd = MD5Utils.MD5Encode(pwd, "utf-8");

		System.out.println(userinfo.getUname());// ------------------
		System.out.println(userinfo.getActive());// ------------------

		if (userinfo.getPassword().equals(pwd)) {
			httpServletRequest.getSession().setAttribute("currentUser", userinfo);
			response.getWriter().print("t");
//			return "登陆成功";
			return;
		} else {
			response.getWriter().print("f");
//			return "登陆失败";
			return;
		}
	}

}
