package org.andersen.lab.lesson12;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sight а: ");
        int a = scanner.nextInt();

        System.out.println("Enter sight b: ");
        int b = scanner.nextInt();

        System.out.println("Enter sight с: ");
        int c = scanner.nextInt();

        System.out.println("The area of triangle is: " + TriangleSquareCalculation.calculateTriangleSquare(a, b, c));
    }
}
