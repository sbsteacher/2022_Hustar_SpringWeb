package com.koreait.springweb.user;

import com.koreait.springweb.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/join")
    public void join() {}

    @PostMapping("/join")
    public String joinProc(UserEntity entity) {
        System.out.println(entity);
        int result = service.join(entity);
        return "redirect:/user/login";
    }

    @GetMapping("/login")
    public void login() {}

    @PostMapping("/login")
    public String loginProc(UserEntity entity) {
        System.out.println(entity);
        int result = service.login(entity);
        System.out.println("login-state: " + result);
        return "redirect:/board/list";
    }

}
