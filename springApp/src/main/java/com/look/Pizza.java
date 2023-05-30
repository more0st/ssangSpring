package com.look;

import java.util.concurrent.atomic.AtomicLong;

public class Pizza {
	// AtomicLong : 스레드 환경에서 안전하게 자동으로 숫자를 증가 시킬 수 인는 클래스
	private static AtomicLong count = new AtomicLong(0);
	
	private boolean isVeg;
	
	public Pizza() {
		count.incrementAndGet();
	}
	
	@Override
	public String toString() {
		return "A new " + (isVeg ? "veggie" : "") + " Pizza, "
				+ "count(" + count.get() + ")";
	}
	
	public void setIsVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

}
