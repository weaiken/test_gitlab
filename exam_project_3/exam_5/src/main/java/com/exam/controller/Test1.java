package com.exam.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.exam.dao.QuesSingleMapper;
import com.exam.dao.StorePaperMapper;
import com.exam.dao.UserinfoMapper;
import com.exam.entity.Paper;
import com.exam.entity.QuesSingle;
import com.exam.entity.QuesSingleWithBLOBs;
import com.exam.entity.StorePaper;
import com.exam.entity.StorePaperExample;
import com.exam.entity.Userinfo;
import com.exam.entity.UserinfoExample;
import com.exam.service.UserService;

@RestController
public class Test1 {
	
	@Autowired
	UserService us;
	
	@Autowired
	QuesSingleMapper qsm;
	
	@Autowired
	StorePaperMapper spm;
	
	@RequestMapping("/getQsi")
	public QuesSingleWithBLOBs getQsiint( String qid ) {
		int id = Integer.parseInt(qid);
		QuesSingleWithBLOBs qsb = qsm.selectByPrimaryKey(id);
		
		return qsb;
	}
	
	@Autowired
	UserinfoMapper userinfoMapper;

	@RequestMapping("/test1")
	public String test1() {
		System.out.println("test1");
		return "test1";
	}
	
	@RequestMapping("/getuser")
	public String getUser() {
		return us.getUser();
	}
	
	@RequestMapping("changepw")
	public String cp() {
		
		return "cw";
	}
	
	@RequestMapping("/login_test")
	public Userinfo login_test(Integer uid, HttpServletRequest req) {
		System.out.println(uid);
		Userinfo u = userinfoMapper.selectByPrimaryKey(uid);
		System.out.println(u.getUname());
		req.getSession().setAttribute("currentUser", u);
		
		return u;
	}
	
	@RequestMapping("/getSharePapers")
	public List getSharePapers(String kw) {
		kw = "%" + kw + "%";
		return spm.selectSharePapers(kw);
	}
	
	@RequestMapping("/test5")
	public void getQues(){
		Paper p = new Paper();
		Userinfo u = new Userinfo();
		
		p.setPid(2);
		u.setUid(3);
		
		List<Object> ls = new ArrayList<Object>();
		
		ls.add(p);
		ls.add(u);

		for ( Object obj : ls ) {
			if ( obj instanceof Paper ) {
				System.out.println(((Paper)obj).getPid());
			}
			
			if ( obj instanceof Userinfo ) {
				System.out.println(((Userinfo)obj).getUid());
			}
		}
		System.out.println("ok================================================");
		
	}
}
