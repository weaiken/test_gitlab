package com.exam.service;

import java.util.List;

import com.exam.entity.PaperToQues;
import com.exam.entity.QuesSingleExample;
import com.exam.entity.QuesSingleWithBLOBs;

public interface PaperExamService {

	List<QuesSingleWithBLOBs> selectByExampleWithBLOBs(QuesSingleExample example,int pid);
	
	List<Object> selectPartQuestion(List<PaperToQues> list);
	
}
