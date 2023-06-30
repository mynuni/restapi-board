package com.study.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.board.entity.Board;

//@Mapper
public interface BoardMapper {
	
	List<Board> getBoardList();
}
