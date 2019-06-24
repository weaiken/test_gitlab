package com.exam.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.exam.entity.Paper;
import com.exam.entity.QuesBank;
import com.exam.service.SearchService;

@Controller
public class SearchController {
	@Autowired
	SearchService searchService;


	@RequestMapping("/search_share_paper")
	public String getlist(@RequestParam("keyword") String keyword, Model m) {
		System.out.println("yes");//----------------
//		String keyword = req.getParameter("keyword");
		System.out.println(keyword + "==keyword");// -------
		List<Paper> list = searchService.searchpaper(keyword);
		m.addAttribute("paperList", list); //

		System.out.println(JSON.toJSONString(list));

		return "shop_paper::share_paper_list_div";
	}

	@RequestMapping("/search_share_bank")
	public String getbank(@RequestParam("keyword") String keyword, Model m) {
//		String keyword = req.getParameter("keyword");
		System.out.println(keyword + "==keyword");//----------------------
		List<QuesBank> list = searchService.searchbank(keyword);
		m.addAttribute("bankList", list);

		System.out.println(JSON.toJSONString(list));

		return "shop_bank::share_bank_list_div"; // ·µ»ØÒ»¸öÍøÒ³£º£ºµÄÄ³¸ö²¿·Ö
	}

//	@RequestMapping("/getsharelist_t")
//	@ResponseBody 
//	public List getlist_1(String keyword) {
//        System.out.println(keyword);
//		List<Paper> list = searchService.searchpaper(keyword);
////		m.addAttribute("sharepaper", list); //
//		return list;
////		return "paper_shop::share_paper_list"; // ÒªÆ¥ÅäÒ»¸öÍøÒ³ /static/pages/ hello5 .html
//	}

}
