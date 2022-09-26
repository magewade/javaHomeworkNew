package org.andresen.lab.lesson4.race;

public class Cat extends Animal {
    private static int counter;

    public Cat(String breed, String name, int run, int swim) {
        this.breeds = breed;
        this.name = name;
        this.run = run;
        this.swim = swim;
        counter++;
    }

    public static int getCount() {
        return counter;
    }
}
