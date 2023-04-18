package com.armanyazdi.esmfamilapi.controller;

import com.armanyazdi.esmfamilapi.response.EsmFamil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api")
public class JsonController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/esmfamil")
    public EsmFamil jsonResponse(@RequestParam char letter) {
        return new EsmFamil(counter.incrementAndGet(), letter);
    }
}