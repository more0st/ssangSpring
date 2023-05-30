package com.look;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// 스프링 컨테이너
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("classpath:com/look/applicationContext.xml");
		
		try {
			PizzaShop shop = (PizzaShop)context.getBean("pizzaShop");
			
			Pizza p1 = shop.makePizza();
			System.out.println("첫번째 피자 : " + p1);
			
			Pizza p2 = shop.makePizza();
			System.out.println("두번째 피자 : " + p2);
			
			Pizza p3 = shop.makeVeggiePizza();
			System.out.println("베지 피자 : " + p3);
			
		} finally {
			context.close();
		}

	}

}
