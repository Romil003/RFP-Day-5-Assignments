package com.bridgelabz;

import java.util.Scanner;

public class Q8 {
    static void m1(int x){
        if(x%2 == 0){
            System.out.println(x + " is Even number");
        }
        else {
            System.out.println(x + " is Odd number");
        }

    }


    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        m1(a);
    }
}
