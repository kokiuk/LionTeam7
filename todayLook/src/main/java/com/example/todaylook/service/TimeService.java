package com.example.todaylook.service;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Service
public class TimeService {
    @Getter
    private String Time;
    @Getter
    private String Date;

    public void simpleTime() {
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String nowDate = localDateTime.format(formatter);
        formatter = DateTimeFormatter.ofPattern("HH10");
        String nowTime = localDateTime.format(formatter);

        Time = nowTime;
        Date = nowDate;
        System.out.println(nowDate + " " + nowTime);
    }
}
