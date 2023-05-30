package com.scope1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("classpath:com/scope1/applicationContext.xml");
		
		try {
			Movie movie1 = context.getBean(Movie.class);
			Movie movie2 = context.getBean(Movie.class);
			
			// singleton(기본)
			if(movie1 == movie2) {
				System.out.println("movie:동일객체");
			} else {
				System.out.println("movie:다른객체");
			}
			
			movie1.play();
			movie2.play();
			
			System.out.println("-------------------------------\n");
			
			// prototype : 컨테이너에서 객체를 가져올 때마다 새로운 객체가 생성
			Music music1 = context.getBean(Music.class);
			Music music2 = context.getBean(Music.class);
			
			if(music1 == music2) {
				System.out.println("music:동일객체");
			} else {
				System.out.println("music:다른객체");
			}
			
			music1.play();
			music2.play();
			
		} finally {
			context.close();
		}

	}

}
