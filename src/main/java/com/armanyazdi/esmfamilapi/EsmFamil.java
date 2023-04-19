package com.armanyazdi.esmfamilapi;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class EsmFamil {
    private final Long id;
    private final HttpStatus status;
    private final String name;
    private final String family;
    private final String food;
    private final String fruit;
    private final String color;
    private final String city;
    private final String country;
    private final String animal;
    private final String flower;
    private final String car;
    private final String object;

    public EsmFamil(Long id, HttpStatus status, char letter) {
        this.id = id;
        this.status = status;
        this.name = NameGenerator.firstName(letter);
        this.family = NameGenerator.lastName(letter);
        this.food = RandomSelector.select(letter, "foods.txt");
        this.fruit = RandomSelector.select(letter, "fruits.txt");
        this.color = RandomSelector.select(letter, "colors.txt");
        this.city = RandomSelector.select(letter, "cities.txt");
        this.country = RandomSelector.select(letter, "countries.txt");
        this.animal = RandomSelector.select(letter, "animals.txt");
        this.flower = RandomSelector.select(letter, "flowers.txt");
        this.car = RandomSelector.select(letter, "cars.txt");
        this.object = RandomSelector.select(letter, "objects.txt");
    }
}