package com.example.todaylook.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Service
public class TimeService {
    @Setter
    @Getter
    private String Time;
    @Setter
    @Getter
    private String Date;

    public void simpleTime() {
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String nowDate = localDateTime.format(formatter);
        formatter = DateTimeFormatter.ofPattern("HH10");
        String nowTime = localDateTime.format(formatter);

        setTime(nowTime);
        setDate(nowDate);
        System.out.println(nowDate + " " + nowTime);
    }
}
