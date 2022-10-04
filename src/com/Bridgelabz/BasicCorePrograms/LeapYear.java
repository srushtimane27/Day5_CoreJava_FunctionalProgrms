package com.Bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class LeapYear {
    static void leapYear(int year){

        if (year % 400 == 0){
            System.out.println(year + " : Is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " : Is a leap year");
        }else {
            System.out.println(year + " : Is not a leap year");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:  ");
        int year = sc.nextInt();
        leapYear(year);
    }

}
