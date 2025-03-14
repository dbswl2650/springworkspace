package com.yedam.app.board.service;

import java.util.List;

public interface BoardService {
	// 현재 게시판의 전체 글 조회
	public List<BoardVO> findBoardList();
	// 글 단건 조회
	public BoardVO findBoardByBno(BoardVO boarVO);
}
