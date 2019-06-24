package com.exam.service;

import java.util.List;

import com.exam.entity.Paper;
import com.exam.entity.QuesBank;

public interface SearchService {
 
	List<Paper> searchpaper(String s);
	List<QuesBank> searchbank(String i);
	
}
