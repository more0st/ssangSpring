package com.scope2;

public class Movie implements Player {

	@Override
	public void play() {
		System.out.println("영화 : " + toString());
	}
}
