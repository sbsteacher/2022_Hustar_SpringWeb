package com.koreait.springweb.board;

import com.koreait.springweb.model.BoardEntity;
import com.koreait.springweb.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardEntity entity);
    List<BoardVo> selBoardList();
    BoardVo selBoard(BoardEntity entity);
    int addHits(BoardEntity entity);
}
