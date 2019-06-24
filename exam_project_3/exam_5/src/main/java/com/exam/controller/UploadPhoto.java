package com.exam.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.exam.entity.Userinfo;
import com.exam.service.UserService;

@RestController
public class UploadPhoto {
	
	@Autowired
	UserService us;

	@RequestMapping("/upload_photo")
	public Map<String, Object> upload(MultipartFile file, HttpServletRequest request) {
//		System.out.println("ok");
		Map<String, Object> map = new HashMap<String, Object>();
		if (file.isEmpty()) {
			map.put("code", 1);
			return map;
		}
		
		// fileName可以用自己的生成方案，我这里只简单用的原始文件名称
		String fileName = file.getOriginalFilename();
		String filePath = request.getServletContext().getRealPath("/upload");
		
		Userinfo currentUser = (Userinfo) request.getSession().getAttribute("currentUser");
		fileName = currentUser.getUid() + ".jpg";
		filePath = "C:\\Users\\weizh\\Documents\\Programs\\eclipse-workspace\\exam2\\src\\main\\resources\\static\\img\\photo\\";
		
		// 如果没有该文件夹,创建文件夹,有,就跳过
		File fileFolder = new File(filePath);
		if (!fileFolder.exists()) {
			fileFolder.mkdirs();
		}

		// 目标文件的路径和文件名
		File dest = new File(filePath, fileName);
		try {
			file.transferTo(dest);// transferTo() 将二进制流写入到某个目标文件上
			map.put("code", 0);
			
			Userinfo u = new Userinfo();
			u.setUid(currentUser.getUid());
			u.setPhoto(fileName);
			us.modifyUser(u);
			System.out.println(u.getPhoto());//------------------
			
			currentUser.setPhoto(fileName);
			System.out.println(currentUser.getPhoto());//------------------

			System.out.println(((Userinfo) request.getSession().getAttribute("currentUser")).getPhoto());//------------------
//			request.getSession().getAttribute("currentUser", fileName);
			
			return map;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		map.put("code", 1);
		
		return map;
	}
}
