package com.sp.app.ex23;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/*
 - RedirectAttributes
   : RedirectAttributes를 사용하여 데이터를 저장하면 Redirect 된 후 즉시 사라지고 
     사용자가 F5를 눌러 리로드해도 서버로 다시 submit 되지 않게 할 수 있다. 
   : RedirectAttributes를 이용하면 리다이렉트된 페이지에 쿼리스트링을 이용하여 파라미터를 
     전달하지 않고 임시 플래시 메모리를 이용하여 리다이렉트된 페이지에 값을 전달할 수 있다.
     또한 사용 후 바로 삭제된다.  
 */

@Controller("ex23.userController")
@RequestMapping("/ex23/*")
public class UserController {
	
	@GetMapping("write")
	public String form() {
		
		return "ex23/write";
	}

	@PostMapping("write")
	public String submit(User dto, final RedirectAttributes rAttr) {
		// DB 작업
		
		
		// 리다이렉트한 페이지에 값 넘기기
		rAttr.addFlashAttribute("dto", dto);
		rAttr.addFlashAttribute("msg", dto.getName() + "님 회원 가입 환영..");
		
		return "redirect:/ex23/complete";
	}
	
	@GetMapping("complete")
	public String complete(@ModelAttribute("dto") User dto) {
		// @ModelAttribute("dto") User dto 는 RedirectAttributes 에서
		// 설정한 속성을 받을 수 있다. 
		// F5를 눌러 새로고침하면 dto는 초기화 되어 dto.getName()은 null이 된다. 
		
		if(dto.getId() == null) {
			// 메인화면으로 리다이렉트 
			
		}
		
		System.out.println(dto.getName() + ":" +dto.getAge());
		
		return "ex23/result";
	}
	

}
