package com.scope2;

public class Music implements Player{
	@Override
	public void play() {
		System.out.println("음악 : " + toString());
	}

}
