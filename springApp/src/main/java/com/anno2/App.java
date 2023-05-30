package com.anno2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("classpath:com/anno2/applicationContext.xml");
		
		try {
			// 스프링 컨테이너에서 빈을 가져옴
			User obj = (User)context.getBean("user");
			obj.disp();
			
			System.out.println("------------------");
			
			User2 obj2 = (User2)context.getBean("user2");
			obj2.disp();
		} finally {
			context.close();
		}

	}

}
