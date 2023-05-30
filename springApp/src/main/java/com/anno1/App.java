package com.anno1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("classpath:com/anno1/applicationContext.xml");
		
		try {
			// 스프링 컨테이너에서 빈을 가져옴
			// User obj = (User)context.getBean("user");
			// User2 obj = (User2)context.getBean("user2");
			User3 obj = (User3)context.getBean("user3");
			
			obj.disp();
		} finally {
			context.close();
		}

	}

}
