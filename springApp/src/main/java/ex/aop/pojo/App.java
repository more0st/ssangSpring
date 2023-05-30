package ex.aop.pojo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex.aop.pojo.core.TestService;

public class App {
	public static void main(String[] args) {
		// 스프링 컨테이너 
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("classpath:ex/aop/pojo/applicationContext.xml");
		
		System.out.println(">>AOP 예제 <<\n");
		
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
