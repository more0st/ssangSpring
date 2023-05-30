package com.anno.scope2;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
						// 해당 객체에 접근(메소드 호출)할 때마다 객체 생성
public class Music {
	public void play() {
		System.out.println("음악 : " + toString());
	}
}
