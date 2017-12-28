package kr.or.nextit.member.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.nextit.member.mapper.MemberMapper;
import kr.or.nextit.member.model.Member;
import kr.or.nextit.member.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberMapper memberMapper;
		
	@Override
	public int getMemberCount(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return memberMapper.selectMemberCount(paramMap);
	}

	@Override
	public List<Member> getMemberList(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return memberMapper.selectMemberList(paramMap);
	}

	@Override
	public Member getMember(String mem_id) throws Exception {
		// TODO Auto-generated method stub
		return memberMapper.selectMember(mem_id);
	}

	@Override
	public int insertMember(Member member) throws Exception {
		// TODO Auto-generated method stub
		return memberMapper.insertMember(member);
	}

	@Override
	public int updateMember(Member member) throws Exception {
		// TODO Auto-generated method stub
		return memberMapper.updateMember(member);
	}

	@Override
	public int deleteMember(Member member) throws Exception {
		// TODO Auto-generated method stub
		return memberMapper.deleteMember(member);
	}

	@Override
	public int updateLikeCount(int mem_seq_no) throws Exception {
		// TODO Auto-generated method stub
		return memberMapper.updateLikeCount(mem_seq_no);
	}

}
