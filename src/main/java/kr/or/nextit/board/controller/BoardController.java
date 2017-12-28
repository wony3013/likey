package kr.or.nextit.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.nextit.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/boardList")
	public String boardList(
			Model model
			) throws Exception {
		
		/*Map<String, Object> paramMap = new HashMap<>();
		
		List<Board> boardList = boardService.getBoardList(paramMap);*/
		
		return "board/boardList";
	}
	
}
