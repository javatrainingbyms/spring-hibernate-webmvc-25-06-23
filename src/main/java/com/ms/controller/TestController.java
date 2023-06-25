package com.ms.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/testing")
	public void test() {
		System.out.println("Testing Success....");
	}
	
	
}

//in spring webmvc controller is supposed to return model and view to dispatcher servlet.