package com.bridgelabz;

import java.util.Scanner;

public class Q2 {
    static void m1(int x) {
        if (x >= 1000 && x <= 9999) {
            System.out.println("Number is 4 digit number");
                    if (x % 400 == 0) {
                        System.out.println(x + " is leap year");
                    }
                    else if (x%4 == 0 && x%100 != 0) {
                        System.out.println(x + " is leap year");
                    }
                    else {
                    System.out.println(x + " is not leap year");
                    }
            }
            else{
                System.out.println("Number is not 4 digit number");
            }
        }





    public static void main(String[] args) {
        System.out.println("Enter a year : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        m1(a);
    }
}
