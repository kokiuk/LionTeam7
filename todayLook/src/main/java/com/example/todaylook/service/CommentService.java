package com.example.todaylook.service;

import com.example.todaylook.dto.CommentDto;
import com.example.todaylook.entity.Comment;
import com.example.todaylook.repo.CommentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CommentService {
  private final CommentRepository commentRepository;

  public List<CommentDto> readComments(Long articleId){
    List<CommentDto> commentDtos = new ArrayList<>();
    for (Comment comments : commentRepository.findByArticleId(articleId)){
      commentDtos.add(CommentDto.fromEntity(comments));
    }
    return commentDtos;
  }

}
