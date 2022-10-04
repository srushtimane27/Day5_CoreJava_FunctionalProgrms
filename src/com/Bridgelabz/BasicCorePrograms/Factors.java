package com.Bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class Factors {
    public static void findFactors(int num){

        for (int i=2; i<=num; i++){
            if (num % i == 0){
                System.out.println("Factors are: " +i);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        findFactors(num);

    }
}
