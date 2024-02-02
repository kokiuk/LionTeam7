package com.example.todaylook.dto;

import com.example.todaylook.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long id;
    @Setter
    private String name;
    @Setter
    private String created_at;
    @Setter
    private Long articleId;

    public BoardDto(Long id, String name, String created_at, Long articleId) {
        this.id = id;
        this.name = name;
        this.created_at = created_at;
        this.articleId = articleId;
    }

    public static BoardDto fromEntity(Board entity){
        BoardDto dto = new BoardDto();
        dto.id = dto.getId();
        dto.name = dto.getName();
        dto.created_at = dto.getCreated_at();
        dto.articleId = dto.getArticleId();
        return dto;
    }
}
