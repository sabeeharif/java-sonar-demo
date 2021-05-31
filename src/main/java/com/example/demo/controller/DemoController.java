package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	String c;
	String b = null;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/getDemoString")
	public String getAllAccounts() {
		String a;
		a = "Hey!";
		return a + " There?";
	}
	
	public void empty(int ic) {
		
	}

}
