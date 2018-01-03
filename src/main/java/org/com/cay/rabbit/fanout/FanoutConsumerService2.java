package org.com.cay.rabbit.fanout;

import org.springframework.stereotype.Component;

@Component
public class FanoutConsumerService2 {

	public void getMessage(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Fanout模式消费者2接收到 ： " + obj);
	}

}
