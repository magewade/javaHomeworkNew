package org.andersen.lab.lesson12;

public class TriangleSquareCalculation {
    public static double calculateTriangleSquare(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 | c <= 0) {
            System.out.println("The sight must be more than zero");
            throw new Exception();
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Sum of the two sights must be more than the third sight");
            throw new Exception();
        }

        double halfPerimeter = (a + b + c) * 0.5;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}
