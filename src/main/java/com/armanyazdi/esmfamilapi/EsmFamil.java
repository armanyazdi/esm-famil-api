package com.armanyazdi.esmfamilapi;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class EsmFamil {
    private final Long id;
    private final HttpStatus status;
    private final char letter;
    private final String name, family, food, fruit, color, city, country, animal, flower, car, object;

    public EsmFamil(Long id, HttpStatus status, char letter) {
        this.id = id;
        this.status = status;
        this.letter = letter;
        this.name = NameGenerator.firstName(letter);
        this.family = NameGenerator.lastName(letter);
        this.food = RandomSelector.selectItem(letter, "foods.txt");
        this.fruit = RandomSelector.selectItem(letter, "fruits.txt");
        this.color = RandomSelector.selectItem(letter, "colors.txt");
        this.city = RandomSelector.selectItem(letter, "cities.txt");
        this.country = RandomSelector.selectItem(letter, "countries.txt");
        this.animal = RandomSelector.selectItem(letter, "animals.txt");
        this.flower = RandomSelector.selectItem(letter, "flowers.txt");
        this.car = RandomSelector.selectItem(letter, "cars.txt");
        this.object = RandomSelector.selectItem(letter, "objects.txt");
    }
}