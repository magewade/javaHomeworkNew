package org.andersen.lab.lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"zero", "first", "second", "third", "fourth", "fifth", "sixth", "seventh"};

        System.out.println(Arrays.toString(array));
        ElementsSwap.swapElements(array, 2, 5);
        System.out.println(Arrays.toString(array));
        System.out.println();

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        for (int i = 0; i < 10; i++) {
            orangeBox.add(new Orange());
        }
        for (int i = 0; i < 5; i++) {
            appleBox.add(new Apple());
        }

        orangeBox.showBox();
        appleBox.showBox();

        float orangeWeight = orangeBox.getWeight();
        float appleWeight = appleBox.getWeight();
        System.out.println("Orange box weight: " + orangeWeight);
        System.out.println("Apple box weight: " + appleWeight);

        System.out.println("Compare orange box and apple box: " + orangeBox.compare(appleBox));
        System.out.println("Second orange box:");
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.showBox();
        orangeBox.moveAtBox(orangeBox2);
        System.out.println("Move all oranges from Orange box to Orange box 2:");
        orangeBox2.showBox();
        System.out.println("Orange box:");
        orangeBox.showBox();
        System.out.println("Fill the Orange box again");
        for (int i = 0; i < 10; i++) {
            orangeBox.add(new Orange());
        }
        orangeBox.showBox();
        System.out.println("Compare orange box and orange box 2: " + orangeBox.compare(orangeBox2));
    }
}
