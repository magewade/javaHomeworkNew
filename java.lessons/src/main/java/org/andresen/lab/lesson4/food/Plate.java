package org.andresen.lab.lesson4.food;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int f) {
        food += f;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }
}
