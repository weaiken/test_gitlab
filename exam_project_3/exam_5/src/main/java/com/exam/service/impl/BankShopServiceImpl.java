package com.exam.service.impl;

import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exam.dao.BankToQUesMapper;
import com.exam.dao.QuesBankMapper;
import com.exam.dao.StoreQuesBankMapper;
import com.exam.entity.BankToQUes;
import com.exam.entity.BankToQUesExample;
import com.exam.entity.QuesBank;

import com.exam.service.BankShopService;

@Service
public class BankShopServiceImpl implements BankShopService {

	@Autowired
	QuesBankMapper quesbankmapper;
	@Autowired
	StoreQuesBankMapper storequesbankmapper;
	@Autowired
	BankToQUesMapper banktoquesmapper;

	@Override
	@Transactional
	public int agreeBank(Integer bid, Integer uid) { // q 接收 controller中的bid 拿着这个bid去创建一个新的题库 使用mapping表将原bid中的
														// 题目插入到新bid中

		QuesBank bank = quesbankmapper.selectByPrimaryKey(bid);
		bank.setUid(uid);
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 设置时间
		String date = time.format(new Date());
		bank.setDate(date);
		quesbankmapper.creatBank(bank);
		Integer bidnew = bank.getBid();
		return bidnew;
	}

	@Override
	public int reMap(Integer old_bid, Integer new_bid) {
//		BankToQUesExample example = new BankToQUesExample();
//		example.createCriteria().andBidEqualTo(old_bid);

		BankToQUesExample example = new BankToQUesExample();
		example.createCriteria().andBidEqualTo(old_bid);

		java.util.List<BankToQUes> old_banklist = banktoquesmapper.selectByExample(example);
		int result = 0;
		for (BankToQUes bq : old_banklist) {
			bq.setBid(new_bid);
			bq.setBqid(null);
			result += banktoquesmapper.insert(bq);

		}
		return result;
	}

}
