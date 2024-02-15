package com.example.querydsl;
import com.example.querydsl.entity.Item;
import com.example.querydsl.entity.QItem;
import com.example.querydsl.entity.Shop;
import com.example.querydsl.repo.ItemRepository;
import com.example.querydsl.repo.ShopRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.example.querydsl.entity.QItem.item;
import static org.junit.jupiter.api.Assertions.*;

@Transactional
@SpringBootTest
@ActiveProfiles("test")
public class QuerydslQueryTests {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ShopRepository shopRepository;
    @Autowired
    private JPAQueryFactory queryFactory;

    // @BeforeEach: 각 테스트 전에 실행할 코드를 작성하는 영역
    @BeforeEach
    public void beforeEach() {
        Shop shopA = shopRepository.save(Shop.builder()
                .name("shopA")
                .description("shop A description")
                .build());
        Shop shopB = shopRepository.save(Shop.builder()
                .name("shopB")
                .description("shop B description")
                .build());

        itemRepository.saveAll(List.of(
                Item.builder()
                        .shop(shopA)
                        .name("itemA")
                        .price(5000)
                        .stock(20)
                        .build(),
                Item.builder()
                        .shop(shopA)
                        .name("itemB")
                        .price(6000)
                        .stock(30)
                        .build(),
                Item.builder()
                        .shop(shopB)
                        .name("itemC")
                        .price(8000)
                        .stock(40)
                        .build(),
                Item.builder()
                        .shop(shopB)
                        .name("itemD")
                        .price(10000)
                        .stock(50)
                        .build(),
                Item.builder()
                        .name("itemE")
                        .price(11000)
                        .stock(10)
                        .build(),
                Item.builder()
                        .price(10500)
                        .stock(25)
                        .build()
        ));
    }
    @Test
    public void fetch() {
        List<Item> foundList = queryFactory
                .selectFrom(item)
                .fetch();
        assertEquals(6, foundList.size());
        Item found = queryFactory
                .selectFrom(item)
                .where(item.id.eq(1L))
                // 하나만 조회
                .fetchOne();
        assertEquals(1L, found.getId());

        found = queryFactory
                .selectFrom(item)
                .where(item.id.eq(0L))
                // 없을 경우 Null
                .fetchOne();
        assertNull(found);

        queryFactory.selectFrom(item)
                // 2개 이상일 경우 Exception
                .fetchOne();

        found = queryFactory
                .selectFrom(item)
                // LIMIT 1 -> fetchOne();
                .fetchOne();
        assertNotNull(found);

        // offset limit
        foundList = queryFactory
                .selectFrom(item)
                .offset(3)
                .limit(2)
                .fetch();
        for (Item find : foundList) {
            System.out.println(find.getId());
        }
    }


}
