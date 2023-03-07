package com.knoldus.task5;

import java.util.Scanner;

public class Studentgrade {

    //Determining grade on the basis of percentage provided by user.
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the percentage");
        float percentage=input.nextFloat();
        char grade=' ';
        if(percentage<=100){
            grade='A';
            if (percentage<=90){
                grade='B';
                if (percentage<=80){
                    grade='C';
                    if (percentage<=70){
                        grade='D';
                        if(percentage<=60){
                            grade='E';
                        }
                    }
                }
            }
        }

        System.out.println("Grade of Student according to the given percentage: "+grade);
    }
}
