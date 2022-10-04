package com.Bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class WindChill {
    public static void windChill(double t, double v){

        double wind = 35.74 + 0.6215 * t + ( 0.4275 * t - 35.75 ) * Math.pow(v,0.16);
        System.out.println("Wind Temperature: " + wind );

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature t :  ");
        double t=sc.nextInt();

        System.out.println("Enter wind speed v :  ");
        double v=sc.nextInt();

        windChill(t,v);

    }
}
