package com.koreait.springweb.board;

import com.koreait.springweb.model.BoardEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int insBoard(BoardEntity entity);
}
