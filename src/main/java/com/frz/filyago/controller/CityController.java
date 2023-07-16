package com.frz.filyago.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@RestController
public class CityController {
    @Value("${base-url}") String baseUrl;
    @Value("${countries}") String countriesUrl;
    @GetMapping("/cities")
    public List <Object> getCity(){
        RestTemplate template = new RestTemplate();
        Object[] objects = new Object[]{template.getForObject(baseUrl+countriesUrl, Object.class)};
        return Arrays.asList(objects);

    }
    @GetMapping("/cities1")
    public String getCity1(){
        return "WORKING";
    }
}

