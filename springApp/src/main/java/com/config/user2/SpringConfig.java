package com.config.user2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 환경 설정 파일
@ComponentScan(basePackages = {"com.config.user2"})
public class SpringConfig {
	
	/*
	 @Bean
	    : 외부 라이브러리의 객체를 생성할 때 사용
	    : 하나 이상의 @Bean 를 사용하는 클래스는 @Configuration 이 필요
	 */
	
	@Bean // 빈의 이름은 기본적으로 메소드명
	public UserService userServiceDevice() {
		return new UserServiceImpl();
	}
	
	@Bean(name = "user2.user", initMethod = "init", destroyMethod = "destroy")
	public User userDevice() {
		return new User();
	}

}
