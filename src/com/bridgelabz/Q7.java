package com.bridgelabz;

import java.util.Scanner;

public class Q7 {
    static void m1(int x,int y,int z){
        z = x;
        x = y;
        y = z;
        System.out.println("1st number = " + x);
        System.out.println("2nd number = " + y);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        int c = 0 ;
        m1(a,b,c);
    }
}
