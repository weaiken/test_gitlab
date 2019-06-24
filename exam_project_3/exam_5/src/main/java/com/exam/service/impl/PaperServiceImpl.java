package com.exam.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exam.entity.StorePaperExample;
import com.exam.entity.StorePaperExample.Criteria;
import com.alibaba.fastjson.JSON;
import com.exam.dao.PaperMapper;
import com.exam.dao.PaperToQuesMapper;
import com.exam.dao.StorePaperMapper;
import com.exam.entity.Paper;
import com.exam.entity.PaperExample;
import com.exam.entity.PaperToQues;
import com.exam.entity.PaperToQuesExample;
import com.exam.entity.StorePaper;
import com.exam.service.PaperService;

@Service
public class PaperServiceImpl implements PaperService {
	
	@Autowired
	PaperMapper pm;
	
	@Autowired
	StorePaperMapper spm;
	
	@Autowired
	PaperToQuesMapper pqm;

	@Override
	public List<Paper> getTeaPapers(Integer uid) {
		List<Paper> pls = pm.selectTeaPapers(uid);
		
		return pls;
	}

	@Override
	public int getPaperExamineeNum(Integer pid) {
		
		int res = pm.countExamineeNum(pid);
		return res;
	}

	@Override
	public List<Integer> getPapersExamineeNum(List<Paper> pls) {
		
		List<Integer> ls = new ArrayList<Integer>();
		
		if ( pls == null || pls.size() == 0 )
			return null;
		
		for ( Paper p : pls ) {
			ls.add(this.getPaperExamineeNum(p.getPid()));
		}
		
		return ls;
	}

	@Override
	public int getPaperReportsNum(Integer pid) {
		
		int res = pm.countReportNum(pid);
		
		return res;
	}

	@Override
	public List<Integer> getPapersReportsNum(List<Paper> pls) {
		List<Integer> ls = new ArrayList<Integer>();
		
		if ( pls == null || pls.size() == 0 )
			return null;
		
		for ( Paper p : pls ) {
			ls.add(this.getPaperReportsNum(p.getPid()));
		}
		
		return ls;
	}

	@Override
	public int setPaperType(Paper p) {
		int res = pm.updateByPrimaryKeySelective(p);
		return res;
	}

	@Override
	public int setPaperExamTime(Paper p) {
		int res = pm.updateByPrimaryKeySelective(p);
		return res;
	}

	@Override
	public int setPickInfo(Paper p) {
		int res = pm.updateByPrimaryKeySelective(p);
		return res;
	}

	@Override
	public int setPaperShare(Integer pid) {
		
		StorePaperExample spe = new StorePaperExample();
		Criteria c = spe.createCriteria();
		c.andPidEqualTo(pid);
		List<StorePaper> sp_ls = spm.selectByExample(spe);
		if ( sp_ls.size()  > 0 ) {
			return -1;
		}
		
		StorePaper sp = new StorePaper();
		sp.setPid(pid);
		int res = spm.insertSelective(sp);
		
		return res;
	}

	@Override
	@Transactional
	public int paperCopy(Integer pid) {
		
		Paper p = pm.selectByPrimaryKey(pid);
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date=time.format(new Date());
		
		String pname = this.getPaperCopyName(p.getPname() + " - 副本");
		
		p.setPname(pname);
		p.setDate(date);
		
		int res = pm.insertPaperNoPrimaryKey(p);
		if ( res == 1 ) {
			int new_pid = p.getPid();
			int res_2 = this.paperQuesMap(pid, new_pid);
			
			if ( res == 1 && res_2 == 1 )
				return 1;
			else
				return 0;
		} else {
			return 0;
		}
		
	}

	@Override
	public int paperQuesMap(Integer old_pid, Integer new_pid) {
		PaperToQuesExample example = new PaperToQuesExample();
		example.createCriteria().andPidEqualTo(old_pid);
		
		List<PaperToQues> old_paper_ques_list = pqm.selectByExample(example);
		
		int result = 0;
		
		for(PaperToQues pq : old_paper_ques_list) {
			pq.setPid(new_pid);
			pq.setPqid(null);
			result += pqm.insertSelective(pq);
		}
		
		if(result == old_paper_ques_list.size())
			return 1;
		else
			return 0;
	}

	@Override
	public String getPaperCopyName(String pname) {
		
		PaperExample pe = new PaperExample();
		pe.createCriteria().andPnameEqualTo(pname);
		
		List<Paper> pls = pm.selectByExample(pe);
		
		while ( pls.size() != 0 ) {
			pname += " - 副本";
			pe = new PaperExample();
			pe.createCriteria().andPnameEqualTo(pname);
			pls.clear();
			pls = pm.selectByExample(pe);
		}
		
		return pname;
	}

	@Override
	@Transactional
	public int delPaper(Integer pid) {
		
		int res = pm.deleteByPrimaryKey(pid);
		if ( res == 1 ) {
			int res_2 = this.delPaperQuesMap(pid);
		}
		
		return res;
	}

	@Override
	public int delPaperQuesMap(Integer pid) {
		
		PaperToQuesExample pqe = new PaperToQuesExample();
		com.exam.entity.PaperToQuesExample.Criteria c = pqe.createCriteria().andPidEqualTo(pid);
		
		int result = pqm.deleteByExample(pqe);
		
//		System.out.println(result);
		
		return 1;
	}

}
