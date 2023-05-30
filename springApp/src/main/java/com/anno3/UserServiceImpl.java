package com.anno3;

public class UserServiceImpl implements UserService {
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl() {
		this.name = "이자바";
		this.tel = "010-1111-2222";
		this.age = 20;
	}

	@Override
	public String message() {
		String a = age >= 19 ? "성인" : "미성년자";
		String s = name + ", " + tel + ", " + age + ", " + a;
		return s;
	}
}
