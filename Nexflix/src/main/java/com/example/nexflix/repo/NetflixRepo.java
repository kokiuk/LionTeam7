package com.example.nexflix.repo;

import com.example.nexflix.entity.Netfilx;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NetflixRepo extends JpaRepository<Netfilx, String> {

}
