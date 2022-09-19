package org.andresen.lab.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Task9LengthAndValue {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the length");
        int len = console.nextInt();
        System.out.println("Enter the value");
        int initialValue = console.nextInt();
        fillArrayWithValue(len, initialValue);
    }

    public static int[] fillArrayWithValue(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        System.out.println(Arrays.toString(arr));
        return(arr);
    }
}
