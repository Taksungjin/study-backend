package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class RandNumService {
	
	private ApiTestServiceImpl apiTestServiceImpl;
	
	public String randNum() {
		
		apiTestServiceImpl = new RandVO();
		
		return apiTestServiceImpl.testService();
		
	}
	
	
}
