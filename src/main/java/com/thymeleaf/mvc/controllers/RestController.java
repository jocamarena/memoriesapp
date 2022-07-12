package com.thymeleaf.mvc.controllers;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1")
public class RestController {
	@GetMapping("/test")
	public String makeRestCall(){
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> responseEntity = rt.exchange("https://www.googleapis.com/books/v1/volumes?q=isbn:9781260463415", HttpMethod.GET, null, String.class);
		return responseEntity.getBody();
	}
}
