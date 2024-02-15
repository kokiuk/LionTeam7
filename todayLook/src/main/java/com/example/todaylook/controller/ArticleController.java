package com.example.todaylook.controller;

import com.example.todaylook.dto.ArticleDto;
import com.example.todaylook.entity.Article;
import com.example.todaylook.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {
    private final ArticleService articleService;

    //Read
    @GetMapping("/{id}")
    public String readOne(
            @PathVariable
            Long id,
            Model model
    ){
        model.addAttribute("articles", articleService.readOne(id));
        return "article";
    }

    //Create

    //Update
    @GetMapping("{id}/update")
    public String update(
            @PathVariable
            Long id,
            Model model
    ){
//        System.out.println(id);
        model.addAttribute("article", articleService.readOne(id));
        return "update";
    }

    @PostMapping("{id}/update")
    public String updateDo(
            @PathVariable
            Long id,
            @RequestParam("title")
            String title,
            @RequestParam("content")
            String content
    ){
        articleService.update(id, new ArticleDto(title, content));
        return String.format("redirect:/article/%d", id);
    }

    //Delete
    @PostMapping("{id}/delete")
    public String delete(
            @PathVariable
            Long id
    ){
        Long boardId = articleService.readOne(id).getBoardId();
        articleService.delete(id);
        return String.format("redirect:/boards/%d", boardId);
    }

}
