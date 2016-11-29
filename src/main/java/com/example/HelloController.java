package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	

	@Value("${application.greeting}")
    String greeting;
	
	
	@RequestMapping("/demo/rest")
	public String index() {
		return greeting;
	}

}
