package com.corejava;

import java.util.Scanner;

public class SwapTwoNmbers {
    public static void main(String[] ar) {

        //making object of scanner class
        Scanner sc = new Scanner(System.in);

        //taking inputs
        System.out.println("Enter the value for first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the value for second number: ");
        int second = sc.nextInt();

        //swapping both number
        int temp=first;
        first=second;
        second=temp;

        //printing final output
        System.out.println("After swapping we got first number = "+first+" and second number = "+second);
    }
}
