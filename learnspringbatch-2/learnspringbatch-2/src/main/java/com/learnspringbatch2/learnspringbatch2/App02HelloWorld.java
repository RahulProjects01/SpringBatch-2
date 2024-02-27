package com.learnspringbatch2.learnspringbatch2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var context = new AnnotationConfigApplicationContext(HelloWorldSpring.class);
		// Launch spring context
		// do paly with beans 
		// @anotation bolte jo @bean @oride etc.
		context.getBean("name");
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("umar"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("personMethodCall"));
		System.out.println(context.getBean("personMethodCall2"));
	}

}
