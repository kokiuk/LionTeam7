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

    public ArticleDto readOne(Long id){
        Optional<Article> articleOptional
                = articleRepository.findById(id);
        if (articleOptional.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return ArticleDto.fromEntity(articleOptional.get());
    }

    public ArticleDto create(Long id, ArticleDto dto){
        Article article = new Article();
        article.setBoardId(id);
        article.setTitle(dto.getTitle());
        article.setContent(dto.getContent());
        return ArticleDto.fromEntity(articleRepository.save(article));
    }

    public void update(Long id, ArticleDto dto) {
        Article article = articleRepository.findById(id)
                .orElseThrow();
        article.setTitle(dto.getTitle());
        article.setContent(dto.getContent());

        ArticleDto.fromEntity(articleRepository.save(article));
    }

    public void delete(Long id){
        Article article = articleRepository.findById(id)
                .orElseThrow();
        articleRepository.delete(article);
    }
}
