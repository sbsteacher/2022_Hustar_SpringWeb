package com.koreait.springweb.user;

import com.koreait.springweb.model.UserEntity;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public int join(UserEntity entity) {
        //비밀번호 암호화
        String hashedPw = BCrypt.hashpw(entity.getUserpw(), BCrypt.gensalt());
        entity.setUserpw(hashedPw);

        return mapper.insUser(entity);
    }
}
