package com.bridgelabz;

import java.util.Scanner;

public class Q3 {
    static void m1(int x){
        int res = 1;
        for(int i=1 ; i<=x ; i++){
            res = 2*res ;
            System.out.println("2^" + i + "=" + res);
        }
    }




    public static void main(String[] args) {
        System.out.println("Enter a number to print table : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        m1(a);
    }
}
