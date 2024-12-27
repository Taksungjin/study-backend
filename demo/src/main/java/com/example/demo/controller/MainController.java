package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.service.MainTestService;
import com.example.demo.service.RandNumService;

@RestController
public class MainController {
	
	
	private MainTestService mainTestService;
	
	@Autowired
	private RandNumService numService;
	
	public MainController(MainTestService mainTestService) {
		this.mainTestService = mainTestService;
	}
	
	
	@GetMapping("/testget")
	public String getController(@RequestParam(name = "pay") String param) {
		
		return mainTestService.pro(param);
	}
	
	@GetMapping("/random")
	public String smsNum() {
		return numService.randNum();
	}
}
 