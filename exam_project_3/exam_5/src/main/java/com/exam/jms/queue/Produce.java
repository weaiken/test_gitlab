package com.exam.jms.queue;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.exam.entity.Userinfo;


@Component
public class Produce {

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Autowired
	private Queue queue;
	

	public  void send(Userinfo u){
		String strU = JSON.toJSONString(u);
		this.jmsMessagingTemplate.convertAndSend(this.queue, strU);
	}
}
