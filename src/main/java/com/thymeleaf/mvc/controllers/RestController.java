package com.thymeleaf.mvc.controllers;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@GetMapping("/test2")
	@ResponseBody
	public Timestamp getDate(@RequestParam (name = "date", defaultValue = "2022-07-20 19:44:00") String input) {
		return Timestamp.valueOf(input);
	}
	
	@GetMapping("/test3")
	@ResponseBody
	public Test getDate(@RequestParam (name = "month", defaultValue = "1") String month, @RequestParam (name = "day", defaultValue = "1") String day, @RequestParam (name = "year", defaultValue = "1980") String year) {
		int y = Integer.parseInt(year);
		int m = Integer.parseInt(month);
		int d = Integer.parseInt(day);
		Timestamp ts = Timestamp.valueOf(LocalDateTime.of(LocalDate.of(y, m, d), LocalTime.now(ZoneId.of("America/Los_Angeles"))));
		List<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		Test t = new Test(new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(ts), list);
		return t;
	}
}

class Test{
	public Test(String date, List<String> list) {
		this.date = date;
		this.list = list;
	}
	private String date;
	private List<String> list;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
}