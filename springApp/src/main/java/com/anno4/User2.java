package com.anno4;

import javax.inject.Inject;
import javax.inject.Named;

public class User2 {
	@Inject
	@Named("userService2") // @Inject와 함께 사용. 이름으로 빈 설정
	private UserService userService;
	
	public void disp() {
		String s = userService.message();
		
		System.out.println("--- @Inject, @Named ---");
		System.out.println(s);
	}
	
}
