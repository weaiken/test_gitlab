package com.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.ExamineeMapper;
import com.exam.dao.PaperMapper;
import com.exam.dao.ReportMapper;
import com.exam.dao.UserinfoMapper;
import com.exam.entity.Examinee;
import com.exam.entity.Paper;
import com.exam.entity.Report;
import com.exam.entity.Userinfo;
import com.exam.entity.UserinfoExample;
import com.exam.jms.queue.Produce;
import com.exam.service.UserService;
import com.exam.entity.UserinfoExample.Criteria;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserinfoMapper userinfoMapper;

	@Autowired
	ExamineeMapper ex;
	
	@Autowired
	PaperMapper pm;

	@Autowired
	ReportMapper reportmapper;
	
	@Autowired 
	Produce produce;

//	private Examinee examinee;

	private Report report;

	@Override
	public String getUser() {

		Userinfo u = userinfoMapper.selectByPrimaryKey(2);

		return u.getUname();
	}

	@Override
	public Userinfo getUser(int uid) {

		Userinfo u = userinfoMapper.selectByPrimaryKey(uid);

		return u;
	}

	@Override
	public int getExamBykey(String examkey) {
		Paper paper = pm.selectByPrimaryKey(Integer.parseInt(examkey));
		if (paper == null)
			return 0;
		else
			return 1;
	}

	@Override
	public int getReportid(String grade) {
		report = reportmapper.selectByPrimaryKey(Integer.parseInt(grade));
		if (report == null)
			return 0;
		else
			return 1;
	}

	@Override
	public Userinfo getUser(String email) {

		UserinfoExample example = new UserinfoExample();
		example.createCriteria().andEmailEqualTo(email);

		List<Userinfo> select = userinfoMapper.selectByExample(example);

		return select.get(0);
	}

	@Override
	public int modifyUser(Userinfo u) {

		int res = userinfoMapper.updateByPrimaryKeySelective(u);
		return res;
	}

	@Override
	public int addUser(Userinfo u) {
		//int i = userinfoMapper.addUser(u);
		produce.send(u);
		return 1;
	}

	@Override
	public int checkemail(String strs) {
		UserinfoExample ue=new UserinfoExample();
		Criteria cc = ue.createCriteria();
		cc.andEmailEqualTo(strs);
		int i = userinfoMapper.countByExample(ue);

		return i;
	}

	/*
	 * @Override public int getNameandEmail(String name, String eamil) { Userinfo
	 * name = userinfoMapper.selectByPrimaryKey(Integer.parseInt(name)); Userinfo
	 * email = userinfoMapper.selectByPrimaryKey(Integer.parseInt(eamil));
	 * if((name&&eamil) == null) return 0; }
	 */

}
