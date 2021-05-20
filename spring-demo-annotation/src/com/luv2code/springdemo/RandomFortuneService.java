package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array
	private String[] data = {
			"Beware, You are smart",
			"You Fuck hard",
			"Suck it up, its life"
	};
	
	//create a random number generator
	
	private Random myRandom = new Random();
	//int rand = (int)(Math.random() * 2) + 0;
	
	int index = myRandom.nextInt(data.length);
	

	@Override
	public String getFortune() {
		
		
		return data[index];
	}

}
