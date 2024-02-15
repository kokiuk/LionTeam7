package com.example.todaylook.dto;

import com.example.todaylook.entity.ArticleLike;
import lombok.*;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ArticleLikeDto {
    private Long id;
    @Setter
    private Long like_user;
    @Setter
    private Long like_article;
    @Setter
    private String create_at;

    public static ArticleLikeDto fromEntity (ArticleLike entity){
        return ArticleLikeDto.builder()
                .id(entity.getId())
                .like_user(entity.getLike_user())
                .like_article(entity.getLike_article())
                .create_at(entity.getCreate_at())
                .build();
    }
}
