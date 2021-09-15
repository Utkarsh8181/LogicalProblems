package com.bridgelabz;
import java.util.Scanner;

public class MontlyPayment {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest : ");
        double rate = sc.nextDouble();
        rate = rate / (12 * 100);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        year = year * 12;
        double p = (principal * rate) / (1 - Math.pow(1 + rate, -year));
        System.out.println("Payment: " + p);
        sc.close();
    }
}