package com.knoldus.task9;

import java.util.Scanner;

public class PrimeNumber {

    // programs checks the given number is Prime or Not using do while..
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int input_number=input.nextInt();
        if(checkPrime(input_number))
        {
                System.out.println("Number is Prime");
        }
        else
                System.out.println("Number is not Prime");

    }
    public static boolean checkPrime(int number){
        int count=2;
        boolean isPrime=true;
        do {
            if(number==2){
                break;
            }
            else if(number==1){
                isPrime=false;
                break;
            }
            else if(number%count==0){
                isPrime=false;
                break;
            }
            count++;
        }while (count<number/2);

        return isPrime;
    }
}
