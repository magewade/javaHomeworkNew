package org.andersen.lab.lesson4.food;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 5, false);
        cats[1] = new Cat("Murzik", 10, false);
        cats[2] = new Cat("Chernysh", 15, false);
        cats[3] = new Cat("Pushok", 5, false);
        cats[4] = new Cat("Lapka", 100, false);

        Plate plate = new Plate(100);
        plate.info();
        for (Cat cat : cats) {
            if (!cat.fullness && cat.appetite < plate.getFood()) {
                cat.eat(plate);
                cat.fullness = true;
                System.out.println("Cat " + cat.name + " ate the food.");
            } else {
                System.out.println("Cat " + cat.name + " didn't eat.");
            }
        }
        plate.info();
        System.out.println("Enter the quantity of food you want to add: ");
        Scanner scanner = new Scanner(System.in);
        plate.increaseFood(scanner.nextInt());
        plate.info();
    }
}
