package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to reverse it : ");
            int num = sc.nextInt();
            int rev = 0; int rem;
            while (num!=0){
                rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }
            System.out.print("The reversed number is : " + rev);
        }
    }
