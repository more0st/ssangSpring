package com.anno4;

public class UserServiceImpl2 implements UserService {
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl2() {
		this.name = "다자바";
		this.tel = "010-1111-2222";
		this.age = 20;
	}

	@Override
	public String message() {
		String a = age >= 19 ? "성인" : "미성년자";
		String s = name + " : " + tel + " : " + age + " : " + a;
		return s;
	}
}
