package com.study.board.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.study.board.entity.Board;

@Repository
public class MemoryBoardRepository {

	private static List<Board> boardList = new ArrayList<>();

	public List<Board> getBoardList() {
		return boardList;
	}

	public Board getBoardById(Long id) {
		for (Board board : boardList) {
			if (board.getId() == id) {
				return board;
			}
		}
		
		return null;
	}

}
