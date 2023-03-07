package com.knoldus.task8;

import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter the value");
        int number=input.nextInt();
        findSum(number);
    }
    public static void findSum(int number){
        int count =1;
        int sum =0;
        while(count<=number){

            sum+=count;
            count++;
        }
        System.out.println("Sum of First " + number+ " natural numbers: "+sum);
    }
}
