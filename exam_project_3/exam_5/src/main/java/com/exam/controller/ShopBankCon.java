package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.entity.Userinfo;
import com.exam.service.BankShopService;

@Controller
public class ShopBankCon {

	@Autowired
	BankShopService bankShopService;

	@RequestMapping("/to_bank_shop")
	public String toBankShop() {
		return "shop_bank";
	}

	@RequestMapping("/adopt_bank")
	@ResponseBody
	public String getbank(@RequestParam("bank_bid") Integer bid, String o, HttpServletRequest req) throws IOException { // 向后台传值
																														// 值放在req中
//		int bid =Integer.parseInt (req.getParameter("bid"));
//		HttpSession session=req.getSession(); //以session 获取当前用户 uid
		System.out.println("这是前台传来的bid" + bid);
		Userinfo currentUser = (Userinfo) req.getSession().getAttribute("currentUser");
		int new_bid = bankShopService.agreeBank(bid, currentUser.getUid());
		int reMap = bankShopService.reMap(bid, new_bid);
		String s = "";
		if (reMap != 0) {
			s = "success";
		} else {
			s = "error";
		}

		return s;

	}
}
