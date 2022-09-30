package com.Bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class EvenOdd {
    static void m1(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        m1();

    }

}
