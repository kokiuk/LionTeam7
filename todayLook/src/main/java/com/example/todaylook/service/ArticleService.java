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
import java.util.NoSuchElementException;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> readByBoardId(Long id){
        return articleRepository.findByBoardId(id);
    }
    public ArticleDto readArticle(Long articleId){
        return ArticleDto.fromEntity(articleRepository.findById(articleId)
                .orElseThrow(()-> new NoSuchElementException("게시글이 존재하지 않습니다 articleId =" + articleId)));
    }

}
