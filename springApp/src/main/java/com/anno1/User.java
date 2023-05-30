package com.anno1;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	// 필드를 이용하여 의존관계 설정. setter를 작성하지 않아도 된다.
	@Autowired	// 타입을 이용한 의존성 주입
	private UserService userService;
	
	public void disp() {
		String s = userService.message();
		
		System.out.println("--- 애노테이션을 이용한 의존성 주입 : 필드 ---");
		System.out.println(s);
	}
	
}
