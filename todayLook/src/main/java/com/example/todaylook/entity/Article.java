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
    private String writer;
    @Setter
    private String title;
    @Setter
    private String comment;
    @Setter
    private Integer like;
    @Setter
    private String image;
    @Setter
    private String created_at;
    @Setter
    private String tag;
    @Setter
    private String content;

    public Article(
            String writer,
            String title,
            String comment,
            Integer like,
            String image,
            String created_at,
            String tag,
            String content) {
        this.writer = writer;
        this.title = title;
        this.comment = comment;
        this.like = like;
        this.image = image;
        this.created_at = created_at;
        this.tag = tag;
        this.content = content;
    }
}
