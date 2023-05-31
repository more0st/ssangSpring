package com.sp.app.ex03;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 요청 메소드의 리턴 타입 
   - ModelAndView
    : ModelAndView 객체에 뷰의 이름을 설정 
    : 처리 결과를 담은 모델 객체와 정보를 담아 반환
   - String 
    : 리턴 값이 뷰의 이름이다. 
    : String을 반환하면 내부적으로 ModelAndView 객체를 생성하여 처리한다.  
   - void 
   	: 메소드 내부에서 HTTP Response를 직접 처리하는 경우 사용
   	: 메소드의 파라미터에 HttpServletResponse가 존재하지 않는 경우 
   	  주소가 "/ex03/hello" 이면 뷰의 이름은 "ex03/hello" 가 된다. 
   - Map, Model, ModelMap
    : 뷰의 이름이 주소를 이용하여 자동으로 지정된다.
      주소가 "/ex03/hello" 이면 뷰의 이름은 "ex03/hello" 가 된다. 
    : 반환 값은 모델이다. 
 */

@Controller("ex03.userController")
@RequestMapping("/ex03/*")
public class UserController {
	
	@GetMapping("hello")
	public void execute(HttpServletResponse resp) throws Exception {
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h3>환영합니다.</h3>");
		out.print("</body>");
		out.print("</html>");

	}
	
	@GetMapping("hello2")
	public Map<String, Object> process() throws Exception {
		// 이렇게 map을 던질 수 있음. 근데 쓸일은 없음. 
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "Map 인터페이스를 리턴 타입으로 반환");
		return map;
	}
	
	
	@GetMapping("hello3")
	public Model result() throws Exception {
		Model model = new ExtendedModelMap();
		model.addAttribute("msg", "Model 인터페이스를 리턴 타입으로 반환");
		return model;
	}
	
	
}
