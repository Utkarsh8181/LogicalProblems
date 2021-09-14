package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the last number till you want to check the Prime Number : ");
            int endNum = sc.nextInt();
            for (int num=1; num<=endNum; num++){
                int temp=0;
                for (int i=2; i<num; i++){
                    if (num%i==0){
                        temp+=1;
                    }
                }
                if (temp==0){
                    System.out.println(num);
                }
            }
        }
    }
