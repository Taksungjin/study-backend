package com.example.demo.service;

import java.util.Random;

public class RandVO implements ApiTestServiceImpl{
	
	public String testService() {
        Random rand = new Random();
        String randomNum = "";
        for (int i = 0; i < 6; i++) {
            String random = Integer.toString(rand.nextInt(10));
            randomNum += random;
        }

        return randomNum;
    }

}
