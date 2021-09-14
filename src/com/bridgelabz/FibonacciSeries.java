package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many times you want to print the Fibonacci_Series : ");
        int times = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        int c;
        for (int i=1; i<=times; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
