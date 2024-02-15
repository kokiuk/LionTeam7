package com.example.todaylook.controller;

import com.example.todaylook.dto.ArticleDto;
import com.example.todaylook.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
            Module module
    ){

        return "";
    }

    //Create
    @PostMapping("/create")
    public ArticleDto create(
            @RequestBody
            ArticleDto dto
    ){
       return articleService.create(dto);
    }

    //Update

    //Delete
}
