package com.Bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class Distance {
    public static void findEuclideanDistance(int x1, int x2, int y1, int y2){

        int dis = (int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("distance is"+"("+x1+","+y1+"),"+"("+x2+","+y2+") = "+dis);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1 point");
        int x1=sc.nextInt();

        System.out.println("enter x2 point");
        int x2=sc.nextInt();

        System.out.println("enter y1 point");
        int y1=sc.nextInt();

        System.out.println("enter y2 point");
        int y2=sc.nextInt();

        findEuclideanDistance(x1,x2,y1,y2);

    }
}
