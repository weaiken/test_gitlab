package com.exam.service;

import java.util.Date;
import java.util.List;

import com.exam.entity.Paper;
import com.exam.entity.PaperToQues;
import com.exam.entity.PaperToQuesExample;

public interface ExamService1 {
	Paper selectByPaperKey(int pid);
	
	Date Countdown(String starttime,int time,String endTime);
	
	List<List> selectPaperQues(PaperToQuesExample example,int pid);

}
