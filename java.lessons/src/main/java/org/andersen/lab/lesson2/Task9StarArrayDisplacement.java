package org.andersen.lab.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Task9StarArrayDisplacement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the array's length");
        int len = console.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter " + len + " numbers");
        for (int i = 0; i < len; i++) {
            arr[i] = console.nextInt();
        }
        System.out.println("Your array " + Arrays.toString(arr));
        System.out.println("Enter the number of displacement");
        int displace = console.nextInt();
        System.out.println(Arrays.toString(displaceArray(arr, displace)));
    }

    public static int[] displaceArray(int[] arr, int displace) {
        System.out.println("Enter the direction of displacement: false - left, true - right");
        Scanner console = new Scanner(System.in);
        boolean direction = console.nextBoolean();
        if (direction) {
            for (int i = 1; i <= displace; i++) {
                int shiftedElement = arr[arr.length - 1];
                for (int j = arr.length - 1 - 1; j>= 0; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[0] = shiftedElement;
            }
        } else {
            for (int i = -displace; i <= -1; i++) {
                int shiftedElement = arr[0];
                for (int j = 1; j < arr.length; j++) {
                    arr[j - 1] = arr[j];
                }
                arr[arr.length - 1] = shiftedElement;
            }
        }
        return(arr);
    }
}





