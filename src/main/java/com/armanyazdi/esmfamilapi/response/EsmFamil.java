package com.armanyazdi.esmfamilapi.response;

public class EsmFamil {
    private final char letter;
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

    public EsmFamil(char letter, String name, String family, String food, String fruit, String color, String city, String country, String animal, String flower, String car, String object) {
        this.letter = letter;
        this.name = Name.firstName(letter);
        this.family = Name.lastName(letter);
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

    public char getLetter() {
        return letter;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getFood() {
        return food;
    }

    public String getFruit() {
        return fruit;
    }

    public String getColor() {
        return color;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getAnimal() {
        return animal;
    }

    public String getFlower() {
        return flower;
    }

    public String getCar() {
        return car;
    }

    public String getObject() {
        return object;
    }
}
