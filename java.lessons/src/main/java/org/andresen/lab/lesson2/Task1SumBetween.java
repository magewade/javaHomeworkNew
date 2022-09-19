package org.andresen.lab.lesson2;

import java.util.Scanner;

public class Task1SumBetween {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = console.nextInt();
        System.out.println("Enter the second number");
        int b = console.nextInt();
        System.out.println(checkIfSumBetween(a, b));
    }

    public static boolean checkIfSumBetween(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }
}
