package com.koreait.springweb.user;

import com.koreait.springweb.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String loginProc(UserEntity entity, RedirectAttributes reAttr) {
        System.out.println(entity);
        int result = service.login(entity);
        System.out.println("login-state: " + result);

        if(result != 1) {
            reAttr.addFlashAttribute("loginInfo", entity);
            switch (result) {
                case 0: reAttr.addFlashAttribute("msg", "에러 발생"); break;
                case 2: reAttr.addFlashAttribute("msg", "아이디를 확인해 주세요."); break;
                case 3: reAttr.addFlashAttribute("msg", "비밀번호를 확인해 주세요."); break;
            }
            return "redirect:/user/login";
        }
        return "redirect:/board/list";
    }

}
