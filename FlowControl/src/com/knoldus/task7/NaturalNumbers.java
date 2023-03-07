package com.knoldus.task7;

import java.util.Scanner;

public class NaturalNumbers {

    // program that prints numbers from 1 to the number provided by user.

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter the value");
        int number=input.nextInt();

        int count =1;
        while(count<=number){

            System.out.print(count+" ");
            count++;
        }

    }
}
