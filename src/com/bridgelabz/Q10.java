package com.bridgelabz;

import java.util.Scanner;

public class Q10 {
    static void m1(int a , int b , int c){
        if (a>b && a>c){
            System.out.println(a + " is Largest number");
        }
        else if (b>a && b>c){
            System.out.println(b + " is Largest number");
        }
        else if (c>a && c>b){
            System.out.println(c + " is Largest number");
        }
        else {
            System.out.println("All are equal");
        }
    }



    public static void main(String[] args) {
        System.out.println("To get largest number , do the following process : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int y = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        int z = sc.nextInt();
        m1(x,y,z);
    }
}
