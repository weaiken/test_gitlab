package com.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.QuesBankMapper;
import com.exam.dao.StorePaperMapper;
import com.exam.entity.Paper;
import com.exam.entity.QuesBank;
import com.exam.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	StorePaperMapper storePaperMapper;
	@Autowired
	QuesBankMapper quesBankMapper;

	@Override
	public List<Paper> searchpaper(String s) {

		s = "%" + s + "%";

		List<Paper> selectShare = storePaperMapper.selectShare(s);

		// TODO Auto-generated method stub
		return selectShare;
	}

	@Override
	public List<QuesBank> searchbank(String i) {
		i = "%" + i + "%";
		
		List<QuesBank> selectBank = quesBankMapper.selectBank(i);

		// TODO Auto-generated method stub
		return selectBank;
	}

}
