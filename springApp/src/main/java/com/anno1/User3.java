package com.anno1;

import org.springframework.beans.factory.annotation.Autowired;

public class User3 {
	private final UserService userService;
	
	// 생성자를 이용한 의존성 주입
	// 스프링 5는 <context:annotation-config/>만 설정하고 @Autowired 생략 가능
	@Autowired
	public User3(UserService userService) {
		this.userService = userService;
	}
	
	public void disp() {
		String s = userService.message();
		
		System.out.println("--- 애노테이션을 이용한 의존성 주입 : 생성자를 이용한 의존성 주입 ---");
		System.out.println(s);
	}
	
}
