package com.Bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
    static void m1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number a = ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number b = ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " +a);
        System.out.println("b = " +b);

    }


    public static void main(String[] args) {
        m1();

    }
}
