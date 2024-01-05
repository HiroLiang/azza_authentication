package com.azza.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(name="/test")
public class TestController {
	
	@GetMapping(name="/log")
	public String testLog() {
		log.info("Test >>> start");
		log.trace("Testing...");
		log.info("Test >>> end");
		return "ok";
	}

	public static void main(String[] args) {
		
	}
	
}
