package com.exam.service;

import com.exam.entity.Paper;

public interface ExamService {

	// 通过试卷邀请码查找试卷
	public Paper getPaper(Integer pid);
	
	// 通过试卷考生信息查找试卷
	public Paper getPaper(String name, String email);
}
