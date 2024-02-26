package com.learnspringbatch2.learnspringbatch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldSpring {
    @Bean
	public String name() {
		return "Rahul";
	}
	
    @Bean(name = "umar")
  	public int age() {
  		return 21;
  	}
    
    @Bean
    public Person person() {
    	return new Person ("Mohit",23);
    }
}
