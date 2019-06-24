package com.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.PaperMapper;
import com.exam.entity.Paper;
import com.exam.service.ExamService;
@Service
public class ExamServiceImpl implements ExamService {
	
	@Autowired
	PaperMapper pm;
	
	

	@Override
	public Paper getPaper(Integer pid) {
		Paper paper = pm.selectByPrimaryKey(pid);
		return paper;
	}

	@Override
	public Paper getPaper(String name, String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
