package com.sp.app.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("memberController")
@RequestMapping("/member/*")
public class MemberController {

	@GetMapping("signup")
	public String form() {
		return "member/signup";
	}
	
	@PostMapping("complete")
	public String submit(
			Member dto,
			Model model
			) {
		
		String[] school = new String[dto.getSchoolName().length];
		String s = "";
		for(int i=0; i<dto.getSchoolName().length; i++) {
			s = dto.getSchoolName()[i] + " : " + dto.getSchoolDate1()[i] + " ~ " + dto.getSchoolDate2()[i];
			school[i] = s;
		}
		
		String[] license = new String[dto.getLicenseName().length];
		String l = "";
		for(int i=0; i<dto.getLicenseName().length; i++) {
			l = dto.getLicenseName()[i] + " : " + dto.getLicenseDate()[i];
			license[i] = l;
		}
		
		model.addAttribute("school", school);
		model.addAttribute("license", license);
		
		/*
		String s = dto.getName() + " : " + dto.getAge() + " : ";
		
		if(dto.getSubject() != null) {
			for(String a : dto.getSubject()) {
				s += a;
			}
		}
		
		model.addAttribute("msg", s);
		*/
		
		
		return "member/complete";
	}
	
}
