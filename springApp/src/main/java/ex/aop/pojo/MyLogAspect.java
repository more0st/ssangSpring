package ex.aop.pojo;

import org.aspectj.lang.JoinPoint;

/*
 - JoinPoint
 	: 클라이언트가 호출한 비즈니스 메소드의 정보를 가지고 있는 인터페이스 
 	: getSignature() - 클라이언트가 호출한 메소드의 시그니처 정보가 저장된 객체 반환
 */

public class MyLogAspect {
	public String beforeLogging(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		
		System.out.println("before : " + methodName);
		
		return methodName;
	}
	
	public void returningLogging(JoinPoint joinPoint, Object ret) {
		String methodName = joinPoint.getSignature().getName();
		
		System.out.println("returning : " + methodName + ", 리턴값 : " + ret);
		
	}
	
	public void throwingLogging(JoinPoint joinPoint, Throwable ex) {
		String methodName = joinPoint.getSignature().getName();

		System.out.println("throwing : " + methodName + ", throws : " + 
					ex.getClass().getName());
	}
	
	public void afterLogging(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();

		System.out.println("after : " + methodName);
		
		
	}
	
}
