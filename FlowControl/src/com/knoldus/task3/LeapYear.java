package com.knoldus.task3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        checkLeapYear(year);
    }
    public  static void checkLeapYear(int year){
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }
            else
            {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println("leap year.");
        } else {
            System.out.println("Not a leap year");
        }
    }
}




