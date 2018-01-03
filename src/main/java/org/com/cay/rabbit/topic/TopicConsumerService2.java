package org.com.cay.rabbit.topic;

import org.springframework.stereotype.Component;

@Component
public class TopicConsumerService2 {

	public void getMessage(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Topic模式消费者2接收到 ： " + obj);
	}

}
