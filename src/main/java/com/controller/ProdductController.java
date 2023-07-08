package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdductController {

	@GetMapping(value ="/get")
	public String name() {
		String name ="Sameer & Amol";
		return name;
	}
	
}
