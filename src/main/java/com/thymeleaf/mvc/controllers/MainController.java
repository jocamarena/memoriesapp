package com.thymeleaf.mvc.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.thymeleaf.mvc.model.Profile;
import com.thymeleaf.mvc.model.User;

@Controller
public class MainController {
    @GetMapping("/home")
    public String index() {
        return "index";
    }
    
    @GetMapping("/page2")
    public ModelAndView page2() {
    	ModelAndView modelView = new ModelAndView();
    	User user = new User();
    	user.setFirstname("Jose");
    	user.setLastname("Camarena");
    	user.setUsername("jose.j.camarena@gmail.com");
    	modelView.addObject(user);
    	List<String> mylist = new ArrayList<String>();
    	for (int i = 0; i < 10; i ++) {
    	mylist.add("item" +i );
    	System.out.println("item"+i);
    	}
    	System.out.println(mylist.size());
    	modelView.addObject("items", mylist);
    	List<Profile> profiles = new ArrayList<Profile>();
    	for (int i = 0; i <= 2; i++) {
    		profiles.add(new Profile(new Date(), "562-909-2345", true, user));
    	}
    	modelView.addObject("userProfiles", profiles);
    	modelView.setViewName("page2");
    	return modelView;
    }
}
