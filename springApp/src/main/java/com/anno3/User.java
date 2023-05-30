package com.anno3;

import javax.annotation.Resource;

/*
 // JDK 9 이상
    <dependency>
        <groupId>javax.annotation</groupId>
        <artifactId>javax.annotation-api</artifactId>
        <version>1.3.2</version>
    </dependency> 
 */

public class User {
	// 자바가 제공하는 애노테이션. 이름으로 빈 의존성 주입. JDK 9부터는 지원안함
	// name 속성을 생략하면 필드와 동일한 이름을 갖는 빈을 주입
	@Resource
	private UserService userService;
	
	public void disp() {
		String s = userService.message();
		
		System.out.println("--- @Resource : name 속성을 사용하지 않은 경우 ---");
		System.out.println(s);
	}
	
}
