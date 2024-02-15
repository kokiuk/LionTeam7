package com.example.todaylook.service;

import com.example.todaylook.dto.ArticleDto;
import com.example.todaylook.entity.Article;
import com.example.todaylook.repo.ArticleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> readByBoardId(Long id){
        return articleRepository.findByBoardId(id);
    }

    public ArticleDto create(ArticleDto dto){
        Article article = Article.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .like(0)
                .boardId(dto.getBoardId())
                .id(dto.getId())
                .build();

        article = articleRepository.save(article);
        return ArticleDto.fromEntity(article);
    }

    public ArticleDto update(ArticleDto dto){
        Article newArticle = Article.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .like(0)
                .boardId(dto.getBoardId())
                .id(dto.getId())
                .build();
    }
}
