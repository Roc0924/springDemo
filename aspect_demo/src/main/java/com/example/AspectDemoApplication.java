package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AspectDemoApplication {

	public static void main(String[] args) {
		long starTime = System.currentTimeMillis();
		SpringApplication.run(AspectDemoApplication.class, args);
		long endTime=System.currentTimeMillis();
		long Time=endTime-starTime;
		System.out.println("\nStart Time: "+ Time/1000 +" s");
		System.out.println("...............................................................");
		System.out.println("..................Service starts successfully..................");
		System.out.println("...............................................................");
	}
}
