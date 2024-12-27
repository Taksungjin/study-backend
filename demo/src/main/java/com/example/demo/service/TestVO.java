package com.example.demo.service;


public class TestVO implements ApiTestServiceImpl {
	
	private final String RESULT = "현금결제";

	@Override
	public String testService() {
		return RESULT;
	}
}
