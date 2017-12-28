package kr.or.nextit.board.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.nextit.board.mapper.BoardMapper;
import kr.or.nextit.board.model.Board;
import kr.or.nextit.board.service.BoardService;

@Service("BoardService")
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public int getBoardCount(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.selectBoardCount(paramMap);
	}

	@Override
	public List<Board> getBoardList(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.selectBoardList(paramMap);
	}

	@Override
	public Board getBoard(int bo_seq_no) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.selectBoard(bo_seq_no);
	}

	@Override
	public int insertBoard(Board board) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.insertBoard(board);
	}

	@Override
	public int updateBoard(Board board) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.updateBoard(board);
	}

	@Override
	public int deleteBoard(Map<String, Object> paramMap) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.deleteBoard(paramMap);
	}

	@Override
	public int updateHitCnt(int bo_seq_no) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.updateHitCnt(bo_seq_no);
	}

	@Override
	public int updateLikeCount(int bo_seq_no) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.updateLikeCount(bo_seq_no);
	}

}
