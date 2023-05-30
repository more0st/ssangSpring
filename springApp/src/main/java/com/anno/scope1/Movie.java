package com.anno.scope1;

import org.springframework.stereotype.Service;

@Service  // 기본 : singleton
public class Movie {
	public void play() {
		System.out.println("영화 : " + toString());
	}
}
