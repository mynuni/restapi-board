package com.study.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.study.board.entity.Board;
import com.study.board.mapper.BoardMapper;

@Service
public class BoardService {
	private final BoardMapper boardMapper;
	
	public BoardService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}
	
	public List<Board> getBoardList(){
		return boardMapper.getBoardList();
	}
	
}
