package org.andersen.lab.lesson2;

import java.util.Scanner;

public class Task2NumberPositiveOrNegative {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = console.nextInt();
        checkPositiveOrNegative(num);
    }
    public static void checkPositiveOrNegative(int num){
        if (num >= 0)
            System.out.println("This number is positive");
        else
            System.out.println("This number is negative");
    }
}
