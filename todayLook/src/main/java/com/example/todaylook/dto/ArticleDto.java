package com.example.todaylook.dto;

import com.example.todaylook.entity.Article;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class ArticleDto {
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

  public ArticleDto(Long id, String writer, String title, String comment, Integer like, String image, String created_at, String tag, String content) {
    this.id = id;
    this.writer = writer;
    this.title = title;
    this.comment = comment;
    this.like = like;
    this.image = image;
    this.created_at = created_at;
    this.tag = tag;
    this.content = content;
  }

  public static ArticleDto fromEntity(Article entity){
    return  new ArticleDto(
            entity.getId(),
            entity.getWriter(),
            entity.getTitle(),
            entity.getComment(),
            entity.getLike(),
            entity.getImage(),
            entity.getCreated_at(),
            entity.getTag(),
            entity.getContent()
    );
  }
}
