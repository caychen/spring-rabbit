package org.com.cay.rabbit.topic;

import org.springframework.stereotype.Component;

@Component
public class TopicConsumerService3 {

	public void getMessage(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Topic模式消费者3接收到 ： " + obj);
	}

}
