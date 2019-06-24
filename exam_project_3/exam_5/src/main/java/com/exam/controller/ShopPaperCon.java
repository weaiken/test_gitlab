package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.dao.PaperMapper;
import com.exam.dao.StorePaperMapper;
import com.exam.entity.Paper;
import com.exam.entity.PaperExample;
import com.exam.entity.PaperExample.Criteria;

@Controller
public class ShopPaperCon {
	
	@Autowired
	StorePaperMapper storePaperMapper;
	@Autowired
	PaperMapper paperMapper;

	@RequestMapping("/to_paper_shop")
	public String toPaperShop() {
		return "shop_paper";
	}
	
	@RequestMapping("/get_paper_share_list")
	public String listUser(Model model) {
		
		PaperExample ex = new PaperExample();
		Criteria c = ex.createCriteria();
		c.andPidIsNotNull();
		c.andTypeEqualTo(1);
		
		List<Paper> selectByExample = paperMapper.selectByExample(ex);
		//强制转换，隐性
		
//		StorePaperExample ex1 = new StorePaperExample();
//		Criteria c1 = ex.createCriteria();
//		c.andSpidIsNotNull();
//		ArrayList<StorePaper> selectByExample;
//		selectByExample = storePaperMapper.selectByExample(ex);
//		selectByExample.forEach(value ->{
//			System.out.println(value.toString());
//		});
		//把循环列表的数据改为获取数据库中已出售的题库和试卷信息
		model.addAttribute("paperList", selectByExample);
		return "shop_paper::share_paper_list_div";
	}
}
