package com.example.todaylook;

import com.example.todaylook.entity.Article;
import com.example.todaylook.repo.ArticleRepository;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
class TodayLookApplicationTests {

    @Autowired
    ArticleRepository articleRepository;
    @After
    public void cleanUp(){
        articleRepository.deleteAll();
    }
    @Test
    public void insertBaseTimeEntity() {
        //given
        LocalDateTime now = LocalDateTime.now();
        articleRepository.save(Article.builder()
                .title("title")
                .content("content")
                .build());

        //when
        Article article = articleRepository.findById(1L).get();

        //then
        System.out.println("now : " + now);
        System.out.println(">>>>>>>>> createDate=" + article.getCreatedAt() + "" +
                ", modifiedDate = " + article.getUpdatedAt() + "<<<<<<<<<<");
        assertEquals(now, article.getCreatedAt());
    }

}
