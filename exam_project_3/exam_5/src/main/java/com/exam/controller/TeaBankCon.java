package com.exam.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.exam.entity.QuesBank;
import com.exam.service.BankService;

@Controller
public class TeaBankCon {

	@Autowired
	BankService bs;

	@RequestMapping("/toTeaBankSpace")
	public String toTeaSpace() {
		return "teacher_bank";
	}

	// 获取教师所有的的试卷
	@RequestMapping("/getBankLs")
	public String getPapers(Model m) {
		List<QuesBank> bls = bs.getTeaBanks(1);

		m.addAttribute("bank_list", bls);

//		if(bls != null)
//			for (QuesBank b : bls)
//				System.out.println(b.getBname());
//		else
//			System.out.println("wu");
//		m.addAttribute("examineeNum", bs.getPapersExamineeNum(pls));
//		m.addAttribute("reportNum", bs.getPapersReportsNum(pls));
//		
//		List<Integer> ls = bs.getPapersReportsNum(pls);
//		System.out.println(ls.get(0) + " " + ls.get(1) + " " + ls.get(2) + " ");

		return "teacher_bank::my_banks_div";
	}

	// 题库创建
	@RequestMapping("/creat_bank")
	public void creat_bank(@RequestBody QuesBank bank, HttpServletResponse response) throws IOException {
		bank.setUid(1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(new Date());
		bank.setDate(date);

		int res = bs.creatBank(bank);

		if (0 != res)
			response.getWriter().print(bank.getBid());
		else
			response.getWriter().print(0);
	}

	// 题库创建
	@RequestMapping("/modBankInfo")
	public void modBankInfo(@RequestBody QuesBank bank, HttpServletResponse response) throws IOException {
//		bank.setUid(1);

		

		int res = bs.modBankInfo(bank);

		if (0 != res)
			response.getWriter().print(bank.getBid());
		else
			response.getWriter().print(0);
	}

	@RequestMapping("/setBankShare")
	public void setPaperShare(@RequestParam("bid") Integer bid, HttpServletResponse response) {
//		System.out.println(bid + " " );//------------------

		int res = bs.setBankShare(bid);

		try {
//			response.getWriter().print(res);
			response.getWriter().print(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping("/delBank")
	public void delBank(@RequestParam("bid") Integer bid, HttpServletResponse response) {
//		System.out.println(bid + " " );//------------------

		int res = bs.delBank(bid);

		try {
//			response.getWriter().print(res);
			response.getWriter().print(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ==============================================================

	// 获取教师所有的的试卷
//		@RequestMapping("/testBankLs")
//		@ResponseBody
//		public List testBankLs(Model m){
//			List<QuesBank> bls = bs.getTeaBanks(1);
//			
////			m.addAttribute("bank_list", bls);
//			
////			if(bls != null)
////				for (QuesBank b : bls)
////					System.out.println(b.getBname());
////			else
////				System.out.println("wu");
////			m.addAttribute("examineeNum", bs.getPapersExamineeNum(pls));
////			m.addAttribute("reportNum", bs.getPapersReportsNum(pls));
////			
////			List<Integer> ls = bs.getPapersReportsNum(pls);
////			System.out.println(ls.get(0) + " " + ls.get(1) + " " + ls.get(2) + " ");
//			
//			return bls;
//		}

}
