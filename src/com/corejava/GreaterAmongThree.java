package com.corejava;

import java.util.Scanner;

public class GreaterAmongThree {
    public static void main(String[] ar) {

        //making object of scanner class
        Scanner sc = new Scanner(System.in);

        //taking inputs
        System.out.println("Enter three numbers to find greatest among three: ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        //initializing max variable with 0
        int max=0;

        //checking the largest among three
        if((first>second)&&(first>third))
        {
            max=first;
        }
        else if((second>first)&&(second>third))
        {
            max=second;
        }
        else
            max=third;

        //printing the largest value among three
        System.out.println("Greatest among this three is: "+max);
    }
}
