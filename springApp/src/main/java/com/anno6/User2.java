package com.anno6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("anno6.user2")
public class User2 {
	@Autowired
	@Qualifier("anno6.userServiceImpl2")
	private UserService userService;
	
	public void disp() {
		String s = userService.message();
		
		System.out.println("--- @Service : 이름 지정 ---");
		System.out.println(s);
	}
	
}
