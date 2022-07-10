package com.thymeleaf.mvc;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thymeleaf.mvc.controllers.MainController;

@SpringBootTest
class MvcApplicationTests {
	@Autowired
	private MainController mc;

	@Test
	void contextLoads() {
	}

	@Test
	void getIndex() {
		String page = mc.index();
		assertAll(() -> assertEquals("index", page));
	}

}
