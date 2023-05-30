package ex.aop.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex.aop.anno.core.TestService;

public class App {
	public static void main(String[] args) {
		// 스프링 컨테이너 
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("classpath:ex/aop/anno/applicationContext.xml");
		
		System.out.println(">> @Aspect 애노테이션을 이용한 AOP <<\n");
		
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
