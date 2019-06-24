package com.exam.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import com.exam.entity.Paper;

public interface PaperService {

	// 获取教师的所有试卷列表
//	@Cacheable(value="paper_list", key="'user_'+#uid")
	public List<Paper> getTeaPapers(Integer uid);

	// 获取一批试卷的考生数
	public List<Integer> getPapersExamineeNum(List<Paper> pls);

	// 获取试卷的邀请人数
//	@Cacheable(value="examinee_num_list", key="'pid_'+#pid")
	public int getPaperExamineeNum(Integer pid);

	// 获取试卷的成绩报告数
//	@Cacheable(value="report_num_list", key="'pid_'+#pid")
	public int getPaperReportsNum(Integer pid);

	// 获取一批试卷的报告数
	public List<Integer> getPapersReportsNum(List<Paper> pls);
	
	// 修改试卷的权限：公开/私有
	public int setPaperType(Paper p);
	
	// 修改试卷的考试时间
	public int setPaperExamTime(Paper p);
	
	// 修改试卷的采集信息
	public int setPickInfo(Paper p);
	
	// 分享试卷
	public int setPaperShare(Integer pid);
	
	// 试卷信息复制
	public int paperCopy(Integer pid);
	
	// 试卷-题目映射
	public int paperQuesMap(Integer old_pid, Integer new_pid);
	
	// 测试试卷副本名字
	public String getPaperCopyName(String pname);
	
	// 试卷删除
	public int delPaper(Integer pid);
	
	// 删除试卷-题目映射
	public int delPaperQuesMap(Integer pid);
}
