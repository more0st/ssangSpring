package com.sp.app.ex21;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 
 - @ModelAttribute
  1) 개요 
    : Controller 메소드의 파라미터나 리턴 값을 Model 객체와 바인딩하기 위한 애노테이션
    : @ModelAttribute는 실제적으로 ModelMap.addAttribute(이름, 값)과
      같은 기능을 한다. 
  2) 요청 메소드의 매개변수에 사용
    : 요청 파라미터는 @ModelAttribute가 적용된 메소드의 파라미터(모델 객체)에 매핑되어 넘어온다. 
    : @ModelAttribute가 적용된 메소드의 매개변수는 포워딩되는 View 페이지에서 사용가능하다. 
  3) 메소드 레벨(method level)로 사용
    : View에서 사용할 데이터를 설정하는 용도로 사용
    : @ModelAttribute가 설정된 메소드는 @RequestMapping이 적용된 메소드보다 먼저 호출 
    : @ModelAttribute 메소드 실행 결과로 리턴되는 객체는 자동으로 Model에 저장
    : @ModelAttribute 메소드 실행 결과로 리턴된 객체는 View 페이지에서 사용 가능
    
 */

@Controller("ex21.userController")
@RequestMapping("/ex21/*")
public class UserController {
	
	@GetMapping("write")
	public String form() {
		
		return "ex21/write";
	}
	
	/*
	@PostMapping("write")
	public String submit(User dto, Model model) {
		model.addAttribute("vo", dto);
		return "ex21/result";
	}
	*/

	@PostMapping("write")
	public String submit(@ModelAttribute("vo") User dto) {
		
		return "ex21/result";
	}
	
}
