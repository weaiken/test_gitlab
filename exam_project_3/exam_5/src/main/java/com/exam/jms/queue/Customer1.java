package com.exam.jms.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.exam.dao.UserinfoMapper;
import com.exam.entity.Userinfo;


/**
 * 定义点对点模式的消费者
 * @author Administrator
 *
 */
@Component
public class Customer1 {
	
	@Autowired
	UserinfoMapper userinfoMapper;

	/**
	 * 在项目中随时监听demo.queue1队列 ,如果队列有变化 ,消费者就会监听到 ,会触发下面的方法,进行处理
	 * @param text
	 */
	@JmsListener(destination="demo.queue1")
	public void receiveQueue(String text){
		
		//fastjson提供一个方式,将文本类型强转成对象类型
		Userinfo u = JSON.parseObject(text , new TypeReference<Userinfo>(){});
		
		System.out.println("customer1从队列中得到的对象的内容是"+u.toString());
		
		userinfoMapper.addUser(u);
		
	}
}
