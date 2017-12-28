package kr.or.nextit.board.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.or.nextit.board.model.Board;

@Mapper
public interface BoardMapper {
	
	public int selectBoardCount(Map<String,Object> paramMap) throws Exception;
	
	public List<Board> selectBoardList(Map<String, Object> paramMap) throws Exception;
	
	public Board selectBoard(int bo_seq_no) throws Exception;
	
	public int insertBoard(Board board) throws Exception;
	
	public int updateBoard(Board board) throws Exception;
	
	public int deleteBoard(Map<String, Object> paramMap) throws Exception;
	
	public int updateHitCnt(int bo_seq_no) throws Exception;
	
	public int updateLikeCount(int bo_seq_no) throws Exception;

}
