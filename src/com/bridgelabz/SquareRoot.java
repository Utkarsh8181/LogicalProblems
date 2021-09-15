package com.bridgelabz;
import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double c = sc.nextDouble();
        double epsilon = 1.0e-15;
        double t = c;
        /*
         * To repeat until desired accuracy reached using condition
         */
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        System.out.println("The Square root of the number is " + t);
        sc.close();
    }

}
