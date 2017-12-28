package kr.or.nextit.common.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.nextit.member.model.Member;
import kr.or.nextit.member.service.MemberService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/login")
	public String login(
			@RequestParam(value="mem_id") String mem_id,
			@RequestParam(value="mem_pwd") String mem_pwd,
			Model model,
			HttpSession session,
			HttpServletRequest request
			) throws Exception {
		
		boolean isError = true;
		String message = "";
		
		
		Member member = memberService.getMember(mem_id);
		
		if(member != null) {
			
			if(member.getMem_pwd().equals(mem_pwd)) {
				session.setAttribute("LOGIN_USER", member);
				isError = false;
				message = member.getMem_nickname() + "님이 접속하셨습니다.";
			} else {
				message="아이디와 비밀번호가 일치하지 않습니다.";
			}
			
		} else {
			message = "등록되지 않은 아이디입니다.";	
		}
		
		model.addAttribute("isError", isError);
		model.addAttribute("message", message);
		model.addAttribute("locationURL", request.getHeader("referer"));
		
		
		return "common/message";
	}
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		
		return "/loginForm";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	

}
