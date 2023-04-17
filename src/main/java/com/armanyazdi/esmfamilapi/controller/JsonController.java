package com.armanyazdi.esmfamilapi.controller;

import com.armanyazdi.esmfamilapi.response.EsmFamil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @GetMapping("/esmfamil")
    public EsmFamil json(@RequestParam char letter,
                         @RequestParam(required = false) String name,
                         @RequestParam(required = false) String family,
                         @RequestParam(required = false) String food,
                         @RequestParam(required = false) String fruit,
                         @RequestParam(required = false) String color,
                         @RequestParam(required = false) String city,
                         @RequestParam(required = false) String country,
                         @RequestParam(required = false) String animal,
                         @RequestParam(required = false) String flower,
                         @RequestParam(required = false) String car,
                         @RequestParam(required = false) String object) {
        return new EsmFamil(
                letter,
                name,
                family,
                food,
                fruit,
                color,
                city,
                country,
                animal,
                flower,
                car,
                object);
    }
}
