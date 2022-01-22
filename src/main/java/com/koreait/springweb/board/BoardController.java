package com.koreait.springweb.board;

import com.koreait.springweb.model.BoardEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired BoardService service;

    @GetMapping("/list")
    public void list(Model model) {
        model.addAttribute("list", service.selBoardList());
    }

    @GetMapping("/write")
    public void write() {}

    @PostMapping("/write")
    public String writeProc(BoardEntity entity) {
        System.out.println(entity);
        int result = service.insBoard(entity);
        return "redirect:/board/list";
    }

    @GetMapping("/detail")
    public void detail(BoardEntity entity, Model model) {
        System.out.println(entity);
        service.addHits(entity);
        model.addAttribute("data", service.selBoard(entity));
        model.addAttribute("prevNext", service.selPrevNextInfo(entity));
    }

    @GetMapping("/del")
    public String del(BoardEntity entity) {
        int result = service.delBoard(entity);
        return "redirect:/board/list";
    }

    @GetMapping("/mod")
    public void mod(BoardEntity entity, Model model) {
        model.addAttribute("data", service.selBoard(entity));
    }

    @PostMapping("/mod")
    public String modProc(BoardEntity entity) {
        int result = service.updBoard(entity);
        return "redirect:/board/detail?iboard=" + entity.getIboard();
    }
}
