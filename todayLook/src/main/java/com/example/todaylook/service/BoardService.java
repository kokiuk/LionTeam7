package com.example.todaylook.service;

import com.example.todaylook.dto.BoardDto;
import com.example.todaylook.entity.Board;
import com.example.todaylook.repo.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public List<BoardDto> readAll(){
        List<BoardDto> boardDtos = new ArrayList<>();
        for (Board board : boardRepository.findAll()){
            boardDtos.add(BoardDto.fromEntity(board));
        }
        System.out.println(boardDtos.size());
        return boardDtos;
    }
}
