package com.example.todaylook.controller;

import com.example.todaylook.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class ArticleController {
    private final ArticleService articleService;
}
