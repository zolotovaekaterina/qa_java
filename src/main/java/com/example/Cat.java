package com.example;

public class Cat {

    Predator predator;

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public String getSound() {
        return "Мяу";
    }

    public void getFood() throws Exception {
        predator.eatMeat();
    }

}
