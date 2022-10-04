package com.Bridgelabz.BasicCorePrograms;


import java.util.Scanner;

public class HarmonicNumber {
    public static void findHarmonicNumber(int num){

        double result = 0.0;

        for (int i=num; i>0; i--){
            result = result + (double)1/i;
            System.out.print(result + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        findHarmonicNumber(num);
    }

  }

