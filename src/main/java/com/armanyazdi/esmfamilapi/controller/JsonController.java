package com.armanyazdi.esmfamilapi.controller;

import com.armanyazdi.esmfamilapi.response.EsmFamil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class JsonController {
    @GetMapping("/esmfamil")
    @ResponseBody
    public EsmFamil jsonResponse(@RequestParam char letter) {
        return new EsmFamil(letter);
    }
}