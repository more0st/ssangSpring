package ex.aop.after;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링 컨테이너 
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("classpath:ex/aop/after/applicationContext.xml");
		
		System.out.println("AfterReturningAdvice...\n");
		
		try {
			TestService service = (TestService)context.getBean("testService");
			
			service.save("자바");
			System.out.println();
			
			service.write();
			System.out.println();
			
			
			
		} finally {
			context.close();
		}
		
	}
}
