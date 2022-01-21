package com.koreait.springweb.board;

import com.koreait.springweb.model.BoardEntity;
import com.koreait.springweb.model.BoardVo;
import com.koreait.springweb.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class BoardService {
    @Autowired private BoardMapper mapper;
    @Autowired private HttpSession hs;

    public int insBoard(BoardEntity entity) { //제목, 내용
        UserEntity loginUser = (UserEntity)hs.getAttribute("loginUser");
        int loginUserIuser = loginUser.getIuser();
        entity.setIuser(loginUserIuser);
        return mapper.insBoard(entity);
    }

    public List<BoardVo> selBoardList() {
        return mapper.selBoardList();
    }

    public BoardVo selBoard(BoardEntity entity) {
        return mapper.selBoard(entity);
    }
}
