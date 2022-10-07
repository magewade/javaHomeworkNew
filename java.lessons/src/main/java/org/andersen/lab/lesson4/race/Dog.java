package org.andersen.lab.lesson4.race;

public class Dog extends Animal {
    private static int counter;

    public Dog(String type, String name, int run, int swim) {
        this.breeds = type;
        this.name = name;
        this.run = run;
        this.swim = swim;
        counter++;
    }

    public static int getCount() {
        return counter;
    }
}
