package com.sp.app.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 - ModelAndView
 	: 컨트롤러의 처리 결과를 전달할 뷰의 이름과 전달할 모델을 가지고 있다. 
 */

@Controller("ex02.UserController")
@RequestMapping("/ex02/*")
public class UserController {
	
	@GetMapping("request")
	public ModelAndView form() {
		return new ModelAndView("ex02/write");
	}

	@PostMapping("request")
	public ModelAndView submit(String num) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ex02/result");
		
		// Integer는 NULL을 가질 수 있음. int는 못 가짐
		try {
			int n = Integer.parseInt(num);
			int s = 0; 
			for(int i=1; i<=n; i++) {
				s += i;
			}
			
			mav.addObject("msg", "결과 : " + s); 
			
		} catch (NumberFormatException e) {
			return new ModelAndView("redirect:/ex02/error");	// 리다이렉트 
		}
		
		return mav;
	}
	
	
	@GetMapping("error")
	public String error() {
		return "ex02/error";	// 뷰로 포워딩 
	}
	
	
}
