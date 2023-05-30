package com.anno6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 객체 생성 => 빈이름 : 클래스이름중 첫글자를 소문자로하는 클래스명, user
public class User {
	@Autowired
	private UserService userService;
	// @Autowired : 타입으로 의존성 주입, 동일한 타입이 2개이상인 경우
	//  빈아이디와 필드명이 동일한 객체로 의존성을 주입하며, 
	//  빈아이디와 필드명이 동일한 객체가 없는 경우 예외가 발생 
	
	public void disp() {
		String s = userService.message();
		
		System.out.println("--- @Service : 빈 생성 ---");
		System.out.println(s);
	}
	
}
