package com.example.nexflix;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class NetflixController {
    private final NetflixService netflixService;

    @GetMapping("/home")
    public String home(){
        System.out.println("this is home");
        return "home";
    }

    @PostMapping("/add")
    public String emailCheck(
            @RequestParam
            String email
    ){
        System.out.println(email);
        //이 받은 email로 존재하는 이메일인지 체크
        boolean check = netflixService.emailExistCheck(email);
        //있으면 -> 로그인 페이지
        if (check){
            return "login";
        }
        //없으면 -> 회원가입 페이지
        else {
            return "join";
        }
    }

    @PostMapping("/join")
    public String join(
            @RequestParam
            String email
    ){
        netflixService.joinMember(email);
        System.out.println("가입완료");
        return "home";
    }
}
