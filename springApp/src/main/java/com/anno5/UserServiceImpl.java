package com.anno5;

import org.springframework.beans.factory.annotation.Value;

public class UserServiceImpl implements UserService {
	private String name;
	private String tel;
	private int age;
	
	@Value("자바")
	private String subject;
	
	public UserServiceImpl(@Value("너자바") String name, @Value("010-7788-8899") String tel, @Value("17") int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}

	@Override
	public String message() {
		String a = age >= 19 ? "성인" : "미성년자";
		String s = name + ", " + tel + ", " + age + ", " + a + ", " + subject;
		return s;
	}
}
