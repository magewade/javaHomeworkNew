package org.andresen.lab.lesson4.race;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[5];
        animal[0] = new Cat("Bengal cat", "Cleo", 150, 0);
        animal[1] = new Cat("Maine Coon cat", "Big Boy", 200, 0);
        animal[2] = new Cat("Munchkin dog", "Fluff", 100, 0);
        animal[3] = new Dog("Corgi dog", "Muffin", 350, 5);
        animal[4] = new Dog("Siberian Husky dod", "Gus", 500, 10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of animals: " + Animal.getCount());
        System.out.println("Number of cats: " + Cat.getCount());
        System.out.println("Number of dogs: " + Dog.getCount());
        System.out.println("OBSTACLE RACE");
        System.out.println("Enter the distance of running: ");
        int rDistance = scanner.nextInt();
        for (Animal value : animal) {
            value.run(rDistance);
        }
        System.out.println("\nEnter the distance of swimming: ");
        int sDistance = scanner.nextInt();
        for (Animal value : animal) {
            value.swim(sDistance);
        }
    }
}
