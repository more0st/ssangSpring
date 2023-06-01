package com.sp.app.ex24;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/*
 - @SessionAttributes
   : Model 객체를 세션에 저장하기 위한 애노테이션 
   : 클래스 레벨에서 선언 가능
   : 지속적으로 사용자의 입력 값을 유지시키거나 여러 단계에서 submit 되면서 완성되는 폼을
     구성하는 경우 사용 
   : 용도 
     스프링 form 태그 라이브러리를 사용하는 경우 
     여러 단계에 걸쳐 완성되는 form 
     지속적으로 사용자의 입력 값을 유지할 경우 
     double submit 방지 - 브라우저 뒤로가기 안됨 
   
 */

@SessionAttributes("user")
@Controller("ex24.userController")
@RequestMapping("/ex24/*")
public class UserController {
	
	@ModelAttribute("user")
	public User command() {
		return new User();
	}
	
	@GetMapping("join")
	public String form() {
		return "ex24/step1";
	}
	
	@PostMapping("step1")
	public String step1(@ModelAttribute("user") User user) {
		return "ex24/step2";
	}
	
	@PostMapping("step2")
	public String step2(@ModelAttribute("user") User user, 
			SessionStatus sessionStatus,
			Model model) {
		
		String s = "이름 : " + user.getName() + "<br>" +
				"이메일 : " + user.getEmail() + "<br>" + 
				"아이디 : " + user.getId() + "<br>" + 
				"비밀번호 : " + user.getPwd() + "<br>" + 
				"전화 : " + user.getTel();
		
		sessionStatus.setComplete(); 	// 세션에 저장된 내용 지우기
		
		model.addAttribute("msg", s);
		
		return "ex24/complete";
	}
	
}
