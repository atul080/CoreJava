package com.corejava;

import java.util.Scanner;

public class Factors {
    public static void main(String[] ar) {

        //making object of scanner class
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter the number to get prime factors: ");
        int n = sc.nextInt();

        //looping to find out the prime factors of the given number
        for(int i=2;i*i<n;i++)
        {
            while(n%i==0)
            {
                System.out.println(i);
                n=n/i;
            }
        }

        //printing last factor
        if(n>2)
            System.out.println(n);
    }

}
