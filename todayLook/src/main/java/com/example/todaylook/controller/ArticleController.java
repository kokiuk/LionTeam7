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
    @GetMapping("/update")
    public String update(
            @RequestParam("articleId")
            Long id
    ){
        System.out.println(id);
        return "";
    }

    //Delete
}
