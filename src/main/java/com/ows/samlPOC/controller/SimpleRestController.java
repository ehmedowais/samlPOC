package com.ows.samlPOC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
	@GetMapping(path="/hellowmessage")
	public String sayHello() {
		String response = "Hello Owais";
		return response;
		
	}
}