package com.bridgelabz;

import java.util.Scanner;

public class Q9 {
    static void m1(char x){

            switch (x){
                case 'a':
                    System.out.println(x + " is vowel");
                    break;
                case 'e':
                    System.out.println(x + " is vowel");
                    break;
                case 'i':
                    System.out.println(x + " is vowel");
                    break;
                case 'o':
                    System.out.println(x + " is vowel");
                    break;
                case 'u':
                    System.out.println(x + " is vowel");
                    break;
                default :
                    System.out.println(x + " is consonant");
            }

        }


    public static void main(String[] args) {
        System.out.println("Enter an Alphabet : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        m1(ch);

    }
}
