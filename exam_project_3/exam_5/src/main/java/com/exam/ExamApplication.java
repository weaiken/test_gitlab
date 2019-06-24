package com.exam;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;
import javax.jms.Topic;

@SpringBootApplication
public class ExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}
	
	/**
	 * springboot 在启动的时候 ,自动实例化带有@Bean注解的对象 
	 * 
	 * @return 返回值是一个Queue 队列的对象   Stack
	 */
	@Bean
	public Queue queue(){
		//定义一个点对点队列  ,名称为demo.queue1 
		return new ActiveMQQueue("demo.queue1");
	}
	
//	@Bean
//	public Topic topic(){
//		//定义一个主题模式队列  ,名称为demo.topic1 
//		return new ActiveMQTopic("demo.topic1");
//	}

}
