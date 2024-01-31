package com.example.todaylook.controller;

import com.example.todaylook.service.LocationService;
import com.example.todaylook.service.TimeService;
import com.example.todaylook.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;
    private final TimeService timeService;
    private final LocationService locationService;
    @GetMapping
    public String weatherResult() throws IOException, ParseException {
        // 수원
        // ip : "14.33.74.0"
        // 수원 위도 : 37.237 ~ 37.305
        // 수원 경도 : 127.08 ~ 126.95
        // x = 60 ~ 62
        // y = 120 ~ 121

        locationService.setIp("14.33.74.0");
        locationService.findCity();
        timeService.simpleTime();
        locationService.transferXY();
        weatherService.setBase_date(timeService.getDate());
        weatherService.setNx(locationService.getXLat());
        weatherService.setNy(locationService.getYLon());
        weatherService.ApiExplorer();

        return "done";
    }
}
