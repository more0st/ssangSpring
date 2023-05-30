package com.anno2;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	// 동일한 타입이 둘 이상이면 필드명과 동일한 이름을 갖는 빈을 주입
	// 동일한 타입이 둘 이상이고, 동일한 이름의 빈이 없으면 예외 발생
	@Autowired
	private UserService userService;
	
	public void disp() {
		String s = userService.message();
		
		System.out.println("--- @Autowired : 동일한 타입이 둘 이상인 경우 ---");
		System.out.println(s);
	}
	
}
