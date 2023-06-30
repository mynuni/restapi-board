package com.study.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;

@RestController
public class BoardController {

	private final BoardService boardService;
	
	@Autowired
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@GetMapping("/board")
	public List<Board> getBoardList(){
		return boardService.getBoardList();
	}
	
	@GetMapping("/board/{id}")
	public Board getBoardById(@PathVariable Long id) {
		return boardService.getBoardById(id);
	}
	
}
