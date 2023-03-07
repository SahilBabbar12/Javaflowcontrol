package com.knoldus.task4;

import java.util.Scanner;

public class PositiveNegativeNumber {

    // program that tells number is positive,negative or Zero..
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=input.nextInt();
        if(!(number<0)){
            if(number==0)
                System.out.println("Number is Zero");
            else if (number>0)
                System.out.println("Positive number");

        }
        else
            System.out.println("Negative number");

    }
}
