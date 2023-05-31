package com.sp.app.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 - @Controller 
	: 스테레오 타입 애노테이션 
	: Spring MVC에서 컨트롤러로 인식 - 클라이언트의 요청을 받는다. (요청을 받는것만 붙인다)
	: 빈의 이름은 첫글자를 소문자로하는 클래스 이름이다. 
	: 동일한 빈의 이름이 존재하면 오류가 발생함 
	
 - @RequestMapping
 	: 주소(url)을 클래스 또는 메소드와 매핑 
 	: value 속성으로 주소 설정. value 속성만 존재하는 경우 value는 생략가능
 
 - ModelAndView
 	: 컨트롤러의 처리 결과를 전달할 뷰의 이름과 전달할 모델을 가지고 있다.
 	모델 - 처리된 결과를 가지고 있는 놈 
 */

@Controller
public class UserController {
	@RequestMapping("/ex01/main")	// GET, POST, PUT 등을 모두 처리. 
									// method를 쓰지 않아서 'value' 생략가능
	public String main() {
		return "ex01/main";	// forward 할 뷰 이름  
	}
	
	// GET 만 처리 
	// @GetMapping("/ex01/request") 와 동일 (스프링 4.3 부터 가능) 
	@RequestMapping(value= "/ex01/request", method = RequestMethod.GET)
	public ModelAndView submit() {
		ModelAndView mav = new ModelAndView("ex01/main");
		mav.addObject("msg", "GET 방식으로 요청했습니다.");
		return mav;
	}
	
	// POST 만 처리
	// @POSTMapping("/ex01/request") 와 동일
	@RequestMapping(value = "/ex01/request", method = RequestMethod.POST)
	public ModelAndView submit2() {
		/*
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ex01/main");
		// 이렇게도 할 수 있음 
		 */
		ModelAndView mav = new ModelAndView("ex01/main");
		mav.addObject("msg", "POST 방식으로 요청했습니다.");
		return mav;
	}

}
