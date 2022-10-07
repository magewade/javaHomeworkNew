package org.andersen.lab.lesson2;

import java.util.Scanner;

public class Task4LineMultiplyNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = console.nextLine();
        System.out.println("Enter the number");
        int num = console.nextInt();
        multiplyLine(str, num);
    }

    public static void multiplyLine(String str, int num){
        for (int i = 0; i < num; i++) {
            System.out.print(str + " ");
        }
    }
}
