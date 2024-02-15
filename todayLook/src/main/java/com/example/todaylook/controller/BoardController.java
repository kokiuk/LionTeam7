package com.example.todaylook.controller;

import com.example.todaylook.dto.ArticleDto;
import com.example.todaylook.service.ArticleService;
import com.example.todaylook.service.BoardService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
//        System.out.println(model);

        return "test";
    }

    @GetMapping("/{id}/article")
    public String create(
            @PathVariable
            Long id,
            Model model
    ){
        model.addAttribute("board", boardService.readOne(id));
        return "create";
    }

    @PostMapping("/{id}/article")
    public String createDo(
            @PathVariable
            Long id,
            @RequestParam("title")
            String title,
            @RequestParam("content")
            String content
    ){

        Long newId = articleService.create(id, new ArticleDto(title, content)).getId();
        return String.format("redirect:/article/%d", newId);
    }


}
