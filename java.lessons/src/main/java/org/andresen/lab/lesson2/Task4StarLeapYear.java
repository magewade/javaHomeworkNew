package org.andresen.lab.lesson2;

import java.util.Scanner;

public class Task4StarLeapYear {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = console.nextInt();
        System.out.println(defineLeapYear(year));
    }
    public static boolean defineLeapYear(int year){
        return (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && year !=0);
    }
}
