package com.bridgelabz;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i =2 ; i < x ; i++){
            while(x%i == 0){
                System.out.print(i + " ");
                x=x/i;
            }
        }
          if(x>2){
            System.out.println(x);
          }
    }
}
