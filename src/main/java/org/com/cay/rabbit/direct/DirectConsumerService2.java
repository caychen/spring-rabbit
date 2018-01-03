package org.com.cay.rabbit.direct;

import org.springframework.stereotype.Component;

@Component
public class DirectConsumerService2 {

	public void getMessage(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Direct模式消费者2接收到 ： " + obj);
	}

}
