package com.example.pokedex;

public class Pokemon {
    private String name;
    private String number;
    Pokemon(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
}
