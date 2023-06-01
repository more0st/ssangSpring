package com.sp.app.ex12;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	/*
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
	*/
	
	/*
	// 동일한 이름의 요청 파라미터를 List로 받기 
	// : 요청 파라미터를 List로 받기 위해서는 @RequestParam 이 필요
	// : List 매개변수는 @RequestParam 애노테이션을 붙이지 않으면 500 에러 
	@PostMapping("write")
	public String submit(
			@RequestParam String name,
			@RequestParam int age,
			@RequestParam(required=false) List<String> subject,	
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
	*/
	
	/*
	// 요청 파라미터를 Map으로 받기 
	//  : 요청 파라미터를 Map으로 받기 위해서는 @RequestParam 이 필요 
	//  : 요청 파라미터를 Map으로 받는 경우 동일한 이름의 파라미터는 하나만 받는다!! 
	@PostMapping("write")
	public String submit(
			@RequestParam Map<String, String> paramMap,	
			Model model) {
		
		String s = "";
		
		Iterator<String> it = paramMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = paramMap.get(key);
			s += key + ":" + value + "<br>";
			
		}
		
		model.addAttribute("msg", s);
		
		return "ex12/result";
	}
	*/
	
	@PostMapping("write")
	public String submit(
			Test dto,
			Model model
			) {
		
		String s = dto.getName() + " : " + dto.getAge() + " : ";
		
		if(dto.getSubject() != null) {
			for(String a : dto.getSubject()) {
				s += a;
			}
		}
		
		model.addAttribute("msg", s);
		
		return "ex12/result";
	}
	
	
	
}
