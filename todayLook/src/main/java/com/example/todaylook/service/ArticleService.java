package com.example.todaylook.service;

import com.example.todaylook.dto.ArticleDto;
import com.example.todaylook.entity.Article;
import com.example.todaylook.entity.Board;
import com.example.todaylook.repo.ArticleRepository;
import com.example.todaylook.repo.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;
    private final BoardRepository boardRepository;

    public List<ArticleDto> readByBoardId(Long id) {
        List<Article> articles = articleRepository.findByBoardId(id);
        return articles.stream()
                .map(ArticleDto::fromEntity)
                .collect(Collectors.toList());
    }

    public ArticleDto create(Long boardId, ArticleDto dto) {
        Board board = boardRepository.findById(boardId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Board not found"));

        Article article = new Article();
        article.setBoardId(boardId);
        article.setTitle(dto.getTitle());
        article.setContent(dto.getContent());
        article.setCreated_at(dto.getCreated_at());

        Article savedArticle = articleRepository.save(article);
        return ArticleDto.fromEntity(savedArticle);
    }

    public List<ArticleDto> readAll() {
        List<ArticleDto> articleDtos = new ArrayList<>();
        for (Article article: articleRepository.findAll()) {
            articleDtos.add(ArticleDto.fromEntity(article));
        }
        return articleDtos;
    }

    public ArticleDto readOne(Long id){
        Optional<Article> articleOptional
                = articleRepository.findById(id);
        if (articleOptional.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return ArticleDto.fromEntity(articleOptional.get());
    }

    public ArticleDto updateArticle(Long id, ArticleDto dto) {
        Article article = articleRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Article not found"));

        article.setTitle(dto.getTitle());
        article.setContent(dto.getContent());
        article.setImage(dto.getImage());
        article.setTagId(dto.getTagId());
        article.setUserId(dto.getUserId());

        Article updatedArticle = articleRepository.save(article);

        return ArticleDto.fromEntity(updatedArticle);
    }

    public void delete(Long id) {
        articleRepository.deleteById(id);
    }
}
