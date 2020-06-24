package com.ms.assignment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")

public class TestController {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

	@GetMapping("/{message}")
	public String toUpperCase(@PathVariable("message") String message) {
		LOGGER.debug("Message is {}", message);
		return message.toUpperCase();
	}

}
