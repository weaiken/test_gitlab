package com.exam.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.Paper;
import com.exam.entity.PaperToQues;
import com.exam.entity.PaperToQuesExample;
import com.exam.entity.PaperToQuesExample.Criteria;
import com.exam.entity.QuesSingleExample;
import com.exam.entity.QuesSingleWithBLOBs;
import com.exam.service.ExamService1;
import com.exam.service.PaperExamService;

@Controller
public class PaperToQuesController {

	@Autowired
	ExamService1 examService;
	@Autowired
	PaperExamService paperService;
//	@RequestMapping("/tolist")
//	public List list(HttpServletRequest req){//单选题列表
//	//	int pid=(Integer)req.getSession().getAttribute("pid");//需要从session获取到试卷的id
//	//	Paper paper=(Paper)req.getSession().getAttribute("paper");
//	//	int pid = paper.getPid();
//		PaperToQuesExample example = new PaperToQuesExample();
//	//	Criteria criteria = example.createCriteria();
//	//	criteria.andPidEqualTo(1);
//		List<PaperToQues> list = examService.selectByExample(example,1);
//		List<PaperToQues> list1 = new ArrayList<>();
//		List<PaperToQues> list2 = new ArrayList<>();
//		List<PaperToQues> list3 = new ArrayList<>();
//		List<PaperToQues> list4 = new ArrayList<>();
//		List<PaperToQues> list5 = new ArrayList<>();
//		List<QuesSingleWithBLOBs> list7= new ArrayList<>();
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getType()==1) {
//				list1.add(list.get(i));
//			}else if(list.get(i).getType()==2){
//				list2.add(list.get(i));
//			}else if(list.get(i).getType()==3){
//				list3.add(list.get(i));
//			}else if(list.get(i).getType()==4){
//				list4.add(list.get(i));
//			}else if(list.get(i).getType()==5){
//				list5.add(list.get(i));
//			}
//			
//			QuesSingleExample example2 = new QuesSingleExample();
//			List<QuesSingleWithBLOBs> list6=new ArrayList<>();
//			for(int m=0;m<list1.size();m++) {
//				int pid1 = list1.get(m).getPid();
//				paperService.selectByExampleWithBLOBs(example2,pid1);
//			}
//			for(int j=0;j<list6.size();j++) {
//				for(int k=0;k<list1.size();k++)
//				if(list6.get(j).getQsid()==list1.get(k).getQid()) {
//					list7.add(list6.get(j));
//					System.out.println(list6.get(j).getQsid());
//					System.out.println("---------------");
//					System.out.println(list1.get(k).getPid());
//				}
//			}
//			
////			m.addAttribute("list1",list1);
////			m.addAttribute("list2",list2);
////			m.addAttribute("list3",list3);
////			m.addAttribute("list4",list4);
////			m.addAttribute("list5",list5);
//		}
//		System.out.println("list1"+list1);
//		System.out.println("list2"+list1);
//		System.out.println("list3"+list1);
//		System.out.println("list4"+list1);
//		System.out.println("list5"+list1);
//		System.out.println("list6"+list1);
//		System.out.println("list7"+list7);
//		System.out.println("list"+list1);
//		return list2;
//	}
	
	
	@RequestMapping("/tolist1")
	public String Questionlist(HttpServletRequest req, Model m){//单选题列表
	//	int pid=(Integer)req.getSession().getAttribute("pid");//需要从session获取到试卷的id
	//	Paper paper=(Paper)req.getSession().getAttribute("paper");
	//	int pid = paper.getPid();
		PaperToQuesExample example = new PaperToQuesExample();
		List<List> list = examService.selectPaperQues(example, 3);
		
	//	List<Object> partQuestions=new ArrayList<>();//部分的問題列表
		
		List<Map<String, Object>> list_all = new ArrayList<Map<String, Object>>() ;
		
		for(int i=0;i<list.size();i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			List<PaperToQues> list1 = list.get(i);
			
			map.put("part_name", list1.get(0).getVar1());
			map.put("part_map_ls", list1);
			
			List<Object> list2 = paperService.selectPartQuestion(list1);
			
			map.put("part_ques_ls", list2);
			
			list_all.add(map);
			m.addAttribute("map",map);
		}
		
		m.addAttribute("list_all", list_all);
		return "hello6";
	}
}
