package ex.aop.after;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/*
 - AfterReturningAdvice
 	: 대상 객체의 메소드 실행 이후에 공통 기능을 실행할때 사용되는 Advice
 	: 예외 없이 실행된 경우에만 실행 
 */

public class AfterLogAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println(target +  " 클래스의 " + method.getName() + " 메소드 호출 후 ...");
		System.out.println("리턴 값 : " + returnValue);
	}

}
