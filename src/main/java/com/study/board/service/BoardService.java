package com.study.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.study.board.entity.Board;
import com.study.board.mapper.MemoryBoardRepository;

@Service
public class BoardService {
//	private final BoardMapper boardMapper;
	
	private final MemoryBoardRepository memoryBoardRepository;
	
	public BoardService(MemoryBoardRepository memoryBoardRepository) {
		this.memoryBoardRepository = memoryBoardRepository;
	}
	
	public List<Board> getBoardList(){
//		return boardMapper.getBoardList();
		return memoryBoardRepository.getBoardList();
	}
	
	public Board getBoardById(Long id) {
		return memoryBoardRepository.getBoardById(id);
	}
	
}
