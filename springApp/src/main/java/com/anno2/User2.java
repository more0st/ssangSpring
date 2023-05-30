package com.anno2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User2 {
	@Autowired
	@Qualifier("userService2") // @Autowired와 함께 사용하며, 이름을 설정하여 의존성 주입
	private UserService userService;
	
	public void disp() {
		String s = userService.message();
		
		System.out.println("--- @Autowired, @Qualifier : 동일한 타입이 둘 이상인 경우 ---");
		System.out.println(s);
	}
	
}
