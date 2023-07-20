package kr.co.mlec.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class MemberController {

	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "form/joinForm";
	}
	
	/*
	@RequestMapping("/join.do")
	public String join(HttpServletRequest request) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		request.setAttribute("member", member);
		return "form/memberInfo";
	}
	*/
	
	/*
	@RequestMapping("/join.do")
	public String join(HttpServletRequest request, 
					   @RequestParam("id") String id, 
					   @RequestParam("password") String pass, 
					   @RequestParam("name") String name) {
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(pass);
		member.setName(name);
		request.setAttribute("member", member);
		return "form/memberInfo";
	}
	*/
	
	/*
	@RequestMapping("/join.do")
	public String join(MemberVO member) {
		
		return "form/memberInfo";
	}
	*/
	
	@RequestMapping("/join.do")
	public String join(@ModelAttribute("member") MemberVO member) {
		
		return "form/memberInfo";
	}
}
