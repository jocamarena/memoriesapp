package com.thymeleaf.mvc.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.thymeleaf.mvc.model.Users;

@Controller
public class MainController {
	@GetMapping("/home")
	public String index() {
		return "index";
	}

	@GetMapping("/page2")
	public ModelAndView page2() {
		ModelAndView modelView = new ModelAndView();
		Users user = new Users("jcamarena", "Clairdel803!", true);
		modelView.addObject("user", user);
		return modelView;
	}

	@GetMapping("/page3")
	public ModelAndView page3() {
		ModelAndView modelView = new ModelAndView();
		List<String> mylist = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			mylist.add("item" + i);
		}
		modelView.addObject("items", mylist);
		modelView.setViewName("page2");

		return modelView;
	}
}
