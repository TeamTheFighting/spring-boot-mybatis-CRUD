package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.service.BoardService;
import com.dw.emp.vo.BoardVO;

@RestController
public class BoardApiController {

	@Autowired
	BoardService service;
	
	@GetMapping("/api/v1/board")
	public List<BoardVO> callBoardSave() {
		return service.selectBoard();
	}
	
	//게시물 생성
	@PostMapping("/api/v1/board")
	public int callBoardSave(@RequestBody BoardVO vo) {
		return service.insertBoard(vo);
	}
	
	//게시물 상세조회
	@GetMapping("/api/v1/board/{boardNo}")
	public BoardVO callBoard(@PathVariable  int boardNo) {
		return service.selectBoardFindByBoardNo(boardNo);
	}
	
	
	
}
