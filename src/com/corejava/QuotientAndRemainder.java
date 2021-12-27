package com.corejava;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] ar) {

        //making object of scanner class
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter the divisor and dividend to get Quotient and Remainder: ");
        int divior = sc.nextInt();
        int dividend=sc.nextInt();

        //calculating quotient and remainder
        int quotient=dividend/divior;
        int remainder=dividend%divior;

        //printing final output
        System.out.println("Quotent is: "+quotient+" and Remainder is: "+remainder);


    }
}
