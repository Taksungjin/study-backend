package com.example.demo.service;


public class TestVO2 implements ApiTestServiceImpl{
	
	private final String RESULT = "카드결제"; 
	
	@Override
	public String testService() {
		return RESULT;
	}

}
