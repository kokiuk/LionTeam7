package com.example.todaylook.controller;

import com.example.todaylook.service.ArticleService;
import com.example.todaylook.service.BoardService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardController {
    private final BoardService boardService;
    private final ArticleService articleService;

    @GetMapping()
    public String readAll(Model model){
        model.addAttribute("boards", boardService.readAll());
        return "index";
    }

    @GetMapping("/{id}")
    public String readOne(
            @PathVariable
            Long id,
            Model model){
        model.addAttribute("board", boardService.readOne(id));
        model.addAttribute("articles", articleService.readByBoardId(id));
        System.out.println(model);

        return "test";
    }
}
