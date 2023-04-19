package com.armanyazdi.esmfamilapi.controller;

import com.armanyazdi.esmfamilapi.EsmFamil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api")
public class EsmFamilController {
    private static final AtomicLong counter = new AtomicLong();
    private static final HttpStatus status = HttpStatus.OK;

    @GetMapping("/esmfamil")
    public EsmFamil esmfamil(@RequestParam char letter) {
        return new EsmFamil(counter.incrementAndGet(), status, letter);
    }
}