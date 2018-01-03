package org.com.cay.rabbit.fanout;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class FanoutConsumerService implements MessageListener {

	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		System.out.println("Fanout模式消费者接收到 ： " + message.toString());
	}

}
