package org.andresen.lab.lesson2;

import java.util.Random;
import java.util.Arrays;

public class Task5To8ArraysManipulations {
    public static void main(String[] args) {
        refactorArray();
        System.out.println();
        fillArray();
        System.out.println();
        doubleArrayNumbers();
        System.out.println();
        fillSquareArray();
    }

    public static void refactorArray() {
        Random random = new Random();
        int arrsize = 20;
        int[] arr = new int[random.nextInt(arrsize + 1)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void doubleArrayNumbers() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillSquareArray() {
        int size = 12;
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == j) || (i + j == size - 1))
                    arr[i][j] = 1;
                else
                    arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

