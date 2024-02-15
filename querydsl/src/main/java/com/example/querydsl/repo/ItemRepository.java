package com.example.querydsl.repo;

import com.example.querydsl.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    // Intellij가 여기에 들어갈 문자열은
    @Query("SELECT i FROM Item i")
    List<Item> findWithJpql();
}
