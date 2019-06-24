package com.exam.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.PaperMapper;
import com.exam.dao.PaperToQuesMapper;
import com.exam.entity.Paper;
import com.exam.entity.PaperToQues;
import com.exam.entity.PaperToQuesExample;
import com.exam.entity.PaperToQuesExample.Criteria;
import com.exam.entity.QuesSingleExample;
import com.exam.entity.QuesSingleWithBLOBs;
import com.exam.service.ExamService1;

@Service
public class ExamService1Impl implements ExamService1{
	@Autowired
	PaperMapper paperMapper;
	@Autowired
	PaperToQuesMapper paperToQuesMapper;

	@Override
	public Paper selectByPaperKey(int pid) {
		Paper paper = paperMapper.selectByPrimaryKey(pid);
		return paper;
	}

	@Override
	public Date Countdown(String starttime,int time,String endtime) {
		SimpleDateFormat s =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date stime = s.parse(starttime);//考生进入考试的时刻
			System.out.println(stime);
			Date etime = s.parse(endtime);//考试设定的结束时间
			long examtime= time*60*1000;
			long stime1 = stime.getTime();
			long etime2 = etime.getTime();//考生如果按照规定时间提交的时间，可能超过考试设定的结束时间
			long realetime=examtime+stime1;
			Date newdate = new Date(realetime);
			String format = s.format(newdate);
			Date parse = s.parse(format);
			if(realetime>=etime2) {
				return etime;
			}
			    return parse;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	


	@Override
	public List<List> selectPaperQues(PaperToQuesExample example, int pid) {
		Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(pid);
		List<PaperToQues> list = paperToQuesMapper.selectByExample(example);//获取到paperToQuesMapper表中pid=pid的所有记录
		List <List> partCollection = new ArrayList<>();
		List<Integer> maxList=new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			int int1 = list.get(i).getInt1();
			maxList.add(int1);
		}
		
		int max = Collections.max(maxList);
		
		for(int j=1;j<=max;j++){
			List <PaperToQues> part = new ArrayList<>();
			for(int i = 0;i<list.size();i++) {
//				List<PaperToQues> ques =new ArrayList<>();
				if(list.get(i).getInt1()==j) {
					PaperToQues paperToQues = list.get(i);
//					ques.add(paperToQues);
					part.add(paperToQues);
				}
			}
			Collections.sort(part, new Comparator<PaperToQues>() {
				public int compare(PaperToQues p,PaperToQues q) {
					return p.getQorder()-q.getQorder();
				}
			});
			partCollection.add(part);
		}
		return partCollection;
		
	}

}
