package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.emp.mapper.BoardMapper;
import com.dw.emp.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	BoardMapper mapper;
	
	public int insertBoard(BoardVO vo) {
		return mapper.insertBoard(vo);
	}
	
	public BoardVO selectBoardFindByBoardNo(int boardNo) {
		return mapper.selectBoardFindByBoardNo(boardNo);
	}
	
	public List<BoardVO> selectBoard(){
		return mapper.selectBoard();
	}
}
