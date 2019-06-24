package com.exam.service;

import com.exam.entity.Userinfo;

public interface UserService {

	public String getUser();

	public Userinfo getUser(int uid);

	public int getExamBykey(String examkey);

	public int getReportid(String grade);

	public int modifyUser(Userinfo u);

	public Userinfo getUser(String email);

	public int addUser(Userinfo u);

	public int checkemail(String strs);

}
