package com.corejava;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] ar) {

        //making object of scanner class
        Scanner sc = new Scanner(System.in);

        //taking th inputs
        System.out.println("Enter the valuue of a, b and c to find the roots: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //clculating delta value
        double delta=(b*b)-(4*a*c);
        delta=Math.sqrt(delta);

        //calculating the root values
        double root1=(-b + delta)/(2*a);
        double root2=(-b - delta)/(2*a);

        //printing final output
        System.out.println("Square roots are: "+root1+", "+root2);

    }
}
