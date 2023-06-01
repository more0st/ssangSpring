package com.sp.app.insa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/insa/*")
public class InsaController {
	
	@Autowired
	private InsaService service;
	
	@GetMapping("write")
	public String form() {
		return "insa/write";
	}
	
	@PostMapping("write")
	public String submit(
			Insa dto,
			Model model
			) {
		
		/*
		String belt = service.belt(dto);
		int age = service.age(dto);
		int tax = service.tax(dto);
		int rSal = service.realSalary(dto);
		*/
		
		dto.setBelt(service.belt(dto));
		dto.setAge(service.age(dto));
		dto.setTax(service.tax(dto));
		dto.setrSal(service.realSalary(dto));
		
		model.addAttribute("dto", dto);

		/*
		model.addAttribute("name", dto.getName());
		model.addAttribute("birth", dto.getBirth());
		model.addAttribute("belt", belt);
		model.addAttribute("age", age);
		model.addAttribute("tel", dto.getTel());
		model.addAttribute("salary", dto.getSalary());
		model.addAttribute("bonus", dto.getBonus());
		model.addAttribute("tax", tax);
		model.addAttribute("realSalary", rSal);
		*/
		
		return "insa/result";
	}
	
}
