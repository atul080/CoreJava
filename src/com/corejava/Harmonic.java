package com.corejava;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] ar) {

        //making object of scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range for harmonic number : ");
        int n = sc.nextInt();

        //initializing a variable
        float harmonic=1;

        //looping to get harmonic value
        for(int i=2;i<=n;i++)
        {
            harmonic+=(float)1/i;
        }

        //printing the final output
        System.out.println(harmonic);
    }
}
