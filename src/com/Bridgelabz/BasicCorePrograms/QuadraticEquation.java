package com.Bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class QuadraticEquation {
    public static void findQuadraticEquation(double a, double b, double c){
        double delta = ((b * b) - (4 * a * c));
        double sqrt = Math.sqrt(delta);

        double FirstRoot = (-b + sqrt) / (2 * a);
        double SecondRoot = (-b - sqrt) / (2 * a);

        System.out.println("Roots are : " + FirstRoot + " and " + SecondRoot);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a : ");
        double a=sc.nextInt();

        System.out.println("Enter value of b : ");
        double b=sc.nextInt();

        System.out.println("Enter value of c : ");
        double c=sc.nextInt();

        findQuadraticEquation(a,b,c);

    }
}
