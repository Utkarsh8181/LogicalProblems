package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

        public static void main(String[] args) {
            int sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to check wheather the number is perfect number or not : ");
            int num = sc.nextInt();
            for (int i=1;i<num;i++){
                if (num%i==0){
                    sum+=i;
                }
            }
            if (num==sum){
                System.out.println(num + " is a Perfect Number");
            }
            else {
                System.out.println(num + " is not a Perfect Number");
            }
        }
}
