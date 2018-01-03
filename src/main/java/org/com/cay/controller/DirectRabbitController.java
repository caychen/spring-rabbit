package org.com.cay.controller;

import java.util.HashMap;
import java.util.Map;

import org.com.cay.rabbit.direct.DirectProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rabbit/direct")
public class DirectRabbitController {

	@Autowired
	private DirectProducerService directProducerService;

	@ResponseBody
	@RequestMapping(value = "/send", produces = { "application/json;charset=utf-8" })
	public String send(String routeKey) {
		Map<String, Object> data = new HashMap<>();
		data.put("msg", "hello rabbitmq");
		directProducerService.sendToQueue(routeKey, data);

		return "发送完毕";
	}

	@ResponseBody
	@RequestMapping(value = "/send2", produces = { "application/json;charset=utf-8" })
	public String send2(String routeKey) {
		for (int i = 0; i < 10; ++i) {
			String msg = "发送者发送了 =====> " + i;
			directProducerService.sendToQueue(routeKey, msg);
		}
		return "发送完毕";
	}
}
