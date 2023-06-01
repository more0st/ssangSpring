package com.sp.app.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {
	
	@Autowired
	private CalculatorService service;
	
	@GetMapping("/calc/main")
	public String form() { 
		return "calc/write";	// "calc/write"로 포워딩해라. 포워딩해야하는 뷰의 이름  
	}
	
	@PostMapping("/calc/main")
	public String submit(Calculator dto, Model model) {
		String s = service.result(dto);
		
		model.addAttribute("calculator", s);
		
		return "calc/result";
	}
	
}
