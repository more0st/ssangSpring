package com.anno.scope1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("classpath:com/anno/scope1/applicationContext.xml");
		
		try {
			// singleton(기본)
			Movie m1 = context.getBean(Movie.class);
			Movie m2 = context.getBean(Movie.class);
			if(m1 == m2) {
				System.out.println("Movie의 m1과 m2 : 동일 객체");
			} else {
				System.out.println("Movie의 m1과 m2 : 다른 객체");
			}
			
			m1.play();
			m2.play();
			
			System.out.println("---------------------------");
			
			// prototype
			Music mu1 = context.getBean(Music.class);
			Music mu2 = context.getBean(Music.class);
			if(mu1 == mu2) {
				System.out.println("Music의 mu1과 mu2 : 동일 객체");
			} else {
				System.out.println("Music의 mu1과 mu2 : 다른 객체");
			}
			
			mu1.play();
			mu2.play();
			
			
		} finally {
			context.close();
		}

	}

}
