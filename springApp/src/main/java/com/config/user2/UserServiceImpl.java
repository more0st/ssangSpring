package com.config.user2;

import org.springframework.beans.factory.annotation.Value;

public class UserServiceImpl implements UserService {
	private @Value("이자바") String name;
	private @Value("20") int age;
	
	@Override
	public String message() {
		String s = age >= 19 ? "성인" : "미성년자";
		return name + ", " + age + ", " + s;
	}
}
