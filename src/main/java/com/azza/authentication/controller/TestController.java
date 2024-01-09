package com.azza.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azza.authentication.config.SecurityConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/log")
	public String testLog() {
		log.info("Test >>> start");
		log.trace("Testing...");
		log.info("Test >>> end");
		return "ok";
	}
	
	@GetMapping("/ok")
	public String test() {
		return "test controller";
	}

	public static void main(String[] args) {
		
	}
	
}
