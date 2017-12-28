package kr.or.nextit.member.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.nextit.member.model.Member;
import kr.or.nextit.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/memberList")
	public String memberList(
			@RequestParam(value="searchWord", required=false, defaultValue="") String searchWord,
			@RequestParam(value="searchType", required=false, defaultValue="") String searchType,
			Model model
			) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
    	paramMap.put("searchWord", searchWord);
    	paramMap.put("searchType", searchType);
		
		List<Member> memberList = memberService.getMemberList(paramMap);
		
		model.addAttribute("memberList", memberList);
		
		return "member/memberList";
		
	}
	
	@RequestMapping("/memberForm")
	public String memberForm() {
		
		return "member/memberForm";
	}
			

	
	
}
