package org.andersen.lab.lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[][] rightMatrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] wrongElementMatrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "Seven", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] wrongSizeMatrix = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        try {
            System.out.println(Arrays.deepToString(rightMatrix));
            System.out.println("Sum of elements is " + MyArrayException.array(rightMatrix) + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(Arrays.deepToString(wrongElementMatrix));
            System.out.println("Sum of elements is" + MyArrayException.array(wrongElementMatrix) + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(Arrays.deepToString(wrongSizeMatrix));
            System.out.println("Sum of elements is" + MyArrayException.array(wrongSizeMatrix) + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

