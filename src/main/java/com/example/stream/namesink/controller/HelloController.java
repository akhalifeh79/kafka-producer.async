package com.example.stream.namesink.controller;

import com.example.stream.namesink.service.message.MessageServiceProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private final MessageServiceProducer producer;

	@Autowired
	public HelloController(MessageServiceProducer producer) {
		this.producer = producer;
	}



	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/send")
	public String send() {
		producer.sendMessage("TEST-out-0","ciao!");
		return "OK";
	}

}
