package com.Bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class EvenOdd {
    static void checkEvenOdd(int num){

        if (num % 2 == 0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        checkEvenOdd(num);

    }

}
