package com.example.todaylook.controller;

import com.example.todaylook.dto.ArticleDto;
import com.example.todaylook.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {
    private final ArticleService articleService;

    //Read
    @GetMapping("/{id}}")
    public String readOne(
            @PathVariable
            Long id,
            Module module
    ){

        return "";
    }

    //Create

    //Update

    //Delete
}
