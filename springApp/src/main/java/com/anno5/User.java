package com.anno5;

import org.springframework.beans.factory.annotation.Autowired;


public class User {
	@Autowired
	private UserService userService;
	
	public void disp() {
		String s = userService.message();
		
		System.out.println("--- @Value : 생성자의 파라미터, 필드에 문자열, 기본자료형의 값 설정 ---");
		System.out.println(s);
	}
	
}
