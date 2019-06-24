package com.exam.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.QuesFillMapper;
import com.exam.dao.QuesJudgeMapper;
import com.exam.dao.QuesMulMapper;
import com.exam.dao.QuesShortMapper;
import com.exam.dao.QuesSingleMapper;
import com.exam.entity.PaperToQues;
import com.exam.entity.QuesFillWithBLOBs;
import com.exam.entity.QuesJudgeWithBLOBs;
import com.exam.entity.QuesMulWithBLOBs;
import com.exam.entity.QuesShortWithBLOBs;
import com.exam.entity.QuesSingleExample;
import com.exam.entity.QuesSingleExample.Criteria;
import com.exam.entity.QuesSingleWithBLOBs;
import com.exam.service.PaperExamService;

@Service
public class PaperServiceImpl implements PaperExamService{
	@Autowired
	QuesSingleMapper quesSingleMapper;
	@Autowired
	QuesMulMapper quesMulMapper;
	@Autowired
	QuesFillMapper quesFillMapper;
	@Autowired
	QuesJudgeMapper quesJudgeMapper;
	@Autowired
	QuesShortMapper quesShortMapper;

	@Override
	public List<QuesSingleWithBLOBs> selectByExampleWithBLOBs(QuesSingleExample example,int pid) {
		Criteria criteria = example.createCriteria();
	    criteria.andQsidEqualTo(pid);
		List<QuesSingleWithBLOBs> list = quesSingleMapper.selectByExampleWithBLOBs(example);
		return list;
	}

	@Override
	public List<Object> selectPartQuestion(List<PaperToQues> list) {
		List<Object> PartQuestion = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			int qid = list.get(i).getQid();
			int type = list.get(i).getType();
			if(type==1) {
				QuesSingleWithBLOBs single= quesSingleMapper.selectByPrimaryKey(qid);
				PartQuestion.add(single);
;			}
			if(type==2) {
			    QuesMulWithBLOBs mul = quesMulMapper.selectByPrimaryKey(qid);
			    PartQuestion.add(mul);
			}
			
			if(type==3) {
				QuesJudgeWithBLOBs judge = quesJudgeMapper.selectByPrimaryKey(qid);
				PartQuestion.add(judge);			}
			if(type==4) {
				QuesFillWithBLOBs fill = quesFillMapper.selectByPrimaryKey(qid);
				PartQuestion.add(fill);
			}
			if(type==5) {
				QuesShortWithBLOBs selectByPrimaryKey = quesShortMapper.selectByPrimaryKey(qid);
				PartQuestion.add(selectByPrimaryKey);
			}
		}
		return PartQuestion;
	}
	
}
