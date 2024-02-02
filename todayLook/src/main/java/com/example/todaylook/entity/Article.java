package com.example.todaylook.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Entity
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String title;
    @Setter
    private String content;
    @Setter
    private Integer like;
    @Setter
    private String image;
    //작성일자
    @Setter
    private String created_at;

    //관계성
    //태그
    @Setter
    private Long tagId;
    //게시판
    @Setter
    private Long boardId;
    //작성자
    @Setter
    private Long userId;

}
