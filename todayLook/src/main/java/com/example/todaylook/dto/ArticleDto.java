package com.example.todaylook.dto;

import com.example.todaylook.entity.Article;
import lombok.*;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto {
    private Long id;
    @Setter
    private String title;
    @Setter
    private String comment;
    @Setter
    private Integer like;
    @Setter
    private String image;
    @Setter
    private String create_at;
    @Setter
    private String tag;

    public static ArticleDto fromEntity(Article entity){
        return ArticleDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .comment(entity.getComment())
                .like(entity.getLike())
                .image(entity.getImage())
                .create_at(entity.getCreated_at())
                .tag(entity.getTag())
                .build();
    }

}
