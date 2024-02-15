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

    public List<CommentDto> read(Long id){
        List<CommentDto> commentDtos = new ArrayList<>();
        for (Comment comment : commentRepository.findByArticleId(id)){
            commentDtos.add(CommentDto.fromEntity(comment));
        }
        return commentDtos;
    }
}
