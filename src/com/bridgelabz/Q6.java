package com.bridgelabz;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("To find Quotient and remainder do the following process :");
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Dividend number : ");
        int a = sc.nextInt();
        System.out.print("Enter Divisor number : ");
        int b = sc.nextInt();
        int Q = 0 ;
        int R = 0 ;
        Q = a/b;
        R = a%b;
        System.out.println("Quotient is " + Q);
        System.out.println("Remainder is " + R);

    }


}
