package kr.or.nextit.member.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.or.nextit.member.model.Member;

@Mapper
public interface MemberMapper {
	
	public int selectMemberCount(Map<String, Object> paramMap) throws Exception;

	public List<Member> selectMemberList(Map<String, Object> paramMap) throws Exception;

	public Member selectMember(String mem_id) throws Exception;

	public int insertMember(Member member) throws Exception;

	public int updateMember(Member member) throws Exception;

	public int deleteMember(Member member) throws Exception;

	public int updateLikeCount(int mem_seq_no) throws Exception;
	
}
