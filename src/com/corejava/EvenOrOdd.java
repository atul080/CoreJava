package com.corejava;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] ar) {

        //making object of scanner class
        Scanner sc = new Scanner(System.in);

        //taking number as input
        System.out.println("Enter the  number to check even or odd: ");
        int num = sc.nextInt();

        //checking if it is even or odd
        if(num==0)
            System.out.println("It's even number");
        else if(num==1)
            System.out.println("It's odd number");
        else if(num%2==0)
            System.out.println("It's even number");
        else
            System.out.println("It's odd number");

    }
}
