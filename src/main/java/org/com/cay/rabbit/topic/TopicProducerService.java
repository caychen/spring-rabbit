package org.com.cay.rabbit.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TopicProducerService {

	@Autowired
	@Qualifier("rabbitTemplate")
	private AmqpTemplate amqpTemplate;

	@Value("${mq_topic_exchange}")
	private String exchangeKey;

	public void sendToQueue(String routeKey, Object obj) {
		// convertAndSend 将Java对象转换为消息发送至匹配key的交换机中Exchange
		amqpTemplate.convertAndSend(exchangeKey, routeKey, obj);
	}
}
