package org.andresen.lab.lesson2;

import java.util.Scanner;

public class Task3NumberPositiveOrNegativeBoolean {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = console.nextInt();
        System.out.println(checkPositiveOrNegativeBooleanVer(num));
    }

    public static boolean checkPositiveOrNegativeBooleanVer(int num) {
        return (num >= 0);
    }
}
