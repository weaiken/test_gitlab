package com.exam.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.BankToQUesMapper;
import com.exam.dao.QuesBankMapper;
import com.exam.dao.StoreQuesBankMapper;
import com.exam.entity.BankToQUesExample;
import com.exam.entity.PaperToQuesExample;
import com.exam.entity.QuesBank;
import com.exam.entity.QuesBankExample;
import com.exam.entity.StorePaper;
import com.exam.entity.StorePaperExample;
import com.exam.entity.StorePaperExample.Criteria;
import com.exam.entity.StoreQuesBank;
import com.exam.entity.StoreQuesBankExample;
import com.exam.service.BankService;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	QuesBankMapper qbm;
	
	@Autowired
	BankToQUesMapper bqm;
	
	@Autowired
	StoreQuesBankMapper sbm;

	@Override
	public List<QuesBank> getTeaBanks(Integer uid) {
//		System.out.println(uid + "ok---------");//-----------------
//		List<QuesBank> res = qbm.selectTeaBanks(uid);
		
		QuesBankExample be = new QuesBankExample();
		com.exam.entity.QuesBankExample.Criteria c = be.createCriteria().andUidEqualTo(uid);
		List<QuesBank> bank_ls = qbm.selectByExampleWithBLOBs(be);
		
		return bank_ls;
	}

	@Override
	public int creatBank(QuesBank bank) {
		
		int res = qbm.creatBank(bank);

		System.out.println("+++++++++++++++id=" + res);//--------------------------
		
		return res;
	}

	@Override
	public int setBankShare(Integer bid) {
		StoreQuesBankExample sbe = new StoreQuesBankExample();
		com.exam.entity.StoreQuesBankExample.Criteria c = sbe.createCriteria();
		c.andBidEqualTo(bid);
		
		List<StoreQuesBank> sb_ls = sbm.selectByExample(sbe);
		
		if ( sb_ls.size()  > 0 ) {
			return -1;
		}
		
		StoreQuesBank sp = new StoreQuesBank();
		sp.setBid(bid);
		int res = sbm.insertSelective(sp);
		
		return res;
	}

	@Override
	public int delBank(Integer bid) {
		int res = qbm.deleteByPrimaryKey(bid);
		if ( res == 1 ) {
			int res_2 = this.delBankQuesMap(bid);
		}
		
		return res;
	}

	@Override
	public int delBankQuesMap(Integer bid) {
		BankToQUesExample bqe = new BankToQUesExample();
		com.exam.entity.BankToQUesExample.Criteria c = bqe.createCriteria().andBidEqualTo(bid);
		
		int result = bqm.deleteByExample(bqe);
		
//		System.out.println(result);
		
		return 1;
	}

	@Override
	public int modBankInfo(QuesBank bank) {
		
		QuesBank old_bank = qbm.selectByPrimaryKey(bank.getBid());
		old_bank.setBname(bank.getBname());
		old_bank.setBdescribe(bank.getBdescribe());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(new Date());
		old_bank.setDate(date);
		
		int res = qbm.updateByPrimaryKeyWithBLOBs(old_bank);
		
		return res;
	}

//	@Override
//	public List<Integer> getBanksQuesNum(List<QuesBank> bls) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public int getBankQuesNum(Integer bid) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
