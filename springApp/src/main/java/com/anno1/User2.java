package com.anno1;

import org.springframework.beans.factory.annotation.Autowired;

public class User2 {
	private UserService userService;
	
	// setter를 이용한 의존성 주입(일반 메소드도 가능)
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void disp() {
		String s = userService.message();
		
		System.out.println("--- 애노테이션을 이용한 의존성 주입 : setter를 이용한 의존성 주입 ---");
		System.out.println(s);
	}
	
}
