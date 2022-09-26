package com.bridgelabz;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.print("Enter a nth number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double num = 0.0;
        if (x>0) {
            double i;
            for (i = 1; i <= x; i++)
                num = (1/i) + num ;
            System.out.println(num);
        }
        else {
            System.out.println("Invalid number");
        }
    }

}
