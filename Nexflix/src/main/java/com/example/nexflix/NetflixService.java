package com.example.nexflix;

import com.example.nexflix.entity.Netfilx;
import com.example.nexflix.repo.NetflixRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NetflixService {
    private final NetflixRepo netflixRepo;

    public boolean emailExistCheck(String email){
        return netflixRepo.existsById(email);
    }

    public Netfilx joinMember(String email){
        Netfilx netfilx = new Netfilx();
        netfilx.setEmail(email);
        return netflixRepo.save(netfilx);
    }
}
