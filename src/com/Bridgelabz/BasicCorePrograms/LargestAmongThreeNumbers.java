package com.Bridgelabz.BasicCorePrograms;

import java.util.Scanner;
public class LargestAmongThreeNumbers {

    static void findLagrgestNumber(int num1, int num2, int num3){

        if(num1>num2 && num1>num3) {
            System.out.println(num1 + " Is the greatest number");
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2 +" Is the greatest number");
        }else {
            System.out.println(num3 + " Is the greatest number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number: ");
        int num3 = sc.nextInt();
        findLagrgestNumber(num1,num2,num3);

    }
}
