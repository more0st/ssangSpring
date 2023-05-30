package com.anno3;

import javax.annotation.Resource;

public class User2 {
	@Resource(name="userService2")
	private UserService userService;
	
	public void disp() {
		String s = userService.message();
		
		System.out.println("--- @Resource : name 속성 사용 ---");
		System.out.println(s);
	}
	
}
