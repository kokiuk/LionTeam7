package com.example.nexflix.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Netfilx {
    @Id
    private String email;
}
