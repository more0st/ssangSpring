package com.config.user2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		try {
			// User user = context.getBean(User.class);
			User user = (User)context.getBean("user2.user");
			user.disp();
			
			User user2 = (User)context.getBean("user2.user");
			System.out.println(user == user2);
		} finally {
			context.close();
		}
		
	}

}
