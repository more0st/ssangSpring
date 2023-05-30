package com.anno4;

import javax.inject.Inject;

/*
    <dependency>
    	<groupId>javax.inject</groupId>
    	<artifactId>javax.inject</artifactId>
    	<version>1</version>
    </dependency> 
*/
public class User {
	// 자바가 제공
	// 타입으로 의존성 주입. 동일한 타입이 둘 이상이면 이름의 빈으로 의존성 주입
	@Inject
	private UserService userService;
	
	public void disp() {
		String s = userService.message();
		
		System.out.println("--- @Inject : 타입으로 의존성 주입 ---");
		System.out.println(s);
	}
	
}
