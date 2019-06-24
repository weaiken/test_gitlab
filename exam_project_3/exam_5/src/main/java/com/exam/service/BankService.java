package com.exam.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import com.exam.entity.QuesBank;

public interface BankService {

	// 获取教师的所有题库列表
//	@Cacheable(value="bank_list", key="'user_'+#uid")
	public List<QuesBank> getTeaBanks(Integer uid);
	
	// 创建一个题库
	// 销毁redis中的bank_list
	public int creatBank(QuesBank bank);
	
	// 修改题库信息
	public int modBankInfo(QuesBank bank);
	
	// 分享题库
	public int setBankShare(Integer bid);
	
	// 删除题库
	public int delBank(Integer bid);
	
	// 删除题库-题目映射
	public int delBankQuesMap(Integer bid);
	

//	// 获取一批题库的问题数
//	public List<Integer> getBanksQuesNum(List<QuesBank> bls);

//	// 获取题库的问题数
//	@Cacheable(value="ques_num_list", key="'bid_'+#bid")
//	public int getBankQuesNum(Integer bid);

//	// 获取试卷的成绩报告数
//	@Cacheable(value="report_num_list", key="'pid_'+#pid")
//	public int getPaperReportsNum(Integer pid);
//
//	// 获取一批试卷的报告数
//	public List<Integer> getPapersReportsNum(List<Paper> pls);
	
}
