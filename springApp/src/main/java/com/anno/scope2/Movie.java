package com.anno.scope2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype")
public class Movie {
	public void play() {
		System.out.println("영화 : " + toString());
	}
}
