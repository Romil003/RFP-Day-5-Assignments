package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    static void m1(int x) {

        for (int i = 1; i <= x; i++) {
            Random flip = new Random();
            int num = flip.nextInt();
            if (num < 0.5) {
                System.out.println("Tails");
            }
            else {
                System.out.println("Heads");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of times to flip the coin : ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        m1(x);
    }
}
