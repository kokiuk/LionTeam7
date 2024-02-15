package com.example.todaylook.controller;

import com.example.todaylook.dto.ArticleDto;
import com.example.todaylook.service.ArticleService;
import com.example.todaylook.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {
    private final ArticleService articleService;
    private final CommentService commentService;

    //Read
    @GetMapping("/{id}")
    public String readOne(
            @PathVariable("id")
            Long articleId,
            Model model
    ){
        model.addAttribute("article", articleService.readArticle(articleId));
        model.addAttribute("comments", commentService.readComments(articleId));
        return "comment";
    }

    //Create

    //Update

    //Delete
}
