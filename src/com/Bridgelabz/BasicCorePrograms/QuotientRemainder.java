package com.Bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class QuotientRemainder {
    static void findQuotientRemainder(int a, int b){
        int Quotient = a / b;
        int Remainder = a % b;

        System.out.println("Quotient of a = " +Quotient);
        System.out.println("Remainder of b = " +Remainder);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        findQuotientRemainder(a,b);

    }
}
