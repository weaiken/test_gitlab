package com.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.UserinfoMapper;
import com.exam.entity.Userinfo;
import com.exam.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserinfoMapper userinfoMapper;

	@Override
	public String getUser() {
		
		Userinfo u =  userinfoMapper.selectByPrimaryKey(2);
		
		return u.getUname();
	}

}
