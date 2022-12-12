package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.BoardVO;

@Mapper
public interface BoardMapper {
	
	//작성한 쿼리 ID와 메소드이름이 동일해야 매핑(연결)이 된다.
	//insert, delete, update는 int로 리턴함
	public int insertBoard(BoardVO vo);
	
	public BoardVO selectBoardFindByBoardNo(int boardNo);
	
	public List<BoardVO> selectBoard();
}
