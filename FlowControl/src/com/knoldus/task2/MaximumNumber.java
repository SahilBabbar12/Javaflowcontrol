package com.knoldus.task2;

import java.util.Scanner;

public class MaximumNumber {

    // take 3 numbers as input and finds the maximum of them
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First number");
        int numberone=input.nextInt();
        System.out.println("Enter the second number");
        int numbertwo=input.nextInt();
        System.out.println("Enter the third number");
        int numberthree=input.nextInt();

        int result=findMax(numberone,numbertwo,numberthree);
        System.out.println("Maximum of 3 numbers is "+result);


    }
    public  static int findMax(int number1,int number2,int number3){
        int maximumnumber=(number1>number2)?(number1>number3?number1:number3):(number2>number3?number2:number3);
        return maximumnumber;
    }
}
