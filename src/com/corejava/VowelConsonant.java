package com.corejava;

import java.util.Arrays;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] ar) {

        //making object of scanner class
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter the alphabet to check vowel or consonant: ");
        String input = sc.next();
        char alpha= input.toLowerCase().charAt(0);

        //declaring array of vowels
        char vowel[]={'a','e','i','o','u'};

        //checking if input if vowel or not
        for(char a:vowel)
            {
                if(a==alpha)
                {
                    System.out.println("It is an vowel.");
                    System.exit(0);
                }
            }
        System.out.println("It is an consonant.");

    }
}
