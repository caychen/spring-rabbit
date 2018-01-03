package org.com.cay.rabbit.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FanoutProducerService {

	@Autowired
	@Qualifier("rabbitTemplate")
	private AmqpTemplate amqpTemplate;
	
	@Value("${mq_fanout_exchange}")
	private String exchangeKey;
	
	public void sendToQueue(Object obj) {
		// convertAndSend 将Java对象转换为消息发送至匹配key的交换机中Exchange
		amqpTemplate.convertAndSend(exchangeKey, "", obj);//在fanout模式的交换机中不需要routekey，因为在fanout模式中凡是跟交换机绑定的队列均能收到消息
	}
}
