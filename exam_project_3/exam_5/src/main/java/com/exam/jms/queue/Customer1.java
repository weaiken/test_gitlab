package com.exam.jms.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.exam.dao.UserinfoMapper;
import com.exam.entity.Userinfo;


/**
 * �����Ե�ģʽ��������
 * @author Administrator
 *
 */
@Component
public class Customer1 {
	
	@Autowired
	UserinfoMapper userinfoMapper;

	/**
	 * ����Ŀ����ʱ����demo.queue1���� ,��������б仯 ,�����߾ͻ������ ,�ᴥ������ķ���,���д���
	 * @param text
	 */
	@JmsListener(destination="demo.queue1")
	public void receiveQueue(String text){
		
		//fastjson�ṩһ����ʽ,���ı�����ǿת�ɶ�������
		Userinfo u = JSON.parseObject(text , new TypeReference<Userinfo>(){});
		
		System.out.println("customer1�Ӷ����еõ��Ķ����������"+u.toString());
		
		userinfoMapper.addUser(u);
		
	}
}
