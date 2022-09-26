package org.andresen.lab.lesson4.food;

public class Cat {
    public String name; //Не уверена насчет public, пыталась делать private, но почему-то не получалось
    public int appetite;
    public boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}
