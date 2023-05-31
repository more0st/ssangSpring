package com.sp.app.ex12;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ex12.testController")
@RequestMapping("/ex12/*")
public class TestController {
	
	@GetMapping("write")
	public String form() {
		return "ex12/write";
	}
	
	/*
	// 동일한 이름으로 넘어온 파라미터를 String subject로 받으면 
	// java, html 처럼 넘어온다. (콤마가 생김)
	@PostMapping("write")
	public String submit(
			String name,
			int age,
			String subject,	
			Model model) {
		
		String s = name + " : " + age + " : " + subject;
		
		model.addAttribute("msg", s);
		
		return "ex12/result";
	}
	*/
	
	// 동일한 이름으로 넘어오는 파라미터를 배열로 받기 
	@PostMapping("write")
	public String submit(
			String name,
			int age,
			String[] subject,	
			Model model) {
		
		String s = name + " : " + age + " : ";
		
		if(subject != null) {
			for(String a : subject) {
				s += a + " "; 
			}
		}
		
		model.addAttribute("msg", s);
		
		return "ex12/result";
	}
	
	
}
