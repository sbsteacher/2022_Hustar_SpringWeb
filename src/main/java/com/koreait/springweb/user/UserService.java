package com.koreait.springweb.user;

import com.koreait.springweb.model.UserEntity;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserService {

    @Autowired private UserMapper mapper;
    @Autowired private HttpSession hs;

    public int join(UserEntity entity) {
        //비밀번호 암호화
        String hashedPw = BCrypt.hashpw(entity.getUserpw(), BCrypt.gensalt());
        entity.setUserpw(hashedPw);

        return mapper.insUser(entity);
    }
    //0: 에러발생, 1: 로그인 성공, 2: 아이디 없음, 3:비밀번호 다름
    public int login(UserEntity entity) { //userid, userpw값이 있음
        UserEntity dbUser = null;
        try {
            dbUser = mapper.selUser(entity);
        } catch (Exception e) {
            e.printStackTrace();
            return 0; //에러 발생
        }
        if(dbUser == null) {
            return 2; //아이디 없음
        } else if(!BCrypt.checkpw(entity.getUserpw(), dbUser.getUserpw())) {
            return 3; //비밀번호 다름
        }

        hs.setAttribute("loginUser", dbUser);
        return 1; //로그인 성공!!
    }
}
