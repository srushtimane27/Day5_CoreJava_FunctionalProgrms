package com.Bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class QuotientRemainder {
    static void m1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int Quotient = a / b;
        int Remainder = a % b;

        System.out.println("Quotient of a = " +Quotient);
        System.out.println("Remainder of b = " +Remainder);

    }

    public static void main(String[] args) {
        m1();

    }
}
