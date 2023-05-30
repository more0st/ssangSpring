package com.anno.scope2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("classpath:com/anno/scope2/applicationContext.xml");
		
		try {
			Movie m1 = context.getBean(Movie.class);
			m1.play();
			m1.play();
			
			System.out.println("---------------------------");
			
			Music mu1 = context.getBean(Music.class);
			// proxyMode 모드에 의해 play() 메소드를 호출할 때마다 객체가 생성
			mu1.play();
			mu1.play();
			
		} finally {
			context.close();
		}

	}

}
