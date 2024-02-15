package com.example.todaylook.dto;

import com.example.todaylook.entity.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class CommentDto {
    private Long id;
    @Setter
    private String content;
    @Setter
    private String created_at;

    @Setter
    private Long articleId;
    @Setter
    private Long memberId;

    public CommentDto(Long id, String content, String created_at, Long articleId, Long memberId) {
        this.id = id;
        this.content = content;
        this.created_at = created_at;
        this.articleId = articleId;
        this.memberId = memberId;
    }

    public static CommentDto fromEntity(Comment entity){
        CommentDto dto = new CommentDto();
        dto.id = entity.getId();
        dto.content = entity.getContent();
        dto.created_at = entity.getCreated_at();
        dto.articleId = entity.getArticleId();
        dto.memberId = entity.getMemberId();
        return dto;
    }
}
