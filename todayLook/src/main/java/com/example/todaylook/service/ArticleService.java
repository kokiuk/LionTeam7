package com.example.todaylook.service;

import com.example.todaylook.dto.ArticleDto;
import com.example.todaylook.entity.Article;
import com.example.todaylook.repo.ArticleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    // C
    public ArticleDto create(ArticleDto dto){
        Article article = Article.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .like(0)
                .boardId(dto.getBoardId())
                .userId(dto.getUserId())
                .build();

        article = articleRepository.save(article);
        return ArticleDto.fromEntity(article);
    }

    // R
    public List<ArticleDto> readByBoardId(Long boardId){
        List<ArticleDto> articleList = new ArrayList<>();
        List<Article> articles = articleRepository.findByBoardId(boardId);
        for (Article entity : articles){
            articleList.add(ArticleDto.fromEntity(entity));
        }
        return articleList;
    }

    public List<ArticleDto> readAllArticle(){
        List<ArticleDto> articleList = new ArrayList<>();
        List<Article> articles = articleRepository.findAll();
        for (Article entity : articles){
            articleList.add(ArticleDto.fromEntity(entity));
        }
        return articleList;
    }

    public ArticleDto readOne(Long id){
        Optional<Article> optionalArticle = articleRepository.findById(id);
        if (optionalArticle.isPresent()){
            Article article = optionalArticle.get();
            return ArticleDto.fromEntity(article);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public ArticleDto update(Long id, ArticleDto dto){
        Optional<Article> optionalArticle = articleRepository.findById(id);
        if (optionalArticle.isPresent()){
            Article article = Article.builder()
                    .title(dto.getTitle())
                    .content(dto.getContent())
                    .like(dto.getLike())
                    .boardId(dto.getBoardId())
                    .userId(dto.getUserId())
                    .build();
            return ArticleDto.fromEntity(articleRepository.save(article));
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public void delete(Long id){
        if (articleRepository.existsById(id)){
            articleRepository.deleteById(id);
        }
        else throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }


}
