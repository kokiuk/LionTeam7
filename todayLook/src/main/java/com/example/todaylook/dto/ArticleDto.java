package com.example.todaylook.dto;

import com.example.todaylook.entity.Article;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class ArticleDto {
    private Long id;
    @Setter
    private String title;
    @Setter
    private String content;
    @Setter
    private Integer like;
    @Setter
    private String image;
    @Setter
    private String created_at;
    @Setter
    private Long tagId;
    @Setter
    private Long boardId;
    @Setter
    private Long userId;

    public ArticleDto(Long id, String title, String content, Integer like, String image, String created_at, Long tagId, Long boardId, Long userId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.like = like;
        this.image = image;
        this.created_at = created_at;
        this.tagId = tagId;
        this.boardId = boardId;
        this.userId = userId;
    }

    public static ArticleDto fromEntity(Article entity) {
        ArticleDto dto = new ArticleDto();
        dto.setTitle(entity.getTitle());
        dto.setContent(entity.getContent().replace("\n", "<br>"));
        dto.setLike(entity.getLike());
        dto.setImage(entity.getImage());
        dto.setCreated_at(entity.getCreated_at());
        dto.setTagId(entity.getTagId());
        dto.setBoardId(entity.getBoardId());
        dto.setUserId(entity.getUserId());

        return dto;
    }
}
