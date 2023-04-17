package com.armanyazdi.esmfamilapi.controller;

import com.armanyazdi.esmfamilapi.response.EsmFamil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @GetMapping("/esmfamil")
    public EsmFamil json(@RequestParam char letter) {
        return new EsmFamil(letter);
    }
}
