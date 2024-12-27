package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MainTestService {
	
	ApiTestServiceImpl apiTestServiceImpl;
	
	public String pro(String test) {
		
		if(test.equals("1")) {
			
			apiTestServiceImpl = new TestVO();
			
		}else if(test.equals("2")) {
			
			apiTestServiceImpl = new TestVO2();
		}
		
		return apiTestServiceImpl.testService();
	}

}
