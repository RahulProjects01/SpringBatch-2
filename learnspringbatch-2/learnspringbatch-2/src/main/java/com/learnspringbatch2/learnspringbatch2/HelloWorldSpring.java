package com.learnspringbatch2.learnspringbatch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age , Address address) {};
record Address(String city, String state) {};

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
    	return new Person("Mohit",23,address());
    }
    
    @Bean
    @Primary
    public Address address() {
    	var Ghar = new Address("Jaipur", "Rajasthan");
    	return Ghar;
    }
    
    @Bean
    public Address address2() {
    	var Ghar = new Address("Moti_Dungri", "Jaipur");
    	return Ghar;
    }
    
    @Bean
    public Person personMethodCall() {
    	return new Person(name(),age() , new Address("Lalsot","Dausa"));
    }// can we pass method in a constator ...?
    
    
    @Bean
    public Person personMethodCall2(String name, int age, Address address) {
    	return new Person(name, age ,address);
    }
}

// streem in array
