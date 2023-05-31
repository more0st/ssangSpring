package com.sp.app.ex11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 - 요청 파라미터를 메소드의 매개변수로 받기
   : 요청 파라미터와 메소드의 매개변수가 동일한 경우 요청 파라미터를 받을 수 있다.  
 - @RequestParam
   : 요청 파라미터와 메소드의 매개변수를 매핑 
   : 기본이 필수이므로 매개변수에 해당하는 요청 파라미터가 없으면 400 에러 발생 
 */

@Controller("ex11.testController")
@RequestMapping("/ex11/*")
public class TestController {
	@GetMapping("main")
	public String main() {
		return "ex11/main";
	}
	/*
	@GetMapping("request")
	public String execute(
			String name,
			Integer age,	// int age 인 경우 age 이름으로 파라미터가 넘어오지 않으면 null이므로 500 에러가 발생 
			Model model) throws Exception {
		
		String s = name + ", " + age;
		model.addAttribute("msg", s); 
		
		return "ex11/result";
	}
	*/
	
	/*
	@GetMapping("request")
	public String execute(
			@RequestParam(required = false) String name,	// 필수가 아님.
			@RequestParam int age,
			Model model) throws Exception {
		
		String s = name + ", " + age;
		model.addAttribute("msg", s); 
		
		return "ex11/result";
	}
	*/
	
	// 요청 파라미터의 이름과 메소드의 매개변수의 명이 다른 경우 name 속성을 이용
	// defaultValue : 넘어온 파라미터가 없는 경우 기본값 지정 
	@GetMapping("request")
	public String execute(
			@RequestParam(defaultValue = "기본") String name,	
			@RequestParam(name="age", defaultValue="0") int a,
			Model model) throws Exception {
		
		String s = name + ", " + a;
		model.addAttribute("msg", s); 
		
		return "ex11/result";
	}
	
	
}
