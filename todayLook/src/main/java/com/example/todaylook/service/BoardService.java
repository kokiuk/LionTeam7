package com.example.todaylook.service;

import com.example.todaylook.dto.BoardDto;
import com.example.todaylook.entity.Board;
import com.example.todaylook.repo.BoardRepository;
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

    public BoardDto readOne(Long id){
        Optional<Board> optionalBoardDto =
                boardRepository.findById(id);
        if (optionalBoardDto.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return BoardDto.fromEntity(optionalBoardDto.get());


    }





}
