package com.sam.MavenDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehicle {

	public void drive()
	{
		System.out.println("Lets drive!");
	}
	
}
