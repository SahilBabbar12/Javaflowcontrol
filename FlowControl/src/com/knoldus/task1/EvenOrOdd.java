package com.knoldus.task1;

import java.util.Scanner;

public class EvenOrOdd {

    // program to check given number is odd or even

    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner input= new Scanner(System.in);
        int number=input.nextInt();
        if(number%2==0)
        System.out.println("the given number is even");
        else
        System.out.println("the given number is odd");

    }

}
